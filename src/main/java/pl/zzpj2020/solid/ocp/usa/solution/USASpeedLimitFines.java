package pl.zzpj2020.solid.ocp.usa.solution;

public class USASpeedLimitFines {

	State state;

	public USASpeedLimitFines(State state) {
		this.state = state;
	}

	public double calculateSpeedLimitFine(int speed) {

		double fine = 0;
		if (speed > state.getMaxSpeed()) {
			// calculate...
		}
		return fine;

	}

}
