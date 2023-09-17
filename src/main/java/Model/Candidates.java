/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DAO
 */
public class Candidates {
    private String Id;
    private String FirstName;
    private String LastName;
    private int dateOfBirth;
    private String address;
    private String Phone;
    private String Email;
    private int typeCandidate;

    public Candidates(String Id, String FirstName, String LastName, int dateOfBirth, String address, String Phone, String Email, int typeCandidate) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.Phone = Phone;
        this.Email = Email;
        this.typeCandidate = typeCandidate;
        
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int  getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public int getTypeCandidate() {
        return typeCandidate;
    }

    public void setTypeCandidate(int typeCandidate) {
        this.typeCandidate = typeCandidate;
    }

    @Override
    public String toString() {
        return  this.FirstName + "|" + this.LastName + "|" + this.dateOfBirth + "|=" + this.address + "|" + this.Phone + "|" + this.Email + "|" + this.typeCandidate ;
    }
    
    
}
