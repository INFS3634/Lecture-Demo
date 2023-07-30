package au.edu.unsw.lecturedemo;

import java.util.ArrayList;

public class Course {
    private String code;
    private String name;

    public Course(String courseCode, String courseName) {
        this.code = courseCode;
        this.name = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Course> getData(){
        ArrayList<Course> courseList = new ArrayList<>();
        for(int i=0; i < 30; i++) {
            Course course = new Course("INFS"+String.valueOf(i+1001), "Information Systems Course "+ String.valueOf(i+1));
            courseList.add(course);
        }
        return courseList;
    }

    public static Course findCourse(String code){
        ArrayList<Course> courses = Course.getData();
        for (Course course : courses) {
            if (course.code.toString().equals(code)) {
                return course;
            }
        };
        return null;
    }
}
