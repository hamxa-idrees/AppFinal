package hamxaproject.com.googlemapsgoogleplaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ComputerTecnicion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_tecnicion);
    }
    @Override
    public void onBackPressed() {
        Intent intent= new Intent(ComputerTecnicion.this, Home.class);
        startActivity(intent);
        finish();
        super.onBackPressed();
    }
}
