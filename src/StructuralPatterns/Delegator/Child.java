package StructuralPatterns.Delegator;

public class Child implements IDad, IMom {
    private Dad dad;
    private Mom mom;

    public Child(String lastName){
        this.dad = new Dad(lastName);
        this.mom = new Mom(lastName);
    }
    @Override
    public String getLastName(){
        return dad.getLastName();
    }
}
