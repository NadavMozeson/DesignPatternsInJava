package StructuralPatterns.Delegator;

public class Dad implements IDad {
    private String lastName;
    public Dad(String lastName){
        this.lastName = lastName;
    }
    @Override
    public String getLastName() {
        return lastName;
    }
}
