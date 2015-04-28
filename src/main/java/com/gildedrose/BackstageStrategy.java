package com.gildedrose;

/**
 * Created by gmatheu on 28/04/15.
 */
public class BackstageStrategy  implements ItemStrategy{
    @Override
    public void update(Item item) {

        item.sellIn = item.sellIn - 1;
            if (item.sellIn < 11) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }

            if (item.sellIn < 6) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }

    }
}
