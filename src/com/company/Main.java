package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Random;
import java.util.HashMap;

public class Main {

    public static HashMap<Integer, String> raffleTickets = new HashMap<>();

    public static void tickets() {
        boolean active = true;
        while (active) {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("please enter your name");
            try {
                String userName = bufferedReader.readLine();

                System.out.println("do you want to 'check' a ticket or to 'buy' a ticket");
                System.out.println("or enter 'end' if you would like to stop playing");


                String userInput = bufferedReader.readLine();

                Random random = new Random();
                if (userInput.equals("buy")) {
                    System.out.println(userName + " " + "your ticket is" + " " + random.nextInt(401));
                    //} else if (userInput.equals("check")) {

                } else if (userInput.equals("end")) {
                    System.out.println("you have ended the raffle");
                    break;
                }

            } catch (IOException e) {
                System.out.println("sorry, that is a error");
            }
        }
    }

    public static String input() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            return bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("error!!" + e);

        }
        return "";

    }

    public static int menu (String input) {
        switch (input.toLowerCase(Locale.ROOT)) {
            case "check":
                return 1;
            case "buy":
                return 2;
            case "end":
                return 3;

        }
        return 0;
    }

    public static void ticketCheck(int check) {
        if (check == 1){
            System.out.println("what is your name");
        String name = input().toLowerCase();
        System.out.println("what ticket number do you have ?");
        try {
            int yourTicketNumb = Integer.parseInt(input());

        } catch (NumberFormatException e) {
            System.out.println("you have not entered a number");
        }
    }else if (check == 2 ){
            System.out.println("what is your name ?");
            String name = input().toLowerCase();
        }


    }

    public static void ticketMaker(String name){
        Random random = new Random();
        int randomNumber = (random.nextInt(401));
        boolean duplicate = true;
        while(duplicate){
            if (raffleTickets.containsKey(randomNumber)){
                randomNumber = (random.nextInt(401));
            }else{
                duplicate = false;
            }
        }
        raffleTickets.put(randomNumber,  (name));
        System.out.println(name + " " + "your number is" + " " + randomNumber);
    }
    public static void winningTickets(String name , int randomNumber) {
        boolean primeNumber = true;
        try {
            if (raffleTickets.get(randomNumber).equals(name)){
                System.out.println("this is your ticket");
                for (int i = 2; i < randomNumber/ 2; i++){
                    if (randomNumber % i == 0) {
                        System.out.println(" you have not won the raffle.");
                        primeNumber = false;
                        break;
            }

        }
        }
        if(primeNumber){
            System.out.println("you have won :))))))))");
    }
    }catch(NullPointerException e){
            System.out.println("this is not your number");
        }
    }





    public static void main(String[] args) {
        tickets();
       ticketMaker();
       ticketCheck();
        }




}


    








