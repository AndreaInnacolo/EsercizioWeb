package com.company.EsercizioWeb.controller;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tags")
public class Scraper {
    @GetMapping("tag")
    String tag;

    //solo post admin e regular NO GUEST
    public Scraper(String tag) {
        this.tag = tag;
    }

}
