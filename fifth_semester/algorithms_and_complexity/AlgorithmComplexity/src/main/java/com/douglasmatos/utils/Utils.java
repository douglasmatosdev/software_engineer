package com.douglasmatos.utils;

public abstract class Utils {

    public static String toString(int[] list) {
        String result = "";
        int length = list.length;

        for (int i = 0; i < length; i++) {
            result += list[i];

            if (i != length - 1)
                result += ", ";
        }

        return result;
    }
}
