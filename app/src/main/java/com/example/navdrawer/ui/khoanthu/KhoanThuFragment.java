package com.example.navdrawer.ui.khoanthu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.example.navdrawer.R;
import com.example.navdrawer.adapter.PageKhoanThuAdapter;
import com.google.android.material.tabs.TabLayout;
import org.jetbrains.annotations.NotNull;

public class KhoanThuFragment extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private PageKhoanThuAdapter pageKhoanThuAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_khoan_thu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPager = view.findViewById(R.id.pagers);
        tabLayout = view.findViewById(R.id.tabs);
        pageKhoanThuAdapter = new PageKhoanThuAdapter(getChildFragmentManager());
        viewPager.setAdapter(pageKhoanThuAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
