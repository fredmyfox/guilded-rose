package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item workingItem = items[i];
            if (! workingItem.name.equals(AgedBrie.NAME)) {
                workingItem = new AgedBrie(items[i]);
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

        /*for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }

            if (items[i].quality < 0) {
                items[i].quality = 0;
            } else if (items[i].quality > 50 && !items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].quality = 50;
            }
        }*/
    }
}