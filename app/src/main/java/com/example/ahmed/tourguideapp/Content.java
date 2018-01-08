package com.example.ahmed.tourguideapp;

/**
 * Created by Ishaq Hassan on 7/23/2017.
 */

public class Content {
    private String name;
    private String age;
    //description
    private String describtion;
    private int image;

    public Content(String name, String age, String description, int image){
        this.name = name;
        this.age = age;
        this.image = image;
        this.describtion=description;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    //For Description
    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

}
