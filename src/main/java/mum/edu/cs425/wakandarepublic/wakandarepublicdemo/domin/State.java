package mum.edu.cs425.wakandarepublic.wakandarepublicdemo.domin;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class State {
    @Id
    @GeneratedValue()
    private int stateId;
    @NotNull(message = "* stateCode required")
    @NotBlank(message = "* stateCode cannot be empty or blank space(s)")
    private String stateCode;
    @NotNull(message = "* stateName required")
    @NotBlank(message = "* stateName cannot be empty or blank space(s)")
    private String stateName;
    @OneToMany
    @JoinColumn
    private List<Citizen> citizen;

    public State(String stateCode, String stateName, List<Citizen> citizen) {
        this.stateCode = stateCode;
        this.stateName = stateName;
        this.citizen = citizen;
    }
    public State(){}

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public List<Citizen> getCitizen() {
        return citizen;
    }

    public void setCitizen(List<Citizen> citizen) {
        this.citizen = citizen;
    }
}
