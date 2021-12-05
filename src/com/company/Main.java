package com.company;
import java.util.ArrayList; // list библиотекасын қостық
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>(); // list
       list.add("SIB 29"); // spisokka kosu
       list.add("FIT");
       String abc= list.get(0); // 0 indexti el aku
        System.out.println(abc); // consol shigaru
        System.out.println(list);
    }
}
