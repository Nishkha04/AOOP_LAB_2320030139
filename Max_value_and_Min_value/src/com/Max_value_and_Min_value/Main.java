package com.Max_value_and_Min_value;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {3, 5, 1, 9, 7};
        MinMaxImpl<Integer> intMinMax = new MinMaxImpl<>(intArray);
        System.out.println("Integer Array: " + Arrays.toString(intArray));
        System.out.println("Min: " + intMinMax.min());
        System.out.println("Max: " + intMinMax.max());
        String[] strArray = {"apple", "banana", "cherry", "date"};
        MinMaxImpl<String> strMinMax = new MinMaxImpl<>(strArray);
        System.out.println("String Array: " + Arrays.toString(strArray));
        System.out.println("Min: " + strMinMax.min());
        System.out.println("Max: " + strMinMax.max());
        Character[] charArray = {'x', 'a', 'z', 'b', 'q'};
        MinMaxImpl<Character> charMinMax = new MinMaxImpl<>(charArray);
        System.out.println("Character Array: " + Arrays.toString(charArray));
        System.out.println("Min: " + charMinMax.min());
        System.out.println("Max: " + charMinMax.max());
        Float[] floatArray = {3.5f, 1.2f, 4.8f, 2.9f};
        MinMaxImpl<Float> floatMinMax = new MinMaxImpl<>(floatArray);
        System.out.println("Float Array: " + Arrays.toString(floatArray));
        System.out.println("Min: " + floatMinMax.min());
        System.out.println("Max: " + floatMinMax.max());
    }
}
