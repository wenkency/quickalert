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
        final QuickDialog popup = new QuickBuilder(this)
                .setContentView(R.layout.dialog_test)
                .setFullWidth()
                .isSetBackground(false)
                .fromBottom(true)
                .isDimEnabled(false)
                .build();
        // 显示在View的下面，窗口宽居view中间
        popup.setOnClickListener(R.id.v_bg, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup.dismiss();
            }
        });
        // 比较特殊：自己在布局定义模糊背景
        popup.showViewCenter(view, true);
    }

    public void showScreen(View view) {
        final QuickDialog popup = new QuickBuilder(this)
                .setContentView(R.layout.dialog_window)
                .setWidthScale(0.8f)
                .build();
        popup.show();
    }

    public void showView(View view) {
        final QuickDialog popup = new QuickBuilder(this)
                .setContentView(R.layout.dialog_window)
                .setWidthScale(0.5f)
                .fromBottom(true)
                .isDimEnabled(false)
                .build();
        popup.showViewCenter(view);
    }

    public void showViewDown(View view) {
        final QuickDialog popup = new QuickBuilder(this)
                .setContentView(R.layout.dialog_window)
                .setWidthScale(0.5f)
                .fromBottom(true)
                .isDimEnabled(false)
                .build();
        popup.show(view);
    }

}
