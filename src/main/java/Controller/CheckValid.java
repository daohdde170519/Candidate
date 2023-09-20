/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Candidates;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAO
 */
public class CheckValid {  
    private final  Scanner in = new Scanner(System.in);
    
    public int CheckInputBirthYear() {
        while (true) {
            try {
                String birthYearStr = in.nextLine().trim();
                int birthYear = Integer.parseInt(birthYearStr);
                int currentYear = Year.now().getValue();

                if (birthYear >= 1900 && birthYear <= currentYear) {
                    return birthYear; // Trả về năm sinh hợp lệ
                } else {
                    System.out.println("Error! Birth Year must be between 1900 and " + currentYear);
                }
            } catch (NumberFormatException | DateTimeParseException e) {
                System.out.println("Error! Not a valid integer.");
            }
        }
    }
      
          /*
    \\d{10} user must be input 10 number
    \\d* user can input more number or not
     */
    private static final String PHONE_VALID = "^\\d{10}\\d*$";
    
    //check user input string
    public  String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
        //check phone is number with minimum 10 characters
    public String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            //check user input phone valid
            if (result.matches(PHONE_VALID)) {
                return result;
            } else {
                System.err.println("Phone is number with minimum 10 characters");
                System.out.println("Enter again: ");
            }
        }
    }
        /*
    [A-Za-z0-9.-+%]+ user must be input from a-z ignore case,0-9 and .-+% least one times
    @ user must be input "@"
    [A-Za-z.-]+ user mustbe input from a-z ignore case, "." "-" least one times
    \\. user must be input "."
    [A-Za-z]{2,4} user must be input from a-z ignore 2 - 4 times
     */
    private static final String EMAIL_VALID
            = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";
        
    //check email with format <account name>@<domain>. (eg: annguyen@fpt.edu.vn)
    public  String checkInputEmail() {
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            //check user input email valid
            if (result.matches(EMAIL_VALID)) {
                return result;
            } else {
                System.err.println("Email with format <account name>@<domain>");
                System.out.println("Enter again: ");
            }
        }
    }
    
    public int CheckInputExperience(int Birth_Day) {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - Birth_Day;
        while(true){
            System.out.print("Enter years of experience (1-100): ");
                     int yearsOfExperience = Integer.parseInt(in.nextLine().trim());

            if (yearsOfExperience < 1 || yearsOfExperience > 100) {
                System.err.println("Error! Years of Experience must be between 1 and 100.");
                System.out.println("Enter again: ");
            } else if(age < yearsOfExperience){
                System.err.println("Error! Y ears Of your Experience must be smaller than Age!! ");
                System.out.println("Enter again: ");
            } else{
                return yearsOfExperience;
            }
        }
    }
    
        //check user input graduation rank
    public String checkInputGraduationRank() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Excellence")
                    || result.equalsIgnoreCase("Good")
                    || result.equalsIgnoreCase("Fair")
                    || result.equalsIgnoreCase("Poor")) {
                return result;
            } else {
                System.err.println("Please input string: Excellence, Good, Fair, Poor");
                System.out.println("Enter again: ");
            }
        }
    }
    
        //check id exist or not
public boolean checkIdExist(ArrayList<Candidates> candidates, String id) {
    for (Candidates candidate : candidates) {
        if (candidate.getId().equalsIgnoreCase(id)) {
            System.err.println("Id exist.");
            System.out.println("Enter again: ");
            return false; 
        }
    }
    return true; 
}

    //check user input y/Y or n/N
    public boolean checkInputYN() {
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            //check user input y/Y or n/N
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
            
        }
    }
    
        //check user input number limit
    public int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
}
