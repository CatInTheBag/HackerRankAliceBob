package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {

        List<Integer> alice = new ArrayList<>(Arrays.asList(5,6,7));
        List<Integer> bob = new ArrayList<>(Arrays.asList(3,6,10));

	     List<Integer> result = compareTriplets(alice,bob);
        System.out.println(result);
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b)
    {

        List<Integer> resultList = new ArrayList<>();
        Integer[] result = new Integer[]{0,0};

        for(int count = 0; count < a.size(); count++)
        {
            if(a.get(count) > b.get(count))
            {
                ++result[0];
            }
            else if(a.get(count) < b.get(count))
            {
                ++result[1];
            }
            else
            {
                continue;
            }
        }

        resultList = Arrays.asList(result);

        return resultList;

    }


}
