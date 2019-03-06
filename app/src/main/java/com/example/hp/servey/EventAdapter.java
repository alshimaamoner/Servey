package com.example.hp.servey;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.hp.servey.Api.Model.DataItem;

import java.util.ArrayList;
import java.util.List;


public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {
List<DataItem> dataItems;
OnItemClickListener onItemClickListener;

    public EventAdapter(List<DataItem> dataItems) {
        this.dataItems = dataItems;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.event_item,viewGroup,false);

       return new ViewHolder(view);
    }


    @SuppressLint("ResourceType")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
       final DataItem data=dataItems.get(i);
       viewHolder.textView.setText(data.getName());
       viewHolder.textView2.setText(data.getDescription());
       if(onItemClickListener!=null){
           viewHolder.textView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   onItemClickListener.OnItemClick(i,data.getId());
               }
           });
       }

    }

    @Override
    public int getItemCount() {
        if(dataItems==null)
            return 0;
        return dataItems.size();
    }
public void ChangeData(List<DataItem> dataItems){
        this.dataItems=dataItems;
        notifyDataSetChanged();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

      TextView textView;
      TextView textView2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.event_name);
            textView2=itemView.findViewById(R.id.event_desc);
        }
    }
    public interface OnItemClickListener{
       void OnItemClick(int pos, int id);
    }
}
