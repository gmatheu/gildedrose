package com.gildedrose;

/**
 * Created by gmatheu on 28/04/15.
 */
public class BackstageStrategy  implements ItemStrategy{
    @Override
    public void update(Item item) {
        item.quality = increaseQuality(item.quality);

        item.sellIn = updateSellIn(item.sellIn);
        if (item.sellIn < 11) {
            item.quality = increaseQuality(item.quality);
        }

        if (item.sellIn < 6) {
            item.quality = increaseQuality(item.quality);
        }
        if(item.sellIn < 0){
            item.quality = 0;
        }

    }
}
