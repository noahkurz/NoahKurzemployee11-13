package com.example.csc250_fall2019_employeemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmployeeListActivity extends AppCompatActivity {

    private ListView employeeLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);

        this.employeeLV  = this.findViewById(R.id.employeeLV);



        ArrayList<String> theEmployeesList = new ArrayList<String>();

        for(int i = 0; i < Core.theEmployees.size(); i ++)
        {
            theEmployeesList.add(Core.theEmployees.get(i).toString());
        }









        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, theEmployeesList);
        this.employeeLV.setAdapter(adapter2);

    }
}