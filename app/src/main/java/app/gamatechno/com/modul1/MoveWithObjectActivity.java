package app.gamatechno.com.modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithObjectActivity extends AppCompatActivity {

    TextView tvObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        tvObject = findViewById(R.id.tv_object_received);

        Biodata biodata = getIntent().getParcelableExtra("biodata");
        String text = "Name : " + biodata.getName() + ",\nEmail : " + biodata.getEmail() + ",\nAge : " + biodata.getAge() + ",\nLocation : " + biodata.getCity();
        tvObject.setText(text);
    }
}
