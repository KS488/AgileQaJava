package com.exercise;

public class Main {

    public static void main(String[] args) {
        VowelCounter counter = new VowelCounter();
        var resultVowel = counter.getVowelListWithCount(args);
        System.out.println(resultVowel);
      
}
}

