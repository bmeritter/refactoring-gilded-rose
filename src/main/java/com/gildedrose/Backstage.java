package com.gildedrose;

public class Backstage extends Item {
    public Backstage(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    protected boolean isBackstage() {
        return true;
    }

    @Override
    protected void updateQualityWhenSellInLessZero() {
        quality = 0;
    }
}
