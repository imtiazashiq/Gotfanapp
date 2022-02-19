package com.khokhar.got;

public class Model {

    int image;
    String character_name;

    public Model(int image, String character_name) {
        this.image = image;
        this.character_name = character_name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCharacter_name() {
        return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }
}
