package app.reading.stoic.stoicreading.SenecaOfLeisure;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class SenecaOfLeisureHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_of_leisure_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaOfLeisureTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.OfLeisure_1);
        button.setOnClickListener(v -> OfLeisure_1());

        button = findViewById(R.id.OfLeisure_2);
        button.setOnClickListener(v -> OfLeisure_2());

        button = findViewById(R.id.OfLeisure_3);
        button.setOnClickListener(v -> OfLeisure_3());

        button = findViewById(R.id.OfLeisure_4);
        button.setOnClickListener(v -> OfLeisure_4());

        button = findViewById(R.id.OfLeisure_5);
        button.setOnClickListener(v -> OfLeisure_5());

        button = findViewById(R.id.OfLeisure_6);
        button.setOnClickListener(v -> OfLeisure_6());

        button = findViewById(R.id.OfLeisure_7);
        button.setOnClickListener(v -> OfLeisure_7());

        button = findViewById(R.id.OfLeisure_8);
        button.setOnClickListener(v -> OfLeisure_8());
    }

    //Activity call methods, called by buttons above
    public void OfLeisure_1() {
        Intent intent = new Intent(this, SenecaOfLeisure_1.class);
        startActivity(intent);
    }

    public void OfLeisure_2() {
        Intent intent = new Intent(this, SenecaOfLeisure_2.class);
        startActivity(intent);
    }

    public void OfLeisure_3() {
        Intent intent = new Intent(this, SenecaOfLeisure_3.class);
        startActivity(intent);
    }

    public void OfLeisure_4() {
        Intent intent = new Intent(this, SenecaOfLeisure_4.class);
        startActivity(intent);
    }

    public void OfLeisure_5() {
        Intent intent = new Intent(this, SenecaOfLeisure_5.class);
        startActivity(intent);
    }

    public void OfLeisure_6() {
        Intent intent = new Intent(this, SenecaOfLeisure_6.class);
        startActivity(intent);
    }

    public void OfLeisure_7() {
        Intent intent = new Intent(this, SenecaOfLeisure_7.class);
        startActivity(intent);
    }

    public void OfLeisure_8() {
        Intent intent = new Intent(this, SenecaOfLeisure_8.class);
        startActivity(intent);
    }

}