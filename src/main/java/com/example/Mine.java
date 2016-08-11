package com.example;

/**
 * Created by ryanjbaxter on 8/10/16.
 */
public class Mine {
    private String someKey;
    private String someValue;

    public Mine(String someKey, String someValue) {
        this.someKey = someKey;
        this.someValue = someValue;
    }

    public Mine(){}
    public String getSomeValue() {
        return someValue;
    }

    public void setSomeValue(String someValue) {
        this.someValue = someValue;
    }

    public String getSomeKey() {

        return someKey;
    }

    public void setSomeKey(String someKey) {
        this.someKey = someKey;
    }
}
