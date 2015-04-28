package com.gildedrose;

/**
 * Created by gmatheu on 28/04/15.
 */
public interface ItemStrategy {

    void update(Item item);

    default Integer updateSellIn(final Integer sellIn) {
        return sellIn - 1;
    }

    default Integer increaseQuality(final Integer quality) {
        if(quality < 50) {
            return quality + 1;
        }
        return quality;
    }
}
