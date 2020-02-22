package app.reading.stoic.stoicreading.SenecaMarcia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class SenecaMarciaHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_marcia_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaMarciaTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.Marcia_1);
        button.setOnClickListener(v -> Marcia_1());

        button = findViewById(R.id.Marcia_2);
        button.setOnClickListener(v -> Marcia_2());

        button = findViewById(R.id.Marcia_3);
        button.setOnClickListener(v -> Marcia_3());

        button = findViewById(R.id.Marcia_4);
        button.setOnClickListener(v -> Marcia_4());

        button = findViewById(R.id.Marcia_5);
        button.setOnClickListener(v -> Marcia_5());

        button = findViewById(R.id.Marcia_6);
        button.setOnClickListener(v -> Marcia_6());

        button = findViewById(R.id.Marcia_7);
        button.setOnClickListener(v -> Marcia_7());

        button = findViewById(R.id.Marcia_8);
        button.setOnClickListener(v -> Marcia_8());

        button = findViewById(R.id.Marcia_9);
        button.setOnClickListener(v -> Marcia_9());

        button = findViewById(R.id.Marcia_10);
        button.setOnClickListener(v -> Marcia_10());

        button = findViewById(R.id.Marcia_11);
        button.setOnClickListener(v -> Marcia_11());

        button = findViewById(R.id.Marcia_12);
        button.setOnClickListener(v -> Marcia_12());

        button = findViewById(R.id.Marcia_13);
        button.setOnClickListener(v -> Marcia_13());

        button = findViewById(R.id.Marcia_14);
        button.setOnClickListener(v -> Marcia_14());

        button = findViewById(R.id.Marcia_15);
        button.setOnClickListener(v -> Marcia_15());

        button = findViewById(R.id.Marcia_16);
        button.setOnClickListener(v -> Marcia_16());

        button = findViewById(R.id.Marcia_17);
        button.setOnClickListener(v -> Marcia_17());

        button = findViewById(R.id.Marcia_18);
        button.setOnClickListener(v -> Marcia_18());

        button = findViewById(R.id.Marcia_19);
        button.setOnClickListener(v -> Marcia_19());

        button = findViewById(R.id.Marcia_20);
        button.setOnClickListener(v -> Marcia_20());

        button = findViewById(R.id.Marcia_21);
        button.setOnClickListener(v -> Marcia_21());

        button = findViewById(R.id.Marcia_22);
        button.setOnClickListener(v -> Marcia_22());

        button = findViewById(R.id.Marcia_23);
        button.setOnClickListener(v -> Marcia_23());

        button = findViewById(R.id.Marcia_24);
        button.setOnClickListener(v -> Marcia_24());

        button = findViewById(R.id.Marcia_25);
        button.setOnClickListener(v -> Marcia_25());

        button = findViewById(R.id.Marcia_26);
        button.setOnClickListener(v -> Marcia_26());
    }

    //Activity call methods, called by buttons above
    public void Marcia_1() {
        Intent intent = new Intent(this, SenecaMarcia_1.class);
        startActivity(intent);
    }

    public void Marcia_2() {
        Intent intent = new Intent(this, SenecaMarcia_2.class);
        startActivity(intent);
    }

    public void Marcia_3() {
        Intent intent = new Intent(this, SenecaMarcia_3.class);
        startActivity(intent);
    }

    public void Marcia_4() {
        Intent intent = new Intent(this, SenecaMarcia_4.class);
        startActivity(intent);
    }

    public void Marcia_5() {
        Intent intent = new Intent(this, SenecaMarcia_5.class);
        startActivity(intent);
    }

    public void Marcia_6() {
        Intent intent = new Intent(this, SenecaMarcia_6.class);
        startActivity(intent);
    }

    public void Marcia_7() {
        Intent intent = new Intent(this, SenecaMarcia_7.class);
        startActivity(intent);
    }

    public void Marcia_8() {
        Intent intent = new Intent(this, SenecaMarcia_8.class);
        startActivity(intent);
    }

    public void Marcia_9() {
        Intent intent = new Intent(this, SenecaMarcia_9.class);
        startActivity(intent);
    }

    public void Marcia_10() {
        Intent intent = new Intent(this, SenecaMarcia_10.class);
        startActivity(intent);
    }

    public void Marcia_11() {
        Intent intent = new Intent(this, SenecaMarcia_11.class);
        startActivity(intent);
    }

    public void Marcia_12() {
        Intent intent = new Intent(this, SenecaMarcia_12.class);
        startActivity(intent);
    }

    public void Marcia_13() {
        Intent intent = new Intent(this, SenecaMarcia_13.class);
        startActivity(intent);
    }

    public void Marcia_14() {
        Intent intent = new Intent(this, SenecaMarcia_14.class);
        startActivity(intent);
    }

    public void Marcia_15() {
        Intent intent = new Intent(this, SenecaMarcia_15.class);
        startActivity(intent);
    }

    public void Marcia_16() {
        Intent intent = new Intent(this, SenecaMarcia_16.class);
        startActivity(intent);
    }

    public void Marcia_17() {
        Intent intent = new Intent(this, SenecaMarcia_17.class);
        startActivity(intent);
    }

    public void Marcia_18() {
        Intent intent = new Intent(this, SenecaMarcia_18.class);
        startActivity(intent);
    }

    public void Marcia_19() {
        Intent intent = new Intent(this, SenecaMarcia_19.class);
        startActivity(intent);
    }

    public void Marcia_20() {
        Intent intent = new Intent(this, SenecaMarcia_20.class);
        startActivity(intent);
    }

    public void Marcia_21() {
        Intent intent = new Intent(this, SenecaMarcia_21.class);
        startActivity(intent);
    }

    public void Marcia_22() {
        Intent intent = new Intent(this, SenecaMarcia_22.class);
        startActivity(intent);
    }

    public void Marcia_23() {
        Intent intent = new Intent(this, SenecaMarcia_23.class);
        startActivity(intent);
    }

    public void Marcia_24() {
        Intent intent = new Intent(this, SenecaMarcia_24.class);
        startActivity(intent);
    }

    public void Marcia_25() {
        Intent intent = new Intent(this, SenecaMarcia_25.class);
        startActivity(intent);
    }

    public void Marcia_26() {
        Intent intent = new Intent(this, SenecaMarcia_26.class);
        startActivity(intent);
    }
}