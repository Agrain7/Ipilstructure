package com.ipilsolar.ipilstructure;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ipilsolar.ipilstructure.databinding.FragmentResultBinding;

public class ResultFragment extends Fragment {

    private FragmentResultBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentResultBinding.inflate(inflater, container, false);

                binding.buttonResult2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent go_ipil_Solar = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ipilsolar.netlify.app/SolarTest/SolarSample001"));
                        startActivity(go_ipil_Solar);

                    }
                });

                binding.buttonResult5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent go_ipil_Solar = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ipilsolar.netlify.app/solartest/buildingsample001"));
                        startActivity(go_ipil_Solar);

                    }
                });

                binding.buttonResult6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        /*NavHostFragment.findNavController(ResultFragment.this)
                                .navigate(R.id.action_ThirdFragment_to_FirstFragment);*/
                        Intent intent = new Intent(getActivity(), PopupActivity.class);
                        startActivity(intent);
                    }
                });

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getParentFragmentManager().setFragmentResultListener("key", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String key, @NonNull Bundle bundle) {
                String main_result1 = bundle.getString("main_result1");
                String main_result2 = bundle.getString("main_result2");
                String main_result3 = bundle.getString("main_result3");

                TextView activity_result1 = binding.activityResult1;
                TextView activity_result2 = binding.activityResult2;
                TextView activity_result3 = binding.activityResult3;

                activity_result1.setText(main_result1);
                activity_result2.setText(main_result2);
                activity_result3.setText(main_result3);

                if (main_result1.equals("O.K")){
                    activity_result1.setTextColor(Color.BLUE);
                    activity_result2.setTextColor(Color.BLUE);
                    activity_result3.setTextColor(Color.BLUE);

                }
                else{
                    activity_result1.setTextColor(Color.RED);
                    activity_result2.setTextColor(Color.RED);
                    activity_result3.setTextColor(Color.RED);
                }

            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}