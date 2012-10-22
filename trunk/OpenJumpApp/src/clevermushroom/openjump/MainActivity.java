package clevermushroom.openjump;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
	
	private static final String TAG = MainActivity.class.getSimpleName();

	private MainGamePanel mainGamePanel;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        		WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        mainGamePanel = new MainGamePanel(this);
        setContentView(mainGamePanel);
        Log.d(TAG, "View added.");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    public void onDestroy() {
    	Log.d(TAG, "Destroying...");
    }
    
    @Override
    public void onStop() {
    	Log.d(TAG, "Stopping...");
    }
    
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	if (keyCode == KeyEvent.KEYCODE_BACK) {
    		mainGamePanel.thread.setRunning(false);
    		this.finish();
    	}
    	return super.onKeyDown(keyCode, event);
    }
}
