package app.gamatechno.com.modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {

    TextView tvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        tvDataReceived = findViewById(R.id.tv_data_received);

        String name = getIntent().getStringExtra("nama");
        int age = getIntent().getIntExtra("umur", 0);
        String text = "Name : " + name + ",\nYour Age : " + age;

        tvDataReceived.setText(text);
    }
}
