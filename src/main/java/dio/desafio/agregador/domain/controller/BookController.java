package dio.desafio.agregador.domain.controller;

import dio.desafio.agregador.domain.DTO.BookDto;
import dio.desafio.agregador.domain.model.Book;
import dio.desafio.agregador.domain.service.BookService;
import dio.desafio.agregador.domain.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService _bookService;
    private final UserService _userService;

    public BookController(BookService bookService, UserService userService) {
        this._bookService = bookService;
        this._userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<BookDto>> findAll() {
        return ResponseEntity.ok(_bookService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(_bookService.findById(id));
    }

    @PostMapping("/{userId}")
    @Transactional
    public ResponseEntity<Book> createBook(@RequestBody Book book, @PathVariable Long userId) {
        var user = _userService.findById(userId);
        book.setUser(user);
        user.getBooks().add(book);
        return ResponseEntity.ok(_bookService.create(book));
    }
}
