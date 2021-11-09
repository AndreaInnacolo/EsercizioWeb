package com.company.EsercizioWeb;

public class Controller {

    private final long id;
    private final String content;

    public Controller(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}