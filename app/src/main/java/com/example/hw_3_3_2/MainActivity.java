package com.example.hw_3_3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PhoneAdapter adapter;
    private ArrayList<String> phoneList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.rv_phone);
        loadData();
        adapter = new PhoneAdapter(phoneList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {

        phoneList.add("Samsung");
        phoneList.add("Iphone");
        phoneList.add("Xiaomi");
        phoneList.add("Nokia");
        phoneList.add("Lenovo");
        phoneList.add("Oneplus");
        phoneList.add("Huawei");
        phoneList.add("Sony");

    }

}
