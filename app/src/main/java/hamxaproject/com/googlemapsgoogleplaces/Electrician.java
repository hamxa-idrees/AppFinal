package hamxaproject.com.googlemapsgoogleplaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

public class Electrician extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrician);


    }

    @Override
    public void onBackPressed() {
        Intent intent= new Intent(Electrician.this, Home.class);
        startActivity(intent);
        finish();
        super.onBackPressed();
    }
}

