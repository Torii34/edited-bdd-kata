package se.crisp.edu.refactor.gildedrose;

import java.util.ArrayList;

public class Inventory {

    private final ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
//        items.add(new Item("+5 Dexterity Vest", 10, 20)); //Normal
//        items.add(new Item("Aged Brie", 2, 0)); //Aged
//        items.add(new Item("Elixir of the Mongoose", 5, 7)); //Normal
//        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80)); //Legendary item
//        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)); //Passes
//        items.add(new Item("Conjured Mana Cake", 3, 6)); //Conjured
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
