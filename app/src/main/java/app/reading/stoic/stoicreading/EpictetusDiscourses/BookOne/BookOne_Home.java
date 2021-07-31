package app.reading.stoic.stoicreading.EpictetusDiscourses.BookOne;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class BookOne_Home extends AppCompatActivity {
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
        setContentView(R.layout.activity_book_one__home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.EpictetusDiscoursesBookOneTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.BookOne_1);
        button.setOnClickListener(v -> BookOne_1());

        button = findViewById(R.id.BookOne_2);
        button.setOnClickListener(v -> BookOne_2());

        button = findViewById(R.id.BookOne_3);
        button.setOnClickListener(v -> BookOne_3());

        button = findViewById(R.id.BookOne_4);
        button.setOnClickListener(v -> BookOne_4());

        button = findViewById(R.id.BookOne_5);
        button.setOnClickListener(v -> BookOne_5());

        button = findViewById(R.id.BookOne_6);
        button.setOnClickListener(v -> BookOne_6());

        button = findViewById(R.id.BookOne_7);
        button.setOnClickListener(v -> BookOne_7());

        button = findViewById(R.id.BookOne_8);
        button.setOnClickListener(v -> BookOne_8());

        button = findViewById(R.id.BookOne_9);
        button.setOnClickListener(v -> BookOne_9());

        button = findViewById(R.id.BookOne_10);
        button.setOnClickListener(v -> BookOne_10());

        button = findViewById(R.id.BookOne_11);
        button.setOnClickListener(v -> BookOne_11());

        button = findViewById(R.id.BookOne_12);
        button.setOnClickListener(v -> BookOne_12());

        button = findViewById(R.id.BookOne_13);
        button.setOnClickListener(v -> BookOne_13());

        button = findViewById(R.id.BookOne_14);
        button.setOnClickListener(v -> BookOne_14());

        button = findViewById(R.id.BookOne_15);
        button.setOnClickListener(v -> BookOne_15());

        button = findViewById(R.id.BookOne_16);
        button.setOnClickListener(v -> BookOne_16());

        button = findViewById(R.id.BookOne_17);
        button.setOnClickListener(v -> BookOne_17());

        button = findViewById(R.id.BookOne_18);
        button.setOnClickListener(v -> BookOne_18());

        button = findViewById(R.id.BookOne_19);
        button.setOnClickListener(v -> BookOne_19());

        button = findViewById(R.id.BookOne_20);
        button.setOnClickListener(v -> BookOne_20());

        button = findViewById(R.id.BookOne_21);
        button.setOnClickListener(v -> BookOne_21());

        button = findViewById(R.id.BookOne_22);
        button.setOnClickListener(v -> BookOne_22());

        button = findViewById(R.id.BookOne_23);
        button.setOnClickListener(v -> BookOne_23());

        button = findViewById(R.id.BookOne_24);
        button.setOnClickListener(v -> BookOne_24());

        button = findViewById(R.id.BookOne_25);
        button.setOnClickListener(v -> BookOne_25());

        button = findViewById(R.id.BookOne_26);
        button.setOnClickListener(v -> BookOne_26());

        button = findViewById(R.id.BookOne_27);
        button.setOnClickListener(v -> BookOne_27());

        button = findViewById(R.id.BookOne_28);
        button.setOnClickListener(v -> BookOne_28());

        button = findViewById(R.id.BookOne_29);
        button.setOnClickListener(v -> BookOne_29());

        button = findViewById(R.id.BookOne_30);
        button.setOnClickListener(v -> BookOne_30());
    }

    //Activity call methods, called by buttons above
    public void BookOne_1() {
        Intent intent = new Intent(this, BookOne_1.class);
        startActivity(intent);
    }

    public void BookOne_2() {
        Intent intent = new Intent(this, BookOne_2.class);
        startActivity(intent);
    }

    public void BookOne_3() {
        Intent intent = new Intent(this, BookOne_3.class);
        startActivity(intent);
    }

    public void BookOne_4() {
        Intent intent = new Intent(this, BookOne_4.class);
        startActivity(intent);
    }

    public void BookOne_5() {
        Intent intent = new Intent(this, BookOne_5.class);
        startActivity(intent);
    }

    public void BookOne_6() {
        Intent intent = new Intent(this, BookOne_6.class);
        startActivity(intent);
    }

    public void BookOne_7() {
        Intent intent = new Intent(this, BookOne_7.class);
        startActivity(intent);
    }

    public void BookOne_8() {
        Intent intent = new Intent(this, BookOne_8.class);
        startActivity(intent);
    }

    public void BookOne_9() {
        Intent intent = new Intent(this, BookOne_9.class);
        startActivity(intent);
    }

    public void BookOne_10() {
        Intent intent = new Intent(this, BookOne_10.class);
        startActivity(intent);
    }

    public void BookOne_11() {
        Intent intent = new Intent(this, BookOne_11.class);
        startActivity(intent);
    }

    public void BookOne_12() {
        Intent intent = new Intent(this, BookOne_12.class);
        startActivity(intent);
    }

    public void BookOne_13() {
        Intent intent = new Intent(this, BookOne_13.class);
        startActivity(intent);
    }

    public void BookOne_14() {
        Intent intent = new Intent(this, BookOne_14.class);
        startActivity(intent);
    }

    public void BookOne_15() {
        Intent intent = new Intent(this, BookOne_15.class);
        startActivity(intent);
    }

    public void BookOne_16() {
        Intent intent = new Intent(this, BookOne_16.class);
        startActivity(intent);
    }

    public void BookOne_17() {
        Intent intent = new Intent(this, BookOne_17.class);
        startActivity(intent);
    }

    public void BookOne_18() {
        Intent intent = new Intent(this, BookOne_18.class);
        startActivity(intent);
    }

    public void BookOne_19() {
        Intent intent = new Intent(this, BookOne_19.class);
        startActivity(intent);
    }

    public void BookOne_20() {
        Intent intent = new Intent(this, BookOne_20.class);
        startActivity(intent);
    }

    public void BookOne_21() {
        Intent intent = new Intent(this, BookOne_21.class);
        startActivity(intent);
    }

    public void BookOne_22() {
        Intent intent = new Intent(this, BookOne_22.class);
        startActivity(intent);
    }

    public void BookOne_23() {
        Intent intent = new Intent(this, BookOne_23.class);
        startActivity(intent);
    }

    public void BookOne_24() {
        Intent intent = new Intent(this, BookOne_24.class);
        startActivity(intent);
    }

    public void BookOne_25() {
        Intent intent = new Intent(this, BookOne_25.class);
        startActivity(intent);
    }

    public void BookOne_26() {
        Intent intent = new Intent(this, BookOne_26.class);
        startActivity(intent);
    }

    public void BookOne_27() {
        Intent intent = new Intent(this, BookOne_27.class);
        startActivity(intent);
    }

    public void BookOne_28() {
        Intent intent = new Intent(this, BookOne_28.class);
        startActivity(intent);
    }

    public void BookOne_29() {
        Intent intent = new Intent(this, BookOne_29.class);
        startActivity(intent);
    }

    public void BookOne_30() {
        Intent intent = new Intent(this, BookOne_30.class);
        startActivity(intent);
    }
}
