package com.gildedrose;

public class Aged extends Item {
    public Aged(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    protected boolean isAged() {
        return true;
    }
}
