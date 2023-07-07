package CreationalPatterns.Builder;

public class Computer {
    private Mainboard mainboard;
    private Disk disk;
    private Memory memory;
    private Motherboard motherboard;

    public void setDisk (Disk d) { this.disk = d; }

    public void setMemory(Memory memory) { this.memory= memory; }

    public void setMainboard(Mainboard b) { this.mainboard = b; }

    public void setMotherboard(Motherboard mb) { this.motherboard = mb; }

    public String toString() { return "Mainboard: " + this.mainboard.getName() + ", Motherboard: " + this.motherboard.getName() + ", Memory: " + this.memory.getName() + ", Disk: " + this.disk.getName(); }
}

