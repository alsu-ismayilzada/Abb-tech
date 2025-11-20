package lesson_12.facade;

public class ComputerFacade {
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade() {
        processor = new CPU();
        ram = new Memory();
        hd = new HardDrive();
    }

    public void process() {
        System.out.println("Komputer işə salınır...");

        processor.startBootSequence();
        hd.read();
        ram.load();
        processor.execute();

    }
}
