/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DAO
 */
public class Fresher extends Candidates{
    private String Graduation_date;
    private String Graduation_rank;
    private String Education;
    public Fresher(String Id, String FirstName, String LastName, int dateOfBirth, String address, String Phone, String Email, int typeCandidate, String Graduation_date, String Graduation_rank, String Education ) {
        super(Id, FirstName, LastName, dateOfBirth, address, Phone, Email, typeCandidate);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

    public String getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(String Graduation_date) {
        this.Graduation_date = Graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String Graduation_rank) {
        this.Graduation_rank = Graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }
    
}
