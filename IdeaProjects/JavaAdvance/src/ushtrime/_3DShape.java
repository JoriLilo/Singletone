package ushtrime;

public abstract  class _3DShape implements Fillable{
    abstract float calculateVolume();

    @Override
    public float fill(float amount) {
        return 0;
    }
}
