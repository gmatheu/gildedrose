package com.gildedrose;

public class ConjuredStrategy implements ItemStrategy{

    @Override
    public void update(Item item) {
        item.sellIn = updateSellIn(item.sellIn);

        item.quality -= 2;
        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
