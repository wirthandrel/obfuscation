package com.github.specht;

public class Util {

    protected int x = 0;
    private String text = "Hello ";

    public String printText () {
        x++;

        return text + "Obfuscation works! Here is some int: " + x;
    }
}
