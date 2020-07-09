package com.example.p_nestedscrollview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    NestedScrollView nestedScrollView;
    Button btnGoTop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        nestedScrollView = findViewById(R.id.nestedScrollView);
        btnGoTop = findViewById(R.id.btnToTop);
        btnGoTop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnToTop:
                nestedScrollView.smoothScrollTo(0,0);
                break;
        }
    }
}
