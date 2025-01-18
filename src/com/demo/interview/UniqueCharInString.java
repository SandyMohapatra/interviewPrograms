package com.demo.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueCharInString {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "Happiness is the only thing that multiplies when you share it";

        List<Character> uniqueChars = getUniqueChars(str);
        System.out.println(uniqueChars);

        // Using lambda
        List<Character> chrList = str.chars().mapToObj(c-> (char)c).collect(Collectors.toList());
        Map<Character, Long> charIntMap = chrList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Character> uniqueCh = charIntMap.entrySet().stream().filter(ent -> ent.getValue() == 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(uniqueCh);
    }

    private static List<Character> getUniqueChars(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int idx = 0; idx < str.length(); idx++) {
            char curr = str.charAt(idx);
            if (charCountMap.containsKey(curr)) {
                int count = charCountMap.get(curr);
                charCountMap.put(curr, ++count);
            } else {
                charCountMap.put(curr, 1);
            }
        }

        List<Character> uniqueChars = new ArrayList<>();
        for (Character ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) == 1) {
                uniqueChars.add(ch);
            }
        }
        return uniqueChars;
    }

}
