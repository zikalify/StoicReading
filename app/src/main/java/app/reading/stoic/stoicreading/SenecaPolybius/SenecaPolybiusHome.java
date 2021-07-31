package app.reading.stoic.stoicreading.SenecaPolybius;

import androidx.appcompat.app.AppCompatActivity;
import app.reading.stoic.stoicreading.R;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class SenecaPolybiusHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_polybius_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaPolybiusTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.Polybius1);
        button.setOnClickListener(v -> Polybius1());

        button = findViewById(R.id.Polybius2);
        button.setOnClickListener(v -> Polybius2());

        button = findViewById(R.id.Polybius3);
        button.setOnClickListener(v -> Polybius3());

        button = findViewById(R.id.Polybius4);
        button.setOnClickListener(v -> Polybius4());

        button = findViewById(R.id.Polybius5);
        button.setOnClickListener(v -> Polybius5());

        button = findViewById(R.id.Polybius6);
        button.setOnClickListener(v -> Polybius6());

        button = findViewById(R.id.Polybius7);
        button.setOnClickListener(v -> Polybius7());

        button = findViewById(R.id.Polybius8);
        button.setOnClickListener(v -> Polybius8());

        button = findViewById(R.id.Polybius9);
        button.setOnClickListener(v -> Polybius9());

        button = findViewById(R.id.Polybius10);
        button.setOnClickListener(v -> Polybius10());

        button = findViewById(R.id.Polybius11);
        button.setOnClickListener(v -> Polybius11());

        button = findViewById(R.id.Polybius12);
        button.setOnClickListener(v -> Polybius12());

        button = findViewById(R.id.Polybius13);
        button.setOnClickListener(v -> Polybius13());

        button = findViewById(R.id.Polybius14);
        button.setOnClickListener(v -> Polybius14());

        button = findViewById(R.id.Polybius15);
        button.setOnClickListener(v -> Polybius15());

        button = findViewById(R.id.Polybius16);
        button.setOnClickListener(v -> Polybius16());

        button = findViewById(R.id.Polybius17);
        button.setOnClickListener(v -> Polybius17());

        button = findViewById(R.id.Polybius18);
        button.setOnClickListener(v -> Polybius18());
    }

    //Activity call methods, called by buttons above
    public void Polybius1() {
        Intent intent = new Intent(this, SenecaPolybius1.class);
        startActivity(intent);
    }

    public void Polybius2() {
        Intent intent = new Intent(this, SenecaPolybius2.class);
        startActivity(intent);
    }

    public void Polybius3() {
        Intent intent = new Intent(this, SenecaPolybius3.class);
        startActivity(intent);
    }

    public void Polybius4() {
        Intent intent = new Intent(this, SenecaPolybius4.class);
        startActivity(intent);
    }

    public void Polybius5() {
        Intent intent = new Intent(this, SenecaPolybius5.class);
        startActivity(intent);
    }

    public void Polybius6() {
        Intent intent = new Intent(this, SenecaPolybius6.class);
        startActivity(intent);
    }

    public void Polybius7() {
        Intent intent = new Intent(this, SenecaPolybius7.class);
        startActivity(intent);
    }

    public void Polybius8() {
        Intent intent = new Intent(this, SenecaPolybius8.class);
        startActivity(intent);
    }

    public void Polybius9() {
        Intent intent = new Intent(this, SenecaPolybius9.class);
        startActivity(intent);
    }

    public void Polybius10() {
        Intent intent = new Intent(this, SenecaPolybius10.class);
        startActivity(intent);
    }

    public void Polybius11() {
        Intent intent = new Intent(this, SenecaPolybius11.class);
        startActivity(intent);
    }

    public void Polybius12() {
        Intent intent = new Intent(this, SenecaPolybius12.class);
        startActivity(intent);
    }

    public void Polybius13() {
        Intent intent = new Intent(this, SenecaPolybius13.class);
        startActivity(intent);
    }

    public void Polybius14() {
        Intent intent = new Intent(this, SenecaPolybius14.class);
        startActivity(intent);
    }

    public void Polybius15() {
        Intent intent = new Intent(this, SenecaPolybius15.class);
        startActivity(intent);
    }

    public void Polybius16() {
        Intent intent = new Intent(this, SenecaPolybius16.class);
        startActivity(intent);
    }

    public void Polybius17() {
        Intent intent = new Intent(this, SenecaPolybius17.class);
        startActivity(intent);
    }

    public void Polybius18() {
        Intent intent = new Intent(this, SenecaPolybius18.class);
        startActivity(intent);
    }
}