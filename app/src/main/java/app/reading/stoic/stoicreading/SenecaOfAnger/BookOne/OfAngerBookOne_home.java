package app.reading.stoic.stoicreading.SenecaOfAnger.BookOne;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class OfAngerBookOne_home extends AppCompatActivity {
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
        setContentView(R.layout.activity_of_anger_book_one_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaOfAngerBookTitle1));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.OfAngerBookOne_1);
        button.setOnClickListener(v -> OfAngerBookOne_1());

        button = findViewById(R.id.OfAngerBookOne_2);
        button.setOnClickListener(v -> OfAngerBookOne_2());

        button = findViewById(R.id.OfAngerBookOne_3);
        button.setOnClickListener(v -> OfAngerBookOne_3());

        button = findViewById(R.id.OfAngerBookOne_4);
        button.setOnClickListener(v -> OfAngerBookOne_4());

        button = findViewById(R.id.OfAngerBookOne_5);
        button.setOnClickListener(v -> OfAngerBookOne_5());

        button = findViewById(R.id.OfAngerBookOne_6);
        button.setOnClickListener(v -> OfAngerBookOne_6());

        button = findViewById(R.id.OfAngerBookOne_7);
        button.setOnClickListener(v -> OfAngerBookOne_7());

        button = findViewById(R.id.OfAngerBookOne_8);
        button.setOnClickListener(v -> OfAngerBookOne_8());

        button = findViewById(R.id.OfAngerBookOne_9);
        button.setOnClickListener(v -> OfAngerBookOne_9());

        button = findViewById(R.id.OfAngerBookOne_10);
        button.setOnClickListener(v -> OfAngerBookOne_10());

        button = findViewById(R.id.OfAngerBookOne_11);
        button.setOnClickListener(v -> OfAngerBookOne_11());

        button = findViewById(R.id.OfAngerBookOne_12);
        button.setOnClickListener(v -> OfAngerBookOne_12());

        button = findViewById(R.id.OfAngerBookOne_13);
        button.setOnClickListener(v -> OfAngerBookOne_13());

        button = findViewById(R.id.OfAngerBookOne_14);
        button.setOnClickListener(v -> OfAngerBookOne_14());

        button = findViewById(R.id.OfAngerBookOne_15);
        button.setOnClickListener(v -> OfAngerBookOne_15());

        button = findViewById(R.id.OfAngerBookOne_16);
        button.setOnClickListener(v -> OfAngerBookOne_16());

        button = findViewById(R.id.OfAngerBookOne_17);
        button.setOnClickListener(v -> OfAngerBookOne_17());

        button = findViewById(R.id.OfAngerBookOne_18);
        button.setOnClickListener(v -> OfAngerBookOne_18());

        button = findViewById(R.id.OfAngerBookOne_19);
        button.setOnClickListener(v -> OfAngerBookOne_19());

        button = findViewById(R.id.OfAngerBookOne_20);
        button.setOnClickListener(v -> OfAngerBookOne_20());

        button = findViewById(R.id.OfAngerBookOne_21);
        button.setOnClickListener(v -> OfAngerBookOne_21());
    }

    //Activity call methods, called by buttons above
    public void OfAngerBookOne_1() {
        Intent intent = new Intent(this, OfAngerBookOne_1.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_2() {
        Intent intent = new Intent(this, OfAngerBookOne_2.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_3() {
        Intent intent = new Intent(this, OfAngerBookOne_3.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_4() {
        Intent intent = new Intent(this, OfAngerBookOne_4.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_5() {
        Intent intent = new Intent(this, OfAngerBookOne_5.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_6() {
        Intent intent = new Intent(this, OfAngerBookOne_6.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_7() {
        Intent intent = new Intent(this, OfAngerBookOne_7.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_8() {
        Intent intent = new Intent(this, OfAngerBookOne_8.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_9() {
        Intent intent = new Intent(this, OfAngerBookOne_9.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_10() {
        Intent intent = new Intent(this, OfAngerBookOne_10.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_11() {
        Intent intent = new Intent(this, OfAngerBookOne_11.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_12() {
        Intent intent = new Intent(this, OfAngerBookOne_12.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_13() {
        Intent intent = new Intent(this, OfAngerBookOne_13.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_14() {
        Intent intent = new Intent(this, OfAngerBookOne_14.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_15() {
        Intent intent = new Intent(this, OfAngerBookOne_15.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_16() {
        Intent intent = new Intent(this, OfAngerBookOne_16.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_17() {
        Intent intent = new Intent(this, OfAngerBookOne_17.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_18() {
        Intent intent = new Intent(this, OfAngerBookOne_18.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_19() {
        Intent intent = new Intent(this, OfAngerBookOne_19.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_20() {
        Intent intent = new Intent(this, OfAngerBookOne_20.class);
        startActivity(intent);
    }

    public void OfAngerBookOne_21() {
        Intent intent = new Intent(this, OfAngerBookOne_21.class);
        startActivity(intent);
    }
}
