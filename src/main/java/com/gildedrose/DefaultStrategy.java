package com.gildedrose;

/**
 * Created by gmatheu on 28/04/15.
 */
public class DefaultStrategy  implements ItemStrategy{


    @Override
    public void update(Item item) {
        item.quality = item.quality - 1;
        item.sellIn = item.sellIn - 1;
    }
}
