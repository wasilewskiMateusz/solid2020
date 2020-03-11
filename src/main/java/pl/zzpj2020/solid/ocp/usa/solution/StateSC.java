package pl.zzpj2020.solid.ocp.usa.solution;

public class StateSC implements State{
    private static final int MAX_SPEED = 120;
    @Override
    public int getMaxSpeed() {
        return MAX_SPEED;
    }
}
