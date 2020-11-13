package com.gildedrose;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public static String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static String TAFKAL80ETC_BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";

    public static int QUALITY_AGING = -1;
    public static int SELL_IN_AGING = -1;
    public static int MAX_QUALITY = 50;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality() {
        int currentQualityAging = this.name.contains("Conjured") ? QUALITY_AGING * 2 : QUALITY_AGING;

        this.sellIn = this.sellIn + SELL_IN_AGING;
        this.quality = this.sellIn < 0 ? this.quality + currentQualityAging * 2 : this.quality + currentQualityAging;
        if (this.quality < 0) {
            this.quality = 0;
        } else if (this.quality > MAX_QUALITY) {
            this.quality = MAX_QUALITY;
        }
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
