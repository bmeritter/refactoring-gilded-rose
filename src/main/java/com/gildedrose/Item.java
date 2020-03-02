package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    protected boolean isAged() {
        return false;
    }

    protected boolean isSulfuras() {
        return false;
    }

    protected boolean isBackstage() {
        return false;
    }

    public void updateQualityAndSellIn() {
        updateQuality();

        updateSellIn();

        if (sellIn < 0) {
            updateQualityWhenSellInLessZero();
        }
    }

    protected void updateQualityWhenSellInLessZero() {
        if (quality <= 0) {
            return;
        }
        quality = quality - 1;
    }

    protected void updateQuality() {
        if (quality <= 0) {
            return;
        }
        quality = quality - 1;
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }
}
