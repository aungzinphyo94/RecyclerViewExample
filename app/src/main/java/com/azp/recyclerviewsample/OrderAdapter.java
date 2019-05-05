package com.azp.recyclerviewsample;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderViewHolder>{

    private Context mContext;
    private List<OrderData> orderList;

    public OrderAdapter(Context context, List<OrderData> orderList) {
        this.mContext = context;
        this.orderList = orderList;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View orderView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_order, viewGroup, false);
        return new OrderViewHolder(orderView);
    }

    @Override
    public void onBindViewHolder(@NonNull final OrderViewHolder orderViewHolder, int position) {

        orderViewHolder.orderID.setText(orderList.get(position).getOrderID());
        orderViewHolder.orderRequest.setText(orderList.get(position).getOrderRequest());
        orderViewHolder.orderStatus.setText(orderList.get(position).getOrderStatus());
        orderViewHolder.orderDate.setText(orderList.get(position).getOrderDate());
        orderViewHolder.orderItemCount.setText(orderList.get(position).getOrderItemCount());
        orderViewHolder.orderPrice.setText(orderList.get(position).getOrderPrice());
        orderViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent orderIntent = new Intent(mContext, DetailsActivity.class);
                orderIntent.putExtra("Price", orderList.get(orderViewHolder.getAdapterPosition()).getOrderPrice());
                mContext.startActivity(orderIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }
}

class OrderViewHolder extends RecyclerView.ViewHolder {

    CardView cardView;
    TextView orderID, orderRequest, orderStatus, orderDate, orderItemCount, orderPrice;

    public OrderViewHolder(@NonNull View itemView) {
        super(itemView);

        orderID = itemView.findViewById(R.id.order_id);
        orderRequest = itemView.findViewById(R.id.special_request);
        orderStatus = itemView.findViewById(R.id.txt_status);
        orderDate = itemView.findViewById(R.id.order_date);
        orderItemCount = itemView.findViewById(R.id.total_item);
        orderPrice = itemView.findViewById(R.id.order_price);
        cardView = itemView.findViewById(R.id.order_card);
    }
}
