package e.wolfsoft1.uiuxlabecommerce_jp31;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;

import com.viewpagerindicator.LinePageIndicator;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp31.adapter.ColorAdapter_31;
import e.wolfsoft1.uiuxlabecommerce_jp31.adapter.JacketViewPagerAdapterShop_31;
import e.wolfsoft1.uiuxlabecommerce_jp31.adapter.SizeAdapter_31;
import e.wolfsoft1.uiuxlabecommerce_jp31.model.Color_Model;
import e.wolfsoft1.uiuxlabecommerce_jp31.model.Size_Model;

public class Shop_31 extends AppCompatActivity {

    ViewPager viewpager_jacket;
    RecyclerView size_recycler_31, color_recycler_31;
    ArrayList<Size_Model> size_modelArrayList;
    ArrayList<Color_Model> color_modelArrayList;
    FrameLayout increment, decrement;
    LinePageIndicator indicator_line;

    private String size[] = {"X", "XL", "S", "XS", "XL", "XX", "L"};
    private Integer color[] = {R.drawable.ic_color1, R.drawable.ic_color2, R.drawable.ic_color3, R.drawable.ic_color4, R.drawable.ic_color5, R.drawable.ic_color6, R.drawable.ic_color7, R.drawable.ic_color8};

    int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_31);

        indicator_line = findViewById(R.id.indicator_line);

        increment = findViewById(R.id.increment);
        decrement = findViewById(R.id.decrement);

        viewpager_jacket = findViewById(R.id.viewpager_jacket);
        size_recycler_31 = findViewById(R.id.size_recycler_31);

        color_recycler_31 = findViewById(R.id.color_recycler_31);

        JacketViewPagerAdapterShop_31 viewPagerAdapter = new JacketViewPagerAdapterShop_31(getSupportFragmentManager(), 3);
        viewpager_jacket.setAdapter(viewPagerAdapter);

        indicator_line.setViewPager(viewpager_jacket);
        size_modelArrayList = new ArrayList<>();
        color_modelArrayList = new ArrayList<>();

        for (int i = 0; i < size.length; i++) {
            Size_Model size_model = new Size_Model(size[i]);
            size_modelArrayList.add(size_model);
        }
        for (int i = 0; i < color.length; i++) {
            Color_Model color_model = new Color_Model(color[i]);
            color_modelArrayList.add(color_model);
        }

        size_recycler_31.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        SizeAdapter_31 sizeAdapter = new SizeAdapter_31(this, size_modelArrayList);
        size_recycler_31.setAdapter(sizeAdapter);

        color_recycler_31.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ColorAdapter_31 adapter = new ColorAdapter_31(this, color_modelArrayList);
        color_recycler_31.setAdapter(adapter);


    }
}
