package se.crisp.edu.refactor.gildedrose.step;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import se.crisp.edu.refactor.gildedrose.GildedRose;
import se.crisp.edu.refactor.gildedrose.Inventory;
import se.crisp.edu.refactor.gildedrose.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneralSteps {

//    private static final String SOME_NAME = "some name";
    private GildedRose gildedRose;
    private Inventory inventory;
    private Item currentItem;

    @Before
    public void beforeAll() {
        inventory = new Inventory();
        gildedRose = new GildedRose(inventory);
    }

    @Given("^The item \"([^\"]*)\" with quality \"(-?\\d+)\" and sell in \"(-?\\d+)\"$")
    public void the_item_with_quality_and_sell_in(String itemName, int initialQuality, int initialSellIn) throws Throwable {
        currentItem = new Item(itemName, initialSellIn, initialQuality);
        inventory.addItem(currentItem);
    }

    @When("^\"(-?\\d+)\" day passed$")
    public void day_passed(int daysPassed) throws Throwable {
        for (int n = 0; n < daysPassed; n++) {
            gildedRose.updateQuality();
//            System.out.println("Quality by day " + n + " : + " + currentItem.getQuality());


        }
    }

    @Then("^the item has quality \"(-?\\d+)\"$")
    public void the_item_has_quality(int expectedQuality) throws Throwable {
//        System.out.println("Expected quality : " + expectedQuality + ", calculated quality : " + currentItem.quality);
        assertEquals(expectedQuality, currentItem.quality);
    }

    @And("^the item has sell by date \"(-?\\d+)\"$")
    public void theItemHasSellByDate(int expectedSellIn) throws Throwable {
//        System.out.println("Expected sell in : " + expectedSellIn + ", calculated sell in : " + currentItem.sellIn);
        assertEquals(expectedSellIn, currentItem.sellIn);
    }
}

