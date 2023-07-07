package CreationalPatterns.Builder;

public class Engineer {
    private ComputerBuilder builder;

    public Engineer(ComputerBuilder builder){
        this.builder = builder;
    }

    public Computer getComputer() {
        return builder.getComputer();
    }

    public void constructComputer() {
        builder.buildDisk();
        builder.buildMemory();
        builder.buildMainboard();
        builder.buildMotherboard();
    }
}

