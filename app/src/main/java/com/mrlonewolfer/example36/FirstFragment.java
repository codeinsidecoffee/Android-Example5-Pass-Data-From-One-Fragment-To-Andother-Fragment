package com.mrlonewolfer.example36;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {

    EditText edtMsg;
    Button btnSubmit;
    Context context;
    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_first, container, false);
        edtMsg=view.findViewById(R.id.edtMsg);
        btnSubmit=view.findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Fragment fragment=new SecondFragment();
        String msg=edtMsg.getText().toString();
        Bundle bundle= new Bundle();
        bundle.putString("mymsg",msg);
        fragment.setArguments(bundle);

        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameContainer,fragment);
        fragmentTransaction.addToBackStack(FirstFragment.class.getName());
        fragmentTransaction.commit();
    }
}
