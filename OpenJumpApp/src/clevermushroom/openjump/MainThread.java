package clevermushroom.openjump;

import android.util.Log;
import android.view.SurfaceHolder;

public class MainThread extends Thread {

	private static final String TAG = MainThread.class.getSimpleName();
	
	private boolean _running;
	private SurfaceHolder _surfaceHolder;
	private MainGamePanel _gamePanel;
	
	public void setRunning(boolean r) {
		_running = r;
	}
	
	public SurfaceHolder getSurfaceHolder() {
		return _surfaceHolder;
	}
	
	public MainGamePanel getGamePanel() {
		return _gamePanel;
	}
	
	public MainThread(SurfaceHolder surfaceHolder, MainGamePanel gamePanel) {
		super();
		this._surfaceHolder = surfaceHolder;
		this._gamePanel = gamePanel;
	}
	
	@Override
	public void run() {
		long tickCount = 0L;
		Log.d(TAG, "Starting game loop.");
		while (_running) {
			tickCount++;
			// DO stuff
			// update game state
			// render
		}
		Log.d(TAG, "Exited the game loop after " + tickCount + " times.");
	}
	
}
