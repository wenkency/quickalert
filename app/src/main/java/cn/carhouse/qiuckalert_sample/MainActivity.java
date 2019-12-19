package cn.carhouse.qiuckalert_sample;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import cn.carhouse.alert.QuickBuilder;
import cn.carhouse.alert.QuickDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void show(View view) {
        QuickDialog popup = new QuickBuilder(this)
                .setContentView(R.layout.dialog_test)
                .setWidthScale(0.5f)
                .fromBottom(true)
                .build();
        // 显示在View的下面
        // popup.show(view);
        // 显示在View的下面，窗口宽居屏幕中间
        // popup.showWindowCenter(view);
        // 显示在View的下面，窗口宽居view中间
        popup.showViewCenter(view,20);
    }
}
