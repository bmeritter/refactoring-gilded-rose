package com.gildedrose;

public class Sulfuras extends Item {
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    protected boolean isSulfuras() {
        return true;
    }

    @Override
    protected void updateQualityWhenSellInLessZero() {
        return;
    }

    @Override
    protected void updateSellIn() {
        return;
    }

    @Override
    protected void updateQuality() {
        return;
    }
}
