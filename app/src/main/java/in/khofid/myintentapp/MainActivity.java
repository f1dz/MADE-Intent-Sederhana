package in.khofid.myintentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMoveActivity;
    Button btnMoveWithDataActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_move_activity:
                Intent moveActivity = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveActivity);
                break;
            case R.id.btn_move_activity_data:
                Intent intentWithData = new Intent(MainActivity.this, MoveWithDataActivity.class);
                intentWithData.putExtra(MoveWithDataActivity.EXTRA_NAME, "Dicoding Academy");
                intentWithData.putExtra(MoveWithDataActivity.EXTRA_AGE, 5);
                startActivity(intentWithData);
                break;
        }
    }
}
