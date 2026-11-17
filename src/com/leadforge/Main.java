package com.leadforge;
import java.util.Scanner;




public class Main{
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        boolean running = true;
        while (running){

            System.out.println("\n==== Lead Forge ====");
            System.out.println("1- Add Leads");
            System.out.println("2- View Leads");
            System.out.println("3- Search Leads");
            System.out.println("4- Exit\n\n");
            System.out.print("Enter your choice (1-4): ");

            String choice = obj.nextLine();// used string instead of int so we don't get int errors


            switch(choice){

                case "1":

                    System.out.print("Enter name: ");
                    String name = obj.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = obj.nextLine();

                    System.out.print("Enter email: ");
                    String email = obj.nextLine();

                    System.out.println();

                    addLeads(name,phone,email);


                    break;
                case "2":
                    System.out.println("View leads selected");
                    break;
                case "3":
                    System.out.println("Search leads selected");
                    break;
                case "4":
                    running = false;
                    System.out.println("Exit selected");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }
        obj.close();

    }

    static void addLeads(String name, String phone, String email){
        System.out.println("Lead added successfully!");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phone);
        System.out.println("Email: " + email);
    }


}
