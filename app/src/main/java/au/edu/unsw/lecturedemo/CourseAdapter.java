package au.edu.unsw.lecturedemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {
    private ArrayList<Course> localDataSet;

    public static class CourseViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView code, name;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.ivImage);
            code = itemView.findViewById(R.id.tvCode);
            name = itemView.findViewById(R.id.tvName);
        }
    }

    public CourseAdapter(ArrayList<Course> dataSet) {
        localDataSet = dataSet;
    }

    @NonNull
    @Override
    public CourseAdapter.CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.CourseViewHolder holder, int position) {
        Course course = localDataSet.get(position);
        holder.code.setText(course.getCode());
        holder.name.setText(course.getName());
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}
