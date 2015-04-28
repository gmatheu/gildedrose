package com.gildedrose;

class GildedRose {
    private Item[] items;

    public GildedRose(Item[] items) {
        this.setItems(items);
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItem(item);
        }
    }

    private void updateItem(Item item) {
        ItemStrategy strategy = Strategy.detect(item);
        strategy.update(item);
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}
