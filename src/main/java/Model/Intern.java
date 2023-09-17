/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DAO
 */
public class Intern extends Candidates {
    private String major;
    private String semester;
    private String university;
    public Intern(String Id, String FirstName, String LastName, int dateOfBirth, String address, String Phone, String Email, int typeCandidate, String major, String semester, String university) {
        super(Id, FirstName, LastName, dateOfBirth, address, Phone, Email, typeCandidate);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    
}
