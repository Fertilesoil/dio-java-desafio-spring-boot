package dio.desafio.agregador.domain.service;

import dio.desafio.agregador.domain.DTO.BookDto;
import dio.desafio.agregador.domain.model.Book;

import java.util.List;

public interface BookService {
    List<BookDto> findAll();
    Book create(Book book);
    BookDto findById(Long id);
}
