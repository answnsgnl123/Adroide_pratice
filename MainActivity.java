package com.example.practice2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity implements ActionBar.TabListener{
    String[] tabName = {"문제1", "문제2", "문제3", "문제4"};

    MyTabFragment myFrags[] = new MyTabFragment[4];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        for(String name : tabName)
            createTab(name);

    }

    public void createTab(String text){

        ActionBar bar = getSupportActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tabName = bar.newTab();
        tabName.setText(text);
        tabName.setTabListener(this);
        bar.addTab(tabName);
    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        MyTabFragment myTabFrag = null;

        if (myFrags[tab.getPosition()] == null) {

            myTabFrag = new MyTabFragment();
            Bundle data = new Bundle();
            data.putString("tabName", tab.getText().toString());

            myTabFrag.setArguments(data);
            myFrags[tab.getPosition()] = myTabFrag;
        } else
            myTabFrag = myFrags[tab.getPosition()];


        ft.replace(android.R.id.content, myTabFrag);

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }

    public static class MyTabFragment extends androidx.fragment.app.Fragment {
        String tabName;
        Question__001 question__001 = new Question__001();
        Question__002 question__002 = new Question__002();
        Question__003 question__003 = new Question__003();

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Bundle data = getArguments();
            tabName = data.getString("tabName");

            System.out.println("Context2:" + getContext());




        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            LinearLayout layout1 = question__001.baseLayout(getActivity());
            LinearLayout layout2 = question__001.outsideLinearLayout(getActivity());
            LinearLayout layout3 = question__001.midLinearLayout(getActivity());
            LinearLayout layout4 = question__001.centerLinearLayout(getActivity());

            LinearLayout llayout1 = question__002.firstLinearLayout(getActivity());
            LinearLayout llayout2 = question__002.secondLinearLaout(getActivity());
            LinearLayout llayout3 = question__002.secondLinearLaout(getActivity());
            LinearLayout llayout4 = question__002.secondLinearLaout(getActivity());
            LinearLayout llayout5 = question__002.secondLinearLaout(getActivity());
            LinearLayout llayout6 = question__002.secondLinearLaout(getActivity());



            if (tabName == "문제1") {
                layout1.setGravity(Gravity.CENTER);
                layout2.setGravity(Gravity.CENTER);
                layout3.setGravity(Gravity.CENTER);
                layout2.setBackgroundColor(Color.GREEN);
                layout3.setBackgroundColor(Color.BLACK);
                layout4.setBackgroundColor(Color.BLUE);

                layout1.addView(layout2, 500, 500);
                layout2.addView(layout3, 250, 250);
                layout3.addView(layout4, 100, 100);
            }
            if (tabName == "문제2") {
                layout2.setEnabled(false);

                llayout1.setBackgroundColor(Color.BLACK);
                llayout2.setBackgroundColor(Color.BLUE);
                llayout3.setBackgroundColor(Color.YELLOW);
                llayout4.setBackgroundColor(Color.GRAY);
                llayout5.setBackgroundColor(Color.BLACK);
                llayout6.setBackgroundColor(Color.GREEN);

                llayout4.setOrientation(LinearLayout.VERTICAL);

                layout1.addView(llayout1);
                layout1.addView(llayout2);
                llayout1.addView(llayout3);
                llayout1.addView(llayout4);
                llayout4.addView(llayout5);
                llayout4.addView(llayout6);
            }
            if (tabName == "문제3") {
                layout2.setVisibility(View.INVISIBLE);
            }
            if (tabName == "문제4") {
                layout2.setVisibility(View.INVISIBLE);
            }

            return layout1;
        }

    }
}