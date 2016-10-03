package bombey77.sa27;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonTime = (Button)findViewById(R.id.btnTime);
        Button buttonDate = (Button)findViewById(R.id.btnDate);
        buttonTime.setOnClickListener(this);
        buttonDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent;

        switch (v.getId()) {
            case R.id.btnTime:
                intent = new Intent("bombey77.intent.time");
                startActivity(intent);
                break;
            case R.id.btnDate:
                intent = new Intent("bombey77.intent.date");
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
