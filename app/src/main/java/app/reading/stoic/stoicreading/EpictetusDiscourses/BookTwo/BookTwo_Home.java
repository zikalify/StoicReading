package app.reading.stoic.stoicreading.EpictetusDiscourses.BookTwo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class BookTwo_Home extends AppCompatActivity {
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
        setContentView(R.layout.activity_book_two__home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.EpictetusDiscoursesBookTwoTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.BookTwo_1);
        button.setOnClickListener(v -> BookTwo_1());

        button = findViewById(R.id.BookTwo_2);
        button.setOnClickListener(v -> BookTwo_2());

        button = findViewById(R.id.BookTwo_3);
        button.setOnClickListener(v -> BookTwo_3());

        button = findViewById(R.id.BookTwo_4);
        button.setOnClickListener(v -> BookTwo_4());

        button = findViewById(R.id.BookTwo_5);
        button.setOnClickListener(v -> BookTwo_5());

        button = findViewById(R.id.BookTwo_6);
        button.setOnClickListener(v -> BookTwo_6());

        button = findViewById(R.id.BookTwo_7);
        button.setOnClickListener(v -> BookTwo_7());

        button = findViewById(R.id.BookTwo_8);
        button.setOnClickListener(v -> BookTwo_8());

        button = findViewById(R.id.BookTwo_9);
        button.setOnClickListener(v -> BookTwo_9());

        button = findViewById(R.id.BookTwo_10);
        button.setOnClickListener(v -> BookTwo_10());

        button = findViewById(R.id.BookTwo_11);
        button.setOnClickListener(v -> BookTwo_11());

        button = findViewById(R.id.BookTwo_12);
        button.setOnClickListener(v -> BookTwo_12());

        button = findViewById(R.id.BookTwo_13);
        button.setOnClickListener(v -> BookTwo_13());

        button = findViewById(R.id.BookTwo_14);
        button.setOnClickListener(v -> BookTwo_14());

        button = findViewById(R.id.BookTwo_15);
        button.setOnClickListener(v -> BookTwo_15());

        button = findViewById(R.id.BookTwo_16);
        button.setOnClickListener(v -> BookTwo_16());

        button = findViewById(R.id.BookTwo_17);
        button.setOnClickListener(v -> BookTwo_17());

        button = findViewById(R.id.BookTwo_18);
        button.setOnClickListener(v -> BookTwo_18());

        button = findViewById(R.id.BookTwo_19);
        button.setOnClickListener(v -> BookTwo_19());

        button = findViewById(R.id.BookTwo_20);
        button.setOnClickListener(v -> BookTwo_20());

        button = findViewById(R.id.BookTwo_21);
        button.setOnClickListener(v -> BookTwo_21());

        button = findViewById(R.id.BookTwo_22);
        button.setOnClickListener(v -> BookTwo_22());

        button = findViewById(R.id.BookTwo_23);
        button.setOnClickListener(v -> BookTwo_23());

        button = findViewById(R.id.BookTwo_24);
        button.setOnClickListener(v -> BookTwo_24());

        button = findViewById(R.id.BookTwo_25);
        button.setOnClickListener(v -> BookTwo_25());

        button = findViewById(R.id.BookTwo_26);
        button.setOnClickListener(v -> BookTwo_26());
    }

    //Activity call methods, called by buttons above
    public void BookTwo_1() {
        Intent intent = new Intent(this, BookTwo_1.class);
        startActivity(intent);
    }

    public void BookTwo_2() {
        Intent intent = new Intent(this, BookTwo_2.class);
        startActivity(intent);
    }

    public void BookTwo_3() {
        Intent intent = new Intent(this, BookTwo_3.class);
        startActivity(intent);
    }

    public void BookTwo_4() {
        Intent intent = new Intent(this, BookTwo_4.class);
        startActivity(intent);
    }

    public void BookTwo_5() {
        Intent intent = new Intent(this, BookTwo_5.class);
        startActivity(intent);
    }

    public void BookTwo_6() {
        Intent intent = new Intent(this, BookTwo_6.class);
        startActivity(intent);
    }

    public void BookTwo_7() {
        Intent intent = new Intent(this, BookTwo_7.class);
        startActivity(intent);
    }

    public void BookTwo_8() {
        Intent intent = new Intent(this, BookTwo_8.class);
        startActivity(intent);
    }

    public void BookTwo_9() {
        Intent intent = new Intent(this, BookTwo_9.class);
        startActivity(intent);
    }

    public void BookTwo_10() {
        Intent intent = new Intent(this, BookTwo_10.class);
        startActivity(intent);
    }

    public void BookTwo_11() {
        Intent intent = new Intent(this, BookTwo_11.class);
        startActivity(intent);
    }

    public void BookTwo_12() {
        Intent intent = new Intent(this, BookTwo_12.class);
        startActivity(intent);
    }

    public void BookTwo_13() {
        Intent intent = new Intent(this, BookTwo_13.class);
        startActivity(intent);
    }

    public void BookTwo_14() {
        Intent intent = new Intent(this, BookTwo_14.class);
        startActivity(intent);
    }

    public void BookTwo_15() {
        Intent intent = new Intent(this, BookTwo_15.class);
        startActivity(intent);
    }

    public void BookTwo_16() {
        Intent intent = new Intent(this, BookTwo_16.class);
        startActivity(intent);
    }

    public void BookTwo_17() {
        Intent intent = new Intent(this, BookTwo_17.class);
        startActivity(intent);
    }

    public void BookTwo_18() {
        Intent intent = new Intent(this, BookTwo_18.class);
        startActivity(intent);
    }

    public void BookTwo_19() {
        Intent intent = new Intent(this, BookTwo_19.class);
        startActivity(intent);
    }

    public void BookTwo_20() {
        Intent intent = new Intent(this, BookTwo_20.class);
        startActivity(intent);
    }

    public void BookTwo_21() {
        Intent intent = new Intent(this, BookTwo_21.class);
        startActivity(intent);
    }

    public void BookTwo_22() {
        Intent intent = new Intent(this, BookTwo_22.class);
        startActivity(intent);
    }

    public void BookTwo_23() {
        Intent intent = new Intent(this, BookTwo_23.class);
        startActivity(intent);
    }

    public void BookTwo_24() {
        Intent intent = new Intent(this, BookTwo_24.class);
        startActivity(intent);
    }

    public void BookTwo_25() {
        Intent intent = new Intent(this, BookTwo_25.class);
        startActivity(intent);
    }

    public void BookTwo_26() {
        Intent intent = new Intent(this, BookTwo_26.class);
        startActivity(intent);
    }
}
