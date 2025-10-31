package com.pluralsight.musicItem;

public class Guitar extends MusicItem {
    public Guitar(String name, double price) {
        super(name, price);
    }

    @Override
    public void use() {
        super.use();
        System.out.println("🎸 Strumming the strings of the guitar!");
    }
}
