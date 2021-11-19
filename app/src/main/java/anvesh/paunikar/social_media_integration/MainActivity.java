package anvesh.paunikar.social_media_integration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button flogin;
     Button gsignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flogin = findViewById(R.id.flogin);
        gsignin = findViewById(R.id.gsignin);

        flogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), facebooklogin.class);
                startActivity(intent1);
            }
        });

        gsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), googlelogin.class);
                startActivity(intent2);
            }
        });
    }


}