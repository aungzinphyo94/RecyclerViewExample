package com.azp.recyclerviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<OrderData> orderDataList;
    OrderData orderData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        orderDataList = new ArrayList<>();
        orderData = new OrderData("#1242452232", "Special Request","Pending","19/9/2019","20","4500000 Ks");
        orderDataList.add(orderData);
        orderData = new OrderData("#124245212", "Special Request","Delivered","20/8/2019","20","4000000 Ks");
        orderDataList.add(orderData);

        OrderAdapter orderAdapter = new OrderAdapter(MainActivity.this, orderDataList);
        recyclerView.setAdapter(orderAdapter);
    }
}
