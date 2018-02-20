package com.hfad.toolbar;

/**
 * Created by Kin on 2/15/18.
 */

public class Pizza {
    private String name;
    private int imageResourceId;

    public static final Pizza[] pizzas = {
            new Pizza("diavolo", R.drawable.diavolo),
            new Pizza("funghi", R.drawable.funghi)
    };

    public Pizza (String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName () {
        return name;
    }

    public int getImageResourceId () {
        return imageResourceId;
    }

}
