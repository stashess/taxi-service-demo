package com.taxi.input;

import java.util.Arrays;
import java.util.Scanner;

public class InputUtils {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String EXIT = "q";


    private static void clearScanner() {
        SCANNER.next();
    }


    public static void ifExitPressed() {
        clearScanner();
        if (InputUtils.SCANNER.hasNext("^q$")){
            throw new RuntimeException();
        }
    }

    public static double getPositiveDouble(String fieldName) {
        if (SCANNER.hasNextDouble()) {
            double positiveDouble = SCANNER.nextDouble();
            if (positiveDouble < 0) {
                System.out.println(fieldName + " cannot be negative.");
                return getPositiveDouble(fieldName);
            }
            return positiveDouble;
        } else {
            InputUtils.clearScanner();
            System.out.println(fieldName + " should be positive double");
            return getPositiveDouble(fieldName);
        }
    }


    //java generics
    //enum
    //class class
    public static <T extends Enum<T>> T getEnumValue(Class<T> type) {
        System.out.println("Select, one of the following options " + Arrays.toString(type.getEnumConstants()));
        String input = SCANNER.next();
        input = input.toUpperCase();
        try {
            return Enum.valueOf(type, input);
        } catch (IllegalArgumentException e) {
            System.out.println("Unfortunately,there is no such class");
            return getEnumValue(type);
        }
    }
}
