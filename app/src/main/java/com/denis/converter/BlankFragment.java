package com.denis.converter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class BlankFragment extends Fragment implements View.OnClickListener {

    EditText edit1;
    Button btnUsdtoUan;
    Button btnEurtoUsd;
    Button btnEurtoUan;
    Button btnUantoEur;
    Button btnUantoUsd;
    Button btnUsdtoEur;
    TextView tvRes;
    Random r = new Random();

    double one;
    final double TWO =1.19;
    final double THREE =33.54;
    final double FOUR =0.03;
    final double FIVE =0.035;
    final double SIX =0.84;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        edit1 = (EditText) view.findViewById(R.id.edit1);
        btnUsdtoUan = (Button) view.findViewById(R.id.btnUsdtoUan);
        btnEurtoUsd = (Button) view.findViewById(R.id.btnEurtoUsd);
        btnEurtoUan = (Button) view.findViewById(R.id.btnEurtoUan);
        btnUantoEur = (Button) view.findViewById(R.id.btnUantoEur);
        btnUantoUsd = (Button) view.findViewById(R.id.btnUantoUsd);
        btnUsdtoEur = (Button) view.findViewById(R.id.btnUsdtoEur);
        tvRes = (TextView) view.findViewById(R.id.tvRes);
        btnUsdtoUan.setOnClickListener(this);
        btnEurtoUsd.setOnClickListener(this);
        btnEurtoUan.setOnClickListener(this);
        btnUantoEur.setOnClickListener(this);
        btnUantoUsd.setOnClickListener(this);
        btnUsdtoEur.setOnClickListener(this);
    one=25 + Math.random()*5;
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnUsdtoUan: {
                try {
                    String s1 = edit1.getText().toString();
                    double res = Double.parseDouble(s1) * one;
                    String s3 = String.format(s1 + " USD to UAH = %.3f", res);
                    tvRes.setText(s3);
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
                break;
            }
            case R.id.btnEurtoUsd: {
                try {
                    String s1 = edit1.getText().toString();
                    double res = Double.parseDouble(s1) * TWO;
                    String s3 = String.format(s1 + " EUR to USD = %.3f", res);
                    tvRes.setText(s3);
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
                break;
            }
            case R.id.btnEurtoUan: {
                try {
                    String s1 = edit1.getText().toString();
                    double res = Double.parseDouble(s1) * THREE;
                    String s3 = String.format(s1 + " EUR to UAN = %.3f", res);
                    tvRes.setText(s3);
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
                break;
            }
            case R.id.btnUantoEur: {
                try {
                    String s1 = edit1.getText().toString();
                    double res = Double.parseDouble(s1) * FOUR;
                    String s3 = String.format(s1 + " UAH to EUR = %.3f", res);
                    tvRes.setText(s3);
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
                break;
            }
            case R.id.btnUantoUsd: {
                try {
                    String s1 = edit1.getText().toString();
                    double res = Double.parseDouble(s1) * FIVE;
                    String s3 = String.format(s1 + " UAH to USD = %.3f", res);
                    tvRes.setText(s3);
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
                break;
            }
            case R.id.btnUsdtoEur: {
                try {
                    String s1 = edit1.getText().toString();
                    double res = Double.parseDouble(s1) * SIX;
                    String s3 = String.format(s1 + " USD to EUR = %.3f", res);
                    tvRes.setText(s3);
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
                break;
            }

        }
    }
}