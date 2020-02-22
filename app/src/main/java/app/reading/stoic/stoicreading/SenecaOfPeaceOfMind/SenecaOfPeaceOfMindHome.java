package app.reading.stoic.stoicreading.SenecaOfPeaceOfMind;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class SenecaOfPeaceOfMindHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_of_peace_of_mind_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaOfPeaceOfMindTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.OfPeaceOfMind_1);
        button.setOnClickListener(v -> OfPeaceOfMind_1());

        button = findViewById(R.id.OfPeaceOfMind_2);
        button.setOnClickListener(v -> OfPeaceOfMind_2());

        button = findViewById(R.id.OfPeaceOfMind_3);
        button.setOnClickListener(v -> OfPeaceOfMind_3());

        button = findViewById(R.id.OfPeaceOfMind_4);
        button.setOnClickListener(v -> OfPeaceOfMind_4());

        button = findViewById(R.id.OfPeaceOfMind_5);
        button.setOnClickListener(v -> OfPeaceOfMind_5());

        button = findViewById(R.id.OfPeaceOfMind_6);
        button.setOnClickListener(v -> OfPeaceOfMind_6());

        button = findViewById(R.id.OfPeaceOfMind_7);
        button.setOnClickListener(v -> OfPeaceOfMind_7());

        button = findViewById(R.id.OfPeaceOfMind_8);
        button.setOnClickListener(v -> OfPeaceOfMind_8());

        button = findViewById(R.id.OfPeaceOfMind_9);
        button.setOnClickListener(v -> OfPeaceOfMind_9());

        button = findViewById(R.id.OfPeaceOfMind_10);
        button.setOnClickListener(v -> OfPeaceOfMind_10());

        button = findViewById(R.id.OfPeaceOfMind_11);
        button.setOnClickListener(v -> OfPeaceOfMind_11());

        button = findViewById(R.id.OfPeaceOfMind_12);
        button.setOnClickListener(v -> OfPeaceOfMind_12());

        button = findViewById(R.id.OfPeaceOfMind_13);
        button.setOnClickListener(v -> OfPeaceOfMind_13());

        button = findViewById(R.id.OfPeaceOfMind_14);
        button.setOnClickListener(v -> OfPeaceOfMind_14());

        button = findViewById(R.id.OfPeaceOfMind_15);
        button.setOnClickListener(v -> OfPeaceOfMind_15());

        button = findViewById(R.id.OfPeaceOfMind_16);
        button.setOnClickListener(v -> OfPeaceOfMind_16());

        button = findViewById(R.id.OfPeaceOfMind_17);
        button.setOnClickListener(v -> OfPeaceOfMind_17());
    }

    //Activity call methods, called by buttons above
    public void OfPeaceOfMind_1() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_1.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_2() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_2.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_3() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_3.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_4() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_4.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_5() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_5.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_6() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_6.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_7() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_7.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_8() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_8.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_9() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_9.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_10() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_10.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_11() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_11.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_12() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_12.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_13() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_13.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_14() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_14.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_15() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_15.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_16() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_16.class);
        startActivity(intent);
    }

    public void OfPeaceOfMind_17() {
        Intent intent = new Intent(this, SenecaOfPeaceOfMind_17.class);
        startActivity(intent);
    }

}