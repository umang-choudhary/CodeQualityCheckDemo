package com.demo.codequalitycheck;

public class Bar {
    private final boolean barInstance = isFoo();

    public boolean isFoo() {
        return false;
    }
}
