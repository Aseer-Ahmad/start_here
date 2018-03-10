package com.example.newu.exa_ui;

/**
 * Created by nEW u on 09/03/2018.
 */

public class Book {
    private String category;
    private String title;
    private String description;
    private int thumbnail;

    public Book(){
    }

    public Book(String category, String title, String description, int thumbnail) {
        this.category = category;
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getCategory() {

        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getThumbnail() {
        return thumbnail;
    }
}
