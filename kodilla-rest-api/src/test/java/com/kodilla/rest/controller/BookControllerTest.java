package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BookControllerTest {

    @Test
    void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    void shouldAddBookToList() {
        // given
        BookService bookService = new BookService();
        BookController bookController = new BookController(bookService);
        BookDto bookDto = new BookDto("Test Book", "Test Author");

        // when
        bookController.addBook(bookDto);

        // then
        List<BookDto> books = bookController.getBooks();
        assertEquals(1, books.size());
        assertEquals(bookDto.getTitle(), books.get(0).getTitle());
        assertEquals(bookDto.getAuthor(), books.get(0).getAuthor());
    }
}