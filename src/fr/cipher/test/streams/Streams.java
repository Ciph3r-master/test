package fr.cipher.test.streams;

import java.util.Arrays;
import java.util.Comparator;

public class Streams {

    public void displayTab(double[] numbers){

        Arrays.stream(numbers).forEach(System.out::println);

    }

    public Integer maxTab(Integer[] numbers){


        Integer r = Arrays.stream(numbers).max(Comparator.comparing(Integer::valueOf)).get();

        return r;

    }

    public Object meanValue(Integer... n){

        int r = Arrays.stream(n).mapToInt(Integer::intValue).sum();

        return r/n.length;

    }

}
