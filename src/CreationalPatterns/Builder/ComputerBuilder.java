package CreationalPatterns.Builder;

public interface ComputerBuilder {
    void buildMotherboard();
    void buildMainboard();
    void buildDisk();
    void buildMemory();
    Computer getComputer();
}
