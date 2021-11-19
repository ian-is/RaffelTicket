package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void tickets() {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("what is your name");
            try {
            String userName = bufferedReader.readLine();

            System.out.println("do you want to check a ticket or to but a ticket");

                String userInput = bufferedReader.readLine();

                Random random = new Random();
                if (userInput.equals("buy")) {
                    System.out.println(userName + " " + random.nextInt(401));
                }else if(userInput.equals("check")){
                    
                }


            } catch (Exception e) {
                System.out.println("sorry, that is a error");


            }


        }



    public static void main(String[] args) {
        tickets();


        ;


    }
}
