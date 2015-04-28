package com.gildedrose;

/**
 * Created by gmatheu on 28/04/15.
 */
public class DefaultStrategy  implements ItemStrategy{


    @Override
    public void update(Item item) {
        item.sellIn = updateSellIn(item.sellIn);
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality = item.quality - 1;
        }
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }

    }
}
