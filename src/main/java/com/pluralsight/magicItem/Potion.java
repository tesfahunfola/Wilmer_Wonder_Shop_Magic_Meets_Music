package com.pluralsight.magicItem;

public class Potion extends MagicItem {

    public Potion(String name, double price) {
        super(name, price);
    }

    @Override
    public void use() {
        super.use();
        System.out.println("💫 You drink the potion. You feel invisible!");
    }
}
