package au.edu.unsw.lecturedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnLaunchDetailActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("INFS3634 Lecture Demo");
        btnLaunchDetailActivity = findViewById(R.id.btnLaunch);
        btnLaunchDetailActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchDetailActivity("Hello from MainActivity");
            }
        });

    }

    private void launchDetailActivity(String msg) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("message",msg);
        startActivity(intent);
    }

}