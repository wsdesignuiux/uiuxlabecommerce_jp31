package e.wolfsoft1.uiuxlabecommerce_jp31.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp31.R;
import e.wolfsoft1.uiuxlabecommerce_jp31.model.Size_Model;

public class SizeAdapter_31 extends RecyclerView.Adapter<SizeAdapter_31.MySizeHolder> {

    private final ArrayList<Size_Model> size_modelArrayList;
    private final Context context;
    private int position;

    public SizeAdapter_31(Context context, ArrayList<Size_Model> size_modelArrayList) {
        this.size_modelArrayList = size_modelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MySizeHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_size_31, viewGroup, false);
        return new MySizeHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MySizeHolder mySizeHolder, final int i) {

        mySizeHolder.size_text.setText(size_modelArrayList.get(i).getSize());
        mySizeHolder.size_LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = i;
                notifyDataSetChanged();
            }
        });

        if (position == i) {
            mySizeHolder.line1.setBackgroundColor(Color.parseColor("#2962ff"));
            mySizeHolder.line2.setBackgroundColor(Color.parseColor("#2962ff"));
        } else {
            mySizeHolder.line1.setBackgroundColor(Color.parseColor("#fcfcfc"));
            mySizeHolder.line2.setBackgroundColor(Color.parseColor("#fcfcfc"));
        }
    }

    @Override
    public int getItemCount() {
        return size_modelArrayList.size();
    }

    class MySizeHolder extends RecyclerView.ViewHolder {
        LinearLayout size_LinearLayout;
        TextView size_text;
        View line1, line2;

        public MySizeHolder(@NonNull View itemView) {
            super(itemView);
            size_LinearLayout = itemView.findViewById(R.id.size_LinearLayout);
            size_text=itemView.findViewById(R.id.size_text);
            line1 = itemView.findViewById(R.id.line1);
            line2 = itemView.findViewById(R.id.line2);
        }
    }
}
