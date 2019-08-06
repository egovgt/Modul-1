package app.gamatechno.com.modul1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lat2Activity extends AppCompatActivity implements View.OnClickListener {

    Button btnMoveActivity;
    Button btnMoveWithDataActivity;
    Button btnMoveWithObject;
    Button btnDialPhone;
    Button btnMoveForResult;
    TextView tvResult;

    private int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lat2);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataActivity.setOnClickListener(this);

        btnMoveWithObject = findViewById(R.id.btn_move_activity_object);
        btnMoveWithObject.setOnClickListener(this);

        btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);

        btnMoveForResult = findViewById(R.id.btn_move_for_result);
        btnMoveForResult.setOnClickListener(this);

        tvResult = findViewById(R.id.tv_result);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                /*
                Intent untuk memulai activity baru
                 */
                Intent moveIntent = new Intent(Lat2Activity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_activity_data:
                /*
                Intent untuk mengirimkan data ke activity lain
                 */
                Intent moveWithDataIntent = new Intent(Lat2Activity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra("nama", "Acong Mania");
                moveWithDataIntent.putExtra("umur", 23);
                startActivity(moveWithDataIntent);
                break;

            case R.id.btn_move_activity_object:
                /*
                Intent untuk mengirimkan object ke activity lain, perlu diingat bahwa object biodata adalah parcelable
                 */
                Biodata biodata = new Biodata();
                biodata.setName("Acong Mania");
                biodata.setAge(23);
                biodata.setEmail("acong@mania.com");
                biodata.setCity("Jogja");

                Intent moveWithObjectIntent = new Intent(Lat2Activity.this, MoveWithObjectActivity.class);
                moveWithObjectIntent.putExtra("biodata", biodata);
                startActivity(moveWithObjectIntent);
                break;

            case R.id.btn_dial_number:
                /*
                Intent action untuk menjalankan action dial
                 */
                String phoneNumber = "085329135757";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);
                break;

            case R.id.btn_move_for_result:
                /*
                Intent for result bermanfaat ketika kita ingin mendapatkan nilai balikan dari activity lainnya
                Perhatikan bahwa kita mengirimkan intent beserta REQUEST_CODE
                 */
                Intent moveForResultIntent = new Intent(Lat2Activity.this, MoveForResultActivity.class);
                startActivityForResult(moveForResultIntent, REQUEST_CODE);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == MoveForResultActivity.RESULT_CODE) {
                String value = data.getStringExtra("result");
                tvResult.setText("Hasil : " + value);
            }
        }
    }
}
