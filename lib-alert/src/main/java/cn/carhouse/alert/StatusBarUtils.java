package cn.carhouse.alert;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/**
 * StatusBar Utils handle with special FlymeOS4.x/Android4.4.4
 * (状态栏工具,处理魅族FlymeOS4.x/Android4.4.4)
 */
public class StatusBarUtils {
    /**
     * 获取状态栏的高度
     */
    public static int getStatusBarHeight(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        return resources.getDimensionPixelOffset(identifier);
    }


    /**
     * 获取虚拟功能键高度
     */
    public static int getNavBarHeight(Context context) {
        Resources res = context.getResources();
        int resourceId = res.getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId != 0) {
            return res.getDimensionPixelSize(resourceId);
        } else {
            return 0;
        }
    }
}
