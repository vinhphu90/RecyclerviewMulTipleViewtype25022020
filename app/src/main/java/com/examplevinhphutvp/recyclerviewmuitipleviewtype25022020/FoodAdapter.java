package com.examplevinhphutvp.recyclerviewmuitipleviewtype25022020;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.Itemholder>{

    private ArrayList<FoodModel> mfoodModelArrayList;

    public FoodAdapter(){
        mfoodModelArrayList = new ArrayList<>();
    }
    public void SubmitData(ArrayList<FoodModel> foodModelArrayList){
        if (foodModelArrayList!= null){
            if (mfoodModelArrayList .size() > 0){
                mfoodModelArrayList.clear();
                mfoodModelArrayList.addAll(foodModelArrayList);

            }else {
                mfoodModelArrayList.addAll(foodModelArrayList);
            }
               notifyDataSetChanged();
        }
    }


    @NonNull
    @Override
    public Itemholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_layout_fool, parent , false);
        return new Itemholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Itemholder holder, int position) {
        FoodModel foodModel = mfoodModelArrayList.get(position);
        holder.mTvName.setText(foodModel.getName());
        DecimalFormat decimalFormat = new DecimalFormat("###.###.###");
        holder.mTvPrice.setText("$" + decimalFormat.format(foodModel.getPrice()));
        holder.mTvDesribe.setText(foodModel.getDescribe());
        holder.mImg.setImageResource(foodModel.getImage());
    }

    @Override
    public int getItemCount() {
        return mfoodModelArrayList.size();
    }

    class Itemholder extends RecyclerView.ViewHolder{

        ImageView mImg ;
        TextView mTvName , mTvPrice , mTvDesribe ;

        public Itemholder(@NonNull View itemView) {
            super(itemView);

            mImg = itemView .findViewById(R.id.imageviewFood);
            mTvName = itemView.findViewById(R.id.textviewNameFood);
            mTvPrice = itemView.findViewById(R.id.textviewPriceFood);
            mTvDesribe = itemView.findViewById(R.id.textviewdescribeFool);


        }
    }


}
