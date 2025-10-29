package com.automation.clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class P3Reader {

    private String path;

    public P3Reader(String path) {
        this.path = path;
    }

    public String read() throws IOException {
        var texto = Files.readString(Path.of(path));

        return texto;
    }
}
