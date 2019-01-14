package edu.neu.cs4500.cs4500sp19s3kakadeo.controllers;

public class HelloObject {
    public HelloObject() {
    }
    private String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public HelloObject(String message) {
        this.message = message;
    }

}

