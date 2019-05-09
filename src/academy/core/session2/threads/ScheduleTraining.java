package academy.core.session2.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import static java.util.concurrent.TimeUnit.*; // SECONDSs

public class ScheduleTraining {
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	public void runFor10seconds() {
		final ScheduledFuture<?> runnerHandler = scheduler.scheduleAtFixedRate(
				() -> ScheduleTraining.runForrestGump(), 1, 1, SECONDS);

		// Sombody stops forest!
		scheduler.schedule(() -> runnerHandler.cancel(true), 10, SECONDS);
	}

	public static void main(String args[]) {
		new ScheduleTraining().runFor10seconds();
	}
	
	static void runForrestGump() {
		System.out.println("Running");
	}
}
