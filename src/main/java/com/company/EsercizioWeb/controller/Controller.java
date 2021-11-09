package com.company.EsercizioWeb.controller;

public class Controller {

    private final long id;
    private final String content;

    public Controller(long id, String content) {
        this.id = id;
        this.content = content;
    } //bho

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}