package com.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] {
                new Item("Null", 0, 0),
                new Item("Thunderfury, Blessed Blade of the Windseeker", 10, 10),
                new Item("Aged Brie", 10, 1),
                new Item("Sulfuras, Hand of Ragnaros", 10, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10),
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10),
                new Item("Thunderfury, Blessed Blade of the Windseeker", 10, 49),
                new Item("Thunderfury, Blessed Blade of the Windseeker", 10, 60),
                new Item("Thunderfury, Blessed Blade of the Windseeker", 0, 50),
                new Item("Aged Brie", 0, 1),
                new Item("Conjured Mana Cake", 10, 10),
                new Item("Conjured Mana Cake", 0, 10),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Null", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
        assertEquals("Thunderfury, Blessed Blade of the Windseeker", app.items[1].name);
        assertEquals(9, app.items[1].sellIn);
        assertEquals(9, app.items[1].quality);
        assertEquals("Aged Brie", app.items[2].name);
        assertEquals(9, app.items[2].sellIn);
        assertEquals(2, app.items[2].quality);
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[3].name);
        assertEquals(10, app.items[3].sellIn);
        assertEquals(80, app.items[3].quality);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[4].name);
        assertEquals(9, app.items[4].sellIn);
        assertEquals(12, app.items[4].quality);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[5].name);
        assertEquals(4, app.items[5].sellIn);
        assertEquals(13, app.items[5].quality);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[6].name);
        assertEquals(-1, app.items[6].sellIn);
        assertEquals(0, app.items[6].quality);
        assertEquals("Thunderfury, Blessed Blade of the Windseeker", app.items[7].name);
        assertEquals(9, app.items[7].sellIn);
        assertEquals(48, app.items[7].quality);
        assertEquals("Thunderfury, Blessed Blade of the Windseeker", app.items[8].name);
        assertEquals(9, app.items[8].sellIn);
        assertEquals(50, app.items[8].quality);
        assertEquals("Thunderfury, Blessed Blade of the Windseeker", app.items[9].name);
        assertEquals(-1, app.items[9].sellIn);
        assertEquals(48, app.items[9].quality);
        assertEquals("Aged Brie", app.items[10].name);
        assertEquals(-1, app.items[10].sellIn);
        assertEquals(3, app.items[10].quality);
        assertEquals("Conjured Mana Cake", app.items[11].name);
        assertEquals(9, app.items[11].sellIn);
        assertEquals(8, app.items[11].quality);
        assertEquals("Conjured Mana Cake", app.items[12].name);
        assertEquals(-1, app.items[12].sellIn);
        assertEquals(6, app.items[12].quality);

        app.updateQuality();
        assertEquals("Null", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
        assertEquals("Thunderfury, Blessed Blade of the Windseeker", app.items[1].name);
        assertEquals(8, app.items[1].sellIn);
        assertEquals(8, app.items[1].quality);
        assertEquals("Aged Brie", app.items[2].name);
        assertEquals(8, app.items[2].sellIn);
        assertEquals(3, app.items[2].quality);
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[3].name);
        assertEquals(10, app.items[3].sellIn);
        assertEquals(80, app.items[3].quality);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[4].name);
        assertEquals(8, app.items[4].sellIn);
        assertEquals(14, app.items[4].quality);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[5].name);
        assertEquals(3, app.items[5].sellIn);
        assertEquals(16, app.items[5].quality);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[6].name);
        assertEquals(-2, app.items[6].sellIn);
        assertEquals(0, app.items[6].quality);
        assertEquals("Thunderfury, Blessed Blade of the Windseeker", app.items[7].name);
        assertEquals(8, app.items[7].sellIn);
        assertEquals(47, app.items[7].quality);
        assertEquals("Thunderfury, Blessed Blade of the Windseeker", app.items[8].name);
        assertEquals(8, app.items[8].sellIn);
        assertEquals(49, app.items[8].quality);
        assertEquals("Thunderfury, Blessed Blade of the Windseeker", app.items[9].name);
        assertEquals(-2, app.items[9].sellIn);
        assertEquals(46, app.items[9].quality);
        assertEquals("Aged Brie", app.items[10].name);
        assertEquals(-2, app.items[10].sellIn);
        assertEquals(5, app.items[10].quality);
        assertEquals("Conjured Mana Cake", app.items[11].name);
        assertEquals(8, app.items[11].sellIn);
        assertEquals(6, app.items[11].quality);
        assertEquals("Conjured Mana Cake", app.items[12].name);
        assertEquals(-2, app.items[12].sellIn);
        assertEquals(2, app.items[12].quality);
    }

}
