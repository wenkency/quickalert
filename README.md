# QuickDialog、QuickPopup
快速构建Dialog和PopupWindow。

### 引入

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}


implementation 'com.github.wenkency:quickalert:1.1.0'

```

### 使用方式
```
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
        popup.showViewCenter(view);

```

### 运行结果

![](screenshot/image.jpg)