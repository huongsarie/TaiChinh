package com.sarie.taichinh.adapter;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.sarie.taichinh.R;
import com.sarie.taichinh.common.Item_Expense;

import java.util.ArrayList;

/**
 * Created by huongsarie on 07/04/2016.
 */
public class AdapterRecyclerExpense extends RecyclerView.Adapter<AdapterRecyclerExpense.ExpenseViewHolder> {

    private ArrayList<Item_Expense> arr;


    public AdapterRecyclerExpense(ArrayList<Item_Expense> arr){
        this.arr= arr;
    }

    @Override
    public ExpenseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_express_detail,parent,false);
        return new ExpenseViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(AdapterRecyclerExpense.ExpenseViewHolder holder, int position) {
        Item_Expense item= arr.get(position);

//        holder._icon.setBitmap; //getbitmap from id icon
//        holder._name_catalogue.setText( ); //get string from idcataloge
        holder._money.setText(item.getSoTien()+" VND");
        holder._btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public interface AdapterRVExpenseListener{
        public void onClickButtonSetting();
        public void setSharingButton(ImageButton buttonShare);
    }

    public static class ExpenseViewHolder extends RecyclerView.ViewHolder{
        protected ImageView _icon;
        protected TextView _name_catalogue;
        protected TextView _money;
        protected TextView _datetime;
        protected ImageButton _btnSetting;
        public ExpenseViewHolder(View itemView){
            super(itemView);
            _icon=(ImageView) itemView.findViewById(R.id.imageview_item_exp_icon);
            _name_catalogue=(TextView) itemView.findViewById(R.id.txt_item_exp_name);
            _money=(TextView) itemView.findViewById(R.id.txt_item_exp_money);
            _datetime=(TextView) itemView.findViewById(R.id.text_item_exp_datetime);
            _btnSetting=(ImageButton) itemView.findViewById(R.id.imagebutton_item_exp_setting);
        }
    }
}
