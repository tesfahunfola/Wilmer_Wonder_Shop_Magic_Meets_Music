package com.pluralsight.musicItem;

public class DrumKit extends MusicItem {

    @Override
    public void use() {
        super.use();
        System.out.println("🥁 Boom boom! The drumbeat fills the room!");
    }
}
