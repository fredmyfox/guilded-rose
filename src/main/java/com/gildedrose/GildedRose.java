package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            items[i].QUALITY_AGING = -1;
            items[i].SELL_IN_AGING = -1;
            items[i].MAX_QUALITY = 50;
            if (items[i].name.equals(AgedBrie.NAME)) {
                items[i].QUALITY_AGING = 1;
            } else if (items[i].name.equals(Item.SULFURAS)) {
                items[i].QUALITY_AGING = 0;
                items[i].SELL_IN_AGING = 0;
                items[i].MAX_QUALITY = 80;
            } else if (items[i].name.equals(Item.TAFKAL80ETC_BACKSTAGE_PASSES)) {
                if (items[i].sellIn > 10) {
                    items[i].QUALITY_AGING = 1;
                } else if (items[i].sellIn > 5) {
                    items[i].QUALITY_AGING = 2;
                } else if (items[i].sellIn > 0) {
                    items[i].QUALITY_AGING = 3;
                } if (items[i].sellIn <= 0) {
                    items[i].QUALITY_AGING = -items[i].quality;
                }
            }

            items[i].updateQuality();
        }
    }
}