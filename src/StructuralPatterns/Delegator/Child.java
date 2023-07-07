package StructuralPatterns.Delegator;

public class Child {
    private Dad dad;
    private Mom mom;

    public Child(){
        this.dad = new Dad();
        this.mom = new Mom();
    }
}
