package com.example.rinks.cafecoffeeday;

/**
 * Created by rinks on 25/06/17.
 */

public class Drinks {

    private String name;
    private String info;
    private int imageID;


    public static final Drinks[] drinks={

            new Drinks("LATTE", "This is a Description of Latte coffee", R.drawable.coffee1),
            new Drinks("coffee2", "This is a info of the coffee2", R.drawable.coffee2),
            new Drinks("coffee3", "This is a info of the coffee3", R.drawable.coffee3)

    };

    private Drinks (String name, String info, int imageID) {

        this.name=name;
        this.info=info;
        this.imageID=imageID;
        }

        public String getInfo() {

            return info;
        }

        public String getName() {

            return name;
        }

        public int getImageID() {

            return imageID;
        }

        public String toString() {

            return this.name;
        }
}
