package com.ipilsolar.ipilstructure;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.journeyapps.barcodescanner.CaptureActivity;

public class ScanQR extends AppCompatActivity {

    WebView wv;
    EditText et;
    Button bt;
    IntentIntegrator integrator;

    @Override public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(ScanQR.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qr);
        et = findViewById(R.id.et);
        wv = findViewById(R.id.wv);

        bt = findViewById(R.id.bt);
        WebSettings webSettings = wv.getSettings();

        webSettings.setJavaScriptEnabled(true);

        wv.setWebViewClient(new WebViewClient(){
            @Override public void onPageFinished(WebView view,String url) {
                Toast.makeText(ScanQR.this,"스캔 완료", Toast.LENGTH_SHORT).show();
            }
        });

        et.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId == EditorInfo.IME_ACTION_SEARCH){
                    bt.callOnClick();
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

                    imm.hideSoftInputFromWindow(v.getWindowToken(),0);
                    return true;
                }
                return false;
            }
        });

        integrator = new IntentIntegrator(this);

        integrator.setPrompt("Ipil 구조계산서 표지의 바코드를 사각형 안에 비춰주세요");
        integrator.setBeepEnabled(false);
        integrator.setBarcodeImageEnabled(true);
        integrator.setCaptureActivity(CaptureActivity.class);

        integrator.initiateScan();
    }

    public void onClick(View view) {
        String address = et.getText().toString();

        if(!address.startsWith("http://")&&!address.startsWith("https://")) {
            address = "https://" + address;
        }

        wv.loadUrl(address);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);

        if(result != null){
            if(result.getContents() == null){
                Intent intent = new Intent(ScanQR.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }else{

                et.setText(result.getContents());

                bt.callOnClick();
            }
        }else{
            super.onActivityResult(requestCode, resultCode, data); }
    }
}