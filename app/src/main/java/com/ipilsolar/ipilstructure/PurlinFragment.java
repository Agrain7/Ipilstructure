package com.ipilsolar.ipilstructure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.ipilsolar.ipilstructure.databinding.FragmentPurlinBinding;

public class PurlinFragment extends Fragment {

    Double[] items14 = {2.0, 2.1, 2.2, 2.3, 2.4, 2.5, 2.6, 2.7, 2.8, 2.9, 3.0, 3.1, 3.2, 3.3, 3.4, 3.5, 3.6, 3.7, 3.8, 3.9, 4.0};
    Double[] items15 = {5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0, 21.0, 22.0,
            23.0, 24.0, 25.0, 26.0, 27.0, 28.0, 29.0, 30.0};
    Double[] items17 = {0.0, 10.0, 15.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0};

    TextView textView11;
    TextView textView12;
    TextView resulttext1;
    TextView resulttext2;
    TextView resulttext3;

    Spinner spinner;
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Spinner spinner5;

    String char1;
    String char2;
    String char3;
    int Main_wind;
    double Main_max_wind;
    double span;
    Double degree_value;
    String Pu_size;
    Double set_height;
    private FragmentPurlinBinding binding;

    public static int make_wind_value (@NonNull String A_value, String B_value){
        int basicwind = 0;
        switch (A_value) {
            case "서울특별시":
                if (B_value.equals("서울")) {
                    basicwind = 26;
                }
                break;
            case "인천광역시":
                switch (B_value) {
                    case "옹진":
                        basicwind = 30;
                        break;
                    case "인천": case "강화":
                        basicwind = 28;
                        break;
                }
                break;
            case "경기도":
                switch (B_value) {
                    case "안산": case "시흥": case "평택":
                        basicwind = 28;
                        break;
                    case "구리": case "수원": case "군포": case "오산": case "김포": case "화성": case "의왕":
                    case "부천": case "고양": case "안양": case "과천": case "광명": case "의정부": case "동두천":
                    case "양주": case "파주": case "광주": case "성남": case "용인": case "양평": case "포천":
                    case "남양주": case "가평": case "하남":
                        basicwind = 26;
                        break;
                    case "안성": case "연천": case "이천": case "여주":
                        basicwind = 24;
                        break;
                }
                break;
            case "강원도":
                switch (B_value) {
                    case "속초": case "양양": case "강릉": case "고성":
                        basicwind = 34;
                        break;
                    case "동해": case "삼척": case "홍천": case "인제": case "정선":
                        basicwind = 30;
                        break;
                    case "양구":
                        basicwind = 26;
                        break;
                    case "철원": case "화천": case "춘천": case "횡성": case "원주": case "평창": case "영월": case "태백":
                        basicwind = 24;
                        break;
                }
                break;
            case "대전광역시":
                if (B_value.equals("대전")) {
                    basicwind = 28;
                }
                break;
            case "충청남북도":
                switch (B_value) {
                    case "서산": case "태안":
                        basicwind = 34;
                        break;
                    case "당진":
                        basicwind = 32;
                        break;
                    case "서천": case "청원": case "보령": case "홍성": case "청주":
                        basicwind = 30;
                        break;
                    case "예산": case "공주": case "세종": case "부여":
                        basicwind = 28;
                        break;
                    case "아산": case "계룡": case "진천":
                        basicwind = 26;
                        break;
                    case "천안": case "금산": case "제천": case "괴산": case "증평": case "청양": case "논산": case "음성":
                    case "충주": case "단양": case "영동": case "보은": case "옥천":
                        basicwind = 24;
                        break;
                }

                break;
            case "부산광역시":
                if (B_value.equals("부산")) {
                    basicwind = 38;
                }
                break;
            case "대구광역시":
                if (B_value.equals("대구")) {
                    basicwind = 28;
                }
                break;
            case "울산광역시":
                if (B_value.equals("울산")) {
                    basicwind = 34;
                }
                break;
            case "경상남북도":
                switch (B_value) {
                    case "울릉": case "독도":
                        basicwind = 40;
                        break;
                    case "포항": case "기장": case "통영": case "경주": case "거제":
                        basicwind = 36;
                        break;
                    case "양산": case "남해": case "김해": case "울주":
                        basicwind = 34;
                        break;
                    case "영덕": case "고성":
                        basicwind = 32;
                        break;
                    case "울진": case "창원": case "영천": case "사천":
                        basicwind = 30;
                        break;
                    case "청송": case "청도": case "하동": case "밀양": case "경산":
                        basicwind = 28;
                        break;
                    case "영양": case "성주": case "칠곡": case "진주": case "군위": case "고령":
                    case "창녕": case "함안": case "달성":
                        basicwind = 26;
                        break;
                    case "봉화": case "구미": case "추풍령": case "안동": case "산청": case "의령":
                    case "거창": case "함양": case "예천": case "상주": case "의성": case "김천":
                    case "문경": case "영주": case "합천":
                        basicwind = 24;
                        break;
                }


                break;
            case "광주광역시":
                if (B_value.equals("광주")) {
                    basicwind = 26;
                }
                break;
            case "전라남북도":
                switch (B_value) {
                    case "완도": case "해남":
                        basicwind = 36;
                        break;
                    case "진도": case "여수": case "고흥": case "신안": case "무안": case "장흥":
                        basicwind = 34;
                        break;
                    case "군산": case "영암": case "목포": case "부안": case "강진":
                        basicwind = 32;
                        break;
                    case "영광": case "나주": case "함평":
                        basicwind = 30;
                        break;
                    case "익산": case "순천": case "광양": case "김제": case "고창":
                        basicwind = 28;
                        break;
                    case "보성": case "전주": case "완주": case "장성":
                        basicwind = 26;
                        break;
                    case "무주": case "정읍": case "진안": case "장수": case "임실": case "순창":
                    case "남원": case "담양": case "곡성": case "구례":
                        basicwind = 24;
                        break;
                }
                break;
            case "제주도":
                if (B_value.equals("서귀포")) {
                    basicwind = 44;
                } else if (B_value.equals("제주")) {
                    basicwind = 44;
                }
                break;
        }
        return basicwind;
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentPurlinBinding.inflate(inflater, container, false);

        String[] items = getResources().getStringArray(R.array.items);
        String[] items1 = getResources().getStringArray(R.array.items1);
        String[] items2 = getResources().getStringArray(R.array.items2);
        String[] items3 = getResources().getStringArray(R.array.items3);
        String[] items4 = getResources().getStringArray(R.array.items4);
        String[] items5 = getResources().getStringArray(R.array.items5);
        String[] items6 = getResources().getStringArray(R.array.items6);
        String[] items7 = getResources().getStringArray(R.array.items7);
        String[] items8 = getResources().getStringArray(R.array.items8);
        String[] items9 = getResources().getStringArray(R.array.items9);
        String[] items10 = getResources().getStringArray(R.array.items10);
        String[] items11 = getResources().getStringArray(R.array.items11);
        String[] items12 = getResources().getStringArray(R.array.items12);
        String[] items13 = getResources().getStringArray(R.array.items13);
        String[] items16 = getResources().getStringArray(R.array.items16);

        textView11 = binding.textView11;
        textView12 = binding.textView12;
        resulttext1 = binding.resulttext1;
        resulttext2 = binding.resulttext2;
        resulttext3 = binding.resulttext3;

        spinner = binding.spinner;
        spinner1 = binding.spinner1;
        spinner2 = binding.spinner2;
        spinner3 = binding.spinner3;
        spinner4 = binding.spinner4;
        spinner5 = binding.spinner5;

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ArrayAdapter<Double> adapter14 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items14);
        adapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter14);

        ArrayAdapter<Double> adapter15 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items15);
        adapter15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter15);

        ArrayAdapter<String> adapter16 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items16);
        adapter16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter16);

        ArrayAdapter<Double> adapter17 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items17);
        adapter17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter17);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items3);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items4);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items5);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter6 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items6);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter7 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items7);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter8 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items8);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter9 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items9);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter10 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items10);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter11 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items11);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter12 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items12);
        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter13 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, items13);
        adapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (items[position]) {
                    case "서울특별시":
                        spinner1.setAdapter(adapter1);
                        char2 = items1[0];
                        break;
                    case "인천광역시":
                        spinner1.setAdapter(adapter2);
                        char2 = items2[0];
                        break;
                    case "경기도":
                        spinner1.setAdapter(adapter3);
                        char2 = items3[0];
                        break;
                    case "강원도":
                        spinner1.setAdapter(adapter4);
                        char2 = items4[0];
                        break;
                    case "대전광역시":
                        spinner1.setAdapter(adapter5);
                        char2 = items5[0];
                        break;
                    case "충청남북도":
                        spinner1.setAdapter(adapter6);
                        char2 = items6[0];
                        break;
                    case "부산광역시":
                        spinner1.setAdapter(adapter7);
                        char2 = items7[0];
                        break;
                    case "대구광역시":
                        spinner1.setAdapter(adapter8);
                        char2 = items8[0];
                        break;
                    case "울산광역시":
                        spinner1.setAdapter(adapter9);
                        char2 = items9[0];
                        break;
                    case "경상남북도":
                        spinner1.setAdapter(adapter10);
                        char2 = items10[0];
                        break;
                    case "광주광역시":
                        spinner1.setAdapter(adapter11);
                        char2 = items11[0];
                        break;
                    case "전라남북도":
                        spinner1.setAdapter(adapter12);
                        char2 = items12[0];
                        break;
                    case "제주도":
                        spinner1.setAdapter(adapter13);
                        char2 = items13[0];
                        break;
                }

                char1 = items[position];

                String myString = char3;
                ArrayAdapter myAdap1 = (ArrayAdapter) spinner1.getAdapter();
                int spinnerPosition = myAdap1.getPosition(myString);
                spinner1.setSelection(spinnerPosition);

                Main_wind = make_wind_value(char1,char2);
                Main_max_wind = Math.round(Main_wind * 1.43);

                String test = Main_wind + " m/s";
                textView11.setText(test);

                String test2 = Main_max_wind + " m/s";
                textView12.setText(test2);

            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                textView11.setText("");
            }
        });

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                switch (char1) {
                    case "서울특별시":
                        char3 = items1[position];
                        break;
                    case "인천광역시":
                        char3 = items2[position];
                        break;
                    case "경기도":
                        char3 = items3[position];
                        break;
                    case "강원도":
                        char3 = items4[position];
                        break;
                    case "대전광역시":
                        char3 = items5[position];
                        break;
                    case "충청남북도":
                        char3 = items6[position];
                        break;
                    case "부산광역시":
                        char3 = items7[position];
                        break;
                    case "대구광역시":
                        char3 = items8[position];
                        break;
                    case "울산광역시":
                        char3 = items9[position];
                        break;
                    case "경상남북도":
                        char3 = items10[position];
                        break;
                    case "광주광역시":
                        char3 = items11[position];
                        break;
                    case "전라남북도":
                        char3 = items12[position];
                        break;
                    case "제주도":
                        char3 = items13[position];
                        break;
                }

                Main_wind = make_wind_value(char1,char3);
                Main_max_wind = Math.round(Main_wind * 1.43);

                String test = Main_wind + " m/s";
                textView11.setText(test);

                String test2 = Main_max_wind + " m/s";
                textView12.setText(test2);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                textView12.setText("");
            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                span = items14[position];
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                textView11.setText("");
            }
        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                degree_value = items15[position];
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                textView11.setText("");
            }
        });

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Pu_size = items16[position];
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                textView11.setText("");
            }
        });

        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                set_height = items17[position];
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                textView11.setText("");
            }
        });

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonPurlin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PurlinLogic kk = new PurlinLogic(PurlinFragment.this);
                kk.main(Pu_size,span,degree_value,set_height,Main_wind);

                resulttext1.setText(kk.final_NG_OK);
                double tempvalue = (double)Math.round(kk.final_ratio*1000)/1000;
                String test3 = Double.toString(tempvalue);
                resulttext2.setText(test3);
                resulttext3.setText(kk.final_comment);

                Bundle result = new Bundle();
                result.putString("main_result1", kk.final_NG_OK);
                result.putString("main_result2", test3);
                result.putString("main_result3", kk.final_comment);
                getParentFragmentManager().setFragmentResult("key", result);

                NavHostFragment.findNavController(PurlinFragment.this)
                        .navigate(R.id.action_SecondFragment_to_ThirdFragment);

            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}