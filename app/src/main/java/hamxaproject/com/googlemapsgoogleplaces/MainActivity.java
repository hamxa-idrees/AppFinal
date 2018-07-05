package hamxaproject.com.googlemapsgoogleplaces;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=4000;
    SharedPreferences sp;

    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Arkhip_font.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
        setContentView(R.layout.activity_main);
        sp=getSharedPreferences("login",MODE_PRIVATE);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                if(sp.contains("username")){
                    startActivity(new Intent(MainActivity.this,LocationActivity.class));
                    finish();   //finish current activity
                }
                else {
                    Intent intent = new Intent(MainActivity.this, PhoneLogin.class);
                    startActivity(intent);
                    finish();
                }
            }
        },SPLASH_TIME_OUT);

    }
}
