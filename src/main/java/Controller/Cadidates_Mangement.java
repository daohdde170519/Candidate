/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Candidates;
import Model.Experience;
import Model.Fresher;
import Model.Intern;
import View.Menu;
import static java.lang.System.exit;
import java.util.ArrayList;

/**
 *
 * @author DAO
 */
public class Cadidates_Mangement extends Menu<String>{
     public ArrayList<Candidates> candidates;
     private CheckValid check;
    static String[] mc = {"Experience","Fresher","Intern","Searching", "Exit"};
    
   public Cadidates_Mangement (){
       super("Cadidates_Mangement", mc);
       check = new CheckValid();
       candidates = new ArrayList<>();
   }
   
    @Override
    public void execute(int choice) {
          switch (choice) {
            case 1 -> createCandidate(candidates,0);
            case 2 -> createCandidate(candidates,1);
            case 3 -> createCandidate(candidates,2);
            case 4 -> searchCandidate(candidates);
            case 5 -> exit(0);
             default -> System.out.println("Try again");
            }
    }

   public void createCandidate(ArrayList<Candidates> candidates, int type){
               //loop until user don't want to create new candidate
        while (true) {
            System.out.print("Enter id: ");
            String id = check.checkInputString();
            //check id exist or not
            if (check.checkIdExist(candidates, id)){
            System.out.print("Enter first name: ");
            String firstName = check.checkInputString();
            System.out.print("Enter last name: ");
            String lastName = check.checkInputString();
            System.out.print("Enter birth date: ");
            int birthDate = check.CheckInputBirthYear();
            System.out.print("Enter address: ");
            String address = check.checkInputString();
            System.out.print("Enter phone: ");
            String phone = check.checkInputPhone();
            System.out.print("Enter email: ");
            String email = check.checkInputEmail();
            
            Candidates candidate = new Candidates(id, firstName, lastName,
                    birthDate,address, phone, email, type);
            
                        
            
                switch (type) {
                    case 0 -> createExperience(candidates, candidate);
                    case 1 -> createFresher(candidates, candidate);
                    case 2 -> createIntern(candidates, candidate);
                
            } 
              }else{
                continue;
            }

            System.out.print("Do you want to continue (Y/N): ");
            //check user want to create new candidate or not
            if (!check.checkInputYN()) {
                return;
            }
        }
     }
     
       //allow user create experience
    public void createExperience(ArrayList<Candidates> candidates,
            Candidates candidate) {
        System.out.print("Enter year of experience: ");
        int yearExperience = check.CheckInputExperience(candidate.getDateOfBirth());
        System.out.print("Enter professional skill: ");
        String professionalSkill = check.checkInputString();
        candidates.add(new Experience(candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getDateOfBirth(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate(), yearExperience, professionalSkill));
        System.err.println("Create success.");
    }
   
        //allow user create fresher
    public void createFresher(ArrayList<Candidates> candidates,
            Candidates candidate) {
        System.out.print("Enter graduation date: ");
        String graduationDate = check.checkInputString();
        System.out.print("Enter graduation rank: ");
        String graduationRank = check.checkInputGraduationRank();
        System.out.print("Enter Education ");
        String Education = check.checkInputString();
        candidates.add(new Fresher(candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getDateOfBirth(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getTypeCandidate(), graduationDate, graduationRank , Education));
        System.err.println("Create success.");
    }
    
        //allow user create internship
    public void createIntern(ArrayList<Candidates> candidates,
            Candidates candidate) {
        System.out.print("Enter major: ");
        String major = check.checkInputString();
        System.out.print("Enter semester: ");
        String semester = check.checkInputString();
        System.out.print("Enter university: ");
        String university = check.checkInputString();
        candidates.add(new Intern( candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getDateOfBirth(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getTypeCandidate(), major, semester, university ));
        System.err.println("Create success.");
    }
    
        //allow user search candidate by name
    public void searchCandidate(ArrayList<Candidates> candidates) {
        printListNameCandidate(candidates);
        System.out.print("Enter andidate name (First name or Last name): ");
        String nameSearch = check.checkInputString();
        System.out.print("Enter type of candidate: ");
        int typeCandidate = check.checkInputIntLimit(0, 2);
        for (Candidates candidate : candidates) {
            if (candidate.getTypeCandidate() == typeCandidate
                    && candidate.getFirstName().contains(nameSearch)
                    || candidate.getLastName().contains(nameSearch)) {
                System.out.println(candidate.toString());
            }
        }
    }

    //display list name candidate
    public void printListNameCandidate(ArrayList<Candidates> candidates) {
        System.err.println("Experience Candidate");
        for (Candidates candidate : candidates) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
        System.err.println("Fresher Candidate");
        for (Candidates candidate : candidates) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
        System.err.println("Internship Candidate");
        for (Candidates candidate : candidates) {
            if (candidate instanceof Intern) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
    }
   }

