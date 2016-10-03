package bombey77.sa27;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent = getIntent();
        String action = intent.getAction();

        String format = "", textInfo = "";

        if(action.equals("bombey77.intent.time")){
            format = "HH:mm:ss";
            textInfo = "Time = ";
        }else if(action.equals("bombey77.intent.date")){
            format = "dd.MM.yyyy";
            textInfo = "Date = ";
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String dateTime = simpleDateFormat.format(new Date(System.currentTimeMillis()));

        TextView textView = (TextView)findViewById(R.id.textFirst);
        textView.setText(textInfo + dateTime);
    }
}
