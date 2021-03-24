package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        int sum = 0;
        for (int number: numbers) {
            if(number % 2 == 1) {
                sum = sum + number;
            }
        }

        return sum;
    }
}