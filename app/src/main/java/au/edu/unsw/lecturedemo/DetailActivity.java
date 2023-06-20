package au.edu.unsw.lecturedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView tvCourseCode, tvCourseName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle("Detail Activity");

        Intent intent = getIntent();
        if (intent.getStringExtra("message") != null) {
            String intentMessage = intent.getStringExtra("message");
            Course course = Course.findCourse(intentMessage);

            tvCourseCode = findViewById(R.id.tvCode);
            tvCourseName = findViewById(R.id.tvName);

            tvCourseCode.setText(course.getCode());
            tvCourseName.setText(course.getName());
        }
    }
}