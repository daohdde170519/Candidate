/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DAO
 */
public class Experience extends Candidates {
    private int ExpInYear;
    private String ProSkill;
    
     
    public Experience(String Id, String FirstName, String LastName, int dateOfBirth, String address, String Phone, String Email, int typeCandidate, int ExpInYear, String ProSkill) {
        super(Id, FirstName, LastName, dateOfBirth, address, Phone, Email, typeCandidate);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int ExpInYear) {
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }
    
    
    
}
