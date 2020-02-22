package app.reading.stoic.stoicreading.SenecaOfAnger.BookThree;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class OfAngerBookThree_home extends AppCompatActivity {
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
        setContentView(R.layout.activity_of_anger_book_three_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaOfAngerBookTitle3));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.OfAngerBookThree_1);
        button.setOnClickListener(v -> OfAngerBookThree_1());

        button = findViewById(R.id.OfAngerBookThree_2);
        button.setOnClickListener(v -> OfAngerBookThree_2());

        button = findViewById(R.id.OfAngerBookThree_3);
        button.setOnClickListener(v -> OfAngerBookThree_3());

        button = findViewById(R.id.OfAngerBookThree_4);
        button.setOnClickListener(v -> OfAngerBookThree_4());

        button = findViewById(R.id.OfAngerBookThree_5);
        button.setOnClickListener(v -> OfAngerBookThree_5());

        button = findViewById(R.id.OfAngerBookThree_6);
        button.setOnClickListener(v -> OfAngerBookThree_6());

        button = findViewById(R.id.OfAngerBookThree_7);
        button.setOnClickListener(v -> OfAngerBookThree_7());

        button = findViewById(R.id.OfAngerBookThree_8);
        button.setOnClickListener(v -> OfAngerBookThree_8());

        button = findViewById(R.id.OfAngerBookThree_9);
        button.setOnClickListener(v -> OfAngerBookThree_9());

        button = findViewById(R.id.OfAngerBookThree_10);
        button.setOnClickListener(v -> OfAngerBookThree_10());

        button = findViewById(R.id.OfAngerBookThree_11);
        button.setOnClickListener(v -> OfAngerBookThree_11());

        button = findViewById(R.id.OfAngerBookThree_12);
        button.setOnClickListener(v -> OfAngerBookThree_12());

        button = findViewById(R.id.OfAngerBookThree_13);
        button.setOnClickListener(v -> OfAngerBookThree_13());

        button = findViewById(R.id.OfAngerBookThree_14);
        button.setOnClickListener(v -> OfAngerBookThree_14());

        button = findViewById(R.id.OfAngerBookThree_15);
        button.setOnClickListener(v -> OfAngerBookThree_15());

        button = findViewById(R.id.OfAngerBookThree_16);
        button.setOnClickListener(v -> OfAngerBookThree_16());

        button = findViewById(R.id.OfAngerBookThree_17);
        button.setOnClickListener(v -> OfAngerBookThree_17());

        button = findViewById(R.id.OfAngerBookThree_18);
        button.setOnClickListener(v -> OfAngerBookThree_18());

        button = findViewById(R.id.OfAngerBookThree_19);
        button.setOnClickListener(v -> OfAngerBookThree_19());

        button = findViewById(R.id.OfAngerBookThree_20);
        button.setOnClickListener(v -> OfAngerBookThree_20());

        button = findViewById(R.id.OfAngerBookThree_21);
        button.setOnClickListener(v -> OfAngerBookThree_21());

        button = findViewById(R.id.OfAngerBookThree_22);
        button.setOnClickListener(v -> OfAngerBookThree_22());

        button = findViewById(R.id.OfAngerBookThree_23);
        button.setOnClickListener(v -> OfAngerBookThree_23());

        button = findViewById(R.id.OfAngerBookThree_24);
        button.setOnClickListener(v -> OfAngerBookThree_24());

        button = findViewById(R.id.OfAngerBookThree_25);
        button.setOnClickListener(v -> OfAngerBookThree_25());

        button = findViewById(R.id.OfAngerBookThree_26);
        button.setOnClickListener(v -> OfAngerBookThree_26());

        button = findViewById(R.id.OfAngerBookThree_27);
        button.setOnClickListener(v -> OfAngerBookThree_27());

        button = findViewById(R.id.OfAngerBookThree_28);
        button.setOnClickListener(v -> OfAngerBookThree_28());

        button = findViewById(R.id.OfAngerBookThree_29);
        button.setOnClickListener(v -> OfAngerBookThree_29());

        button = findViewById(R.id.OfAngerBookThree_30);
        button.setOnClickListener(v -> OfAngerBookThree_30());

        button = findViewById(R.id.OfAngerBookThree_31);
        button.setOnClickListener(v -> OfAngerBookThree_31());

        button = findViewById(R.id.OfAngerBookThree_32);
        button.setOnClickListener(v -> OfAngerBookThree_32());

        button = findViewById(R.id.OfAngerBookThree_33);
        button.setOnClickListener(v -> OfAngerBookThree_33());

        button = findViewById(R.id.OfAngerBookThree_34);
        button.setOnClickListener(v -> OfAngerBookThree_34());

        button = findViewById(R.id.OfAngerBookThree_35);
        button.setOnClickListener(v -> OfAngerBookThree_35());

        button = findViewById(R.id.OfAngerBookThree_36);
        button.setOnClickListener(v -> OfAngerBookThree_36());

        button = findViewById(R.id.OfAngerBookThree_37);
        button.setOnClickListener(v -> OfAngerBookThree_37());

        button = findViewById(R.id.OfAngerBookThree_38);
        button.setOnClickListener(v -> OfAngerBookThree_38());

        button = findViewById(R.id.OfAngerBookThree_39);
        button.setOnClickListener(v -> OfAngerBookThree_39());

        button = findViewById(R.id.OfAngerBookThree_40);
        button.setOnClickListener(v -> OfAngerBookThree_40());

        button = findViewById(R.id.OfAngerBookThree_41);
        button.setOnClickListener(v -> OfAngerBookThree_41());

        button = findViewById(R.id.OfAngerBookThree_42);
        button.setOnClickListener(v -> OfAngerBookThree_42());

        button = findViewById(R.id.OfAngerBookThree_43);
        button.setOnClickListener(v -> OfAngerBookThree_43());
    }

    //Activity call methods, called by buttons above
    public void OfAngerBookThree_1() {
        Intent intent = new Intent(this, OfAngerBookThree_1.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_2() {
        Intent intent = new Intent(this, OfAngerBookThree_2.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_3() {
        Intent intent = new Intent(this, OfAngerBookThree_3.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_4() {
        Intent intent = new Intent(this, OfAngerBookThree_4.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_5() {
        Intent intent = new Intent(this, OfAngerBookThree_5.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_6() {
        Intent intent = new Intent(this, OfAngerBookThree_6.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_7() {
        Intent intent = new Intent(this, OfAngerBookThree_7.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_8() {
        Intent intent = new Intent(this, OfAngerBookThree_8.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_9() {
        Intent intent = new Intent(this, OfAngerBookThree_9.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_10() {
        Intent intent = new Intent(this, OfAngerBookThree_10.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_11() {
        Intent intent = new Intent(this, OfAngerBookThree_11.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_12() {
        Intent intent = new Intent(this, OfAngerBookThree_12.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_13() {
        Intent intent = new Intent(this, OfAngerBookThree_13.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_14() {
        Intent intent = new Intent(this, OfAngerBookThree_14.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_15() {
        Intent intent = new Intent(this, OfAngerBookThree_15.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_16() {
        Intent intent = new Intent(this, OfAngerBookThree_16.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_17() {
        Intent intent = new Intent(this, OfAngerBookThree_17.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_18() {
        Intent intent = new Intent(this, OfAngerBookThree_18.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_19() {
        Intent intent = new Intent(this, OfAngerBookThree_19.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_20() {
        Intent intent = new Intent(this, OfAngerBookThree_20.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_21() {
        Intent intent = new Intent(this, OfAngerBookThree_21.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_22() {
        Intent intent = new Intent(this, OfAngerBookThree_22.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_23() {
        Intent intent = new Intent(this, OfAngerBookThree_23.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_24() {
        Intent intent = new Intent(this, OfAngerBookThree_24.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_25() {
        Intent intent = new Intent(this, OfAngerBookThree_25.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_26() {
        Intent intent = new Intent(this, OfAngerBookThree_26.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_27() {
        Intent intent = new Intent(this, OfAngerBookThree_27.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_28() {
        Intent intent = new Intent(this, OfAngerBookThree_28.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_29() {
        Intent intent = new Intent(this, OfAngerBookThree_29.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_30() {
        Intent intent = new Intent(this, OfAngerBookThree_30.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_31() {
        Intent intent = new Intent(this, OfAngerBookThree_31.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_32() {
        Intent intent = new Intent(this, OfAngerBookThree_32.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_33() {
        Intent intent = new Intent(this, OfAngerBookThree_33.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_34() {
        Intent intent = new Intent(this, OfAngerBookThree_34.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_35() {
        Intent intent = new Intent(this, OfAngerBookThree_35.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_36() {
        Intent intent = new Intent(this, OfAngerBookThree_36.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_37() {
        Intent intent = new Intent(this, OfAngerBookThree_37.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_38() {
        Intent intent = new Intent(this, OfAngerBookThree_38.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_39() {
        Intent intent = new Intent(this, OfAngerBookThree_39.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_40() {
        Intent intent = new Intent(this, OfAngerBookThree_40.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_41() {
        Intent intent = new Intent(this, OfAngerBookThree_41.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_42() {
        Intent intent = new Intent(this, OfAngerBookThree_42.class);
        startActivity(intent);
    }

    public void OfAngerBookThree_43() {
        Intent intent = new Intent(this, OfAngerBookThree_43.class);
        startActivity(intent);
    }
}
