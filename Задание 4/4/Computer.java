public class Computer {
    public enum Trademark {
        Samsung,
        HP,
        Lenovo,
        Sony,
        Asus
    }
    Processor processor;
    Memory memory;
    Monitor monitor;

    private boolean isTurnedOn;

    Computer() {

        this.isTurnedOn = false;
    }


    public void run() {
        if (!this.isTurnedOn) {
            this.processor = new Processor();
            this.memory = new Memory();
            this.monitor = new Monitor();
            this.processor.run();
            this.memory.run();
            this.isTurnedOn = true;
            System.out.println("Is running: " + this.isTurnedOn);
        } else System.out.println("Turned on");
    }

    public void shutdown() {
        if (this.isTurnedOn) {
            this.processor.shutdown();
            this.memory.shutdown();
            this.isTurnedOn = false;
            System.out.println("Is running: " + this.isTurnedOn);
        } else System.out.println("Turned off");
    }

    public static void main(String [] args) {
        Computer a = new Computer();
        a.run();
        a.monitor.run();
        a.shutdown();
        a.monitor.shutdown();
    }

}