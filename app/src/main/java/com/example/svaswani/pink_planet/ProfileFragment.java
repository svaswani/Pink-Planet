package com.example.svaswani.pink_planet;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by svaswani on 2/27/2016.
 */
public class ProfileFragment extends Fragment {

    private TextView mExampleView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_profilefragment, container,
                false);

        return rootView;
    }


    public ProfileFragment() {

    }

//    @Nullable
//    @Override
//    public View getView() {
//        return mExampleView;
//    }
}
