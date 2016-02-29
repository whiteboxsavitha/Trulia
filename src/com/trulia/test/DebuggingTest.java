package com.trulia.test;

import com.trulia.util.WBy;


public class DebuggingTest {

    public static void main(String[] args) {

        WBy.loadJsonMap(String.format("%s/locators.json", System.getProperty("user.dir")));

    }
}
