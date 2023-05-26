package com.example.practice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class FragmentChat extends Fragment {

    TabLayout tabLayout_chat;
    ViewPager2 viewPager2_chat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        viewPager2_chat = view.findViewById(R.id.view_pager2_chat);

        tabLayout_chat = view.findViewById(R.id.tabLayout_chat);
        viewPager2_chat = view.findViewById(R.id.view_pager2_chat);

        Adapter_Tab_ViewPager2 adapter = new Adapter_Tab_ViewPager2(getChildFragmentManager(), getLifecycle());
        adapter.addFragment(new FragmentChatChats());
        adapter.addFragment(new FragmentChatGroups());
        adapter.addFragment(new FragmentChatPosts());
        adapter.addFragment(new FragmentChatCalls());

        viewPager2_chat.setAdapter(adapter);
        tabLayout_chat.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2_chat.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout_chat.selectTab(tabLayout_chat.getTabAt(position));
            }
        });

        return view;
    }
}
