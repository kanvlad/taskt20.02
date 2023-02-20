package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        String s = "1050,1091,1084,1101,1090,1088,1091,44,32,1089,32,1044,1085,1077,1084,32,1056,1086,1078,1076,1077,1085,1080,1103";

        String[] chars = s.split(",");

        for (int i = 0; i < chars.length; i++) {
            System.out.print((char) Integer.parseInt(chars[i]));
        }


    }


}