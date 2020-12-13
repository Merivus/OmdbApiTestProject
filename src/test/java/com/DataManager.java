package com;

public enum DataManager {

    API_KEY("apiKey"),
    ID("i"),
    TITLE("t"),
    TYPE("type"),
    YEAR("y"),
    PLOT("plot"),
    DATA_TYPE("r"),
    CALLBACK("callback"),
    APIVERSION("v"),
    FILM_NAME("s"),
    PAGE("page"),
    ;

    private String data;

    DataManager(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
