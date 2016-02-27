package com.example.svaswani.pink_planet;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by svaswani on 2/27/2016.
 */
public class MessagesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_messagesfragment, container,
                false);

        return rootView;
    }
    

    public MessagesFragment() {

    }

//    @Nullable
//    @Override
//    public View getView() {
//
//        return mExampleView;
//    }
}
