package org.src;

public class functions {
    static boolean divideBy3(int i) {
        int result = 0;
        result = i % 3;
        if (result == 0) {
            return true;
        }
        return false;
    }

    static boolean divideBy5(int i) {
        int result = 0;
        result = i % 5;
        if (result == 0) {
            return true;
        }
        return false;
    }
}
