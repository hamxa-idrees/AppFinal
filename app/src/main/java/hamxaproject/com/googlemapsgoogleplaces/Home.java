package hamxaproject.com.googlemapsgoogleplaces;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Home extends AppCompatActivity {

    private Button Electrician,Plumber,Painter,Welder,ComputerTechnicion;
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
        setContentView(R.layout.activity_home);
        Electrician=(Button)findViewById(R.id.btnElectricion);
        Plumber=(Button)findViewById(R.id.btnPlumber);
        Painter=(Button)findViewById(R.id.btnPainter);
        Welder=(Button)findViewById(R.id.btnWeldor);
        ComputerTechnicion=(Button)findViewById(R.id.btnComputer);


        Electrician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this, Electrician.class);
                startActivity(intent);
                finish();
            }
        });

        Painter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this, Painter.class);
                startActivity(intent);
                finish();
            }
        });

        Plumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this, Plumber.class);
                startActivity(intent);
                finish();
            }
        });

        ComputerTechnicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this, ComputerTecnicion.class);
                startActivity(intent);
                finish();
            }
        });

        Welder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this, Welder.class);
                startActivity(intent);
                finish();
            }
        });






    }
}
