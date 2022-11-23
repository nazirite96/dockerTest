package com.example.dockerTest.web;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class BoardRequest {
    private Long id;
    private String author;
    private String title;
    private String content;
}