package com.example.navdrawer.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.navdrawer.ui.khoanthu.ListKhoanThuFragment;
import com.example.navdrawer.ui.khoanthu.ListLoaiKhoanThuFragment;
import org.jetbrains.annotations.NotNull;

public class PageKhoanThuAdapter extends FragmentStatePagerAdapter {


    public PageKhoanThuAdapter(@NonNull @NotNull FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Khoản Thu";
            case 1:
                return "Loại Thu";
        }
        return super.getPageTitle(position);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ListKhoanThuFragment();
            case 1:
                return new ListLoaiKhoanThuFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
