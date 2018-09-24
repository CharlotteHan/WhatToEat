package com.example.charlotte.what_to_eat;

/**
 * Created by Charlotte on 23/9/18.
 */
public class Restaurant {
    private String name;
    private String image_name;
    private String dis;

    public Restaurant(String name, String image_name, String dis) {
        this.name = name;
        this.image_name = image_name;
        this.dis = dis;
    }

    public String getResName(){
        return this.name;
    }

    public String getImageName() {
        return this.image_name;
    }

    public String getDis() {
        return this.dis;
    }
}
