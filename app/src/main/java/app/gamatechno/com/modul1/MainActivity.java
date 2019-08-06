package app.gamatechno.com.modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /*Membuat object yang akan mempresentasikan class Button*/
    private Button btnActivity;
    private Button btnIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Pasangkan object dengan view yang kita maksud*/
        btnActivity = findViewById(R.id.btn_activity);
        btnIntent = findViewById(R.id.btn_intent);

        /*Beri aksi (event) kepada object*/
        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LatActivity.class));
            }
        });

        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Lat2Activity.class));
            }
        });
    }
}
