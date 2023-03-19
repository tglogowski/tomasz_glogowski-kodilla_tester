package com.kodilla.rest.controller;

import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(BookController.class)
public class BookControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    void shouldFetchBooks() throws Exception {
        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);

        //when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/books")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(200))
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }

    @Test
    void shouldAddThreeBooks() throws Exception {
        // given
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("The Stand", "Stephen King"));
        bookList.add(new BookDto("The Lord of the Rings", "J.R.R. Tolkien"));
        bookList.add(new BookDto("Harry Potter and the Philosopher's Stone", "J.K. Rowling"));
        Gson gson = new Gson();
        String json;

        // when & then
        for (BookDto bookDto : bookList) {
            json = gson.toJson(bookDto);
            mockMvc.perform(MockMvcRequestBuilders.post("/books")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(json))
                    .andExpect(MockMvcResultMatchers.status().isOk());
            Mockito.verify(bookService, Mockito.times(1)).addBook(bookDto);
        }
        Mockito.verify(bookService, Mockito.times(3)).addBook(Mockito.any(BookDto.class));
    }
}
