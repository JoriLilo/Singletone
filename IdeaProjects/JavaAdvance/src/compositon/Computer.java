package compositon;

public class Computer {
    private String manufacture1;
    private String model;
    private int productionYear;

    private Processor processor;

    public Computer(String manufacture1, String model, int productionYear, Processor processor) {
        this.manufacture1 = manufacture1;
        this.model = model;
        this.productionYear = productionYear;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacture1='" + manufacture1 + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", processor=" + processor +
                '}';
    }
}
