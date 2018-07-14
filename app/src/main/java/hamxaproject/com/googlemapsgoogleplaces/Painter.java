package hamxaproject.com.googlemapsgoogleplaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Painter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painter);
    }
    @Override
    public void onBackPressed() {
        Intent intent= new Intent(Painter.this, Home.class);
        startActivity(intent);
        finish();
        super.onBackPressed();
    }
}
