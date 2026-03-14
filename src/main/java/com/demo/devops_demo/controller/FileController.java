package com.demo.devops_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@RestController
public class FileController {

    private static final String PATH = "/data/test.txt";

    @GetMapping("/write")
    public String write() throws Exception {
        Files.createDirectories(Paths.get("/data"));
        Files.write(
                Paths.get(PATH),
                "hello\n".getBytes(),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    return "written";
}

    @GetMapping("/read")
    public String read() throws Exception {
        return Files.readString(Paths.get(PATH));
    }
}