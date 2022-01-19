package com.ipilsolar.ipilstructure;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class PopupActivity extends Activity implements
        OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_popup);

        setContent();
    }

    private void setContent() {
        Button mConfirm = findViewById(R.id.btnConfirm);

        mConfirm.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.btnConfirm) {
            this.finish();
        }
    }
}