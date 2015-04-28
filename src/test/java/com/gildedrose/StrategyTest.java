package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by gmatheu on 28/04/15.
 */
public class StrategyTest {
    @Test
    public void testDefaultStrategy() {
        Item item = new Item("any name", 20, 40);
        ItemStrategy strategy = Strategy.detect(item);

        assertTrue("is default strategy", strategy instanceof DefaultStrategy);
    }
    @Test
    public void agedBrieItemReturnsAgedBrieStrategy() {
        Item item = new Item("Aged Brie", 20, 40);
        ItemStrategy strategy = Strategy.detect(item);

        assertTrue("is default strategy", strategy instanceof AgedBrieStrategy);
    }
    @Test
    public void sulfurasItemReturnsSulfurasStrategy() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 20, 40);
        ItemStrategy strategy = Strategy.detect(item);

        assertTrue("is default strategy", strategy instanceof SulfurasStrategy);
    }

    @Test
    public void backstageItemReturnsBackstageStrategy() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 20, 40);
        ItemStrategy strategy = Strategy.detect(item);

        assertTrue("is default strategy", strategy instanceof BackstageStrategy);
    }

    @Test
    public void conjuredItemReturnsConjuredStrategy() {
        Item item = new Item("Conjured", 20, 40);
        ItemStrategy strategy = Strategy.detect(item);

        assertTrue("is default strategy", strategy instanceof ConjuredStrategy);
    }
}