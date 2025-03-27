Feature: General business rules

  Scenario Outline: Item degradation
    Given The item "<itemName>" with quality "<initialQuality>" and sell in "<initialSellIn>"
    When "<daysPassed>" day passed
    Then the item has quality "<expectedQuality>"
    And the item has sell by date "<expectedSellIn>"

    Examples:
      | itemName                                  | initialQuality | initialSellIn  | daysPassed | expectedQuality | expectedSellIn |
      | +5 Dexterity Vest                         | 20             | 10             | 1          | 19              | 9              |
      | +5 Dexterity Vest                         | 20             | 10             | 4          | 16              | 6              |
      | +5 Dexterity Vest                         | 20             | 10             | 8          | 12              | 2              |
      | +5 Dexterity Vest                         | 20             | 10             | 12         | 6               | -2             |
      | +5 Dexterity Vest                         | 20             | 10             | 15         | 0               | -5             |
      | Elixir of the Mongoose                    | 7              | 5              | 1          | 6               | 4              |
      | Elixir of the Mongoose                    | 7              | 5              | 3          | 4               | 2              |
      | Elixir of the Mongoose                    | 7              | 5              | 6          | 0               | -1             |
      | Elixir of the Mongoose                    | 7              | 5              | 7          | 0               | -2             |
      | Aged Brie                                 | 0              | 2              | 1          | 1               | 1              |
      | Aged Brie                                 | 0              | 2              | 7          | 12              | -5             |
      | Aged Brie                                 | 0              | 2              | 13         | 24              | -11            |
      | Aged Brie                                 | 0              | 2              | 20         | 38              | -18            |
      | Aged Brie                                 | 0              | 2              | 26         | 50              | -24            |
#      | Aged Brie                                 | 0              | 2              | 27         | 52              | -25            |
      | Sulfuras, Hand of Ragnaros                | 80             | 0              | 1          | 80              | 0              |
      | Sulfuras, Hand of Ragnaros                | 80             | 0              | 5          | 80              | 0              |
      | Sulfuras, Hand of Ragnaros                | 80             | 0              | 10         | 80              | 0              |
      | Backstage passes to a TAFKAL80ETC concert | 20             | 15             | 1          | 21              | 14             |
      | Backstage passes to a TAFKAL80ETC concert | 20             | 15             | 5          | 25              | 10             |
      | Backstage passes to a TAFKAL80ETC concert | 20             | 15             | 10         | 35              | 5              |
      | Backstage passes to a TAFKAL80ETC concert | 20             | 15             | 15         | 50              | 0              |
      | Backstage passes to a TAFKAL80ETC concert | 20             | 15             | 16         | 0               | -1             |
      | Conjured Mana Cake                        | 6              | 3              | 1          | 4               | 2              |
      | Conjured Mana Cake                        | 6              | 3              | 2          | 2               | 1              |
      | Conjured Mana Cake                        | 6              | 3              | 3          | 0               | 0              |
      | Conjured Mana Cake                        | 6              | 3              | 4          | 0               | -1             |
      | Conjured Magic Wand                       | 20             | 4              | 1          | 18              | 3              |
      | Conjured Magic Wand                       | 20             | 4              | 3          | 14              | 1              |
      | Conjured Magic Wand                       | 20             | 4              | 5          | 8               | -1             |
      | Conjured Magic Wand                       | 20             | 4              | 7          | 0               | -3             |
      | Conjured Magic Wand                       | 20             | 4              | 8          | 0               | -4             |
#      | Conjured Fire Ring                        | 10             | 1              | 4          | -4              | -3             |


