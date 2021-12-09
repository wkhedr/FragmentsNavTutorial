package com.wik4apps.fragmentstutprep2;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;


public class MessageFragment extends Fragment {



    public MessageFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewFrag = inflater.inflate(R.layout.fragment_message, container, false);
        Button btn = viewFrag.findViewById(R.id.next);
        EditText et = viewFrag.findViewById(R.id.message);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // navController.navigate(R.id.action_messageFragment_to_encryptFragment);
                String message = et.getText().toString();
                Log.d("MMM1",message);
                NavDirections directions = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message);
                NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
                navController.navigate(directions);

            }
        });
        return viewFrag;
    }
}