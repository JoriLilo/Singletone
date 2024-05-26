package compositon;

public class Processor {
    private String manufacture;
    private String coreType;

    public Processor(String manufacture, String coreType) {
        this.coreType = coreType;
        this.manufacture=manufacture;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "manufacture='" + manufacture + '\'' +
                ", coreType='" + coreType + '\'' +
                '}';
    }
}
