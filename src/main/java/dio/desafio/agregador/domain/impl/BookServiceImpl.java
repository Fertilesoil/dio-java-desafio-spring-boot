package dio.desafio.agregador.domain.impl;

import dio.desafio.agregador.domain.DTO.BookDto;
import dio.desafio.agregador.domain.model.Book;
import dio.desafio.agregador.domain.repository.BookRepository;
import dio.desafio.agregador.domain.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository _bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this._bookRepository = bookRepository;
    }

    @Override
    public List<BookDto> findAll() {
        return _bookRepository.findAll().stream()
                .map(book -> new BookDto(
                        book.getId(),
                        book.getTitle(),
                        book.getAuthor(),
                        book.getImage(),
                        book.getPages(),
                        book.getPageReads(),
                        book.isFinished(),
                        book.getUser().getId()
                )).collect(Collectors.toList());
    }

    @Override
    public Book create(Book book) {
        return _bookRepository.save(book);
    }

    @Override
    public BookDto findById(Long id) {
        var book = _bookRepository.findById(id);
        var old = book.get();
        return new BookDto(old.getId(), old.getTitle(), old.getAuthor(), old.getImage(), old.getPages(), old.getPageReads(), old.isFinished(), old.getUser().getId());
    }
}
