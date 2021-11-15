package com.example.testproject1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class FragmentHome extends Fragment {

    Button btnchernobyl;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final  ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.fragment_home, container, false);
        btnchernobyl = (Button) inflatedView.findViewById(R.id.btnchernobyl);
        btnchernobyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent555 = new Intent(getActivity(), ChernobylActivity.class);
                startActivity(intent555);
            }
        });
        return inflatedView;
    }
}
