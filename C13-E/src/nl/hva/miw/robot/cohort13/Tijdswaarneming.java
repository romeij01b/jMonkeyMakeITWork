package nl.hva.miw.robot.cohort13;

import java.util.concurrent.TimeUnit;
import lejos.utility.Stopwatch;


/**
 * In deze klasse staan de methods die gebruikt worden om de rontetijd bij te houden
 */

public class Tijdswaarneming {
	private Stopwatch stopwatch;
	private int eindtijd;

	public Tijdswaarneming() {
		super();
		this.stopwatch = new Stopwatch();
	}

	public void startStopwatch() {
		stopwatch.reset();
	}

	public void stopStopwatch() {
		this.eindtijd = stopwatch.elapsed();
	}

	public String toonElapsed() {
		int t = stopwatch.elapsed();
		return String.format("%02d min, %02d sec", TimeUnit.MILLISECONDS.toMinutes(t),
				TimeUnit.MILLISECONDS.toSeconds(t)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(t)));
	}
	
	@Override
	public String toString() {
		return String.format("%02d min, %02d sec", TimeUnit.MILLISECONDS.toMinutes(this.eindtijd),
				TimeUnit.MILLISECONDS.toSeconds(this.eindtijd)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(this.eindtijd)));
	}

}