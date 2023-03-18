package com.kodilla.rest.domain;

public class BookDto {
    private String title;
    private String author;

    public BookDto () {

    }
    public BookDto(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }

    public String getAuthor() { return author; }
}