package com.javarush.task.task03.task0320;


/* 
Скромность украшает программиста
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        name = bf.readLine();

        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
