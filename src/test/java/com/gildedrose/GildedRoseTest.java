package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void decreasesQualityAndSellInDateByOne() {
        Item[] items = new Item[] { new Item("foo", 20, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("decreases sell in by date", app.getItems()[0].sellIn, 19);
        assertEquals("decreases quality by date", app.getItems()[0].quality, 39);
    }
    @Test
    public void decreaseQualityTwiceWhenSellinDateIsPassed() {
        Item[] items = new Item[] { new Item("foo", 0, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("decreases sell in by date", app.getItems()[0].sellIn, -1);
        assertEquals("decreases quality in by date", app.getItems()[0].quality, 38);
    }
    @Test
    public void qualityNeverNegativeForDefaultItem() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("quality is positive", app.getItems()[0].quality, 0);
    }

    @Test
    public void agedBrieAlwaysIncreasesQuality() {
        Item[] items = new Item[] { new Item("Aged Brie", 20, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("increases quality by date", app.getItems()[0].quality, 41);
    }

    @Test
    public void qualityOfAnItemIsNeverMoreThanFifty() {
        Item[] items = new Item[] { new Item("Aged Brie", 20, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("quality never passes 50", app.getItems()[0].quality, 50);
    }

    @Test
    public void qualityOfAnBackstageItemIsNeverMoreThanFifty() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 20, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("quality never passes 50", app.getItems()[0].quality, 50);
    }

    @Test
    public void sulfurasNeverHasToBeSoldOrDecreaseQuality() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 2, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("never has to be sold", app.getItems()[0].sellIn, 2);
        assertEquals("never decrease quality", app.getItems()[0].quality, 40);
    }

    @Test
    public void backstagePassesIncreasesQualityByThreeWithSellInOne() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 1, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("never has to be sold", app.getItems()[0].sellIn, 0);
        assertEquals("never decrease quality", app.getItems()[0].quality, 43);
    }

    @Test
    public void backstagePassesIncreasesQualityAsSeDateAproachesTen() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("never has to be sold", app.getItems()[0].sellIn, 9);
        assertEquals("never decrease quality", app.getItems()[0].quality, 42);
    }

    @Test
    public void backstagePassesIncreasesQualityAsSeDateAproachesFive() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("never has to be sold", app.getItems()[0].sellIn, 4);
        assertEquals("never decrease quality", app.getItems()[0].quality, 43);
    }

    @Test
    public void backstagePassesDropsTo0WhenSellIn0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("never has to be sold", app.getItems()[0].sellIn, -1);
        assertEquals("never decrease quality", app.getItems()[0].quality, 0);
    }

    @Test
    public void conjuredItemDecreaseTwiceFaster() {
        Item[] items = new Item[] { new Item("Conjured", 10, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("sellIn decrease in one", app.getItems()[0].sellIn, 9);
        assertEquals("quality decrease in two", app.getItems()[0].quality, 38);
    }

}
