package au.edu.unsw.lecturedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView tvIntentMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle("Detail Activity");
        tvIntentMessage = findViewById(R.id.tvMessage);
        Intent intent = getIntent();
        if (intent.getStringExtra("message") != null) {
            String intentMessage = intent.getStringExtra("message");
            tvIntentMessage.setText(intentMessage);
        }
    }
}