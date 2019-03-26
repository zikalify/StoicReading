package app.reading.stoic.stoicreading.RufusLectures;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class LecHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_lec_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.RufusLecTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.rufus_lec_1);
        button.setOnClickListener(v -> Lec1());

        button = findViewById(R.id.rufus_lec_2);
        button.setOnClickListener(v -> Lec2());

        button = findViewById(R.id.rufus_lec_3);
        button.setOnClickListener(v -> Lec3());

        button = findViewById(R.id.rufus_lec_4);
        button.setOnClickListener(v -> Lec4());

        button = findViewById(R.id.rufus_lec_5);
        button.setOnClickListener(v -> Lec5());

        button = findViewById(R.id.rufus_lec_6);
        button.setOnClickListener(v -> Lec6());

        button = findViewById(R.id.rufus_lec_7);
        button.setOnClickListener(v -> Lec7());

        button = findViewById(R.id.rufus_lec_8);
        button.setOnClickListener(v -> Lec8());

        button = findViewById(R.id.rufus_lec_9);
        button.setOnClickListener(v -> Lec9());

        button = findViewById(R.id.rufus_lec_10);
        button.setOnClickListener(v -> Lec10());

        button = findViewById(R.id.rufus_lec_11);
        button.setOnClickListener(v -> Lec11());

        button = findViewById(R.id.rufus_lec_12);
        button.setOnClickListener(v -> Lec12());

        button = findViewById(R.id.rufus_lec_13A);
        button.setOnClickListener(v -> Lec13A());

        button = findViewById(R.id.rufus_lec_13B);
        button.setOnClickListener(v -> Lec13B());

        button = findViewById(R.id.rufus_lec_14);
        button.setOnClickListener(v -> Lec14());

        button = findViewById(R.id.rufus_lec_15);
        button.setOnClickListener(v -> Lec15());

        button = findViewById(R.id.rufus_lec_16);
        button.setOnClickListener(v -> Lec16());

        button = findViewById(R.id.rufus_lec_17);
        button.setOnClickListener(v -> Lec17());

        button = findViewById(R.id.rufus_lec_18A);
        button.setOnClickListener(v -> Lec18A());

        button = findViewById(R.id.rufus_lec_18B);
        button.setOnClickListener(v -> Lec18B());

        button = findViewById(R.id.rufus_lec_19);
        button.setOnClickListener(v -> Lec19());

        button = findViewById(R.id.rufus_lec_20);
        button.setOnClickListener(v -> Lec20());

        button = findViewById(R.id.rufus_lec_21);
        button.setOnClickListener(v -> Lec21());

    }

    //Activity call methods, called by buttons above
    public void Lec1() {
        Intent intent = new Intent(this, Lec1.class);
        startActivity(intent);
    }

    public void Lec2() {
        Intent intent = new Intent(this, Lec2.class);
        startActivity(intent);
    }

    public void Lec3() {
        Intent intent = new Intent(this, Lec3.class);
        startActivity(intent);
    }

    public void Lec4() {
        Intent intent = new Intent(this, Lec4.class);
        startActivity(intent);
    }

    public void Lec5() {
        Intent intent = new Intent(this, Lec5.class);
        startActivity(intent);
    }

    public void Lec6() {
        Intent intent = new Intent(this, Lec6.class);
        startActivity(intent);
    }

    public void Lec7() {
        Intent intent = new Intent(this, Lec7.class);
        startActivity(intent);
    }

    public void Lec8() {
        Intent intent = new Intent(this, Lec8.class);
        startActivity(intent);
    }

    public void Lec9() {
        Intent intent = new Intent(this, Lec9.class);
        startActivity(intent);
    }

    public void Lec10() {
        Intent intent = new Intent(this, Lec10.class);
        startActivity(intent);
    }

    public void Lec11() {
        Intent intent = new Intent(this, Lec11.class);
        startActivity(intent);
    }

    public void Lec12() {
        Intent intent = new Intent(this, Lec12.class);
        startActivity(intent);
    }

    public void Lec13A() {
        Intent intent = new Intent(this, Lec13A.class);
        startActivity(intent);
    }

    public void Lec13B() {
        Intent intent = new Intent(this, Lec13B.class);
        startActivity(intent);
    }

    public void Lec14() {
        Intent intent = new Intent(this, Lec14.class);
        startActivity(intent);
    }

    public void Lec15() {
        Intent intent = new Intent(this, Lec15.class);
        startActivity(intent);
    }

    public void Lec16() {
        Intent intent = new Intent(this, Lec16.class);
        startActivity(intent);
    }

    public void Lec17() {
        Intent intent = new Intent(this, Lec17.class);
        startActivity(intent);
    }

    public void Lec18A() {
        Intent intent = new Intent(this, Lec18A.class);
        startActivity(intent);
    }

    public void Lec18B() {
        Intent intent = new Intent(this, Lec18B.class);
        startActivity(intent);
    }

    public void Lec19() {
        Intent intent = new Intent(this, Lec19.class);
        startActivity(intent);
    }

    public void Lec20() {
        Intent intent = new Intent(this, Lec20.class);
        startActivity(intent);
    }

    public void Lec21() {
        Intent intent = new Intent(this, Lec21.class);
        startActivity(intent);
    }


}
