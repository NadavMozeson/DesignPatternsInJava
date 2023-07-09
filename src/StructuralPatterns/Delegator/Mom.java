package StructuralPatterns.Delegator;

public class Mom implements IMom {
    private String lastName;
    public Mom(String lastName){
        this.lastName = lastName;
    }
    @Override
    public String getLastName() {
        return lastName;
    }
}
