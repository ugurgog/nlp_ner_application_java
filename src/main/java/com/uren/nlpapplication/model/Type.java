package com.uren.nlpapplication.model;

public enum Type {

    PERSON("Person"),
    CITY("City"),
    STATE_OF_PROVINCE("State_Of_Province"),
    COUNTRY("Country"),
    EMAIL("Email"),
    TITLE("Title");

    private String type;

    Type(String type){
        this.type = type;
    }

    public String getName(){
        return type;
    }
}
