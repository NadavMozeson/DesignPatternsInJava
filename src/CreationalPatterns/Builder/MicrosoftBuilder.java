package CreationalPatterns.Builder;

public class MicrosoftBuilder implements ComputerBuilder {
    private Computer comp;

    public MicrosoftBuilder() { comp= new Computer(); }

    public void buildDisk() { comp.setDisk(new Disk("Microsoft Disk Module")); }

    public void buildMemory() {comp.setMemory(new Memory("Microsoft Memory Module")); }

    public void buildMainboard() { comp.setMainboard(new Mainboard("Microsoft Mainboard Module")); }

    public void buildMotherboard() { comp.setMotherboard(new Motherboard("Microsoft Motherboard Module")); }

    public Computer getComputer() { return comp; }
}
