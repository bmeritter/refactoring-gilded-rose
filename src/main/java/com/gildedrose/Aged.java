package com.gildedrose;

public class Aged extends Item {
    public Aged(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    protected boolean isAged() {
        return true;
    }

    @Override
    protected void updateQualityWhenSellInLessZero() {
        if (quality >= 50) {
            return;
        }
        quality = quality + 1;
    }

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
