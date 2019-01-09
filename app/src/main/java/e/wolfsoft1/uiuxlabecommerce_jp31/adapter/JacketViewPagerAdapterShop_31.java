package e.wolfsoft1.uiuxlabecommerce_jp31.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import e.wolfsoft1.uiuxlabecommerce_jp31.fragment.Fragment_Jacket_Viewpager;

public class JacketViewPagerAdapterShop_31 extends FragmentPagerAdapter {
    public JacketViewPagerAdapterShop_31(FragmentManager fm, int i) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment=null;
        switch (i){
            case 0:
                fragment=new Fragment_Jacket_Viewpager();
                break;
            case 1:

                fragment=new Fragment_Jacket_Viewpager();
                break;
            case 2:

                fragment=new Fragment_Jacket_Viewpager();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
