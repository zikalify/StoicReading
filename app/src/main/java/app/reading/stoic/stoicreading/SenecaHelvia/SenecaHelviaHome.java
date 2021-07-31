package app.reading.stoic.stoicreading.SenecaHelvia;

import androidx.appcompat.app.AppCompatActivity;
import app.reading.stoic.stoicreading.R;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class SenecaHelviaHome extends AppCompatActivity {
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
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_seneca_helvia_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaHelviaTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.Helvia1);
        button.setOnClickListener(v -> Helvia1());

        button = findViewById(R.id.Helvia2);
        button.setOnClickListener(v -> Helvia2());

        button = findViewById(R.id.Helvia3);
        button.setOnClickListener(v -> Helvia3());

        button = findViewById(R.id.Helvia4);
        button.setOnClickListener(v -> Helvia4());

        button = findViewById(R.id.Helvia5);
        button.setOnClickListener(v -> Helvia5());

        button = findViewById(R.id.Helvia6);
        button.setOnClickListener(v -> Helvia6());

        button = findViewById(R.id.Helvia7);
        button.setOnClickListener(v -> Helvia7());

        button = findViewById(R.id.Helvia8);
        button.setOnClickListener(v -> Helvia8());

        button = findViewById(R.id.Helvia9);
        button.setOnClickListener(v -> Helvia9());

        button = findViewById(R.id.Helvia10);
        button.setOnClickListener(v -> Helvia10());

        button = findViewById(R.id.Helvia11);
        button.setOnClickListener(v -> Helvia11());

        button = findViewById(R.id.Helvia12);
        button.setOnClickListener(v -> Helvia12());

        button = findViewById(R.id.Helvia13);
        button.setOnClickListener(v -> Helvia13());

        button = findViewById(R.id.Helvia14);
        button.setOnClickListener(v -> Helvia14());

        button = findViewById(R.id.Helvia15);
        button.setOnClickListener(v -> Helvia15());

        button = findViewById(R.id.Helvia16);
        button.setOnClickListener(v -> Helvia16());

        button = findViewById(R.id.Helvia17);
        button.setOnClickListener(v -> Helvia17());

        button = findViewById(R.id.Helvia18);
        button.setOnClickListener(v -> Helvia18());

        button = findViewById(R.id.Helvia19);
        button.setOnClickListener(v -> Helvia19());

        button = findViewById(R.id.Helvia20);
        button.setOnClickListener(v -> Helvia20());
    }

    //Activity call methods, called by buttons above
    public void Helvia1() {
        Intent intent = new Intent(this, SenecaHelvia1.class);
        startActivity(intent);
    }

    public void Helvia2() {
        Intent intent = new Intent(this, SenecaHelvia2.class);
        startActivity(intent);
    }

    public void Helvia3() {
        Intent intent = new Intent(this, SenecaHelvia3.class);
        startActivity(intent);
    }

    public void Helvia4() {
        Intent intent = new Intent(this, SenecaHelvia4.class);
        startActivity(intent);
    }

    public void Helvia5() {
        Intent intent = new Intent(this, SenecaHelvia5.class);
        startActivity(intent);
    }

    public void Helvia6() {
        Intent intent = new Intent(this, SenecaHelvia6.class);
        startActivity(intent);
    }

    public void Helvia7() {
        Intent intent = new Intent(this, SenecaHelvia7.class);
        startActivity(intent);
    }

    public void Helvia8() {
        Intent intent = new Intent(this, SenecaHelvia8.class);
        startActivity(intent);
    }

    public void Helvia9() {
        Intent intent = new Intent(this, SenecaHelvia9.class);
        startActivity(intent);
    }

    public void Helvia10() {
        Intent intent = new Intent(this, SenecaHelvia10.class);
        startActivity(intent);
    }

    public void Helvia11() {
        Intent intent = new Intent(this, SenecaHelvia11.class);
        startActivity(intent);
    }

    public void Helvia12() {
        Intent intent = new Intent(this, SenecaHelvia12.class);
        startActivity(intent);
    }

    public void Helvia13() {
        Intent intent = new Intent(this, SenecaHelvia13.class);
        startActivity(intent);
    }

    public void Helvia14() {
        Intent intent = new Intent(this, SenecaHelvia14.class);
        startActivity(intent);
    }

    public void Helvia15() {
        Intent intent = new Intent(this, SenecaHelvia15.class);
        startActivity(intent);
    }

    public void Helvia16() {
        Intent intent = new Intent(this, SenecaHelvia16.class);
        startActivity(intent);
    }

    public void Helvia17() {
        Intent intent = new Intent(this, SenecaHelvia17.class);
        startActivity(intent);
    }

    public void Helvia18() {
        Intent intent = new Intent(this, SenecaHelvia18.class);
        startActivity(intent);
    }

    public void Helvia19() {
        Intent intent = new Intent(this, SenecaHelvia19.class);
        startActivity(intent);
    }

    public void Helvia20() {
        Intent intent = new Intent(this, SenecaHelvia20.class);
        startActivity(intent);
    }
}