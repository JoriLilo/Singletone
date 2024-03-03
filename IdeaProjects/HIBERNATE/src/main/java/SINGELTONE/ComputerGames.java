package SINGELTONE;

public class ComputerGames {
    private String name;
    private PegiAgeRating pegiAgeRating;
    private Double budgetInMillionsOfDollars;
    private Integer minimumGpuMemoryInMegabytes;
    private Integer diskSpaceNeededInGB;
    private Integer ramNeededInGb;
    private Integer coresNeeded;
    private Double coreSpeedInGhz;

    public ComputerGames(String name, PegiAgeRating pegiAgeRating, Double budgetInMillionsOfDollars,
                         Integer minimumGpuMemoryInMegabytes, Integer diskSpaceNeededInGB,
                         Integer ramNeededInGb, Integer coresNeeded, Double coreSpeedInGhz) {
        this.name = name;
        this.pegiAgeRating = pegiAgeRating;
        this.budgetInMillionsOfDollars = budgetInMillionsOfDollars;
        this.minimumGpuMemoryInMegabytes = minimumGpuMemoryInMegabytes;
        this.diskSpaceNeededInGB = diskSpaceNeededInGB;
        this.ramNeededInGb = ramNeededInGb;
        this.coresNeeded = coresNeeded;
        this.coreSpeedInGhz = coreSpeedInGhz;
    }

    public void ComputerGame(final String name,
                             final PegiAgeRating pegiAgeRating,
                             final Double budgetInMillionsOfDollars,
                             final Integer minimumGpuMemoryInMegabytes,
                             final Integer diskSpaceNeededInGB,
                             final Integer ramNeededInGb,
                             final Integer coresNeeded,
                             final Double coreSpeedInGhz) {
        this.name = name;
        this.pegiAgeRating = pegiAgeRating;
        this.budgetInMillionsOfDollars = budgetInMillionsOfDollars;
        this.minimumGpuMemoryInMegabytes = minimumGpuMemoryInMegabytes;
        this.diskSpaceNeededInGB = diskSpaceNeededInGB;
        this.ramNeededInGb = ramNeededInGb;
        this.coresNeeded = coresNeeded;
        this.coreSpeedInGhz = coreSpeedInGhz;
    }

    public String getName() {
        return name;
    }

    public PegiAgeRating getPegiAgeRating() {
        return pegiAgeRating;
    }

    public Double getBudgetInMillionsOfDollars() {
        return budgetInMillionsOfDollars;
    }

    public Integer getMinimumGpuMemoryInMegabytes() {
        return minimumGpuMemoryInMegabytes;
    }

    public Integer getDiskSpaceNeededInGB() {
        return diskSpaceNeededInGB;
    }

    public Integer getRamNeededInGb() {
        return ramNeededInGb;
    }

    public Integer getCoresNeeded() {
        return coresNeeded;
    }

    public Double getCoreSpeedInGhz() {
        return coreSpeedInGhz;
    }
}

