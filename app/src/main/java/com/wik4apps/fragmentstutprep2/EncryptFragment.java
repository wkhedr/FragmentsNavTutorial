package com.wik4apps.fragmentstutprep2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class EncryptFragment extends Fragment {


    public EncryptFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewFrag = inflater.inflate(R.layout.fragment_encrypt, container, false);
        TextView tv = viewFrag.findViewById(R.id.encrypted_message);
        String message = EncryptFragmentArgs.fromBundle(requireArguments()).getMessage();
        tv.setText(new StringBuffer(message).reverse());

        return viewFrag;
    }
}