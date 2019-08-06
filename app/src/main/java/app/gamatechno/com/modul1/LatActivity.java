package app.gamatechno.com.modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LatActivity extends AppCompatActivity {

    private static final String HOME_ACTIVITY_TAG = LatActivity.class.getSimpleName();

    private void showLog(String text) {
        Log.d(HOME_ACTIVITY_TAG, text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lat);
        showLog("Activity Created");
    }

    @Override
    protected void onRestart() {
        super.onRestart();//call to restart after onStop
        showLog("Activity restarted");
    }

    @Override
    protected void onStart() {
        super.onStart();//soon be visible
        showLog("Activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();//visible
        showLog("Activity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();//invisible
        showLog("Activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showLog("Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showLog("Activity is being destroyed");
    }

}
