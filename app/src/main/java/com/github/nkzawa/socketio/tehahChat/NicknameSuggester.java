package com.github.nkzawa.socketio.tehahChat;
import java.util.Random;
/**
 * A class to handle suggested nicknames for users
 * The final output nickname is a concat of a color and an animal
 * from the hardcoded arrays.
 * e.g. AmberAlligator
 */

public class NicknameSuggester {

    private String[] colorArray = {"Amber", "Beige", "Carmine", "Daffodil", "Eminence",
                                    "Flax", "Grape", "HotPink", "Iris", "Jade", "Jet",
                                    "Lapis", "Mauve", "Navy", "Onyx", "Pearl", "Quartz",
                                    "Rose", "Scarlet", "Teal", "Umbra", "Vermilion",
                                    "Wood", "Yellow", "Zaffre"};
    private String[] animalArray = {"Alligator", "Boar", "Camel", "Dingo", "Eagle", "Ferret",
                                    "Gecko", "Hyena", "Iguana", "Jellyfish", "Kangaroo",
                                    "Lizard", "Mouse", "Numbat", "Octopus", "Panther",
                                    "Quail", "Raccoon", "Seahorse", "Toucan", "Urchin",
                                    "Vulture", "Wombat", "Xerus", "Yak", "Zebra"};

    public NicknameSuggester(){}

    public String suggestName(){
        try {
            return colorArray[new Random().nextInt(25)] + animalArray[new Random().nextInt(25)];
        }
        catch (IndexOutOfBoundsException e){
            return "AlphaOmega";
        }
    }
}
