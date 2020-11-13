package com.gildedrose;

public class AgedBrie extends Item {

    public static String NAME = "Aged Brie";

    public AgedBrie(Item item) {
        super(item.name, item.sellIn, item.quality);
        QUALITY_AGING = 1;
    }
}
