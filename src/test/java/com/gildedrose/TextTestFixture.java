package com.gildedrose;

class TextTestFixture {
    public static void main(String[] args) {
        String output = getReceiptString();
        System.out.println(output);
    }

    public static String getReceiptString() {
        StringBuilder output = new StringBuilder();
        output.append("OMGHAI!").append('\n');

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 1, 20),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 3;

        for (int i = 0; i < days; i++) {
            output.append("-------- day " + i + " --------").append('\n');
            output.append("name, sellIn, quality").append('\n');
            for (Item item : items) {
                output.append(item.toString()).append('\n');
            }
            output.append('\n');
            app.update_quality();
        }
        return output.toString();
    }

}
