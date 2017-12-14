package com.mauricio.logonrm.calculator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImcFragment extends Fragment {

    private RadioGroup sex;
    private EditText height;
    private EditText weight;
    private FloatingTextButton calculateButton;


    public ImcFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_imc, container, false);
        sex = v.findViewById(R.id.radiogroup_imc);
        height = v.findViewById(R.id.edit_main_altura);
        weight = v.findViewById(R.id.edit_main_peso);
        calculateButton = v.findViewById(R.id.button_imc);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Clique!", Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

}
