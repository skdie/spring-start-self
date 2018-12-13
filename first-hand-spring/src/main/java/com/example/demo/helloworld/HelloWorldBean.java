package com.example.demo.helloworld;

public class HelloWorldBean {

    private String messsage;

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "mesasage='" + messsage + '\'' +
                '}';
    }

    public void setMessage(String messsage) {
        this.messsage = messsage;
    }

    public String getMessage() {
        return messsage;
    }

    public HelloWorldBean(String message) {
        this.messsage = message;

    }
}
