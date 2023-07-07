package CreationalPatterns.Builder;

public class AppleBuilder implements ComputerBuilder {
    private Computer comp;

    public AppleBuilder() { comp= new Computer(); }

    public void buildDisk() { comp.setDisk(new Disk("Apple Disk Module")); }

    public void buildMemory() {comp.setMemory(new Memory("Apple Memory Module")); }

    public void buildMainboard() { comp.setMainboard(new Mainboard("Apple Mainboard Module")); }

    public void buildMotherboard() { comp.setMotherboard(new Motherboard("Apple Motherboard Module")); }

    public Computer getComputer() { return comp; }
}

