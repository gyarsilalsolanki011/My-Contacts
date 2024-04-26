package com.gsl.mycontacts;

public class ContactModal {
    int img;
    String name, number;

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
