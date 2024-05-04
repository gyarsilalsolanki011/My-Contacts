package com.gsl.mycontacts;

public class ContactModal {
    int img;
    String name, number;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ContactModal(int image, String name, String number){
        this.name = name;
        this.number = number;
        this.img = image;
    }

    public ContactModal(String name, String number){
        this.name = name;
        this.number = number;
    }

}
