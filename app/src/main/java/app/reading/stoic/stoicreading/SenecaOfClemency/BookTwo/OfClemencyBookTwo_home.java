package app.reading.stoic.stoicreading.SenecaOfClemency.BookTwo;

import androidx.appcompat.app.AppCompatActivity;
import app.reading.stoic.stoicreading.R;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class OfClemencyBookTwo_home extends AppCompatActivity {
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
        setContentView(R.layout.activity_of_clemency_book_two_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaOfClemencyBookTitle2));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.OfClemencyBookTwo_1);
        button.setOnClickListener(v -> OfClemencyBookTwo_1());

        button = findViewById(R.id.OfClemencyBookTwo_2);
        button.setOnClickListener(v -> OfClemencyBookTwo_2());

        button = findViewById(R.id.OfClemencyBookTwo_3);
        button.setOnClickListener(v -> OfClemencyBookTwo_3());

        button = findViewById(R.id.OfClemencyBookTwo_4);
        button.setOnClickListener(v -> OfClemencyBookTwo_4());

        button = findViewById(R.id.OfClemencyBookTwo_5);
        button.setOnClickListener(v -> OfClemencyBookTwo_5());

        button = findViewById(R.id.OfClemencyBookTwo_6);
        button.setOnClickListener(v -> OfClemencyBookTwo_6());

        button = findViewById(R.id.OfClemencyBookTwo_7);
        button.setOnClickListener(v -> OfClemencyBookTwo_7());
    }

    //Activity call methods, called by buttons above
    public void OfClemencyBookTwo_1() {
        Intent intent = new Intent(this, OfClemencyBookTwo_1.class);
        startActivity(intent);
    }

    public void OfClemencyBookTwo_2() {
        Intent intent = new Intent(this, OfClemencyBookTwo_2.class);
        startActivity(intent);
    }

    public void OfClemencyBookTwo_3() {
        Intent intent = new Intent(this, OfClemencyBookTwo_3.class);
        startActivity(intent);
    }

    public void OfClemencyBookTwo_4() {
        Intent intent = new Intent(this, OfClemencyBookTwo_4.class);
        startActivity(intent);
    }

    public void OfClemencyBookTwo_5() {
        Intent intent = new Intent(this, OfClemencyBookTwo_5.class);
        startActivity(intent);
    }

    public void OfClemencyBookTwo_6() {
        Intent intent = new Intent(this, OfClemencyBookTwo_6.class);
        startActivity(intent);
    }

    public void OfClemencyBookTwo_7() {
        Intent intent = new Intent(this, OfClemencyBookTwo_7.class);
        startActivity(intent);
    }
}
