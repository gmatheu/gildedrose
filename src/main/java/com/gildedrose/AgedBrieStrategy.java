package com.gildedrose;

/**
 * Created by gmatheu on 28/04/15.
 */
public class AgedBrieStrategy implements ItemStrategy{
    @Override
    public void update(Item item) {

        item.sellIn = updateSellIn(item.sellIn);

        item.quality = increaseQuality(item.quality);
    }
}
