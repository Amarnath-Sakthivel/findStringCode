package com.wipro.practice;
import java.util.Scanner;

public class findStringValue {
    static int findStringCode(String in) {
        in = in.toUpperCase();
        int val;
        String concat = "";
        for (String split : in.split(" ")) {
            int len = split.length();
            int sum = 0;
            if (split.length() % 2 == 1) {
                for (int i = 0; i <= split.length() / 2; i++) {
                    val = Math.abs(split.charAt(i) - 'A' + 1) - Math.abs(split.charAt(len - 1) - 'A' + 1);
                    sum += (Math.abs(val));
                    len--;
                    if (i == len) {
                        val = Math.abs(split.charAt(i) - 'A' + 1);
                        sum += val;
                    }
                }
            } else {
                for (int i = 0; i < split.length() / 2; i++) {
                    val = Math.abs(split.charAt(i) - 'A' + 1) - Math.abs(split.charAt(len - 1) - 'A' + 1);
                    sum += (Math.abs(val));
                    len--;
                    if (i == len) {
                        val = Math.abs(split.charAt(i) - 'A' + 1);
                        sum += val;
                    }
                }
            }
            System.out.println(sum);
            concat += sum;

        }
        System.out.println(concat);
        return 0;
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        findStringCode(in);
    }


}
