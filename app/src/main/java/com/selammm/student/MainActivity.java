package com.selammm.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity {


    ArrayList<Student> listofStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listofStudent = new ArrayList<>();

    }

    public void saveStudent(View v){


        EditText etStudentName = (EditText) findViewById(R.id.etStudentName);
        EditText etStudentSurname = (EditText) findViewById(R.id.etStudentSurname);
        EditText etStudentNo = (EditText) findViewById(R.id.etStudentNo);

        String studentName = etStudentName.getText().toString();
        String studentSurname = etStudentSurname.getText().toString();
        String studentNo = etStudentNo.getText().toString();


        Student student = new Student(studentName, studentSurname,studentSurname);


        listofStudent.add(student);

        etStudentName.setText("");
        etStudentSurname.setText("");
        etStudentNo.setText("");
    }

    public void listStudent(View v){

        TextView tvList = (TextView) findViewById(R.id.tv);

        String list = "";

        for(Student student : listofStudent){

            list = list + student.studentName + "\n";
            list = list + student.studentSurname + "\n";
            list = list + student.studentNo + "\n";
        }

        tvList.setText(list);
    }

}
