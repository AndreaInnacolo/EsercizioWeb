package com.company.EsercizioWeb.controller;

public class PrimaPaginaController {
    private final String url, tag;

    public PrimaPaginaController(String url, String tag) {
        this.url = url;
        this.tag = tag;
    }

    public String getUrl() {
        return url;
    }

    public String getTag() {
        return tag;
    }
}
