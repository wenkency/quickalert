package cn.carhouse.qiuckalert_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import cn.carhouse.alert.QuickBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void show(View view) {
        new QuickBuilder(this)
                .setContentView(R.layout.dialog_test)
                .fromBottom(true)
                .setFullWidth()
                .show();
    }
}
