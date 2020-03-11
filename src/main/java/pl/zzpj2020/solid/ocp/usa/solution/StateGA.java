package pl.zzpj2020.solid.ocp.usa.solution;

public class StateGA implements State {
    private static final int MAX_SPEED = 140;
    @Override
    public int getMaxSpeed() {
        return MAX_SPEED;
    }
}
