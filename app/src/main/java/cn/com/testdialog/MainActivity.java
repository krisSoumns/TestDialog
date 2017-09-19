package cn.com.testdialog;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.iv);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void click(View view) {
        Toast.makeText(MainActivity.this, "点击了", Toast.LENGTH_SHORT).show();
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this, iv, "iv");
        startActivity(new Intent(MainActivity.this, Main2Activity.class), options.toBundle());
//        startActivityForResult(intent, REQUEST_CODE_COUNTRY, options.toBundle()/*ActivityOptions.makeSceneTransitionAnimation(this).toBundle()*/);
    }
}
