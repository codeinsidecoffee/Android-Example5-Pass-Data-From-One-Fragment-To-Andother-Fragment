package com.mrlonewolfer.example36;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

  TextView txtMsg;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second, container, false);
        txtMsg=view.findViewById(R.id.txtMsg);
        Bundle bundle =getArguments();
        String msg=bundle.getString("mymsg");
        txtMsg.setText(msg);

        return  view;
    }

}
