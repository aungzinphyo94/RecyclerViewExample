package com.azp.recyclerviewsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailsActivity  extends AppCompatActivity {

    TextView orderPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_details);

        orderPrice = findViewById(R.id.detail_price);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            orderPrice.setText(bundle.getString("Price"));
        }
    }
}
