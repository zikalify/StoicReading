package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Call each activity when click corresponding button
        button = (Button) findViewById(R.id.rufus_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rufusHome();
            }
        });

        button = (Button) findViewById(R.id.epictetus_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                epictetusHome();
            }
        });

        button = (Button) findViewById(R.id.hierocles_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hieroclesHome();
            }
        });

        button = (Button) findViewById(R.id.seneca_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                senecaHome();
            }
        });

        button = (Button) findViewById(R.id.aurelius_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aureliusHome();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void rufusHome() {
        Intent intent = new Intent(this, RufusHome.class);
        startActivity(intent);
    }

    public void epictetusHome() {
        Intent intent = new Intent(this, EpictetusHome.class);
        startActivity(intent);
    }

    public void hieroclesHome() {
        Intent intent = new Intent(this, HieroclesHome.class);
        startActivity(intent);
    }

    public void aureliusHome() {
        Intent intent = new Intent(this, AureliusHome.class);
        startActivity(intent);
    }

    public void senecaHome() {
        Intent intent = new Intent(this, SenecaHome.class);
        startActivity(intent);
    }
}
