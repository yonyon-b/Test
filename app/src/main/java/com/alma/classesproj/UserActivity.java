package com.alma.classesproj;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.alma.classesproj.services.DatabaseService;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserActivity extends AppCompatActivity {
    private FirebaseUser user;
    private String uid;
    private TextView userDisplay;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        user = FirebaseAuth.getInstance().getCurrentUser();
        uid = user.getUid();
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users").child(uid);

        userDisplay = findViewById(R.id.tvUser);
        mAuth = FirebaseAuth.getInstance();

        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    String name = snapshot.child("fName").getValue(String.class);
                    userDisplay.setText("Hello " + name);
                    Log.d("USER_NAME", "Name: " + name);
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Log.e("DB_ERROR", error.getMessage());
            }
        });
    }
}