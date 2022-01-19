package com.ipilsolar.ipilstructure;

import java.util.ArrayList;
import java.util.List;

public class PurlinLogic {

    private final PurlinFragment purlinlogic;
    public String final_NG_OK;
    public Double final_ratio;
    public String final_comment;


    public Double Fy_value = 275.0;
    public Double Es_value = 210000.0;
    public Double Cb_value = 1.0; //휨모멘트계수
    public Double k_value = 1.0; // ' 좌굴계수
    public Double 부재배치간격 = 1.0;// ' m
    public Double Mu_value; // = 528150.0
    public Double Minor_Mu_value;// = 143913

    //부재 X축에 대한 전단강도계산
    public Double vux_value;//As  ' = 243.1
    //부재 Y축에 대한 전단강도계산
    public Double vuy_value;//  ' = 908

    //입력값
    public Double A_H_value;//As
    public Double B_B_value;//As
    public Double C_d_value;//As Double
    public Double t_t_value;//As
    public Double R_R_value;//As
    public Double Alpha_R_value;// As
    public Double 경간;// As
    public Double 각도;// As
    public Double 설치높이;// As

    //계산값
    public Double r_value;// As Double
    public Double a_value;// As Double
    public Double a_bar_value;// As Double
    public Double b_value;// As Double
    public Double b_bar_value;// As Double
    public Double c_value;// As Double
    public Double c_bar_value;// As Double
    public Double u_value;// As Double

    public Double Area_value;// As Double
    public Double Ix_value;// As Double
    public Double Xbar_c_value;// As Double
    public Double Iy_value;// As Double
    public Double m_value;// As Double
    public Double Xo_value;// As Double
    public Double J_value;// As Double
    public Double Cw_value;// As Double
    public Double beta_w_value;// As Double
    public Double beta_f_value;// As Double
    public Double beta_I_value;// As Double
    public Double small_j_value;// As Double
    public Double rx_value;// As Double
    public Double ry_value;// As Double

    //검토 대상
    public Double BTR;// As  '플랜지_판폭두께비
    public String BTR_Check;// As  '플랜지_판폭두께비 검토
    public Double HTR;// As  '리브_판폭두께비
    public String HTR_Check;// As  '리브_판폭두께비 검토

    //'강축단면속성-DB화 해야 함
    public Double ycg_value;// As
    public List<Double> MA_L_List;// As New List(Of Double)
    public List<Double> MA_x_List;// As New List(Of Double)
    public List<Double> MA_Lx_List;// As New List(Of Double)
    public List<Double> MA_Lx2_List;// As New List(Of Double)
    public List<Double> MA_I1_List;// As New List(Of Double)
    public Double MA_L_List_Sum;// As
    public Double MA_x_List_Sum;// As Double
    public Double MA_Lx_List_Sum;// As Double
    public Double MA_Lx2_List_Sum;// As Double
    public Double MA_I1_List_Sum;// As Double

    //'강축 항복시작시의 모멘트 강도 계산(Mnx)
    public Double Major_I_Px;// As
    public Double Major_Ix;// As Double
    public Double Major_Sex;// As Double
    public Double Major_Mnx;// As Double

    //주축에대한 횡좌굴 강도 검토(Mnx2)
    public Double Fe_value;// As
    public Double landa_c_value;// As Double
    public Double Fn_value;// As
    public Double Major_Mnx2;// As Double

    //강축에 대한 허용 휨 강도 검토(Ma)
    public Double Wf_value = 1.67;// '기준 안전계수
    public Double Major_Ma;// As
    public Double Major_Ma_ratio;// As Double
    public String Major_Ma_check;// As String

    //강축에 대한 휨 모멘트 강도비 검토(Mao)3
    public Double Major_Mno;// As Double
    public Double Major_Mao;// As Double
    public Double Major_Mao_ratio;// As
    public String Major_Mao_check;// As String

    //약축단면속성-DB화 해야 함
    public Double xcg_value;// As Double
    public List<Double> Mi_L_List = new ArrayList<>();// As New List(Of Double)
    public List<Double> Mi_x_List = new ArrayList<>();// As New List(Of Double)
    public List<Double> Mi_Lx_List = new ArrayList<>();// As New List(Of Double)
    public List<Double> Mi_Lx2_List = new ArrayList<>();// As New List(Of Double)
    public List<Double> Mi_I1_List = new ArrayList<>();// As New List(Of Double)
    public Double Mi_L_List_Sum;// As Double
    public Double Mi_x_List_Sum;// As Double
    public Double Mi_Lx_List_Sum;// As Double
    public Double Mi_Lx2_List_Sum;// As Double
    public Double Mi_I1_List_Sum;// As Double

    //약축 항복시작시의 모멘트 강도 계산(Mny)
    public Double Minor_I_Py;// As Double
    public Double Minor_Iy;// As Double
    public Double Minor_Sey;// As Double
    public Double Minor_Mny;// As Double

    //약축에대한 횡좌굴 강도 검토(Mny2)
    public Double Cs_value = -1.0;// '(인장)
    public Double Sfy_value;// 'DB화 해야 함
    public Double Minor_My;// As Double
    public Double Minor_Mey;// 'DB화 해야 함
    public Double Minor_Mcy;// As Double
    public Double Minor_fcy;// As Double
    public Double Minor_Sey2;// As Double
    public Double Minor_Mny2;// As Double

    //약축에 대한 휨 모멘트 강도비 검토(Ma)
    public Double Minor_Wf_value = 1.67;// '기준 안전계수
    public Double Minor_Ma;// As Double
    public Double Minor_Ma_ratio;// As Double
    public String Minor_Ma_check;// As String

    //약축에 대한 허용 휨강도 검토(Mao)
    public Double Minor_Mno;// As Double
    public Double Minor_Mao;// As Double
    public Double Minor_Mao_ratio;// As Double
    public String Minor_Mao_check;// As String

    //부재 X축에 대한 전단강도계산
    public Double Vax_value;// As Double
    public Double Vax_ratio;// As Double
    public String Vax_check;// As String
    public Double Muy_Vux_Com_ratio;// As Double
    public String Muy_Vux_Com_check;// As String

    //부재 Y축에 대한 전단강도계산
    public Double HTR_Vy;// As Double
    public Double kv_value = 5.34;// ' 기본값
    public Double HTR_a;// As Double
    public Double Vay1_Value;// As Double
    public Double Vay2_Value;// As Double
    public Double Vay_final_Value;// As Double

    //전단강도비 검토
    public Double Vay_ratio;// As Double
    public String Vay_check;// As String
    public Double Mux_Vuy_Com_ratio;// As Double
    public String Mux_Vuy_Com_check;// As String

    //조합강도비 검토
    public Double R_ratio;// As Double
    public String R_ratio_check;// As String

    //======================하중 검토
    public Double 철밀도 = 77.217450725;// 'kN/m3
    public Double 분담폭 = 1.0;// 'm
    public Double 패널무게 = 0.15;// 'kN/m2
    public Double 자중;//
    public Double 고정하중;// As
    public Double 설하중 = 0.5;// 'kN/m2
    public Double 풍하중_정;//  'kN/m2
    public Double 풍하중_부;//  'kN/m2

    //강도 하중조합(X방향)
    public Double wx1_Value;// As Double
    public Double wx2_Value;// As Double
    public Double wx3_Value;// As Double
    public Double wx4_Value;// As Double

    //강도 하중조합(Y방향)
    public Double wy1_Value;// As
    public Double wy2_Value;// As Double
    public Double wy3_Value;// As Double
    public Double wy4_Value;// As Double

    //사용 하중조합(X방향)
    public Double wxs1_Value;// As Double
    public Double wxs2_Value;// As Double
    public Double wxs3_Value;// As Double

    //사용 하중조합(Y방향)
    public Double wys1_Value;// As Double
    public Double wys2_Value;// As Double
    public Double wys3_Value;// As Double


    //기준높이 정압, 부압 피크외압계수 GCpe
    public Double GCpe_pl_value;// ' 정압
    public Double GCpe_Mi_value;// ' 부압

    public Double 유효수압면적;// ' 유효수압면적

    public Double Vo_value;// ' 기본풍속
    public Double Kzt_value = 1.0;// '  지형계수
    public Double Iw_Value = 0.9;// ' 중요도 계수
    public Double kzr_value = 1.0;//    '고도분포계수
    public Double VH_value;// ' 설계풍속
    public Double qH_value;// ' 설계속도압


    public Double Mux1_value;// As Double
    public Double Mux2_value;// As Double
    public Double Mux3_value;// As Double
    public Double Mux4_value;// As Double

    public Double Muy1_value;// As Double
    public Double Muy2_value;// As Double
    public Double Muy3_value;// As Double
    public Double Muy4_value;// As Double


    public Double Vux1_value;// As Double
    public Double Vux2_value;// As Double
    public Double Vux3_value;// As Double
    public Double Vux4_value;// As Double

    public Double Vuy1_value;// As Double
    public Double Vuy2_value;// As Double
    public Double Vuy3_value;// As Double
    public Double Vuy4_value;// As Double

    public PurlinLogic(PurlinFragment purlinlogic) {
        this.purlinlogic = purlinlogic;
    }


    public void main(String input, Double 경간_, Double 각도_, Double 설치높이_, int 기본풍속_) {
        경간 = 경간_ * 1000;
        각도 = 각도_;
        설치높이 = 설치높이_;
        Vo_value = (double) 기본풍속_;

        String[] STR;
        String[] STR2;
        STR = input.split("-");
        STR2 = STR[1].split("x");
        deleteSpaceinstrigarr(STR2);

        //입력값
        A_H_value = Double.parseDouble(STR2[0]);
        B_B_value = Double.parseDouble(STR2[1]);
        C_d_value = Double.parseDouble(STR2[2]);
        t_t_value = Double.parseDouble(STR2[3]);
        R_R_value = t_t_value * 2;
        Alpha_R_value = 1.0;

        //계산값
        r_value = R_R_value + t_t_value / 2;
        a_value = A_H_value - (2 * r_value + t_t_value);
        a_bar_value = A_H_value - t_t_value;
        b_value = B_B_value - (r_value + t_t_value / 2 + Alpha_R_value * (r_value + t_t_value / 2));
        b_bar_value = B_B_value - (t_t_value / 2 + Alpha_R_value * (t_t_value / 2));
        c_value = Alpha_R_value * (C_d_value - (r_value + t_t_value / 2));
        c_bar_value = Alpha_R_value * (C_d_value - (t_t_value / 2));
        u_value = Math.PI * (r_value / 2);


        Area_value = t_t_value * (a_value + 2 * b_value + 2 * u_value + Alpha_R_value * (2 * c_value + 2 * u_value));
        Ix_value = 2 * t_t_value * (0.0417 * Math.pow(a_value, 3) + b_value * Math.pow((a_value / 2 + r_value), 2) +
                u_value * Math.pow((a_value / 2 + 0.637 * r_value), 2) + 0.149 * Math.pow(r_value, 3) +
                Alpha_R_value * (0.0833 * Math.pow(c_value, 3) + c_value / 4 * Math.pow((a_value - c_value), 2) +
                        u_value * Math.pow((a_value / 2 + 0.637 * r_value), 2) + 0.149 * Math.pow(r_value, 3)));
        Xbar_c_value = 2 * t_t_value / Area_value * (b_value * (b_value / 2 + r_value) + u_value * (0.363 * r_value) + Alpha_R_value * (u_value * (b_value + 1.637 * r_value) + c_value * (b_value + 2 * r_value)));
        Iy_value = 2 * t_t_value * (b_value * Math.pow((b_value / 2 + r_value), 2) +
                (Math.pow(b_value, 3)) / 12 + 0.356 * Math.pow(r_value, 3) +
                Alpha_R_value * (c_value * Math.pow((b_value + 2 * r_value), 2) +
                        u_value * Math.pow((b_value + 1.637 * r_value), 2) + 0.149 * Math.pow(r_value, 3))) - Area_value * Math.pow(Xbar_c_value, 2);
        m_value = b_bar_value * ((3 * Math.pow(a_bar_value, 2) * b_bar_value + Alpha_R_value * c_bar_value *
                (6 * Math.pow(a_bar_value, 2) - 8 * Math.pow(c_bar_value, 2))) / (Math.pow(a_bar_value, 3) + 6 * Math.pow(a_bar_value, 2) *
                b_bar_value + Alpha_R_value * c_bar_value * (8 * Math.pow(c_bar_value, 2) - 12 * a_bar_value *
                c_bar_value + 6 * Math.pow(a_bar_value, 2))));
        Xo_value = -1 * (Xbar_c_value + m_value);
        J_value = Math.pow(t_t_value, 3) / 3 * (a_value + 2 * b_value + 2 * u_value + Alpha_R_value * (2 * c_value + 2 * u_value));
        Cw_value = (Math.pow(a_bar_value, 2) * Math.pow(b_bar_value, 2) * t_t_value / 12) *
                (((2 * Math.pow(a_bar_value, 3) * b_bar_value) + (3 * Math.pow(a_bar_value, 2) * Math.pow(b_bar_value, 2)) +
                        Alpha_R_value * ((48 * Math.pow(c_bar_value, 4)) + (112 * b_bar_value * Math.pow(c_bar_value, 3)) +
                                (8 * a_bar_value * Math.pow(c_bar_value, 3)) + (48 * a_bar_value * b_bar_value * Math.pow(c_bar_value, 2)) +
                                (12 * Math.pow(a_bar_value, 2) * Math.pow(c_bar_value, 2)) + (12 * Math.pow(a_bar_value, 2) * b_bar_value * c_bar_value) +
                                (6 * Math.pow(a_bar_value, 3) * c_bar_value))) / ((6 * Math.pow(a_bar_value, 2) * b_bar_value +
                        Math.pow((a_bar_value + Alpha_R_value * 2 * c_bar_value), 3) -
                        Alpha_R_value * 24 * a_bar_value * Math.pow(c_bar_value, 2))));
        beta_w_value = -1 * (t_t_value * Xbar_c_value * Math.pow(a_bar_value, 3) / 12 + t_t_value * Math.pow(Xbar_c_value, 3) * a_bar_value);
        beta_f_value = (t_t_value / 2) * (Math.pow((b_bar_value - Xbar_c_value), 4) - Math.pow(Xbar_c_value, 4)) +
                (t_t_value * Math.pow(a_bar_value, 2)) / 4 * (Math.pow((b_bar_value - Xbar_c_value), 2) -
                        Math.pow(Xbar_c_value, 2));
        beta_I_value = Alpha_R_value * ((2 * c_bar_value * t_t_value * Math.pow((b_bar_value - Xbar_c_value), 3)) +
                ((2 / 3) * t_t_value * (b_bar_value - Xbar_c_value)) * ((Math.pow((a_bar_value / 2), 3)) -
                        (Math.pow((a_bar_value / 2 - c_bar_value), 3))));
        small_j_value = 1 / (2 * Iy_value) * (beta_w_value + beta_f_value + beta_I_value) - Xo_value;
        rx_value = Math.sqrt(Ix_value / Area_value);
        ry_value = Math.sqrt(Iy_value / Area_value);


        설하중계산(purlinlogic.char1, purlinlogic.char2);
        하중계산();
        cal_check();
        Make_Major_List(input);
        cal_Major_Mnx();
        cal_Major_Mnx2(input);
        cal_Major_Ma();
        cal_Major_Mao();

        Mike_Minor_List(input);
        cal_Major_Mny();
        cal_Major_Mny2();
        cal_Minor_Ma();
        cal_Minor_Mao();

        cal_Vax();
        cal_Vay();

        cal_com_ratio();
        Final_Check();
    }

    // 설하중 계산
    public void 설하중계산(String loc_name, String loc_name2) {
        switch (loc_name) {
            case "제주도":
            case "광주광역시":
            case "서울특별시":
            case "인천광역시":
            case "경기도":
            case "대전광역시":
            case "대구광역시":
            case "울산광역시":
            case "부산광역시":
                설하중 = 0.5;
                break;
            case "강원도":
                switch (loc_name2) {
                    case "속초":
                        설하중 = 2.5;
                        break;
                    case "양양":
                        설하중 = 2.8;
                        break;
                    case "강릉":
                    case "평창":
                        설하중 = 3.0;
                        break;
                    case "고성":
                    case "동해":
                    case "삼척":
                        설하중 = 1.7;
                        break;
                    case "홍천":
                        설하중 = 1.0;
                        break;
                    case "정선":
                        설하중 = 3.5;
                        break;
                    case "인제":
                    case "영월":
                        설하중 = 2.2;
                        break;
                    case "양구":
                        설하중 = 1.5;
                        break;
                    case "철원":
                    case "원주":
                    case "춘천":
                        설하중 = 0.5;
                        break;
                    case "화천":
                        설하중 = 0.7;
                        break;
                    case "횡성":
                        설하중 = 1.3;
                        break;
                    case "태백":
                        설하중 = 1.8;
                        break;
                }
                break;
            case "충청남북도":
                switch (loc_name2) {
                    case "충주":
                        설하중 = 0.7;
                        break;
                    case "제천":
                    case "단양":
                        설하중 = 1.3;
                        break;
                    default:
                        설하중 = 0.5;
                        break;
                }
                break;
            case "경상남북도":
                switch (loc_name2) {
                    case "울릉":
                    case "독도":
                        설하중 = 10.0;
                        break;
                    case "울진":
                        설하중 = 0.9;
                        break;
                    case "영양":
                    case "문경":
                    case "예천":
                        설하중 = 0.7;
                        break;
                    case "봉화":
                        설하중 = 1.3;
                        break;
                    case "영주":
                        설하중 = 0.8;
                        break;
                    default:
                        설하중 = 0.5;
                        break;
                }
                break;
            case "전라남북도":
                switch (loc_name2) {
                    case "신안":
                    case "함평":
                    case "무안":
                    case "목포":
                        설하중 = 0.7;
                        break;
                    case "나주":
                        설하중 = 0.6;
                        break;
                    case "정읍":
                        설하중 = 0.65;
                        break;
                    default:
                        설하중 = 0.5;
                        break;
                }
                break;
        }


    }

    //판폭두께비 검토
    public void cal_check() {
        //플랜지_판폭두께비
        BTR = b_value / t_t_value;
        if (BTR < 60) {
            BTR_Check = "O.K";
        } else {
            BTR_Check = "N.G";
        }
        //리브_판폭두께비
        HTR = c_value / t_t_value;
        if (HTR < 60) {
            HTR_Check = "O.K";
        } else {
            HTR_Check = "N.G";
        }

    }

    //강축단면속성 만들기-DB화 해야 함
    public void Make_Major_List(String input) {
        MA_L_List = new ArrayList<>();
        MA_x_List = new ArrayList<>();
        MA_Lx_List = new ArrayList<>();
        MA_Lx2_List = new ArrayList<>();
        MA_I1_List = new ArrayList<>();
        MA_L_List_Sum = 0.0;
        MA_x_List_Sum = 0.0;
        MA_Lx_List_Sum = 0.0;
        MA_Lx2_List_Sum = 0.0;
        MA_I1_List_Sum = 0.0;
        switch (input) {
            case "LC-75x45x15x1.6": {
                ycg_value = 37.5;
                double temp1 = 35.4;
                double temp2 = 0.8;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 10.2;
                temp2 = 9.9;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 88.4;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 12.57;
                temp2 = 2.25;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 19.1;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 65.4;
                temp2 = 37.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 23310.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 35.4;
                temp2 = 74.2;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 10.2;
                temp2 = 65.1;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 88.4;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 12.57;
                temp2 = 72.75;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 19.1;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-75x45x15x2.0": {
                ycg_value = 37.5;
                double temp1 = 33.0;
                double temp2 = 1.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 9.0;
                temp2 = 10.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 60.8;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 15.71;
                temp2 = 2.81;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 37.2;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 63.0;
                temp2 = 37.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 20840.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 33.0;
                temp2 = 74.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 9.0;
                temp2 = 64.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 60.8;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 15.71;
                temp2 = 72.18;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 37.2;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-75x45x15x2.3": {
                ycg_value = 37.5;
                double temp1 = 31.2;
                double temp2 = 1.15;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 8.1;
                temp2 = 10.95;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 44.3;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 18.06;
                temp2 = 3.24;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 61.2;
                temp2 = 37.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 19100.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 31.2;
                temp2 = 73.85;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 8.1;
                temp2 = 64.05;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 44.3;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 18.06;
                temp2 = 71.76;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-75x45x15x3.2": {
                ycg_value = 37.5;
                double temp1 = 25.8;
                double temp2 = 1.6;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 5.4;
                temp2 = 12.3;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 13.1;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 25.13;
                temp2 = 4.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 55.8;
                temp2 = 37.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 14480.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 25.8;
                temp2 = 73.4;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 5.4;
                temp2 = 62.7;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 13.1;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 25.13;
                temp2 = 70.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-100x50x20x1.6": {
                ycg_value = 50.0;
                double temp1 = 40.4;
                double temp2 = 0.8;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 15.2;
                temp2 = 12.4;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 293.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 12.57;
                temp2 = 2.25;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 19.1;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 90.4;
                temp2 = 50.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 61560.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 40.4;
                temp2 = 99.2;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 15.2;
                temp2 = 87.6;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 293.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 12.57;
                temp2 = 97.75;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 19.1;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-100x50x20x2.0": {
                ycg_value = 50.0;
                double temp1 = 38.0;
                double temp2 = 1.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 14.0;
                temp2 = 13.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 229.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 15.71;
                temp2 = 2.81;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 37.2;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 88.0;
                temp2 = 50.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56790.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 38.0;
                temp2 = 99.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 14.0;
                temp2 = 87.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 229.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 15.71;
                temp2 = 97.19;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 37.2;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-100x50x20x2.3": {
                ycg_value = 50.0;
                double temp1 = 36.2;
                double temp2 = 1.15;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 13.1;
                temp2 = 13.45;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 187.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 18.06;
                temp2 = 3.24;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 86.2;
                temp2 = 50.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 53380.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 36.2;
                temp2 = 98.85;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 13.1;
                temp2 = 86.55;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 187.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 18.06;
                temp2 = 96.76;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-100x50x20x2.8": {
                ycg_value = 50.0;
                double temp1 = 33.2;
                double temp2 = 1.4;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 11.6;
                temp2 = 14.2;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 130.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 21.99;
                temp2 = 3.94;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 102.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 83.2;
                temp2 = 50.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 47990.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 33.2;
                temp2 = 98.6;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 11.6;
                temp2 = 85.8;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 130.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 21.99;
                temp2 = 96.06;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 102.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-100x50x20x3.2": {
                ycg_value = 50.0;
                double temp1 = 30.8;
                double temp2 = 1.6;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 10.4;
                temp2 = 14.8;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 93.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 25.13;
                temp2 = 4.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 80.8;
                temp2 = 50.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 43960.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 30.8;
                temp2 = 98.4;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 10.4;
                temp2 = 85.2;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 93.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 25.13;
                temp2 = 95.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-100x50x20x4.0": {
                ycg_value = 50.0;
                double temp1 = 26.0;
                double temp2 = 2.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 8.0;
                temp2 = 16.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 42.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 31.42;
                temp2 = 5.63;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 298.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 76.0;
                temp2 = 50.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 36580.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 26.0;
                temp2 = 98.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 8.0;
                temp2 = 84.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 42.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 31.42;
                temp2 = 94.37;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 298.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-100x50x20x4.5": {
                ycg_value = 50.0;
                double temp1 = 23.0;
                double temp2 = 2.25;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 6.5;
                temp2 = 16.75;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 22.9;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 35.34;
                temp2 = 6.33;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 424.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 73.0;
                temp2 = 50.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 32420.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 23.0;
                temp2 = 97.75;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 6.5;
                temp2 = 83.25;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 22.9;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 35.34;
                temp2 = 93.67;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 424.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-125x50x20x2.3": {
                ycg_value = 62.5;
                double temp1 = 36.2;
                double temp2 = 1.15;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 13.1;
                temp2 = 13.45;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 187.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 18.06;
                temp2 = 3.24;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 111.2;
                temp2 = 62.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 115000.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 36.2;
                temp2 = 123.9;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 13.1;
                temp2 = 111.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 187.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 18.06;
                temp2 = 121.8;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-125x50x20x3.2": {
                ycg_value = 62.5;
                double temp1 = 30.8;
                double temp2 = 1.6;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 10.4;
                temp2 = 14.8;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 93.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 25.13;
                temp2 = 4.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 105.8;
                temp2 = 62.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 98690.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 30.8;
                temp2 = 123.4;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 10.4;
                temp2 = 110.2;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 93.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 25.13;
                temp2 = 120.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-125x50x20x4.0": {
                ycg_value = 62.5;
                double temp1 = 26.0;
                double temp2 = 2.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 8.0;
                temp2 = 16.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 42.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 31.42;
                temp2 = 5.63;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 298.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 101.0;
                temp2 = 62.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 85860.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 26.0;
                temp2 = 123.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 8.0;
                temp2 = 109.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 42.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 31.42;
                temp2 = 119.4;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 298.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-125x50x20x4.5": {
                ycg_value = 62.5;
                double temp1 = 23.0;
                double temp2 = 2.25;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 6.5;
                temp2 = 16.75;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 22.9;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 35.34;
                temp2 = 6.33;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 424.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 98.0;
                temp2 = 62.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 78430.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 23.0;
                temp2 = 122.8;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 6.5;
                temp2 = 108.2;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 22.9;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 35.34;
                temp2 = 118.7;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 424.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-150x50x20x2.3": {
                ycg_value = 75.0;
                double temp1 = 36.2;
                double temp2 = 1.15;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 13.1;
                temp2 = 13.45;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 187.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 18.06;
                temp2 = 3.24;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 136.2;
                temp2 = 75.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 211000.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 36.2;
                temp2 = 148.9;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 13.1;
                temp2 = 136.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 187.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 18.06;
                temp2 = 146.8;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-150x50x20x3.2": {
                ycg_value = 75.0;
                double temp1 = 30.8;
                double temp2 = 1.6;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 10.4;
                temp2 = 14.8;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 93.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 25.13;
                temp2 = 4.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 130.8;
                temp2 = 75.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 186000.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 30.8;
                temp2 = 148.4;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 10.4;
                temp2 = 135.2;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 93.7;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 25.13;
                temp2 = 145.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
            case "LC-150x50x20x4.5": {
                ycg_value = 75.0;
                double temp1 = 23.0;
                double temp2 = 2.25;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 6.5;
                temp2 = 16.75;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 22.9;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 35.34;
                temp2 = 6.33;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 424.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);


                temp1 = 123.0;
                temp2 = 75.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 155000.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 23.0;
                temp2 = 147.8;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 6.5;
                temp2 = 133.2;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 22.9;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);

                temp1 = 35.34;
                temp2 = 143.7;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 424.0;
                MA_L_List.add(temp1);
                MA_x_List.add(temp2);
                MA_Lx_List.add(temp3);
                MA_Lx2_List.add(temp4);
                MA_I1_List.add(temp5);
                for (int k = 0; k < MA_L_List.toArray().length; k++) {
                    MA_L_List_Sum = MA_L_List_Sum + MA_L_List.get(k);
                }
                for (int k = 0; k < MA_x_List.toArray().length; k++) {
                    MA_x_List_Sum = MA_x_List_Sum + MA_x_List.get(k);
                }
                for (int k = 0; k < MA_Lx_List.toArray().length; k++) {
                    MA_Lx_List_Sum = MA_Lx_List_Sum + MA_Lx_List.get(k);
                }
                for (int k = 0; k < MA_Lx2_List.toArray().length; k++) {
                    MA_Lx2_List_Sum = MA_Lx2_List_Sum + MA_Lx2_List.get(k);
                }
                for (int k = 0; k < MA_I1_List.toArray().length; k++) {
                    MA_I1_List_Sum = MA_I1_List_Sum + MA_I1_List.get(k);
                }
                break;
            }
        }
    }

    //강축 항복시작시의 모멘트 강도 계산(Mnx)
    public void cal_Major_Mnx() {
        Major_I_Px = MA_Lx2_List_Sum + MA_I1_List_Sum - MA_L_List_Sum * Math.pow(ycg_value, 2);
        Major_Ix = Major_I_Px * t_t_value;
        Major_Sex = Major_Ix / (A_H_value - ycg_value);
        Major_Mnx = Major_Sex * Fy_value;
    }

    //주축에대한 횡좌굴 강도 검토(Mnx2)
    public void cal_Major_Mnx2(String input) {
        //Fe_value = (Math.pow(Math.PI , 2) * Es_value) / Math.pow((k_value * 경간 / rx_value) , 2);
        //landa_c_value = Math.sqrt(Fy_value / Fe_value);
        //if (landa_c_value <= 1.5){
        //     Fn_value = (Math.pow(0.658 , (Math.pow(landa_c_value , 2)))) * Fy_value;
        //}
        //else{
        //    Fn_value = (0.877 / (Math.pow(landa_c_value , 2))) * Fy_value;
        //}
        //Fn_value = 173.6022;////////// 갑 확인

        make_Fn_value(input);
        Major_Mnx2 = Major_Sex * Fn_value;
    }

    public void make_Fn_value(String input) {
        switch (input) {
            case "LC-75x45x15x1.6":
                if (경간 == 2000) {
                    Fn_value = 210.809281267685;
                } else if (경간 == 2100) {
                    Fn_value = 205.149971703452;
                } else if (경간 == 2200) {
                    Fn_value = 198.075834748161;
                } else if (경간 == 2300) {
                    Fn_value = 191.001697792869;
                } else if (경간 == 2400) {
                    Fn_value = 185.342388228636;
                } else if (경간 == 2500) {
                    Fn_value = 178.268251273345;
                } else if (경간 == 2600) {
                    Fn_value = 171.194114318053;
                } else if (경간 == 2700) {
                    Fn_value = 164.119977362762;
                } else if (경간 == 2800) {
                    Fn_value = 157.04584040747;
                } else if (경간 == 2900) {
                    Fn_value = 149.971703452179;
                } else if (경간 == 3000) {
                    Fn_value = 142.897566496887;
                } else if (경간 == 3100) {
                    Fn_value = 138.228636106395;
                } else if (경간 == 3200) {
                    Fn_value = 133.98415393322;
                } else if (경간 == 3300) {
                    Fn_value = 129.881154499151;
                } else if (경간 == 3400) {
                    Fn_value = 126.061120543294;
                } else if (경간 == 3500) {
                    Fn_value = 122.382569326542;
                } else if (경간 == 3600) {
                    Fn_value = 118.986983588002;
                } else if (경간 == 3700) {
                    Fn_value = 115.874363327674;
                } else if (경간 == 3800) {
                    Fn_value = 112.761743067346;
                } else if (경간 == 3900) {
                    Fn_value = 109.932088285229;
                } else if (경간 == 4000) {
                    Fn_value = 107.102433503113;
                }

                break;
            case "LC-75x45x15x2.0":
                if (경간 == 2000) {
                    Fn_value = 214.6124076463;
                } else if (경간 == 2100) {
                    Fn_value = 208.748680661428;
                } else if (경간 == 2200) {
                    Fn_value = 202.884953676557;
                } else if (경간 == 2300) {
                    Fn_value = 197.021226691685;
                } else if (경간 == 2400) {
                    Fn_value = 191.157499706814;
                } else if (경간 == 2500) {
                    Fn_value = 185.293772721942;
                } else if (경간 == 2600) {
                    Fn_value = 179.430045737071;
                } else if (경간 == 2700) {
                    Fn_value = 173.566318752199;
                } else if (경간 == 2800) {
                    Fn_value = 167.702591767327;
                } else if (경간 == 2900) {
                    Fn_value = 161.838864782456;
                } else if (경간 == 3000) {
                    Fn_value = 154.80239240061;
                } else if (경간 == 3100) {
                    Fn_value = 151.284156209687;
                } else if (경간 == 3200) {
                    Fn_value = 146.59317462179;
                } else if (경간 == 3300) {
                    Fn_value = 143.074938430867;
                } else if (경간 == 3400) {
                    Fn_value = 138.383956842969;
                } else if (경간 == 3500) {
                    Fn_value = 134.865720652046;
                } else if (경간 == 3600) {
                    Fn_value = 131.347484461123;
                } else if (경간 == 3700) {
                    Fn_value = 126.656502873226;
                } else if (경간 == 3800) {
                    Fn_value = 124.311012079278;
                } else if (경간 == 3900) {
                    Fn_value = 120.792775888355;
                } else if (경간 == 4000) {
                    Fn_value = 117.274539697432;
                }

                break;
            case "LC-75x45x15x2.3":
                if (경간 == 2000) {
                    Fn_value = 216.912920465263;
                } else if (경간 == 2100) {
                    Fn_value = 211.673477941947;
                } else if (경간 == 2200) {
                    Fn_value = 206.434035418631;
                } else if (경간 == 2300) {
                    Fn_value = 201.194592895316;
                } else if (경간 == 2400) {
                    Fn_value = 195.955150372;
                } else if (경간 == 2500) {
                    Fn_value = 190.715707848685;
                } else if (경간 == 2600) {
                    Fn_value = 185.476265325369;
                } else if (경간 == 2700) {
                    Fn_value = 180.236822802054;
                } else if (경간 == 2800) {
                    Fn_value = 174.997380278738;
                } else if (경간 == 2900) {
                    Fn_value = 168.71004925076;
                } else if (경간 == 3000) {
                    Fn_value = 163.470606727444;
                } else if (경간 == 3100) {
                    Fn_value = 159.279052708792;
                } else if (경간 == 3200) {
                    Fn_value = 156.135387194802;
                } else if (경간 == 3300) {
                    Fn_value = 151.94383317615;
                } else if (경간 == 3400) {
                    Fn_value = 147.752279157498;
                } else if (경간 == 3500) {
                    Fn_value = 144.608613643508;
                } else if (경간 == 3600) {
                    Fn_value = 140.417059624856;
                } else if (경간 == 3700) {
                    Fn_value = 136.225505606203;
                } else if (경간 == 3800) {
                    Fn_value = 133.081840092214;
                } else if (경간 == 3900) {
                    Fn_value = 129.938174578225;
                } else if (경간 == 4000) {
                    Fn_value = 125.746620559572;
                }
                break;
            case "LC-75x45x15x3.2":
                if (경간 == 2000) {
                    Fn_value = 223.954060705496;
                } else if (경간 == 2100) {
                    Fn_value = 219.852337981952;
                } else if (경간 == 2200) {
                    Fn_value = 215.750615258409;
                } else if (경간 == 2300) {
                    Fn_value = 211.648892534865;
                } else if (경간 == 2400) {
                    Fn_value = 207.547169811321;
                } else if (경간 == 2500) {
                    Fn_value = 203.445447087777;
                } else if (경간 == 2600) {
                    Fn_value = 199.343724364233;
                } else if (경간 == 2700) {
                    Fn_value = 195.242001640689;
                } else if (경간 == 2800) {
                    Fn_value = 191.140278917145;
                } else if (경간 == 2900) {
                    Fn_value = 187.038556193601;
                } else if (경간 == 3000) {
                    Fn_value = 182.936833470057;
                } else if (경간 == 3100) {
                    Fn_value = 179.655455291222;
                } else if (경간 == 3200) {
                    Fn_value = 176.374077112387;
                } else if (경간 == 3300) {
                    Fn_value = 173.092698933552;
                } else if (경간 == 3400) {
                    Fn_value = 169.811320754717;
                } else if (경간 == 3500) {
                    Fn_value = 166.529942575882;
                } else if (경간 == 3600) {
                    Fn_value = 163.248564397047;
                } else if (경간 == 3700) {
                    Fn_value = 159.967186218212;
                } else if (경간 == 3800) {
                    Fn_value = 156.685808039377;
                } else if (경간 == 3900) {
                    Fn_value = 153.404429860541;
                } else if (경간 == 4000) {
                    Fn_value = 150.123051681706;
                }

                break;
            case "LC-100x50x20x1.6":
                if (경간 == 2000) {
                    Fn_value = 224.258289703316;
                } else if (경간 == 2100) {
                    Fn_value = 219.022687609075;
                } else if (경간 == 2200) {
                    Fn_value = 212.914485165794;
                } else if (경간 == 2300) {
                    Fn_value = 206.806282722513;
                } else if (경간 == 2400) {
                    Fn_value = 201.570680628272;
                } else if (경간 == 2500) {
                    Fn_value = 195.462478184991;
                } else if (경간 == 2600) {
                    Fn_value = 188.48167539267;
                } else if (경간 == 2700) {
                    Fn_value = 182.373472949389;
                } else if (경간 == 2800) {
                    Fn_value = 175.392670157068;
                } else if (경간 == 2900) {
                    Fn_value = 169.284467713787;
                } else if (경간 == 3000) {
                    Fn_value = 162.303664921466;
                } else if (경간 == 3100) {
                    Fn_value = 157.940663176265;
                } else if (경간 == 3200) {
                    Fn_value = 154.450261780105;
                } else if (경간 == 3300) {
                    Fn_value = 150.087260034904;
                } else if (경간 == 3400) {
                    Fn_value = 146.596858638743;
                } else if (경간 == 3500) {
                    Fn_value = 142.233856893543;
                } else if (경간 == 3600) {
                    Fn_value = 138.743455497382;
                } else if (경간 == 3700) {
                    Fn_value = 135.253054101222;
                } else if (경간 == 3800) {
                    Fn_value = 130.890052356021;
                } else if (경간 == 3900) {
                    Fn_value = 128.272251308901;
                } else if (경간 == 4000) {
                    Fn_value = 124.78184991274;
                }
                break;
            case "LC-100x50x20x2.0":
                if (경간 == 2000) {
                    Fn_value = 225.574712643678;
                } else if (경간 == 2100) {
                    Fn_value = 220.545977011494;
                } else if (경간 == 2200) {
                    Fn_value = 214.798850574713;
                } else if (경간 == 2300) {
                    Fn_value = 209.770114942529;
                } else if (경간 == 2400) {
                    Fn_value = 204.022988505747;
                } else if (경간 == 2500) {
                    Fn_value = 198.275862068965;
                } else if (경간 == 2600) {
                    Fn_value = 192.528735632184;
                } else if (경간 == 2700) {
                    Fn_value = 186.781609195402;
                } else if (경간 == 2800) {
                    Fn_value = 180.316091954023;
                } else if (경간 == 2900) {
                    Fn_value = 174.568965517241;
                } else if (경간 == 3000) {
                    Fn_value = 168.103448275862;
                } else if (경간 == 3100) {
                    Fn_value = 164.511494252874;
                } else if (경간 == 3200) {
                    Fn_value = 160.919540229885;
                } else if (경간 == 3300) {
                    Fn_value = 157.327586206897;
                } else if (경간 == 3400) {
                    Fn_value = 153.01724137931;
                } else if (경간 == 3500) {
                    Fn_value = 149.425287356322;
                } else if (경간 == 3600) {
                    Fn_value = 145.833333333333;
                } else if (경간 == 3700) {
                    Fn_value = 142.241379310345;
                } else if (경간 == 3800) {
                    Fn_value = 138.649425287356;
                } else if (경간 == 3900) {
                    Fn_value = 135.057471264368;
                } else if (경간 == 4000) {
                    Fn_value = 131.465517241379;
                }
                break;
            case "LC-100x50x20x2.3":
                if (경간 == 2000) {
                    Fn_value = 250.797702616465;
                } else if (경간 == 2100) {
                    Fn_value = 222.08040842374;
                } else if (경간 == 2200) {
                    Fn_value = 216.975111678366;
                } else if (경간 == 2300) {
                    Fn_value = 211.869814932993;
                } else if (경간 == 2400) {
                    Fn_value = 206.76451818762;
                } else if (경간 == 2500) {
                    Fn_value = 201.659221442246;
                } else if (경간 == 2600) {
                    Fn_value = 195.915762603701;
                } else if (경간 == 2700) {
                    Fn_value = 190.810465858328;
                } else if (경간 == 2800) {
                    Fn_value = 185.067007019783;
                } else if (경간 == 2900) {
                    Fn_value = 179.323548181238;
                } else if (경간 == 3000) {
                    Fn_value = 173.580089342693;
                } else if (경간 == 3100) {
                    Fn_value = 170.389278876835;
                } else if (경간 == 3200) {
                    Fn_value = 166.560306317805;
                } else if (경간 == 3300) {
                    Fn_value = 163.369495851946;
                } else if (경간 == 3400) {
                    Fn_value = 159.540523292916;
                } else if (경간 == 3500) {
                    Fn_value = 156.349712827058;
                } else if (경간 == 3600) {
                    Fn_value = 152.520740268028;
                } else if (경간 == 3700) {
                    Fn_value = 148.691767708998;
                } else if (경간 == 3800) {
                    Fn_value = 145.50095724314;
                } else if (경간 == 3900) {
                    Fn_value = 141.67198468411;
                } else if (경간 == 4000) {
                    Fn_value = 138.481174218251;
                }
                break;
            case "LC-100x50x20x2.8":
                if (경간 == 2000) {
                    Fn_value = 228.384991843393;
                } else if (경간 == 2100) {
                    Fn_value = 223.491027732463;
                } else if (경간 == 2200) {
                    Fn_value = 219.140837411637;
                } else if (경간 == 2300) {
                    Fn_value = 214.79064709081;
                } else if (경간 == 2400) {
                    Fn_value = 209.89668297988;
                } else if (경간 == 2500) {
                    Fn_value = 205.002718868951;
                } else if (경간 == 2600) {
                    Fn_value = 200.108754758021;
                } else if (경간 == 2700) {
                    Fn_value = 195.214790647091;
                } else if (경간 == 2800) {
                    Fn_value = 190.320826536161;
                } else if (경간 == 2900) {
                    Fn_value = 185.426862425231;
                } else if (경간 == 3000) {
                    Fn_value = 180.532898314301;
                } else if (경간 == 3100) {
                    Fn_value = 177.270255573681;
                } else if (경간 == 3200) {
                    Fn_value = 173.463839042958;
                } else if (경간 == 3300) {
                    Fn_value = 170.201196302338;
                } else if (경간 == 3400) {
                    Fn_value = 166.938553561718;
                } else if (경간 == 3500) {
                    Fn_value = 163.675910821098;
                } else if (경간 == 3600) {
                    Fn_value = 160.413268080479;
                } else if (경간 == 3700) {
                    Fn_value = 157.150625339859;
                } else if (경간 == 3800) {
                    Fn_value = 153.887982599239;
                } else if (경간 == 3900) {
                    Fn_value = 150.625339858619;
                } else if (경간 == 4000) {
                    Fn_value = 146.818923327896;
                }
                break;
            case "LC-100x50x20x3.2":
                if (경간 == 2000) {
                    Fn_value = 251.103482099068;
                } else if (경간 == 2100) {
                    Fn_value = 249.632172633644;
                } else if (경간 == 2200) {
                    Fn_value = 248.16086316822;
                } else if (경간 == 2300) {
                    Fn_value = 217.753800882786;
                } else if (경간 == 2400) {
                    Fn_value = 213.830308974988;
                } else if (경간 == 2500) {
                    Fn_value = 209.416380578715;
                } else if (경간 == 2600) {
                    Fn_value = 205.002452182442;
                } else if (경간 == 2700) {
                    Fn_value = 200.58852378617;
                } else if (경간 == 2800) {
                    Fn_value = 196.174595389897;
                } else if (경간 == 2900) {
                    Fn_value = 191.760666993624;
                } else if (경간 == 3000) {
                    Fn_value = 187.346738597352;
                } else if (경간 == 3100) {
                    Fn_value = 184.404119666503;
                } else if (경간 == 3200) {
                    Fn_value = 180.97106424718;
                } else if (경간 == 3300) {
                    Fn_value = 178.028445316332;
                } else if (경간 == 3400) {
                    Fn_value = 175.085826385483;
                } else if (경간 == 3500) {
                    Fn_value = 171.65277096616;
                } else if (경간 == 3600) {
                    Fn_value = 168.710152035311;
                } else if (경간 == 3700) {
                    Fn_value = 165.767533104463;
                } else if (경간 == 3800) {
                    Fn_value = 162.33447768514;
                } else if (경간 == 3900) {
                    Fn_value = 159.391858754291;
                } else if (경간 == 4000) {
                    Fn_value = 156.449239823443;
                }
                break;
            case "LC-100x50x20x4.0":
                if (경간 == 2000) {
                    Fn_value = 233.082706766917;
                } else if (경간 == 2100) {
                    Fn_value = 229.741019214703;
                } else if (경간 == 2200) {
                    Fn_value = 225.981620718463;
                } else if (경간 == 2300) {
                    Fn_value = 222.222222222222;
                } else if (경간 == 2400) {
                    Fn_value = 218.462823725982;
                } else if (경간 == 2500) {
                    Fn_value = 214.703425229741;
                } else if (경간 == 2600) {
                    Fn_value = 210.9440267335;
                } else if (경간 == 2700) {
                    Fn_value = 207.18462823726;
                } else if (경간 == 2800) {
                    Fn_value = 203.425229741019;
                } else if (경간 == 2900) {
                    Fn_value = 199.665831244779;
                } else if (경간 == 3000) {
                    Fn_value = 195.906432748538;
                } else if (경간 == 3100) {
                    Fn_value = 193.400167084378;
                } else if (경간 == 3200) {
                    Fn_value = 190.47619047619;
                } else if (경간 == 3300) {
                    Fn_value = 187.552213868003;
                } else if (경간 == 3400) {
                    Fn_value = 184.628237259816;
                } else if (경간 == 3500) {
                    Fn_value = 182.121971595656;
                } else if (경간 == 3600) {
                    Fn_value = 179.197994987469;
                } else if (경간 == 3700) {
                    Fn_value = 176.274018379282;
                } else if (경간 == 3800) {
                    Fn_value = 173.350041771094;
                } else if (경간 == 3900) {
                    Fn_value = 170.843776106934;
                } else if (경간 == 4000) {
                    Fn_value = 167.919799498747;
                }
                break;
            case "LC-100x50x20x4.5":
                if (경간 == 2000) {
                    Fn_value = 235.112142304718;
                } else if (경간 == 2100) {
                    Fn_value = 231.631863882444;
                } else if (경간 == 2200) {
                    Fn_value = 228.538283062645;
                } else if (경간 == 2300) {
                    Fn_value = 225.058004640371;
                } else if (경간 == 2400) {
                    Fn_value = 221.577726218097;
                } else if (경간 == 2500) {
                    Fn_value = 218.097447795824;
                } else if (경간 == 2600) {
                    Fn_value = 215.003866976025;
                } else if (경간 == 2700) {
                    Fn_value = 211.523588553751;
                } else if (경간 == 2800) {
                    Fn_value = 208.043310131477;
                } else if (경간 == 2900) {
                    Fn_value = 204.563031709203;
                } else if (경간 == 3000) {
                    Fn_value = 201.08275328693;
                } else if (경간 == 3100) {
                    Fn_value = 198.76256767208;
                } else if (경간 == 3200) {
                    Fn_value = 196.055684454756;
                } else if (경간 == 3300) {
                    Fn_value = 193.348801237432;
                } else if (경간 == 3400) {
                    Fn_value = 190.641918020108;
                } else if (경간 == 3500) {
                    Fn_value = 187.935034802784;
                } else if (경간 == 3600) {
                    Fn_value = 185.22815158546;
                } else if (경간 == 3700) {
                    Fn_value = 182.907965970611;
                } else if (경간 == 3800) {
                    Fn_value = 180.201082753287;
                } else if (경간 == 3900) {
                    Fn_value = 177.494199535963;
                } else if (경간 == 4000) {
                    Fn_value = 174.787316318639;
                }
                break;
            case "LC-125x50x20x2.3":
                if (경간 == 2000) {
                    Fn_value = 221.647058823529;
                } else if (경간 == 2100) {
                    Fn_value = 216.0;
                } else if (경간 == 2200) {
                    Fn_value = 210.352941176471;
                } else if (경간 == 2300) {
                    Fn_value = 204.705882352941;
                } else if (경간 == 2400) {
                    Fn_value = 198.588235294118;
                } else if (경간 == 2500) {
                    Fn_value = 192.470588235294;
                } else if (경간 == 2600) {
                    Fn_value = 186.352941176471;
                } else if (경간 == 2700) {
                    Fn_value = 179.764705882353;
                } else if (경간 == 2800) {
                    Fn_value = 173.647058823529;
                } else if (경간 == 2900) {
                    Fn_value = 167.058823529412;
                } else if (경간 == 3000) {
                    Fn_value = 160.470588235294;
                } else if (경간 == 3100) {
                    Fn_value = 156.235294117647;
                } else if (경간 == 3200) {
                    Fn_value = 152.470588235294;
                } else if (경간 == 3300) {
                    Fn_value = 148.235294117647;
                } else if (경간 == 3400) {
                    Fn_value = 144.470588235294;
                } else if (경간 == 3500) {
                    Fn_value = 140.235294117647;
                } else if (경간 == 3600) {
                    Fn_value = 136.470588235294;
                } else if (경간 == 3700) {
                    Fn_value = 132.705882352941;
                } else if (경간 == 3800) {
                    Fn_value = 128.941176470588;
                } else if (경간 == 3900) {
                    Fn_value = 125.647058823529;
                } else if (경간 == 4000) {
                    Fn_value = 122.823529411765;
                }
                break;
            case "LC-125x50x20x3.2":
                if (경간 == 2000) {
                    Fn_value = 224.057450628366;
                } else if (경간 == 2100) {
                    Fn_value = 219.389587073609;
                } else if (경간 == 2200) {
                    Fn_value = 214.362657091562;
                } else if (경간 == 2300) {
                    Fn_value = 209.335727109515;
                } else if (경간 == 2400) {
                    Fn_value = 204.308797127469;
                } else if (경간 == 2500) {
                    Fn_value = 198.922800718133;
                } else if (경간 == 2600) {
                    Fn_value = 193.536804308797;
                } else if (경간 == 2700) {
                    Fn_value = 188.150807899461;
                } else if (경간 == 2800) {
                    Fn_value = 182.764811490126;
                } else if (경간 == 2900) {
                    Fn_value = 177.37881508079;
                } else if (경간 == 3000) {
                    Fn_value = 171.992818671454;
                } else if (경간 == 3100) {
                    Fn_value = 168.402154398564;
                } else if (경간 == 3200) {
                    Fn_value = 164.811490125673;
                } else if (경간 == 3300) {
                    Fn_value = 161.220825852783;
                } else if (경간 == 3400) {
                    Fn_value = 157.630161579892;
                } else if (경간 == 3500) {
                    Fn_value = 154.039497307002;
                } else if (경간 == 3600) {
                    Fn_value = 150.448833034111;
                } else if (경간 == 3700) {
                    Fn_value = 146.858168761221;
                } else if (경간 == 3800) {
                    Fn_value = 143.26750448833;
                } else if (경간 == 3900) {
                    Fn_value = 139.67684021544;
                } else if (경간 == 4000) {
                    Fn_value = 136.086175942549;
                }
                break;
            case "LC-125x50x20x4.0":
                if (경간 == 2000) {
                    Fn_value = 226.775956284153;
                } else if (경간 == 2100) {
                    Fn_value = 222.525804493018;
                } else if (경간 == 2200) {
                    Fn_value = 217.972070431087;
                } else if (경간 == 2300) {
                    Fn_value = 213.418336369156;
                } else if (경간 == 2400) {
                    Fn_value = 209.168184578021;
                } else if (경간 == 2500) {
                    Fn_value = 204.61445051609;
                } else if (경간 == 2600) {
                    Fn_value = 200.060716454159;
                } else if (경간 == 2700) {
                    Fn_value = 195.506982392228;
                } else if (경간 == 2800) {
                    Fn_value = 190.953248330298;
                } else if (경간 == 2900) {
                    Fn_value = 186.095931997571;
                } else if (경간 == 3000) {
                    Fn_value = 181.542197935641;
                } else if (경간 == 3100) {
                    Fn_value = 178.202792956891;
                } else if (경간 == 3200) {
                    Fn_value = 174.863387978142;
                } else if (경간 == 3300) {
                    Fn_value = 171.827565270188;
                } else if (경간 == 3400) {
                    Fn_value = 168.488160291439;
                } else if (경간 == 3500) {
                    Fn_value = 165.14875531269;
                } else if (경간 == 3600) {
                    Fn_value = 161.809350333941;
                } else if (경간 == 3700) {
                    Fn_value = 158.469945355191;
                } else if (경간 == 3800) {
                    Fn_value = 155.130540376442;
                } else if (경간 == 3900) {
                    Fn_value = 151.791135397693;
                } else if (경간 == 4000) {
                    Fn_value = 148.755312689739;
                }
                break;
            case "LC-125x50x20x4.5":
                if (경간 == 2000) {
                    Fn_value = 228.251748251748;
                } else if (경간 == 2100) {
                    Fn_value = 224.335664335664;
                } else if (경간 == 2200) {
                    Fn_value = 220.13986013986;
                } else if (경간 == 2300) {
                    Fn_value = 216.223776223776;
                } else if (경간 == 2400) {
                    Fn_value = 212.027972027972;
                } else if (경간 == 2500) {
                    Fn_value = 207.832167832168;
                } else if (경간 == 2600) {
                    Fn_value = 203.636363636364;
                } else if (경간 == 2700) {
                    Fn_value = 199.440559440559;
                } else if (경간 == 2800) {
                    Fn_value = 195.244755244755;
                } else if (경간 == 2900) {
                    Fn_value = 191.048951048951;
                } else if (경간 == 3000) {
                    Fn_value = 186.853146853147;
                } else if (경간 == 3100) {
                    Fn_value = 183.776223776224;
                } else if (경간 == 3200) {
                    Fn_value = 180.699300699301;
                } else if (경간 == 3300) {
                    Fn_value = 177.342657342657;
                } else if (경간 == 3400) {
                    Fn_value = 174.265734265734;
                } else if (경간 == 3500) {
                    Fn_value = 171.188811188811;
                } else if (경간 == 3600) {
                    Fn_value = 168.111888111888;
                } else if (경간 == 3700) {
                    Fn_value = 165.034965034965;
                } else if (경간 == 3800) {
                    Fn_value = 161.958041958042;
                } else if (경간 == 3900) {
                    Fn_value = 158.601398601399;
                } else if (경간 == 4000) {
                    Fn_value = 155.524475524476;
                }
                break;
            case "LC-150x50x20x2.3":
                if (경간 == 2000) {
                    Fn_value = 247.347237467984;
                } else if (경간 == 2100) {
                    Fn_value = 211.85510428101;
                } else if (경간 == 2200) {
                    Fn_value = 206.000731796561;
                } else if (경간 == 2300) {
                    Fn_value = 199.414562751555;
                } else if (경간 == 2400) {
                    Fn_value = 193.194291986828;
                } else if (경간 == 2500) {
                    Fn_value = 186.242224661544;
                } else if (경간 == 2600) {
                    Fn_value = 179.656055616539;
                } else if (경간 == 2700) {
                    Fn_value = 172.338090010977;
                } else if (경간 == 2800) {
                    Fn_value = 165.386022685693;
                } else if (경간 == 2900) {
                    Fn_value = 158.068057080132;
                } else if (경간 == 3000) {
                    Fn_value = 150.75009147457;
                } else if (경간 == 3100) {
                    Fn_value = 146.359312111233;
                } else if (경간 == 3200) {
                    Fn_value = 141.968532747896;
                } else if (경간 == 3300) {
                    Fn_value = 137.577753384559;
                } else if (경간 == 3400) {
                    Fn_value = 133.5528723015;
                } else if (경간 == 3500) {
                    Fn_value = 129.893889498719;
                } else if (경간 == 3600) {
                    Fn_value = 126.234906695939;
                } else if (경간 == 3700) {
                    Fn_value = 122.941822173436;
                } else if (경간 == 3800) {
                    Fn_value = 119.648737650933;
                } else if (경간 == 3900) {
                    Fn_value = 116.35565312843;
                } else if (경간 == 4000) {
                    Fn_value = 113.428466886206;
                }
                break;
            case "LC-150x50x20x3.2":
                if (경간 == 2000) {
                    Fn_value = 246.875867814496;
                } else if (경간 == 2100) {
                    Fn_value = 245.209663982227;
                } else if (경간 == 2200) {
                    Fn_value = 243.543460149958;
                } else if (경간 == 2300) {
                    Fn_value = 202.999166898084;
                } else if (경간 == 2400) {
                    Fn_value = 197.167453485143;
                } else if (경간 == 2500) {
                    Fn_value = 191.335740072202;
                } else if (경간 == 2600) {
                    Fn_value = 185.22632602055;
                } else if (경간 == 2700) {
                    Fn_value = 179.394612607609;
                } else if (경간 == 2800) {
                    Fn_value = 173.007497917245;
                } else if (경간 == 2900) {
                    Fn_value = 166.898083865593;
                } else if (경간 == 3000) {
                    Fn_value = 160.510969175229;
                } else if (경간 == 3100) {
                    Fn_value = 156.623160233269;
                } else if (경간 == 3200) {
                    Fn_value = 152.457650652597;
                } else if (경간 == 3300) {
                    Fn_value = 148.569841710636;
                } else if (경간 == 3400) {
                    Fn_value = 144.682032768675;
                } else if (경간 == 3500) {
                    Fn_value = 140.516523188003;
                } else if (경간 == 3600) {
                    Fn_value = 136.628714246043;
                } else if (경간 == 3700) {
                    Fn_value = 133.018605942794;
                } else if (경간 == 3800) {
                    Fn_value = 129.408497639545;
                } else if (경간 == 3900) {
                    Fn_value = 126.076089975007;
                } else if (경간 == 4000) {
                    Fn_value = 123.021382949181;
                }
                break;
            case "LC-150x50x20x4.5":
                if (경간 == 2000) {
                    Fn_value = 246.728169920618;
                } else if (경간 == 2100) {
                    Fn_value = 244.582707573482;
                } else if (경간 == 2200) {
                    Fn_value = 242.437245226346;
                } else if (경간 == 2300) {
                    Fn_value = 240.29178287921;
                } else if (경간 == 2400) {
                    Fn_value = 240.29178287921;
                } else if (경간 == 2500) {
                    Fn_value = 238.146320532075;
                } else if (경간 == 2600) {
                    Fn_value = 236.000858184939;
                } else if (경간 == 2700) {
                    Fn_value = 233.855395837803;
                } else if (경간 == 2800) {
                    Fn_value = 184.295215618966;
                } else if (경간 == 2900) {
                    Fn_value = 179.360652220554;
                } else if (경간 == 3000) {
                    Fn_value = 174.426088822141;
                } else if (경간 == 3100) {
                    Fn_value = 170.77880283201;
                } else if (경간 == 3200) {
                    Fn_value = 167.346063076593;
                } else if (경간 == 3300) {
                    Fn_value = 163.698777086462;
                } else if (경간 == 3400) {
                    Fn_value = 160.266037331045;
                } else if (경간 == 3500) {
                    Fn_value = 156.618751340914;
                } else if (경간 == 3600) {
                    Fn_value = 153.186011585497;
                } else if (경간 == 3700) {
                    Fn_value = 149.538725595366;
                } else if (경간 == 3800) {
                    Fn_value = 146.105985839948;
                } else if (경간 == 3900) {
                    Fn_value = 142.458699849818;
                } else if (경간 == 4000) {
                    Fn_value = 139.0259600944;
                }
                break;
        }

    }


    //강축에 대한 허용 휨 강도 검토(Ma)
    public void cal_Major_Ma() {
        Major_Ma = Math.min(Major_Mnx, Major_Mnx2) / Wf_value;
        Major_Ma_ratio = Mu_value / Major_Ma;
        if (Major_Ma_ratio < 1) {
            Major_Ma_check = "O.K";
        } else {
            Major_Ma_check = "N.G";
        }
    }

    //강축에 대한 휨 모멘트 강도비 검토(Mao)
    public void cal_Major_Mao() {
        Major_Mno = Major_Mnx;
        Major_Mao = Major_Mno / Wf_value;
        Major_Mao_ratio = Mu_value / Major_Mao;
        if (Major_Mao_ratio < 1) {
            Major_Mao_check = "O.K";
        } else {
            Major_Mao_check = "N.G";
        }
    }

    //약축단면속성 만들기 -DB화 해야 함
    public void Mike_Minor_List(String input) {
        Mi_L_List = new ArrayList<>();
        Mi_x_List = new ArrayList<>();
        Mi_Lx_List = new ArrayList<>();
        Mi_Lx2_List = new ArrayList<>();
        Mi_I1_List = new ArrayList<>();
        Mi_L_List_Sum = 0.0;
        Mi_x_List_Sum = 0.0;
        Mi_Lx_List_Sum = 0.0;
        Mi_Lx2_List_Sum = 0.0;
        Mi_I1_List_Sum = 0.0;
        switch (input) {
            case "LC-75x45x15x1.6": {
                xcg_value = 17.13;
                double temp1 = 70.8;
                double temp2 = 22.5;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 7394.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 12.57;
                temp2 = 2.25;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 19.1;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 12.57;
                temp2 = 42.75;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 19.1;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 65.4;
                temp2 = 0.8;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 20.4;
                temp2 = 44.2;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }
                Sfy_value = 4919.0;
                Minor_Mey = 526000.0;
                break;
            }
            case "LC-75x45x15x2.0": {
                xcg_value = 17.08;
                double temp1 = 66.0;
                double temp2 = 22.5;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 5989.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 15.71;
                temp2 = 2.81;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 37.2;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 15.71;
                temp2 = 42.18;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 37.2;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 63.0;
                temp2 = 1.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 18.0;
                temp2 = 44.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 5863.0;
                Minor_Mey = 758000.0;
                break;
            }
            case "LC-75x45x15x2.3": {
                xcg_value = 17.04;
                double temp1 = 62.4;
                double temp2 = 22.5;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 5062.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 18.06;
                temp2 = 3.24;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 18.06;
                temp2 = 41.76;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 61.2;
                temp2 = 1.15;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 16.2;
                temp2 = 43.85;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 65000.0;
                Minor_Mey = 428000.0;
                break;
            }
            case "LC-75x45x15x3.2": {
                xcg_value = 16.92;
                double temp1 = 51.6;
                double temp2 = 22.5;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 2862.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 25.13;
                temp2 = 4.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 25.13;
                temp2 = 40.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 55.8;
                temp2 = 1.6;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 10.8;
                temp2 = 43.4;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 8186.0;
                Minor_Mey = 5860000.0;
                break;
            }
            case "LC-100x50x20x1.6": {
                xcg_value = 18.6;
                double temp1 = 80.8;
                double temp2 = 25.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 10990.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 12.57;
                temp2 = 2.25;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 19.1;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 12.57;
                temp2 = 47.75;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 19.1;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 90.4;
                temp2 = 0.8;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 30.4;
                temp2 = 49.2;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 7313.0;
                Minor_Mey = 1010000.0;
                break;
            }
            case "LC-100x50x20x2.0": {
                xcg_value = 18.55;
                double temp1 = 76.0;
                double temp2 = 25.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 9145.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 15.71;
                temp2 = 2.81;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 37.2;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 15.71;
                temp2 = 47.18;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 37.2;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 88.0;
                temp2 = 1.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 28.0;
                temp2 = 49.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 8839.0;
                Minor_Mey = 8820000.0;
                break;
            }
            case "LC-100x50x20x2.3": {
                xcg_value = 18.52;
                double temp1 = 72.4;
                double temp2 = 25.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 7906.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 18.06;
                temp2 = 3.24;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 18.06;
                temp2 = 46.76;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 86.2;
                temp2 = 1.15;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 26.2;
                temp2 = 48.85;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 9866.0;
                Minor_Mey = 9950000.0;
                break;
            }
            case "LC-100x50x20x2.8": {
                xcg_value = 18.47;
                double temp1 = 66.4;
                double temp2 = 25.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 6099.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 21.99;
                temp2 = 3.94;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 102.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 21.99;
                temp2 = 46.06;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 102.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 83.2;
                temp2 = 1.4;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 23.2;
                temp2 = 48.6;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 11290.0;
                Minor_Mey = 11800000.0;
                break;
            }
            case "LC-100x50x20x3.2": {
                xcg_value = 18.42;
                double temp1 = 61.6;
                double temp2 = 25.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 4870.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 25.13;
                temp2 = 4.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 25.13;
                temp2 = 45.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 80.8;
                temp2 = 1.6;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 20.8;
                temp2 = 48.4;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 12500.0;
                Minor_Mey = 13200000.0;
                break;
            }
            case "LC-100x50x20x4.0": {
                xcg_value = 18.33;
                double temp1 = 52.0;
                double temp2 = 25.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 2929.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 31.42;
                temp2 = 5.63;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 298.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 31.42;
                temp2 = 44.37;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 298.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 76.0;
                temp2 = 2.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 16.0;
                temp2 = 48.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 14310.0;
                Minor_Mey = 15800000.0;
                break;
            }
            case "LC-100x50x20x4.5": {
                xcg_value = 18.27;
                double temp1 = 46.0;
                double temp2 = 25.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 2028.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 35.34;
                temp2 = 6.33;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 424.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 35.34;
                temp2 = 43.67;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 424.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 73.0;
                temp2 = 2.25;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 13.0;
                temp2 = 47.75;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 15200.0;
                Minor_Mey = 17400000.0;
                break;
            }
            case "LC-125x50x20x2.3": {
                xcg_value = 16.76;
                double temp1 = 72.4;
                double temp2 = 25.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 7906.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 18.06;
                temp2 = 3.24;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 18.06;
                temp2 = 46.76;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 111.2;
                temp2 = 1.15;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 26.2;
                temp2 = 48.85;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 11780.0;
                Minor_Mey = 13300000.0;
                break;
            }
            case "LC-125x50x20x3.2": {
                xcg_value = 16.66;
                double temp1 = 61.6;
                double temp2 = 25.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 4870.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 25.13;
                temp2 = 4.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 25.13;
                temp2 = 45.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 105.8;
                temp2 = 1.6;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 20.8;
                temp2 = 48.4;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 15050.0;
                Minor_Mey = 17300000.0;
                break;
            }
            case "LC-125x50x20x4.0": {
                xcg_value = 16.57;
                double temp1 = 52.0;
                double temp2 = 25.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 2929.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 31.42;
                temp2 = 5.63;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 298.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 31.42;
                temp2 = 44.37;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 298.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 101.0;
                temp2 = 2.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 16.0;
                temp2 = 48.0;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 17260.0;
                Minor_Mey = 20500000.0;
                break;
            }
            case "LC-125x50x20x4.5": {
                xcg_value = 16.51;
                double temp1 = 46.0;
                double temp2 = 25.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 2028.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 35.34;
                temp2 = 6.33;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 424.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 35.34;
                temp2 = 43.67;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 424.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 98.0;
                temp2 = 2.25;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 13.0;
                temp2 = 47.75;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 18350.0;
                Minor_Mey = 22200000.0;
                break;
            }
            case "LC-150x50x20x2.3": {
                xcg_value = 15.32;
                double temp1 = 72.4;
                double temp2 = 25.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 7906.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 18.06;
                temp2 = 3.24;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 18.06;
                temp2 = 46.76;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 56.7;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 136.2;
                temp2 = 1.15;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 26.2;
                temp2 = 48.85;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 13660.0;
                Minor_Mey = 16400000.0;
                break;
            }
            case "LC-150x50x20x3.2": {
                xcg_value = 15.23;
                double temp1 = 61.6;
                double temp2 = 25.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 4870.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 25.13;
                temp2 = 4.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 25.13;
                temp2 = 45.5;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 153.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 130.8;
                temp2 = 1.6;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 20.8;
                temp2 = 48.4;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 17480.0;
                Minor_Mey = 21100000.0;
                break;
            }
            case "LC-150x50x20x4.5": {
                xcg_value = 15.1;
                double temp1 = 46.0;
                double temp2 = 25.0;
                double temp3 = temp1 * temp2;
                double temp4 = temp3 * temp2;
                double temp5 = 2028.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 35.34;
                temp2 = 6.33;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 424.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 35.34;
                temp2 = 43.67;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 424.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                temp1 = 123.0;
                temp2 = 2.25;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);

                temp1 = 13.0;
                temp2 = 47.75;
                temp3 = temp1 * temp2;
                temp4 = temp3 * temp2;
                temp5 = 0.0;
                Mi_L_List.add(temp1);
                Mi_x_List.add(temp2);
                Mi_Lx_List.add(temp3);
                Mi_Lx2_List.add(temp4);
                Mi_I1_List.add(temp5);


                for (int k = 0; k < Mi_L_List.toArray().length; k++) {
                    Mi_L_List_Sum = Mi_L_List_Sum + Mi_L_List.get(k);
                }
                for (int k = 0; k < Mi_x_List.toArray().length; k++) {
                    Mi_x_List_Sum = Mi_x_List_Sum + Mi_x_List.get(k);
                }
                for (int k = 0; k < Mi_Lx_List.toArray().length; k++) {
                    Mi_Lx_List_Sum = Mi_Lx_List_Sum + Mi_Lx_List.get(k);
                }
                for (int k = 0; k < Mi_Lx2_List.toArray().length; k++) {
                    Mi_Lx2_List_Sum = Mi_Lx2_List_Sum + Mi_Lx2_List.get(k);
                }
                for (int k = 0; k < Mi_I1_List.toArray().length; k++) {
                    Mi_I1_List_Sum = Mi_I1_List_Sum + Mi_I1_List.get(k);
                }

                Sfy_value = 21360.0;
                Minor_Mey = 26600000.0;
                break;
            }
        }


    }

    //약축 항복시작시의 모멘트 강도 계산(Mny)
    public void cal_Major_Mny() {
        Minor_I_Py = Mi_Lx2_List_Sum + Mi_I1_List_Sum - Mi_L_List_Sum * Math.pow(xcg_value, 2);
        Minor_Iy = Minor_I_Py * t_t_value;
        Minor_Sey = Minor_Iy / (B_B_value - xcg_value);
        Minor_Mny = Minor_Sey * Fy_value;
    }

    //약축에대한 횡좌굴 강도 검토(Mny2)
    public void cal_Major_Mny2() {
        Minor_My = Sfy_value * Fy_value;
        Minor_Mcy = Minor_My * (1 - Minor_My / (4 * Minor_Mey));
        Minor_fcy = Minor_Mcy / Sfy_value;
        Minor_Sey2 = Minor_Iy / (xcg_value);
        Minor_Mny2 = Minor_Sey2 * Minor_fcy;
    }

    //약축에 대한 휨 모멘트 강도비 검토
    public void cal_Minor_Ma() {
        Minor_Ma = Math.min(Minor_Mny, Minor_Mny2) / Minor_Wf_value;
        Minor_Ma_ratio = Minor_Mu_value / Minor_Ma;
        if (Minor_Ma_ratio < 1) {
            Minor_Ma_check = "O.K";
        } else {
            Minor_Ma_check = "N.G";
        }
    }

    //약축에 대한 허용 휨강도 검토(Mao)
    public void cal_Minor_Mao() {
        Minor_Mno = Minor_Mny;
        Minor_Mao = Minor_Mno / Minor_Wf_value;
        Minor_Mao_ratio = Minor_Mu_value / Minor_Mao;
        if (Minor_Mao_ratio < 1) {
            Minor_Mao_check = "O.K";
        } else {
            Minor_Mao_check = "N.G";
        }
    }

    //부재 X축에 대한 전단강도계산
    public void cal_Vax() {
        Vax_value = 0.4 * Fy_value * (2 * b_value + Math.PI * r_value + 2 * c_value) * t_t_value;
        Vax_ratio = vux_value / Vax_value;
        if (Vax_ratio < 1) {
            Vax_check = "O.K";
        } else {
            Vax_check = "N.G";
        }
        Muy_Vux_Com_ratio = Math.pow((Minor_Mu_value / Minor_Mao), 2) + Math.pow(Vax_ratio, 2);
        if (Muy_Vux_Com_ratio < 1) {
            Muy_Vux_Com_check = "O.K";
        } else {
            Muy_Vux_Com_check = "N.G";
        }
    }

    //부재 Y축에 대한 전단강도계산   '전단강도비 검토
    public void cal_Vay() {
        HTR_Vy = a_value / t_t_value;
        kv_value = 5.34;
        HTR_a = 1.38 * Math.sqrt(Es_value * kv_value / Fy_value);
        if (HTR_Vy <= HTR_a) {
            Vay1_Value = 0.38 * Math.pow(t_t_value, 2) * Math.sqrt(kv_value * Fy_value * Es_value);
            Vay2_Value = 0.4 * Fy_value * a_value * t_t_value;
            Vay_final_Value = Math.min(Vay1_Value, Vay2_Value);
        } else {
            Vay_final_Value = (0.53 * Es_value * kv_value * Math.pow(t_t_value, 3)) / a_value;
        }
        Vay_ratio = vuy_value / Vay_final_Value;
        if (Vay_ratio < 1) {
            Vay_check = "O.K";
        } else {
            Vay_check = "N.G";
        }
        Mux_Vuy_Com_ratio = Math.pow((Mu_value / Major_Mao), 2) + Math.pow(Vay_ratio, 2);
        if (Mux_Vuy_Com_ratio < 1) {
            Mux_Vuy_Com_check = "O.K";
        } else {
            Mux_Vuy_Com_check = "N.G";
        }
    }

    //조합강도비 검토
    public void cal_com_ratio() {
        double temp_ratio1 = Math.abs((Mux1_value * 1000000) / Major_Ma) + Math.abs((Muy1_value * 1000000) / Minor_Ma);
        double temp_ratio2 = Math.abs((Mux2_value * 1000000) / Major_Ma) + Math.abs((Muy2_value * 1000000) / Minor_Ma);
        double temp_ratio3 = Math.abs((Mux3_value * 1000000) / Major_Ma) + Math.abs((Muy3_value * 1000000) / Minor_Ma);
        double temp_ratio4 = Math.abs((Mux4_value * 1000000) / Major_Ma) + Math.abs((Muy4_value * 1000000) / Minor_Ma);


        R_ratio = Math.max(temp_ratio1, temp_ratio2);
        R_ratio = Math.max(R_ratio, temp_ratio3);
        R_ratio = Math.max(R_ratio, temp_ratio4);

        //R_ratio = Mu_value / Major_Mao + Minor_Mu_value / Minor_Mao;
        //R_ratio = Major_Ma_ratio + Minor_Ma_ratio;// 값 확인

        if (R_ratio < 1) {
            R_ratio_check = "O.K";
        } else {
            R_ratio_check = "N.G";
        }
    }


    //최종 검토 결과
    public void Final_Check() {
        if (R_ratio_check.equals("N.G")) {
            final_NG_OK = "N.G";
            final_ratio = R_ratio;
            final_comment = "안전하지 않은 부재입니다.";
        } else {
            final_NG_OK = "O.K";
            final_ratio = R_ratio;
            final_comment = "사용가능한 부재입니다.";
        }

    }


    public void 하중계산() {
        자중 = (Area_value / 1000000 * 철밀도);
        고정하중 = 자중 + 분담폭 * 패널무게;
        유효수압면적 = (경간 / 1000) * 부재배치간격;

        if (설치높이 == 0) {
            kzr_value = 1.0;
            설치높이 = 0.0;
        } else if (설치높이 > 10) {
            kzr_value = 0.71 * Math.pow(설치높이, 0.15);
        }
        VH_value = Vo_value * Kzt_value * Iw_Value * kzr_value;
        qH_value = (0.5 * 1.22 * Math.pow(VH_value, 2)) / 1000;

        if (설치높이 < 20) {
            if (각도 <= 10) {
                cal_GCpe_Value_20_under_10_under();
            } else if (10 < 각도 && 각도 <= 30) {
                cal_GCpe_Value_20_under_10_up();
            }
        } else {
            if (각도 < 10) {
                cal_GCpe_Value_20_UP_10under();
            } else if (10 <= 각도 && 각도 <= 30) {
                cal_GCpe_Value_20_UP_10up_30under();
            } else if (30 < 각도 && 각도 <= 45) {
                cal_GCpe_Value_20_UP_30up_45under();
            }
        }
        if (Math.abs(qH_value * GCpe_pl_value) > 0.5) {
            풍하중_정 = qH_value * GCpe_pl_value;
        } else {
            풍하중_정 = 0.5;
        }
        풍하중_부 = qH_value * GCpe_Mi_value;

        Cal_x_Loadcombi();
        Cal_y_Loadcombi();
        Cal_x_sur_Loadcombi();
        Cal_y_sur_Loadcombi();

        cal_Mu_Vu_value();
    }

    //기준높이 20m미만 각도 10도 이하 정압, 부압 피크외압계수 GCpe
    public void cal_GCpe_Value_20_under_10_under() {
        double tempa;// As Double
        double tempb;// As Double
        double tempx1;// As Double
        double tempx2;// As Double
        double tempy1;// As Double
        double tempy2;// As Double

        if (유효수압면적 <= 1) {
            GCpe_pl_value = 0.6;
        } else if (1 < 유효수압면적 && 유효수압면적 <= 2) {
            tempx1 = 1.0;
            tempx2 = 2.0;
            tempy1 = 0.6;
            tempy2 = 0.54;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (2 < 유효수압면적 && 유효수압면적 <= 3) {
            tempx1 = 2.0;
            tempx2 = 3.0;
            tempy1 = 0.54;
            tempy2 = 0.505;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (3 < 유효수압면적 && 유효수압면적 <= 4) {
            tempx1 = 3.0;
            tempx2 = 4.0;
            tempy1 = 0.505;
            tempy2 = 0.48;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (4 < 유효수압면적 && 유효수압면적 <= 5) {
            tempx1 = 4.0;
            tempx2 = 5.0;
            tempy1 = 0.48;
            tempy2 = 0.46;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (5 < 유효수압면적 && 유효수압면적 <= 6) {
            tempx1 = 5.0;
            tempx2 = 6.0;
            tempy1 = 0.46;
            tempy2 = 0.444;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (6 < 유효수압면적 && 유효수압면적 <= 7) {
            tempx1 = 6.0;
            tempx2 = 7.0;
            tempy1 = 0.444;
            tempy2 = 0.431;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (7 < 유효수압면적 && 유효수압면적 <= 8) {
            tempx1 = 7.0;
            tempx2 = 8.0;
            tempy1 = 0.431;
            tempy2 = 0.419;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (8 < 유효수압면적 && 유효수압면적 <= 9) {
            tempx1 = 8.0;
            tempx2 = 9.0;
            tempy1 = 0.419;
            tempy2 = 0.409;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (9 < 유효수압면적 && 유효수압면적 < 10) {
            tempx1 = 9.0;
            tempx2 = 10.0;
            tempy1 = 0.409;
            tempy2 = 0.4;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (유효수압면적 >= 10) {
            GCpe_pl_value = 0.4;
        }
        GCpe_Mi_value = -2.2;
    }

    //기준높이 20m미만 각도 10~30이하 정압, 부압 피크외압계수 GCpe
    public void cal_GCpe_Value_20_under_10_up() {
        double tempa;// As Double
        double tempb;// As Double
        double tempx1;// As Double
        double tempx2;// As Double
        double tempy1;// As Double
        double tempy2;// As Double

        if (유효수압면적 <= 1) {
            GCpe_pl_value = 0.8;
        } else if (1 < 유효수압면적 && 유효수압면적 <= 2) {
            tempx1 = 1.0;
            tempx2 = 2.0;
            tempy1 = 0.8;
            tempy2 = 0.74;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (2 < 유효수압면적 && 유효수압면적 <= 3) {
            tempx1 = 2.0;
            tempx2 = 3.0;
            tempy1 = 0.74;
            tempy2 = 0.705;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (3 < 유효수압면적 && 유효수압면적 <= 4) {
            tempx1 = 3.0;
            tempx2 = 4.0;
            tempy1 = 0.705;
            tempy2 = 0.68;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (4 < 유효수압면적 && 유효수압면적 <= 5) {
            tempx1 = 4.0;
            tempx2 = 5.0;
            tempy1 = 0.68;
            tempy2 = 0.66;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (5 < 유효수압면적 && 유효수압면적 <= 6) {
            tempx1 = 5.0;
            tempx2 = 6.0;
            tempy1 = 0.66;
            tempy2 = 0.644;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (6 < 유효수압면적 && 유효수압면적 <= 7) {
            tempx1 = 6.0;
            tempx2 = 7.0;
            tempy1 = 0.644;
            tempy2 = 0.631;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (7 < 유효수압면적 && 유효수압면적 <= 8) {
            tempx1 = 7.0;
            tempx2 = 8.0;
            tempy1 = 0.631;
            tempy2 = 0.619;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (8 < 유효수압면적 && 유효수압면적 <= 9) {
            tempx1 = 8.0;
            tempx2 = 9.0;
            tempy1 = 0.619;
            tempy2 = 0.609;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (9 < 유효수압면적 && 유효수압면적 < 10) {
            tempx1 = 9.0;
            tempx2 = 10.0;
            tempy1 = 0.609;
            tempy2 = 0.6;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        } else if (유효수압면적 >= 10) {
            GCpe_pl_value = 0.6;
        }


        if (유효수압면적 <= 1) {
            GCpe_Mi_value = -2.6;
        } else if (1 < 유효수압면적 && 유효수압면적 <= 2) {
            tempx1 = 1.0;
            tempx2 = 2.0;
            tempy1 = -2.6;
            tempy2 = -2.48;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_Mi_value = 유효수압면적 * tempa + tempb;
        } else if (2 < 유효수압면적 && 유효수압면적 <= 3) {
            tempx1 = 2.0;
            tempx2 = 3.0;
            tempy1 = -2.48;
            tempy2 = -2.409;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_Mi_value = 유효수압면적 * tempa + tempb;
        } else if (3 < 유효수압면적 && 유효수압면적 <= 4) {
            tempx1 = 3.0;
            tempx2 = 4.0;
            tempy1 = -2.409;
            tempy2 = -2.359;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_Mi_value = 유효수압면적 * tempa + tempb;
        } else if (4 < 유효수압면적 && 유효수압면적 <= 5) {
            tempx1 = 4.0;
            tempx2 = 5.0;
            tempy1 = -2.359;
            tempy2 = -2.32;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_Mi_value = 유효수압면적 * tempa + tempb;
        } else if (5 < 유효수압면적 && 유효수압면적 <= 6) {
            tempx1 = 5.0;
            tempx2 = 6.0;
            tempy1 = -2.32;
            tempy2 = -2.289;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_Mi_value = 유효수압면적 * tempa + tempb;
        } else if (6 < 유효수압면적 && 유효수압면적 <= 7) {
            tempx1 = 6.0;
            tempx2 = 7.0;
            tempy1 = -2.289;
            tempy2 = -2.262;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_Mi_value = 유효수압면적 * tempa + tempb;
        } else if (7 < 유효수압면적 && 유효수압면적 <= 8) {
            tempx1 = 7.0;
            tempx2 = 8.0;
            tempy1 = -2.262;
            tempy2 = -2.239;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_Mi_value = 유효수압면적 * tempa + tempb;
        } else if (8 < 유효수압면적 && 유효수압면적 <= 9) {
            tempx1 = 8.0;
            tempx2 = 9.0;
            tempy1 = -2.239;
            tempy2 = -2.218;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_Mi_value = 유효수압면적 * tempa + tempb;
        } else if (9 < 유효수압면적 && 유효수압면적 < 10) {
            tempx1 = 9.0;
            tempx2 = 10.0;
            tempy1 = -2.218;
            tempy2 = -2.2;
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_Mi_value = 유효수압면적 * tempa + tempb;
        } else if (유효수압면적 >= 10) {
            GCpe_Mi_value = -2.2;
        }
    }

    //기준높이 20m이상 각도 10도 미만 정압, 부압 피크외압계수 GCpe
    public void cal_GCpe_Value_20_UP_10under() {
        double tempa;// As Double
        double tempb;// As Double
        double tempx1 = 0.0;// As Double
        double tempx2 = 0.0;// As Double
        double tempy1 = 0.0;// As Double
        double tempy2 = 0.0;// As Double

        if (유효수압면적 <= 1) {
            GCpe_pl_value = -2.8;
        } else if (1.0 < 유효수압면적 && 유효수압면적 <= 1.1) {
            tempx1 = 1.0;
            tempx2 = 1.1;
            tempy1 = -2.8;
            tempy2 = -2.776;
        } else if (1.1 < 유효수압면적 && 유효수압면적 <= 1.2) {
            tempx1 = 1.1;
            tempx2 = 1.2;
            tempy1 = -2.776;
            tempy2 = -2.753;
        } else if (1.2 < 유효수압면적 && 유효수압면적 <= 1.3) {
            tempx1 = 1.2;
            tempx2 = 1.3;
            tempy1 = -2.753;
            tempy2 = -2.733;
        } else if (1.3 < 유효수압면적 && 유효수압면적 <= 1.4) {
            tempx1 = 1.3;
            tempx2 = 1.4;
            tempy1 = -2.733;
            tempy2 = -2.714;
        } else if (1.4 < 유효수압면적 && 유효수압면적 <= 1.5) {
            tempx1 = 1.4;
            tempx2 = 1.5;
            tempy1 = -2.714;
            tempy2 = -2.696;
        } else if (1.5 < 유효수압면적 && 유효수압면적 <= 1.6) {
            tempx1 = 1.5;
            tempx2 = 1.6;
            tempy1 = -2.696;
            tempy2 = -2.68;
        } else if (1.6 < 유효수압면적 && 유효수압면적 <= 1.7) {
            tempx1 = 1.6;
            tempx2 = 1.7;
            tempy1 = -2.68;
            tempy2 = -2.664;
        } else if (1.7 < 유효수압면적 && 유효수압면적 <= 1.8) {
            tempx1 = 1.7;
            tempx2 = 1.8;
            tempy1 = -2.664;
            tempy2 = -2.65;
        } else if (1.8 < 유효수압면적 && 유효수압면적 <= 1.9) {
            tempx1 = 1.8;
            tempx2 = 1.9;
            tempy1 = -2.65;
            tempy2 = -2.636;
        } else if (1.9 < 유효수압면적 && 유효수압면적 <= 2.0) {
            tempx1 = 1.9;
            tempx2 = 2.0;
            tempy1 = -2.636;
            tempy2 = -2.623;
        } else if (2.0 < 유효수압면적 && 유효수압면적 <= 2.1) {
            tempx1 = 2.0;
            tempx2 = 2.1;
            tempy1 = -2.623;
            tempy2 = -2.61;
        } else if (2.1 < 유효수압면적 && 유효수압면적 <= 2.2) {
            tempx1 = 2.1;
            tempx2 = 2.2;
            tempy1 = -2.61;
            tempy2 = -2.598;
        } else if (2.2 < 유효수압면적 && 유효수압면적 <= 2.3) {
            tempx1 = 2.2;
            tempx2 = 2.3;
            tempy1 = -2.598;
            tempy2 = -2.587;
        } else if (2.3 < 유효수압면적 && 유효수압면적 <= 2.4) {
            tempx1 = 2.3;
            tempx2 = 2.4;
            tempy1 = -2.587;
            tempy2 = -2.576;
        } else if (2.4 < 유효수압면적 && 유효수압면적 <= 2.5) {
            tempx1 = 2.4;
            tempx2 = 2.5;
            tempy1 = -2.576;
            tempy2 = -2.566;
        } else if (2.5 < 유효수압면적 && 유효수압면적 <= 2.6) {
            tempx1 = 2.5;
            tempx2 = 2.6;
            tempy1 = -2.566;
            tempy2 = -2.556;
        } else if (2.6 < 유효수압면적 && 유효수압면적 <= 2.7) {
            tempx1 = 2.6;
            tempx2 = 2.7;
            tempy1 = -2.556;
            tempy2 = -2.546;
        } else if (2.7 < 유효수압면적 && 유효수압면적 <= 2.8) {
            tempx1 = 2.7;
            tempx2 = 2.8;
            tempy1 = -2.546;
            tempy2 = -2.537;
        } else if (2.8 < 유효수압면적 && 유효수압면적 <= 2.9) {
            tempx1 = 2.8;
            tempx2 = 2.9;
            tempy1 = -2.537;
            tempy2 = -2.528;
        } else if (2.9 < 유효수압면적 && 유효수압면적 <= 3.0) {
            tempx1 = 2.9;
            tempx2 = 3.0;
            tempy1 = -2.528;
            tempy2 = -2.519;
        } else if (3.0 < 유효수압면적 && 유효수압면적 <= 3.1) {
            tempx1 = 3.0;
            tempx2 = 3.1;
            tempy1 = -2.519;
            tempy2 = -2.511;
        } else if (3.1 < 유효수압면적 && 유효수압면적 <= 3.2) {
            tempx1 = 3.1;
            tempx2 = 3.2;
            tempy1 = -2.511;
            tempy2 = -2.503;
        } else if (3.2 < 유효수압면적 && 유효수압면적 <= 3.3) {
            tempx1 = 3.2;
            tempx2 = 3.3;
            tempy1 = -2.503;
            tempy2 = -2.495;
        } else if (3.3 < 유효수압면적 && 유효수압면적 <= 3.4) {
            tempx1 = 3.3;
            tempx2 = 3.4;
            tempy1 = -2.495;
            tempy2 = -2.487;
        } else if (3.4 < 유효수압면적 && 유효수압면적 <= 3.5) {
            tempx1 = 3.4;
            tempx2 = 3.5;
            tempy1 = -2.487;
            tempy2 = -2.48;
        } else if (3.5 < 유효수압면적 && 유효수압면적 <= 3.6) {
            tempx1 = 3.5;
            tempx2 = 3.6;
            tempy1 = -2.48;
            tempy2 = -2.473;
        } else if (3.6 < 유효수압면적 && 유효수압면적 <= 3.7) {
            tempx1 = 3.6;
            tempx2 = 3.7;
            tempy1 = -2.473;
            tempy2 = -2.466;
        } else if (3.7 < 유효수압면적 && 유효수압면적 <= 3.8) {
            tempx1 = 3.7;
            tempx2 = 3.8;
            tempy1 = -2.466;
            tempy2 = -2.459;
        } else if (3.8 < 유효수압면적 && 유효수압면적 <= 3.9) {
            tempx1 = 3.8;
            tempx2 = 3.9;
            tempy1 = -2.459;
            tempy2 = -2.452;
        } else if (3.9 < 유효수압면적 && 유효수압면적 <= 4.0) {
            tempx1 = 3.9;
            tempx2 = 4.0;
            tempy1 = -2.452;
            tempy2 = -2.446;
        } else if (4.0 < 유효수압면적 && 유효수압면적 <= 4.5) {
            tempx1 = 4.0;
            tempx2 = 4.5;
            tempy1 = -2.446;
            tempy2 = -2.416;
        } else if (4.5 < 유효수압면적 && 유효수압면적 <= 5.0) {
            tempx1 = 4.5;
            tempx2 = 5.0;
            tempy1 = -2.416;
            tempy2 = -2.389;
        } else if (5.0 < 유효수압면적 && 유효수압면적 <= 5.5) {
            tempx1 = 5.0;
            tempx2 = 5.5;
            tempy1 = -2.389;
            tempy2 = -2.364;
        } else if (5.5 < 유효수압면적 && 유효수압면적 <= 6.0) {
            tempx1 = 5.5;
            tempx2 = 6.0;
            tempy1 = -2.364;
            tempy2 = -2.342;
        } else if (6.0 < 유효수압면적 && 유효수압면적 <= 6.5) {
            tempx1 = 6.0;
            tempx2 = 6.5;
            tempy1 = -2.342;
            tempy2 = -2.322;
        } else if (6.5 < 유효수압면적 && 유효수압면적 <= 7.0) {
            tempx1 = 6.5;
            tempx2 = 7.0;
            tempy1 = -2.322;
            tempy2 = -2.303;
        } else if (7.0 < 유효수압면적 && 유효수압면적 <= 7.5) {
            tempx1 = 7.0;
            tempx2 = 7.5;
            tempy1 = -2.303;
            tempy2 = -2.285;
        } else if (7.5 < 유효수압면적 && 유효수압면적 <= 8.0) {
            tempx1 = 7.5;
            tempx2 = 8.0;
            tempy1 = -2.285;
            tempy2 = -2.268;
        } else if (8.0 < 유효수압면적 && 유효수압면적 <= 8.5) {
            tempx1 = 8.0;
            tempx2 = 8.5;
            tempy1 = -2.268;
            tempy2 = -2.253;
        } else if (8.5 < 유효수압면적 && 유효수압면적 <= 9.0) {
            tempx1 = 8.5;
            tempx2 = 9.0;
            tempy1 = -2.253;
            tempy2 = -2.238;
        } else if (9.0 < 유효수압면적 && 유효수압면적 <= 9.5) {
            tempx1 = 9.0;
            tempx2 = 9.5;
            tempy1 = -2.238;
            tempy2 = -2.225;
        } else if (9.5 < 유효수압면적 && 유효수압면적 <= 10) {
            tempx1 = 9.5;
            tempx2 = 10.0;
            tempy1 = -2.225;
            tempy2 = -2.211;
        }

        if (유효수압면적 <= 1) {
            GCpe_pl_value = -2.8;
        } else {
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        }


        GCpe_Mi_value = GCpe_pl_value;
    }

    //기준높이 20m이상 각도 10도 이상, 30도 이하 정압, 부압 피크외압계수 GCpe
    public void cal_GCpe_Value_20_UP_10up_30under() {
        double tempa;// As Double
        double tempb;// As Double
        double tempx1 = 0.0;// As Double
        double tempx2 = 0.0;// As Double
        double tempy1 = 0.0;// As Double
        double tempy2 = 0.0;// As Double

        if (유효수압면적 <= 1) {
            GCpe_pl_value = -1.8;
        } else if (1.0 < 유효수압면적 && 유효수압면적 <= 1.1) {
            tempx1 = 1.0;
            tempx2 = 1.1;
            tempy1 = -1.8;
            tempy2 = -1.792;
        } else if (1.1 < 유효수압면적 && 유효수압면적 <= 1.2) {
            tempx1 = 1.1;
            tempx2 = 1.2;
            tempy1 = -1.792;
            tempy2 = -1.784;
        } else if (1.2 < 유효수압면적 && 유효수압면적 <= 1.3) {
            tempx1 = 1.2;
            tempx2 = 1.3;
            tempy1 = -1.784;
            tempy2 = -1.777;
        } else if (1.3 < 유효수압면적 && 유효수압면적 <= 1.4) {
            tempx1 = 1.3;
            tempx2 = 1.4;
            tempy1 = -1.777;
            tempy2 = -1.771;
        } else if (1.4 < 유효수압면적 && 유효수압면적 <= 1.5) {
            tempx1 = 1.4;
            tempx2 = 1.5;
            tempy1 = -1.771;
            tempy2 = -1.765;
        } else if (1.5 < 유효수압면적 && 유효수압면적 <= 1.6) {
            tempx1 = 1.5;
            tempx2 = 1.6;
            tempy1 = -1.765;
            tempy2 = -1.759;
        } else if (1.6 < 유효수압면적 && 유효수압면적 <= 1.7) {
            tempx1 = 1.6;
            tempx2 = 1.7;
            tempy1 = -1.759;
            tempy2 = -1.754;
        } else if (1.7 < 유효수압면적 && 유효수압면적 <= 1.8) {
            tempx1 = 1.7;
            tempx2 = 1.8;
            tempy1 = -1.754;
            tempy2 = -1.749;
        } else if (1.8 < 유효수압면적 && 유효수압면적 <= 1.9) {
            tempx1 = 1.8;
            tempx2 = 1.9;
            tempy1 = -1.749;
            tempy2 = -1.744;
        } else if (1.9 < 유효수압면적 && 유효수압면적 <= 2.0) {
            tempx1 = 1.9;
            tempx2 = 2.0;
            tempy1 = -1.744;
            tempy2 = -1.74;
        } else if (2.0 < 유효수압면적 && 유효수압면적 <= 2.1) {
            tempx1 = 2.0;
            tempx2 = 2.1;
            tempy1 = -1.74;
            tempy2 = -1.736;
        } else if (2.1 < 유효수압면적 && 유효수압면적 <= 2.2) {
            tempx1 = 2.1;
            tempx2 = 2.2;
            tempy1 = -1.736;
            tempy2 = -1.732;
        } else if (2.2 < 유효수압면적 && 유효수압면적 <= 2.3) {
            tempx1 = 2.2;
            tempx2 = 2.3;
            tempy1 = -1.732;
            tempy2 = -1.728;
        } else if (2.3 < 유효수압면적 && 유효수압면적 <= 2.4) {
            tempx1 = 2.3;
            tempx2 = 2.4;
            tempy1 = -1.728;
            tempy2 = -1.724;
        } else if (2.4 < 유효수압면적 && 유효수압면적 <= 2.5) {
            tempx1 = 2.4;
            tempx2 = 2.5;
            tempy1 = -1.724;
            tempy2 = -1.72;
        } else if (2.5 < 유효수압면적 && 유효수압면적 <= 2.6) {
            tempx1 = 2.5;
            tempx2 = 2.6;
            tempy1 = -1.72;
            tempy2 = -1.717;
        } else if (2.6 < 유효수압면적 && 유효수압면적 <= 2.7) {
            tempx1 = 2.6;
            tempx2 = 2.7;
            tempy1 = -1.717;
            tempy2 = -1.714;
        } else if (2.7 < 유효수압면적 && 유효수압면적 <= 2.8) {
            tempx1 = 2.7;
            tempx2 = 2.8;
            tempy1 = -1.714;
            tempy2 = -1.711;
        } else if (2.8 < 유효수압면적 && 유효수압면적 <= 2.9) {
            tempx1 = 2.8;
            tempx2 = 2.9;
            tempy1 = -1.711;
            tempy2 = -1.708;
        } else if (2.9 < 유효수압면적 && 유효수압면적 <= 3.0) {
            tempx1 = 2.9;
            tempx2 = 3.0;
            tempy1 = -1.708;
            tempy2 = -1.705;
        } else if (3.0 < 유효수압면적 && 유효수압면적 <= 3.1) {
            tempx1 = 3.0;
            tempx2 = 3.1;
            tempy1 = -1.705;
            tempy2 = -1.702;
        } else if (3.1 < 유효수압면적 && 유효수압면적 <= 3.2) {
            tempx1 = 3.1;
            tempx2 = 3.2;
            tempy1 = -1.702;
            tempy2 = -1.699;
        } else if (3.2 < 유효수압면적 && 유효수압면적 <= 3.3) {
            tempx1 = 3.2;
            tempx2 = 3.3;
            tempy1 = -1.699;
            tempy2 = -1.696;
        } else if (3.3 < 유효수압면적 && 유효수압면적 <= 3.4) {
            tempx1 = 3.3;
            tempx2 = 3.4;
            tempy1 = -1.696;
            tempy2 = -1.694;
        } else if (3.4 < 유효수압면적 && 유효수압면적 <= 3.5) {
            tempx1 = 3.4;
            tempx2 = 3.5;
            tempy1 = -1.694;
            tempy2 = -1.691;
        } else if (3.5 < 유효수압면적 && 유효수압면적 <= 3.6) {
            tempx1 = 3.5;
            tempx2 = 3.6;
            tempy1 = -1.691;
            tempy2 = -1.689;
        } else if (3.6 < 유효수압면적 && 유효수압면적 <= 3.7) {
            tempx1 = 3.6;
            tempx2 = 3.7;
            tempy1 = -1.689;
            tempy2 = -1.686;
        } else if (3.7 < 유효수압면적 && 유효수압면적 <= 3.8) {
            tempx1 = 3.7;
            tempx2 = 3.8;
            tempy1 = -1.686;
            tempy2 = -1.684;
        } else if (3.8 < 유효수압면적 && 유효수압면적 <= 3.9) {
            tempx1 = 3.8;
            tempx2 = 3.9;
            tempy1 = -1.684;
            tempy2 = -1.682;
        } else if (3.9 < 유효수압면적 && 유효수압면적 <= 4.0) {
            tempx1 = 3.9;
            tempx2 = 4.0;
            tempy1 = -1.682;
            tempy2 = -1.68;
        } else if (4.0 < 유효수압면적 && 유효수압면적 <= 4.5) {
            tempx1 = 4.0;
            tempx2 = 4.5;
            tempy1 = -1.68;
            tempy2 = -1.669;
        } else if (4.5 < 유효수압면적 && 유효수압면적 <= 5.0) {
            tempx1 = 4.5;
            tempx2 = 5.0;
            tempy1 = -1.669;
            tempy2 = -1.66;
        } else if (5.0 < 유효수압면적 && 유효수압면적 <= 5.5) {
            tempx1 = 5.0;
            tempx2 = 5.5;
            tempy1 = -1.66;
            tempy2 = -1.652;
        } else if (5.5 < 유효수압면적 && 유효수압면적 <= 6.0) {
            tempx1 = 5.5;
            tempx2 = 6.0;
            tempy1 = -1.652;
            tempy2 = -1.644;
        } else if (6.0 < 유효수압면적 && 유효수압면적 <= 6.5) {
            tempx1 = 6.0;
            tempx2 = 6.5;
            tempy1 = -1.644;
            tempy2 = -1.637;
        } else if (6.5 < 유효수압면적 && 유효수압면적 <= 7.0) {
            tempx1 = 6.5;
            tempx2 = 7.0;
            tempy1 = -1.637;
            tempy2 = -1.631;
        } else if (7.0 < 유효수압면적 && 유효수압면적 <= 7.5) {
            tempx1 = 7.0;
            tempx2 = 7.5;
            tempy1 = -1.631;
            tempy2 = -1.625;
        } else if (7.5 < 유효수압면적 && 유효수압면적 <= 8.0) {
            tempx1 = 7.5;
            tempx2 = 8.0;
            tempy1 = -1.625;
            tempy2 = -1.619;
        } else if (8.0 < 유효수압면적 && 유효수압면적 <= 8.5) {
            tempx1 = 8.0;
            tempx2 = 8.5;
            tempy1 = -1.619;
            tempy2 = -1.614;
        } else if (8.5 < 유효수압면적 && 유효수압면적 <= 9.0) {
            tempx1 = 8.5;
            tempx2 = 9.0;
            tempy1 = -1.614;
            tempy2 = -1.609;
        } else if (9.0 < 유효수압면적 && 유효수압면적 <= 9.5) {
            tempx1 = 9.0;
            tempx2 = 9.5;
            tempy1 = -1.609;
            tempy2 = -1.604;
        } else if (9.5 < 유효수압면적 && 유효수압면적 <= 10) {
            tempx1 = 9.5;
            tempx2 = 10.0;
            tempy1 = -1.604;
            tempy2 = -1.6;
        }

        if (유효수압면적 <= 1) {
            GCpe_pl_value = -1.8;
        } else if (유효수압면적 > 10) {
            GCpe_pl_value = -1.6;
        } else {
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        }
        GCpe_Mi_value = GCpe_pl_value;
    }

    //기준높이 20m이상 각도 30도 초과, 45도 이하 정압, 부압 피크외압계수 GCpe
    public void cal_GCpe_Value_20_UP_30up_45under() {
        double tempa;// As Double
        double tempb;// As Double
        double tempx1 = 0.0;// As Double
        double tempx2 = 0.0;// As Double
        double tempy1 = 0.0;// As Double
        double tempy2 = 0.0;// As Double

        if (유효수압면적 <= 1) {
            GCpe_pl_value = 1.95;
        } else if (1.0 < 유효수압면적 && 유효수압면적 <= 1.1) {
            tempx1 = 1.0;
            tempx2 = 1.1;
            tempy1 = 1.95;
            tempy2 = 1.938;
        } else if (1.1 < 유효수압면적 && 유효수압면적 <= 1.2) {
            tempx1 = 1.1;
            tempx2 = 1.2;
            tempy1 = 1.938;
            tempy2 = 1.926;
        } else if (1.2 < 유효수압면적 && 유효수압면적 <= 1.3) {
            tempx1 = 1.2;
            tempx2 = 1.3;
            tempy1 = 1.926;
            tempy2 = 1.916;
        } else if (1.3 < 유효수압면적 && 유효수압면적 <= 1.4) {
            tempx1 = 1.3;
            tempx2 = 1.4;
            tempy1 = 1.916;
            tempy2 = 1.906;
        } else if (1.4 < 유효수압면적 && 유효수압면적 <= 1.5) {
            tempx1 = 1.4;
            tempx2 = 1.5;
            tempy1 = 1.906;
            tempy2 = 1.897;
        } else if (1.5 < 유효수압면적 && 유효수압면적 <= 1.6) {
            tempx1 = 1.5;
            tempx2 = 1.6;
            tempy1 = 1.897;
            tempy2 = 1.889;
        } else if (1.6 < 유효수압면적 && 유효수압면적 <= 1.7) {
            tempx1 = 1.6;
            tempx2 = 1.7;
            tempy1 = 1.889;
            tempy2 = 1.881;
        } else if (1.7 < 유효수압면적 && 유효수압면적 <= 1.8) {
            tempx1 = 1.7;
            tempx2 = 1.8;
            tempy1 = 1.881;
            tempy2 = 1.873;
        } else if (1.8 < 유효수압면적 && 유효수압면적 <= 1.9) {
            tempx1 = 1.8;
            tempx2 = 1.9;
            tempy1 = 1.873;
            tempy2 = 1.866;
        } else if (1.9 < 유효수압면적 && 유효수압면적 <= 2.0) {
            tempx1 = 1.9;
            tempx2 = 2.0;
            tempy1 = 1.866;
            tempy2 = 1.86;
        } else if (2.0 < 유효수압면적 && 유효수압면적 <= 2.1) {
            tempx1 = 2.0;
            tempx2 = 2.1;
            tempy1 = 1.86;
            tempy2 = 1.853;
        } else if (2.1 < 유효수압면적 && 유효수압면적 <= 2.2) {
            tempx1 = 2.1;
            tempx2 = 2.2;
            tempy1 = 1.853;
            tempy2 = 1.847;
        } else if (2.2 < 유효수압면적 && 유효수압면적 <= 2.3) {
            tempx1 = 2.2;
            tempx2 = 2.3;
            tempy1 = 1.847;
            tempy2 = 1.841;
        } else if (2.3 < 유효수압면적 && 유효수압면적 <= 2.4) {
            tempx1 = 2.3;
            tempx2 = 2.4;
            tempy1 = 1.841;
            tempy2 = 1.836;
        } else if (2.4 < 유효수압면적 && 유효수압면적 <= 2.5) {
            tempx1 = 2.4;
            tempx2 = 2.5;
            tempy1 = 1.836;
            tempy2 = 1.831;
        } else if (2.5 < 유효수압면적 && 유효수압면적 <= 2.6) {
            tempx1 = 2.5;
            tempx2 = 2.6;
            tempy1 = 1.831;
            tempy2 = 1.826;
        } else if (2.6 < 유효수압면적 && 유효수압면적 <= 2.7) {
            tempx1 = 2.6;
            tempx2 = 2.7;
            tempy1 = 1.826;
            tempy2 = 1.821;
        } else if (2.7 < 유효수압면적 && 유효수압면적 <= 2.8) {
            tempx1 = 2.7;
            tempx2 = 2.8;
            tempy1 = 1.821;
            tempy2 = 1.816;
        } else if (2.8 < 유효수압면적 && 유효수압면적 <= 2.9) {
            tempx1 = 2.8;
            tempx2 = 2.9;
            tempy1 = 1.816;
            tempy2 = 1.811;
        } else if (2.9 < 유효수압면적 && 유효수압면적 <= 3.0) {
            tempx1 = 2.9;
            tempx2 = 3.0;
            tempy1 = 1.811;
            tempy2 = 1.807;
        } else if (3.0 < 유효수압면적 && 유효수압면적 <= 3.1) {
            tempx1 = 3.0;
            tempx2 = 3.1;
            tempy1 = 1.807;
            tempy2 = 1.803;
        } else if (3.1 < 유효수압면적 && 유효수압면적 <= 3.2) {
            tempx1 = 3.1;
            tempx2 = 3.2;
            tempy1 = 1.803;
            tempy2 = 1.798;
        } else if (3.2 < 유효수압면적 && 유효수압면적 <= 3.3) {
            tempx1 = 3.2;
            tempx2 = 3.3;
            tempy1 = 1.798;
            tempy2 = 1.794;
        } else if (3.3 < 유효수압면적 && 유효수압면적 <= 3.4) {
            tempx1 = 3.3;
            tempx2 = 3.4;
            tempy1 = 1.794;
            tempy2 = 1.791;
        } else if (3.4 < 유효수압면적 && 유효수압면적 <= 3.5) {
            tempx1 = 3.4;
            tempx2 = 3.5;
            tempy1 = 1.791;
            tempy2 = 1.787;
        } else if (3.5 < 유효수압면적 && 유효수압면적 <= 3.6) {
            tempx1 = 3.5;
            tempx2 = 3.6;
            tempy1 = 1.787;
            tempy2 = 1.783;
        } else if (3.6 < 유효수압면적 && 유효수압면적 <= 3.7) {
            tempx1 = 3.6;
            tempx2 = 3.7;
            tempy1 = 1.783;
            tempy2 = 1.78;
        } else if (3.7 < 유효수압면적 && 유효수압면적 <= 3.8) {
            tempx1 = 3.7;
            tempx2 = 3.8;
            tempy1 = 1.78;
            tempy2 = 1.776;
        } else if (3.8 < 유효수압면적 && 유효수압면적 <= 3.9) {
            tempx1 = 3.8;
            tempx2 = 3.9;
            tempy1 = 1.776;
            tempy2 = 1.773;
        } else if (3.9 < 유효수압면적 && 유효수압면적 <= 4.0) {
            tempx1 = 3.9;
            tempx2 = 4.0;
            tempy1 = 1.773;
            tempy2 = 1.769;
        } else if (4.0 < 유효수압면적 && 유효수압면적 <= 4.5) {
            tempx1 = 4.0;
            tempx2 = 4.5;
            tempy1 = 1.769;
            tempy2 = 1.754;
        } else if (4.5 < 유효수압면적 && 유효수압면적 <= 5.0) {
            tempx1 = 4.5;
            tempx2 = 5.0;
            tempy1 = 1.754;
            tempy2 = 1.74;
        } else if (5.0 < 유효수압면적 && 유효수압면적 <= 5.5) {
            tempx1 = 5.0;
            tempx2 = 5.5;
            tempy1 = 1.74;
            tempy2 = 1.728;
        } else if (5.5 < 유효수압면적 && 유효수압면적 <= 6.0) {
            tempx1 = 5.5;
            tempx2 = 6.0;
            tempy1 = 1.728;
            tempy2 = 1.717;
        } else if (6.0 < 유효수압면적 && 유효수압면적 <= 6.5) {
            tempx1 = 6.0;
            tempx2 = 6.5;
            tempy1 = 1.717;
            tempy2 = 1.706;
        } else if (6.5 < 유효수압면적 && 유효수압면적 <= 7.0) {
            tempx1 = 6.5;
            tempx2 = 7.0;
            tempy1 = 1.706;
            tempy2 = 1.696;
        } else if (7.0 < 유효수압면적 && 유효수압면적 <= 7.5) {
            tempx1 = 7.0;
            tempx2 = 7.5;
            tempy1 = 1.696;
            tempy2 = 1.687;
        } else if (7.5 < 유효수압면적 && 유효수압면적 <= 8.0) {
            tempx1 = 7.5;
            tempx2 = 8.0;
            tempy1 = 1.687;
            tempy2 = 1.679;
        } else if (8.0 < 유효수압면적 && 유효수압면적 <= 8.5) {
            tempx1 = 8.0;
            tempx2 = 8.5;
            tempy1 = 1.679;
            tempy2 = 1.671;
        } else if (8.5 < 유효수압면적 && 유효수압면적 <= 9.0) {
            tempx1 = 8.5;
            tempx2 = 9.0;
            tempy1 = 1.671;
            tempy2 = 1.664;
        } else if (9.0 < 유효수압면적 && 유효수압면적 <= 9.5) {
            tempx1 = 9.0;
            tempx2 = 9.5;
            tempy1 = 1.664;
            tempy2 = 1.657;
        } else if (9.5 < 유효수압면적 && 유효수압면적 <= 10) {
            tempx1 = 9.5;
            tempx2 = 10.0;
            tempy1 = 1.657;
            tempy2 = 1.65;
        }

        if (유효수압면적 <= 1) {
            GCpe_pl_value = 1.95;
        } else if (유효수압면적 > 10) {
            GCpe_pl_value = 1.65;
        } else {
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_pl_value = 유효수압면적 * tempa + tempb;
        }


        if (유효수압면적 <= 1) {
            GCpe_pl_value = -2.1;
        } else if (1.0 < 유효수압면적 && 유효수압면적 <= 1.1) {
            tempx1 = 1.0;
            tempx2 = 1.1;
            tempy1 = -2.1;
            tempy2 = -2.088;
        } else if (1.1 < 유효수압면적 && 유효수압면적 <= 1.2) {
            tempx1 = 1.1;
            tempx2 = 1.2;
            tempy1 = -2.088;
            tempy2 = -2.076;
        } else if (1.2 < 유효수압면적 && 유효수압면적 <= 1.3) {
            tempx1 = 1.2;
            tempx2 = 1.3;
            tempy1 = -2.076;
            tempy2 = -2.066;
        } else if (1.3 < 유효수압면적 && 유효수압면적 <= 1.4) {
            tempx1 = 1.3;
            tempx2 = 1.4;
            tempy1 = -2.066;
            tempy2 = -2.056;
        } else if (1.4 < 유효수압면적 && 유효수압면적 <= 1.5) {
            tempx1 = 1.4;
            tempx2 = 1.5;
            tempy1 = -2.056;
            tempy2 = -2.047;
        } else if (1.5 < 유효수압면적 && 유효수압면적 <= 1.6) {
            tempx1 = 1.5;
            tempx2 = 1.6;
            tempy1 = -2.047;
            tempy2 = -2.039;
        } else if (1.6 < 유효수압면적 && 유효수압면적 <= 1.7) {
            tempx1 = 1.6;
            tempx2 = 1.7;
            tempy1 = -2.039;
            tempy2 = -2.031;
        } else if (1.7 < 유효수압면적 && 유효수압면적 <= 1.8) {
            tempx1 = 1.7;
            tempx2 = 1.8;
            tempy1 = -2.031;
            tempy2 = -2.023;
        } else if (1.8 < 유효수압면적 && 유효수압면적 <= 1.9) {
            tempx1 = 1.8;
            tempx2 = 1.9;
            tempy1 = -2.023;
            tempy2 = -2.016;
        } else if (1.9 < 유효수압면적 && 유효수압면적 <= 2.0) {
            tempx1 = 1.9;
            tempx2 = 2.0;
            tempy1 = -2.016;
            tempy2 = -2.01;
        } else if (2.0 < 유효수압면적 && 유효수압면적 <= 2.1) {
            tempx1 = 2.0;
            tempx2 = 2.1;
            tempy1 = -2.01;
            tempy2 = -2.003;
        } else if (2.1 < 유효수압면적 && 유효수압면적 <= 2.2) {
            tempx1 = 2.1;
            tempx2 = 2.2;
            tempy1 = -2.003;
            tempy2 = -1.997;
        } else if (2.2 < 유효수압면적 && 유효수압면적 <= 2.3) {
            tempx1 = 2.2;
            tempx2 = 2.3;
            tempy1 = -1.997;
            tempy2 = -1.991;
        } else if (2.3 < 유효수압면적 && 유효수압면적 <= 2.4) {
            tempx1 = 2.3;
            tempx2 = 2.4;
            tempy1 = -1.991;
            tempy2 = -1.986;
        } else if (2.4 < 유효수압면적 && 유효수압면적 <= 2.5) {
            tempx1 = 2.4;
            tempx2 = 2.5;
            tempy1 = -1.986;
            tempy2 = -1.981;
        } else if (2.5 < 유효수압면적 && 유효수압면적 <= 2.6) {
            tempx1 = 2.5;
            tempx2 = 2.6;
            tempy1 = -1.981;
            tempy2 = -1.976;
        } else if (2.6 < 유효수압면적 && 유효수압면적 <= 2.7) {
            tempx1 = 2.6;
            tempx2 = 2.7;
            tempy1 = -1.976;
            tempy2 = -1.971;
        } else if (2.7 < 유효수압면적 && 유효수압면적 <= 2.8) {
            tempx1 = 2.7;
            tempx2 = 2.8;
            tempy1 = -1.971;
            tempy2 = -1.966;
        } else if (2.8 < 유효수압면적 && 유효수압면적 <= 2.9) {
            tempx1 = 2.8;
            tempx2 = 2.9;
            tempy1 = -1.966;
            tempy2 = -1.961;
        } else if (2.9 < 유효수압면적 && 유효수압면적 <= 3.0) {
            tempx1 = 2.9;
            tempx2 = 3.0;
            tempy1 = -1.961;
            tempy2 = -1.957;
        } else if (3.0 < 유효수압면적 && 유효수압면적 <= 3.1) {
            tempx1 = 3.0;
            tempx2 = 3.1;
            tempy1 = -1.957;
            tempy2 = -1.953;
        } else if (3.1 < 유효수압면적 && 유효수압면적 <= 3.2) {
            tempx1 = 3.1;
            tempx2 = 3.2;
            tempy1 = -1.953;
            tempy2 = -1.948;
        } else if (3.2 < 유효수압면적 && 유효수압면적 <= 3.3) {
            tempx1 = 3.2;
            tempx2 = 3.3;
            tempy1 = -1.948;
            tempy2 = -1.944;
        } else if (3.3 < 유효수압면적 && 유효수압면적 <= 3.4) {
            tempx1 = 3.3;
            tempx2 = 3.4;
            tempy1 = -1.944;
            tempy2 = -1.941;
        } else if (3.4 < 유효수압면적 && 유효수압면적 <= 3.5) {
            tempx1 = 3.4;
            tempx2 = 3.5;
            tempy1 = -1.941;
            tempy2 = -1.937;
        } else if (3.5 < 유효수압면적 && 유효수압면적 <= 3.6) {
            tempx1 = 3.5;
            tempx2 = 3.6;
            tempy1 = -1.937;
            tempy2 = -1.933;
        } else if (3.6 < 유효수압면적 && 유효수압면적 <= 3.7) {
            tempx1 = 3.6;
            tempx2 = 3.7;
            tempy1 = -1.933;
            tempy2 = -1.93;
        } else if (3.7 < 유효수압면적 && 유효수압면적 <= 3.8) {
            tempx1 = 3.7;
            tempx2 = 3.8;
            tempy1 = -1.93;
            tempy2 = -1.926;
        } else if (3.8 < 유효수압면적 && 유효수압면적 <= 3.9) {
            tempx1 = 3.8;
            tempx2 = 3.9;
            tempy1 = -1.926;
            tempy2 = -1.923;
        } else if (3.9 < 유효수압면적 && 유효수압면적 <= 4.0) {
            tempx1 = 3.9;
            tempx2 = 4.0;
            tempy1 = -1.923;
            tempy2 = -1.919;
        } else if (4.0 < 유효수압면적 && 유효수압면적 <= 4.5) {
            tempx1 = 4.0;
            tempx2 = 4.5;
            tempy1 = -1.919;
            tempy2 = -1.904;
        } else if (4.5 < 유효수압면적 && 유효수압면적 <= 5.0) {
            tempx1 = 4.5;
            tempx2 = 5.0;
            tempy1 = -1.904;
            tempy2 = -1.89;
        } else if (5.0 < 유효수압면적 && 유효수압면적 <= 5.5) {
            tempx1 = 5.0;
            tempx2 = 5.5;
            tempy1 = -1.89;
            tempy2 = -1.878;
        } else if (5.5 < 유효수압면적 && 유효수압면적 <= 6.0) {
            tempx1 = 5.5;
            tempx2 = 6.0;
            tempy1 = -1.878;
            tempy2 = -1.867;
        } else if (6.0 < 유효수압면적 && 유효수압면적 <= 6.5) {
            tempx1 = 6.0;
            tempx2 = 6.5;
            tempy1 = -1.867;
            tempy2 = -1.856;
        } else if (6.5 < 유효수압면적 && 유효수압면적 <= 7.0) {
            tempx1 = 6.5;
            tempx2 = 7.0;
            tempy1 = -1.856;
            tempy2 = -1.846;
        } else if (7.0 < 유효수압면적 && 유효수압면적 <= 7.5) {
            tempx1 = 7.0;
            tempx2 = 7.5;
            tempy1 = -1.846;
            tempy2 = -1.837;
        } else if (7.5 < 유효수압면적 && 유효수압면적 <= 8.0) {
            tempx1 = 7.5;
            tempx2 = 8.0;
            tempy1 = -1.837;
            tempy2 = -1.829;
        } else if (8.0 < 유효수압면적 && 유효수압면적 <= 8.5) {
            tempx1 = 8.0;
            tempx2 = 8.5;
            tempy1 = -1.829;
            tempy2 = -1.821;
        } else if (8.5 < 유효수압면적 && 유효수압면적 <= 9.0) {
            tempx1 = 8.5;
            tempx2 = 9.0;
            tempy1 = -1.821;
            tempy2 = -1.814;
        } else if (9.0 < 유효수압면적 && 유효수압면적 <= 9.5) {
            tempx1 = 9.0;
            tempx2 = 9.5;
            tempy1 = -1.814;
            tempy2 = -1.807;
        } else if (9.5 < 유효수압면적 && 유효수압면적 <= 10) {
            tempx1 = 9.5;
            tempx2 = 10.0;
            tempy1 = -1.807;
            tempy2 = -1.8;
        }

        if (유효수압면적 <= 1) {
            GCpe_Mi_value = -2.1;
        } else if (유효수압면적 > 10) {
            GCpe_Mi_value = -1.8;
        } else {
            tempa = (tempy2 - tempy1) / (tempx2 - tempx1);
            tempb = tempy1 - (tempx1 * tempa);
            GCpe_Mi_value = 유효수압면적 * tempa + tempb;
        }
    }

    //강도 하중조합(X방향)
    public void Cal_x_Loadcombi() {
        wx1_Value = 1.0 * 고정하중 * Math.cos(Math.PI / 180 * 각도);
        wx2_Value = (0.75 * 고정하중 + 0.75 * 설하중) * Math.cos(Math.PI / 180 * 각도);
        wx3_Value = 0.75 * 고정하중 * Math.cos(Math.PI / 180 * 각도) + 0.75 * 풍하중_정;
        wx4_Value = 0.75 * 고정하중 * Math.cos(Math.PI / 180 * 각도) + 0.75 * 풍하중_부;
    }

    //강도 하중조합(Y방향)
    public void Cal_y_Loadcombi() {
        wy1_Value = 1.0 * 고정하중 * Math.sin(Math.PI / 180 * 각도);
        wy2_Value = (0.75 * 고정하중 + 0.75 * 설하중) * Math.sin(Math.PI / 180 * 각도);
        wy3_Value = 0.75 * 고정하중 * Math.sin(Math.PI / 180 * 각도); //+ 0.75 * 풍하중_정;
        wy4_Value = 0.75 * 고정하중 * Math.sin(Math.PI / 180 * 각도); //+ 0.75 * 풍하중_부;
    }

    //사용 하중조합(X방향)
    public void Cal_x_sur_Loadcombi() {
        wxs1_Value = (1.0 * 고정하중 + 1.0 * 설하중) * Math.cos(Math.PI / 180 * 각도);
        wxs2_Value = (1.0 * 고정하중) * Math.cos(Math.PI / 180 * 각도) + 풍하중_정;
        wxs3_Value = (1.0 * 고정하중) * Math.cos(Math.PI / 180 * 각도) + 풍하중_부;
    }

    //사용 하중조합(Y방향)
    public void Cal_y_sur_Loadcombi() {
        wys1_Value = (1.0 * 고정하중 + 1.0 * 설하중) * Math.sin(Math.PI / 180 * 각도);
        wys2_Value = (1.0 * 고정하중) * Math.sin(Math.PI / 180 * 각도);// '+ 풍하중_정
        wys3_Value = (1.0 * 고정하중) * Math.sin(Math.PI / 180 * 각도);// ' + 풍하중_부
    }

    //설계강도 산정
    public void cal_Mu_Vu_value() {
        Mux1_value = (wx1_Value * Math.pow((경간 / 1000), 2)) / 8;
        Mux2_value = (wx2_Value * Math.pow((경간 / 1000), 2)) / 8;
        Mux3_value = (wx3_Value * Math.pow((경간 / 1000), 2)) / 8;
        Mux4_value = (wx4_Value * Math.pow((경간 / 1000), 2)) / 8;

        Muy1_value = (wy1_Value * Math.pow((경간 / 1000), 2)) / 8;
        Muy2_value = (wy2_Value * Math.pow((경간 / 1000), 2)) / 8;
        Muy3_value = (wy3_Value * Math.pow((경간 / 1000), 2)) / 8;
        Muy4_value = (wy4_Value * Math.pow((경간 / 1000), 2)) / 8;


        Mu_value = Math.max(Math.abs(Mux1_value), Math.abs(Mux2_value));
        Mu_value = Math.max(Mu_value, Math.abs(Mux3_value));
        Mu_value = Math.max(Mu_value, Math.abs(Mux4_value));
        Mu_value = Mu_value * 1000000;

        Minor_Mu_value = Math.max(Math.abs(Muy1_value), Math.abs(Muy2_value));
        Minor_Mu_value = Math.max(Minor_Mu_value, Math.abs(Muy3_value));
        Minor_Mu_value = Math.max(Minor_Mu_value, Math.abs(Muy4_value));
        Minor_Mu_value = Minor_Mu_value * 1000000;


        Vuy1_value = (wx1_Value * (경간 / 1000)) / 2;
        Vuy2_value = (wx2_Value * (경간 / 1000)) / 2;
        Vuy3_value = (wx3_Value * (경간 / 1000)) / 2;
        Vuy4_value = (wx4_Value * (경간 / 1000)) / 2;

        Vux1_value = (wy1_Value * (경간 / 1000)) / 2;
        Vux2_value = (wy2_Value * (경간 / 1000)) / 2;
        Vux3_value = (wy3_Value * (경간 / 1000)) / 2;
        Vux4_value = (wy4_Value * (경간 / 1000)) / 2;


        vuy_value = Math.max(Vuy1_value, Vuy2_value);
        vuy_value = Math.max(vuy_value, Vuy3_value);
        vuy_value = Math.max(vuy_value, Vuy4_value);
        vuy_value = vuy_value * 1000;


        vux_value = Math.max(Vux1_value, Vux2_value);
        vux_value = Math.max(vux_value, Vux3_value);
        vux_value = Math.max(vux_value, Vux4_value);
        vux_value = vux_value * 1000;


        //'부재 X축에 대한 전단강도계산
        //'Public  = 243.1
        //''부재 Y축에 대한 전단강도계산
        //'Public  = 908
    }


    public void deleteSpaceinstrigarr(String[] stringarr) {
        for (int k = 0; k < stringarr.length; k++)
            stringarr[k] = stringarr[k].trim();
    }


}

