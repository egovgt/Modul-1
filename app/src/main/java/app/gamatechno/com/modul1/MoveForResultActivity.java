package app.gamatechno.com.modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MoveForResultActivity extends AppCompatActivity {

    public static int RESULT_CODE = 110;

    EditText edMoveResult;
    Button btnMoveResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_for_result);

        edMoveResult = findViewById(R.id.ed_move_result);

        btnMoveResult = findViewById(R.id.btn_move_result);
        btnMoveResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("result", edMoveResult.getText().toString());
                setResult(RESULT_CODE, intent);
                finish();
            }
        });
    }
}
