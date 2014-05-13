package edu.gmu.bah.class14.lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by student on 5/13/14.
 */
public class ListExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Bob");
        names.add("Sarah");
        System.out.println(names);

        List<String> colors = Arrays.asList("Red", "Green", "Blue");
        System.out.println(colors);
    }
}
