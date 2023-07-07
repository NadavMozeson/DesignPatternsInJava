package CreationalPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder appleBuilder = new AppleBuilder();
        Engineer appleEngineer = new Engineer(appleBuilder);
        appleEngineer.constructComputer();
        Computer applePC = appleEngineer.getComputer();
        System.out.println(applePC.toString()); // -> "Mainboard: Apple Mainboard Module, Motherboard: Apple Motherboard Module, Memory: Apple Memory Module, Disk: Apple Disk Module"

        ComputerBuilder microsoftBuilder = new MicrosoftBuilder();
        Engineer microsoftEngineer = new Engineer(microsoftBuilder);
        microsoftEngineer.constructComputer();
        Computer microsoftPC = microsoftEngineer.getComputer();
        System.out.println(microsoftPC.toString()); // -> "Mainboard: Microsoft Mainboard Module, Motherboard: Microsoft Motherboard Module, Memory: Microsoft Memory Module, Disk: Microsoft Disk Module"
    }
}

