package ushtrime;

public enum Runner {
    Beginner(50, 31),
    Intermediate(30,21),
    Advanced(20,10);

    private Integer minTimeOfRunning;
    private Integer maxTimeOfRunning;

    Runner(Integer minTimeOfRunning,Integer maxTimeOfRunning){
        this.maxTimeOfRunning=maxTimeOfRunning;
        this.minTimeOfRunning=minTimeOfRunning;
    }

    public Integer getMinTimeOfRunning() {
        return minTimeOfRunning;
    }

    public Integer getMaxTimeOfRunning() {
        return maxTimeOfRunning;
    }

    public static Runner getFitnessLevel(Integer time) {

        if (( time>= Beginner.maxTimeOfRunning)&&
                (time<= Beginner.minTimeOfRunning)) {
            return Beginner;
        }else if ((time >= Intermediate.maxTimeOfRunning)&&
        (time< Intermediate.minTimeOfRunning)) {
            return Intermediate;
        }
        else if ((time >= Advanced.maxTimeOfRunning)&&
        (time< Advanced.minTimeOfRunning)) {
            return Advanced;
        }
        else {
            System.out.println();
        }
        return null;

    }
}
