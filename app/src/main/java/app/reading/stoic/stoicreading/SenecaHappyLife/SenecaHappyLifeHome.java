package app.reading.stoic.stoicreading.SenecaHappyLife;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class SenecaHappyLifeHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_happy_life_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaHappyLifeTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.HappyLife_1);
        button.setOnClickListener(v -> HappyLife_1());

        button = findViewById(R.id.HappyLife_2);
        button.setOnClickListener(v -> HappyLife_2());

        button = findViewById(R.id.HappyLife_3);
        button.setOnClickListener(v -> HappyLife_3());

        button = findViewById(R.id.HappyLife_4);
        button.setOnClickListener(v -> HappyLife_4());

        button = findViewById(R.id.HappyLife_5);
        button.setOnClickListener(v -> HappyLife_5());

        button = findViewById(R.id.HappyLife_6);
        button.setOnClickListener(v -> HappyLife_6());

        button = findViewById(R.id.HappyLife_7);
        button.setOnClickListener(v -> HappyLife_7());

        button = findViewById(R.id.HappyLife_8);
        button.setOnClickListener(v -> HappyLife_8());

        button = findViewById(R.id.HappyLife_9);
        button.setOnClickListener(v -> HappyLife_9());

        button = findViewById(R.id.HappyLife_10);
        button.setOnClickListener(v -> HappyLife_10());

        button = findViewById(R.id.HappyLife_11);
        button.setOnClickListener(v -> HappyLife_11());

        button = findViewById(R.id.HappyLife_12);
        button.setOnClickListener(v -> HappyLife_12());

        button = findViewById(R.id.HappyLife_13);
        button.setOnClickListener(v -> HappyLife_13());

        button = findViewById(R.id.HappyLife_14);
        button.setOnClickListener(v -> HappyLife_14());

        button = findViewById(R.id.HappyLife_15);
        button.setOnClickListener(v -> HappyLife_15());

        button = findViewById(R.id.HappyLife_16);
        button.setOnClickListener(v -> HappyLife_16());

        button = findViewById(R.id.HappyLife_17);
        button.setOnClickListener(v -> HappyLife_17());

        button = findViewById(R.id.HappyLife_18);
        button.setOnClickListener(v -> HappyLife_18());

        button = findViewById(R.id.HappyLife_19);
        button.setOnClickListener(v -> HappyLife_19());

        button = findViewById(R.id.HappyLife_20);
        button.setOnClickListener(v -> HappyLife_20());

        button = findViewById(R.id.HappyLife_21);
        button.setOnClickListener(v -> HappyLife_21());

        button = findViewById(R.id.HappyLife_22);
        button.setOnClickListener(v -> HappyLife_22());

        button = findViewById(R.id.HappyLife_23);
        button.setOnClickListener(v -> HappyLife_23());

        button = findViewById(R.id.HappyLife_24);
        button.setOnClickListener(v -> HappyLife_24());

        button = findViewById(R.id.HappyLife_25);
        button.setOnClickListener(v -> HappyLife_25());

        button = findViewById(R.id.HappyLife_26);
        button.setOnClickListener(v -> HappyLife_26());

        button = findViewById(R.id.HappyLife_27);
        button.setOnClickListener(v -> HappyLife_27());

        button = findViewById(R.id.HappyLife_28);
        button.setOnClickListener(v -> HappyLife_28());
    }

    //Activity call methods, called by buttons above
    public void HappyLife_1() {
        Intent intent = new Intent(this, SenecaHappyLife_1.class);
        startActivity(intent);
    }

    public void HappyLife_2() {
        Intent intent = new Intent(this, SenecaHappyLife_2.class);
        startActivity(intent);
    }

    public void HappyLife_3() {
        Intent intent = new Intent(this, SenecaHappyLife_3.class);
        startActivity(intent);
    }

    public void HappyLife_4() {
        Intent intent = new Intent(this, SenecaHappyLife_4.class);
        startActivity(intent);
    }

    public void HappyLife_5() {
        Intent intent = new Intent(this, SenecaHappyLife_5.class);
        startActivity(intent);
    }

    public void HappyLife_6() {
        Intent intent = new Intent(this, SenecaHappyLife_6.class);
        startActivity(intent);
    }

    public void HappyLife_7() {
        Intent intent = new Intent(this, SenecaHappyLife_7.class);
        startActivity(intent);
    }

    public void HappyLife_8() {
        Intent intent = new Intent(this, SenecaHappyLife_8.class);
        startActivity(intent);
    }

    public void HappyLife_9() {
        Intent intent = new Intent(this, SenecaHappyLife_9.class);
        startActivity(intent);
    }

    public void HappyLife_10() {
        Intent intent = new Intent(this, SenecaHappyLife_10.class);
        startActivity(intent);
    }

    public void HappyLife_11() {
        Intent intent = new Intent(this, SenecaHappyLife_11.class);
        startActivity(intent);
    }

    public void HappyLife_12() {
        Intent intent = new Intent(this, SenecaHappyLife_12.class);
        startActivity(intent);
    }

    public void HappyLife_13() {
        Intent intent = new Intent(this, SenecaHappyLife_13.class);
        startActivity(intent);
    }

    public void HappyLife_14() {
        Intent intent = new Intent(this, SenecaHappyLife_14.class);
        startActivity(intent);
    }

    public void HappyLife_15() {
        Intent intent = new Intent(this, SenecaHappyLife_15.class);
        startActivity(intent);
    }

    public void HappyLife_16() {
        Intent intent = new Intent(this, SenecaHappyLife_16.class);
        startActivity(intent);
    }

    public void HappyLife_17() {
        Intent intent = new Intent(this, SenecaHappyLife_17.class);
        startActivity(intent);
    }

    public void HappyLife_18() {
        Intent intent = new Intent(this, SenecaHappyLife_18.class);
        startActivity(intent);
    }

    public void HappyLife_19() {
        Intent intent = new Intent(this, SenecaHappyLife_19.class);
        startActivity(intent);
    }

    public void HappyLife_20() {
        Intent intent = new Intent(this, SenecaHappyLife_20.class);
        startActivity(intent);
    }

    public void HappyLife_21() {
        Intent intent = new Intent(this, SenecaHappyLife_21.class);
        startActivity(intent);
    }

    public void HappyLife_22() {
        Intent intent = new Intent(this, SenecaHappyLife_22.class);
        startActivity(intent);
    }

    public void HappyLife_23() {
        Intent intent = new Intent(this, SenecaHappyLife_23.class);
        startActivity(intent);
    }

    public void HappyLife_24() {
        Intent intent = new Intent(this, SenecaHappyLife_24.class);
        startActivity(intent);
    }

    public void HappyLife_25() {
        Intent intent = new Intent(this, SenecaHappyLife_25.class);
        startActivity(intent);
    }

    public void HappyLife_26() {
        Intent intent = new Intent(this, SenecaHappyLife_26.class);
        startActivity(intent);
    }

    public void HappyLife_27() {
        Intent intent = new Intent(this, SenecaHappyLife_27.class);
        startActivity(intent);
    }

    public void HappyLife_28() {
        Intent intent = new Intent(this, SenecaHappyLife_28.class);
        startActivity(intent);
    }
}