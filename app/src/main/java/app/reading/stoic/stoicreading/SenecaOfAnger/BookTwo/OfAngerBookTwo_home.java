package app.reading.stoic.stoicreading.SenecaOfAnger.BookTwo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class OfAngerBookTwo_home extends AppCompatActivity {
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
        setContentView(R.layout.activity_of_anger_book_two_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaOfAngerBookTitle2));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.OfAngerBookTwo_1);
        button.setOnClickListener(v -> OfAngerBookTwo_1());

        button = findViewById(R.id.OfAngerBookTwo_2);
        button.setOnClickListener(v -> OfAngerBookTwo_2());

        button = findViewById(R.id.OfAngerBookTwo_3);
        button.setOnClickListener(v -> OfAngerBookTwo_3());

        button = findViewById(R.id.OfAngerBookTwo_4);
        button.setOnClickListener(v -> OfAngerBookTwo_4());

        button = findViewById(R.id.OfAngerBookTwo_5);
        button.setOnClickListener(v -> OfAngerBookTwo_5());

        button = findViewById(R.id.OfAngerBookTwo_6);
        button.setOnClickListener(v -> OfAngerBookTwo_6());

        button = findViewById(R.id.OfAngerBookTwo_7);
        button.setOnClickListener(v -> OfAngerBookTwo_7());

        button = findViewById(R.id.OfAngerBookTwo_8);
        button.setOnClickListener(v -> OfAngerBookTwo_8());

        button = findViewById(R.id.OfAngerBookTwo_9);
        button.setOnClickListener(v -> OfAngerBookTwo_9());

        button = findViewById(R.id.OfAngerBookTwo_10);
        button.setOnClickListener(v -> OfAngerBookTwo_10());

        button = findViewById(R.id.OfAngerBookTwo_11);
        button.setOnClickListener(v -> OfAngerBookTwo_11());

        button = findViewById(R.id.OfAngerBookTwo_12);
        button.setOnClickListener(v -> OfAngerBookTwo_12());

        button = findViewById(R.id.OfAngerBookTwo_13);
        button.setOnClickListener(v -> OfAngerBookTwo_13());

        button = findViewById(R.id.OfAngerBookTwo_14);
        button.setOnClickListener(v -> OfAngerBookTwo_14());

        button = findViewById(R.id.OfAngerBookTwo_15);
        button.setOnClickListener(v -> OfAngerBookTwo_15());

        button = findViewById(R.id.OfAngerBookTwo_16);
        button.setOnClickListener(v -> OfAngerBookTwo_16());

        button = findViewById(R.id.OfAngerBookTwo_17);
        button.setOnClickListener(v -> OfAngerBookTwo_17());

        button = findViewById(R.id.OfAngerBookTwo_18);
        button.setOnClickListener(v -> OfAngerBookTwo_18());

        button = findViewById(R.id.OfAngerBookTwo_19);
        button.setOnClickListener(v -> OfAngerBookTwo_19());

        button = findViewById(R.id.OfAngerBookTwo_20);
        button.setOnClickListener(v -> OfAngerBookTwo_20());

        button = findViewById(R.id.OfAngerBookTwo_21);
        button.setOnClickListener(v -> OfAngerBookTwo_21());

        button = findViewById(R.id.OfAngerBookTwo_22);
        button.setOnClickListener(v -> OfAngerBookTwo_22());

        button = findViewById(R.id.OfAngerBookTwo_23);
        button.setOnClickListener(v -> OfAngerBookTwo_23());

        button = findViewById(R.id.OfAngerBookTwo_24);
        button.setOnClickListener(v -> OfAngerBookTwo_24());

        button = findViewById(R.id.OfAngerBookTwo_25);
        button.setOnClickListener(v -> OfAngerBookTwo_25());

        button = findViewById(R.id.OfAngerBookTwo_26);
        button.setOnClickListener(v -> OfAngerBookTwo_26());

        button = findViewById(R.id.OfAngerBookTwo_27);
        button.setOnClickListener(v -> OfAngerBookTwo_27());

        button = findViewById(R.id.OfAngerBookTwo_28);
        button.setOnClickListener(v -> OfAngerBookTwo_28());

        button = findViewById(R.id.OfAngerBookTwo_29);
        button.setOnClickListener(v -> OfAngerBookTwo_29());

        button = findViewById(R.id.OfAngerBookTwo_30);
        button.setOnClickListener(v -> OfAngerBookTwo_30());

        button = findViewById(R.id.OfAngerBookTwo_31);
        button.setOnClickListener(v -> OfAngerBookTwo_31());

        button = findViewById(R.id.OfAngerBookTwo_32);
        button.setOnClickListener(v -> OfAngerBookTwo_32());

        button = findViewById(R.id.OfAngerBookTwo_33);
        button.setOnClickListener(v -> OfAngerBookTwo_33());

        button = findViewById(R.id.OfAngerBookTwo_34);
        button.setOnClickListener(v -> OfAngerBookTwo_34());

        button = findViewById(R.id.OfAngerBookTwo_35);
        button.setOnClickListener(v -> OfAngerBookTwo_35());

        button = findViewById(R.id.OfAngerBookTwo_36);
        button.setOnClickListener(v -> OfAngerBookTwo_36());
    }

    //Activity call methods, called by buttons above
    public void OfAngerBookTwo_1() {
        Intent intent = new Intent(this, OfAngerBookTwo_1.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_2() {
        Intent intent = new Intent(this, OfAngerBookTwo_2.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_3() {
        Intent intent = new Intent(this, OfAngerBookTwo_3.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_4() {
        Intent intent = new Intent(this, OfAngerBookTwo_4.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_5() {
        Intent intent = new Intent(this, OfAngerBookTwo_5.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_6() {
        Intent intent = new Intent(this, OfAngerBookTwo_6.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_7() {
        Intent intent = new Intent(this, OfAngerBookTwo_7.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_8() {
        Intent intent = new Intent(this, OfAngerBookTwo_8.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_9() {
        Intent intent = new Intent(this, OfAngerBookTwo_9.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_10() {
        Intent intent = new Intent(this, OfAngerBookTwo_10.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_11() {
        Intent intent = new Intent(this, OfAngerBookTwo_11.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_12() {
        Intent intent = new Intent(this, OfAngerBookTwo_12.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_13() {
        Intent intent = new Intent(this, OfAngerBookTwo_13.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_14() {
        Intent intent = new Intent(this, OfAngerBookTwo_14.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_15() {
        Intent intent = new Intent(this, OfAngerBookTwo_15.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_16() {
        Intent intent = new Intent(this, OfAngerBookTwo_16.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_17() {
        Intent intent = new Intent(this, OfAngerBookTwo_17.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_18() {
        Intent intent = new Intent(this, OfAngerBookTwo_18.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_19() {
        Intent intent = new Intent(this, OfAngerBookTwo_19.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_20() {
        Intent intent = new Intent(this, OfAngerBookTwo_20.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_21() {
        Intent intent = new Intent(this, OfAngerBookTwo_21.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_22() {
        Intent intent = new Intent(this, OfAngerBookTwo_22.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_23() {
        Intent intent = new Intent(this, OfAngerBookTwo_23.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_24() {
        Intent intent = new Intent(this, OfAngerBookTwo_24.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_25() {
        Intent intent = new Intent(this, OfAngerBookTwo_25.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_26() {
        Intent intent = new Intent(this, OfAngerBookTwo_26.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_27() {
        Intent intent = new Intent(this, OfAngerBookTwo_27.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_28() {
        Intent intent = new Intent(this, OfAngerBookTwo_28.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_29() {
        Intent intent = new Intent(this, OfAngerBookTwo_29.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_30() {
        Intent intent = new Intent(this, OfAngerBookTwo_30.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_31() {
        Intent intent = new Intent(this, OfAngerBookTwo_31.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_32() {
        Intent intent = new Intent(this, OfAngerBookTwo_32.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_33() {
        Intent intent = new Intent(this, OfAngerBookTwo_33.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_34() {
        Intent intent = new Intent(this, OfAngerBookTwo_34.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_35() {
        Intent intent = new Intent(this, OfAngerBookTwo_35.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo_36() {
        Intent intent = new Intent(this, OfAngerBookTwo_36.class);
        startActivity(intent);
    }
}
