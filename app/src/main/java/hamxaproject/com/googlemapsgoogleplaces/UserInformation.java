package hamxaproject.com.googlemapsgoogleplaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.google.firebase.database.FirebaseDatabase;

public class UserInformation extends AppCompatActivity {
 private Button Add;
 FirebaseDatabase db;
 DatabaseReference users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);
        Add=(Button)findViewById(R.id.btnadd);

        db = FirebaseDatabase.getInstance();
        users = db.getReference("Users");
         Add.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 RegisterUser();
             }
         });
    }

    private void RegisterUser() {

        final EditText edtEmail=findViewById(R.id.editEmail);
        final EditText edName=findViewById(R.id.edName);
        final EditText edCnic=findViewById(R.id.edtCnic);
        final EditText Address=findViewById(R.id.edAddress);




    }
}
