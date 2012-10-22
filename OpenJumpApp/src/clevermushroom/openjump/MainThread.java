package clevermushroom.openjump;

import android.util.Log;
import android.view.SurfaceHolder;

public class MainThread extends Thread {

	private static final String TAG = MainThread.class.getSimpleName();
	
	private boolean running;
	private SurfaceHolder surfaceHolder;
	private MainGamePanel gamePanel;
	
	public void setRunning(boolean r) {
		running = r;
	}
	
	public MainThread(SurfaceHolder surfaceHolder, MainGamePanel gamePanel) {
		super();
		this.surfaceHolder = surfaceHolder;
		this.gamePanel = gamePanel;
	}
	
	@Override
	public void run() {
		long tickCount = 0L;
		Log.d(TAG, "Starting game loop.");
		while (running) {
			tickCount++;
			// DO stuff
			// update game state
			// render
		}
		Log.d(TAG, "Exited the game loop after " + tickCount + " times.");
	}
	
}
