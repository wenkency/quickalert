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


implementation 'com.github.wenkency:quickalert:1.0.0'

```

### 使用方式
```
 new QuickBuilder(this)
                .setContentView(R.layout.dialog_test)
                .fromBottom(true)
                .setFullWidth()
                .show();

```

### 运行结果

<img src="screenshot/image.jpg" width="360px"/>