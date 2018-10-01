package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private static final String PREFS_NAME = "prefs";
    private static final String PREF_DARK_THEME = "dark_theme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        boolean useDarkTheme = preferences.getBoolean(PREF_DARK_THEME, false);

        if (useDarkTheme) {
            setTheme(R.style.AppThemeDark);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch toggle = findViewById(R.id.toggle_dark_theme);
        toggle.setChecked(useDarkTheme);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean isChecked) {
                toggleTheme(isChecked);
            }
        });

        //Call each activity when click corresponding button
        button = findViewById(R.id.rufus_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rufusHome();
            }
        });

        button = findViewById(R.id.epictetus_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                epictetusHome();
            }
        });

        button = findViewById(R.id.hierocles_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hieroclesHome();
            }
        });

        button = findViewById(R.id.seneca_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                senecaHome();
            }
        });

        button = findViewById(R.id.aurelius_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aureliusHome();
            }
        });

        button = findViewById(R.id.zeno_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zenoHome();
            }
        });

        button = findViewById(R.id.cleanthes_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanthesHome();
            }
        });

        button = findViewById(R.id.chrysippus_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chrysippusHome();
            }
        });

        button = findViewById(R.id.zenodotus_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zenodotusHome();
            }
        });

        button = findViewById(R.id.aratus_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aratusHome();
            }
        });

        button = findViewById(R.id.didymus_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didymusHome();
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

    public void zenoHome() {
        Intent intent = new Intent(this, ZenoHome.class);
        startActivity(intent);
    }

    public void cleanthesHome() {
        Intent intent = new Intent(this, CleanthesHome.class);
        startActivity(intent);
    }

    public void chrysippusHome() {
        Intent intent = new Intent(this, ChrysippusHome.class);
        startActivity(intent);
    }

    public void zenodotusHome() {
        Intent intent = new Intent(this, ZenodotusHome.class);
        startActivity(intent);
    }

    public void aratusHome() {
        Intent intent = new Intent(this, AratusHome.class);
        startActivity(intent);
    }

    public void didymusHome() {
        Intent intent = new Intent(this, DidymusHome.class);
        startActivity(intent);
    }

    private void toggleTheme(boolean darkTheme) {
        SharedPreferences.Editor editor = getSharedPreferences(PREFS_NAME, MODE_PRIVATE).edit();
        editor.putBoolean(PREF_DARK_THEME, darkTheme);
        editor.apply();

        Intent intent = getIntent();
        finish();

        startActivity(intent);
    }

}