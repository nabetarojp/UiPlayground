package com.example.watanabe.uiplayground.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by watanabe on 2017/08/16.
 */

public class Dessert {

    public String title;
    public String description;

    public Dessert(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public static List<Dessert> prepareDesserts(String[] names, String[] descriptions) {
        List<Dessert> desserts = new ArrayList<>(names.length);

        for (int i = 0; i < names.length; i++) {
            Dessert dessert = new Dessert(names[i], descriptions[i]);
            desserts.add(dessert);
        }

        return desserts;
    }
}
