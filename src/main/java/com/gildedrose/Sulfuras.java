package com.gildedrose;

public class Sulfuras extends Item {
    public Sulfuras(Item item) {
        super(item.name, item.sellIn, item.quality);
        QUALITY_AGING = 1;
    }
}
