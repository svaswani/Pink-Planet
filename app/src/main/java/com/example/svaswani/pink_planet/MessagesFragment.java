package com.example.svaswani.pink_planet;


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

/**
 * Created by svaswani on 2/27/2016.
 */
public class MessagesFragment extends Fragment {
    private TextView mExampleView;

    public MessagesFragment() {

    }

    @Nullable
    @Override
    public View getView() {
        return mExampleView;
    }
}
