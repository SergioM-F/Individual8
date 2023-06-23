package cl.samf.individual8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initlistener();

            }

    private void initlistener() {
        Button irSegundaActivity = findViewById(R.id.irsegundactivity);
        irSegundaActivity.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);

            }
        });
    }
}