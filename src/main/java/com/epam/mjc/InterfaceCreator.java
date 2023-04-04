package com.epam.mjc;

import java.util.ArrayList;

public class InterfaceCreator {
    public Operation<Integer> divideBy(Integer divider) {
        return list -> {
            var result = new ArrayList<Integer>();
            for (var number: list) {
                result.add(number / divider);
            }
            return result;
        };
    }
}
