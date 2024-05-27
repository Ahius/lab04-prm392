package com.example.se161047_lab04;

public class Food {

    private String foodName;
    private String foodDes;
    private int image;

    public Food(String foodName, String foodDes, int image) {
        this.foodName = foodName;
        this.foodDes = foodDes;
        this.image = image;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDes() {
        return foodDes;
    }

    public void setFoodDes(String foodDes) {
        this.foodDes = foodDes;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

