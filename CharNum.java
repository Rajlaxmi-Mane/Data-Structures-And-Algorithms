package com.patterns;
class CharNum {
    public static void main(String[] args) {

        String str = "a5b2c3";

        for (int i = 0; i < str.length(); i += 2) {

            char ch = str.charAt(i);
            int num = Character.getNumericValue(str.charAt(i + 1));

            for (int j = 0; j < num; j++) {
                System.out.print(ch);
            }
        }
    }
}