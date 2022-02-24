package com.company.task3;

import com.company.task3.model.Tests;
import com.google.gson.Gson;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestParser {
    public Tests parse() {

        Gson gson = new Gson();
        Tests tests = new Tests();
        try (FileReader reader = new FileReader("tests.json")) {
            tests = gson.fromJson(reader,tests.getClass());
        } catch (IOException e) {
            System.out.println("Parsing error" + e.toString());
        }


        return tests;
    }
}
