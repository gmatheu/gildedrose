package com.gildedrose;

/**
 * Created by gmatheu on 28/04/15.
 */
public class Strategy {
    public static ItemStrategy detect(Item item) {
        switch (item.name){
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstageStrategy();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasStrategy();
            case "Aged Brie":
                return new AgedBrieStrategy();
            default:
                return new DefaultStrategy();
        }
    }
}
