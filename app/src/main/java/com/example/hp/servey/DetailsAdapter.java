package com.example.hp.servey;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.hp.servey.Api.Model.QustionItem;

import java.util.List;

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.ViewHolder> {
    List<QustionItem> question;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_of_detailes_recyclerview,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
      QustionItem item=question.get(i);
      //viewHolder.title.setText(item.getAnswer1());
    }

    @Override
    public int getItemCount() {
        if(question==null)
            return 0;

        return question.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title,description;
        RadioGroup radioGroup;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            description=itemView.findViewById(R.id.description);
            radioGroup=itemView.findViewById(R.id.rate);
        }
    }
}


