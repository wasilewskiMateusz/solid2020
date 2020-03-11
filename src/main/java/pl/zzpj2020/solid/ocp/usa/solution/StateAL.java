package pl.zzpj2020.solid.ocp.usa.solution;

public class StateAL implements State {
    private static final int MAX_SPEED = 100;
    @Override
    public int getMaxSpeed() {
        return MAX_SPEED;
    }
}
