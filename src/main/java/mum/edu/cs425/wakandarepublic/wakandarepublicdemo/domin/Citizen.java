package mum.edu.cs425.wakandarepublic.wakandarepublicdemo.domin;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Entity
public class Citizen {
    @Id
    @GeneratedValue()
    private  long citizenId;
   /* @NotBlank(message = "* SSN cannot be empty or blank space(s)")
    @NotNull(message = "* SSN is required")*/
    private String ssN;
    /*@NotNull(message = "* firstName is required")
    @NotBlank(message = "* firstName cannot be empty or blank space(s)")*/
    private String firstName;

    private String middleName;

    /*@NotNull(message = "* lastName is required")
    @NotBlank(message = "* Last Name cannot be empty or blank space(s)")*/
    private String lastName;

    /*@NotNull(message = "* dateOfBirthis required")
    @NotBlank(message = "* dateOfBirth cannot be empty or blank space(s)")*/
    private LocalDate dateOfBirth;

    /*@NotNull(message = "*yearlyIncomeis required")
    @NotBlank(message = "* yearlyIncome cannot be empty or blank space(s)")*/
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private double yearlyIncome;

    @ManyToOne

    private State state;

   /* public Citizen(@NotBlank(message = "* SSN cannot be empty or blank space(s)")
                   @NotNull(message = "* SSN is required") String ssN, @NotNull(message = "* firstName is required") @NotBlank(message = "* firstName cannot be empty or blank space(s)") String firstName, String middleName, @NotNull(message = "* lastName is required")
    @NotBlank(message = "* Last Name cannot be empty or blank space(s)") String lastName, @NotNull(message = "* dateOfBirthis required") @NotBlank(message = "* dateOfBirth cannot be empty or blank space(s)") LocalDate dateOfBirth, @NotNull(message = "*yearlyIncomeis required") @NotBlank(message = "* yearlyIncome cannot be empty or blank space(s)") double yearlyIncome, State state) {
        this.ssN = ssN;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.yearlyIncome = yearlyIncome;
        this.state = state;
    }*/

    public Citizen(String ssN, String firstName, String middleName, String lastName, LocalDate dateOfBirth, double yearlyIncome, State state) {
        this.ssN = ssN;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.yearlyIncome = yearlyIncome;
        this.state = state;
    }

    public Citizen(){}


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public long getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(long citizenId) {
        this.citizenId = citizenId;
    }

    public String getSsN() {
        return ssN;
    }

    public void setSsN(String ssN) {
        this.ssN = ssN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(double yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }
}
