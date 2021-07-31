package app.reading.stoic.stoicreading.SenecaOfClemency.BookOne;

import androidx.appcompat.app.AppCompatActivity;
import app.reading.stoic.stoicreading.R;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class OfClemencyBookOne_home extends AppCompatActivity {
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
        setContentView(R.layout.activity_of_clemency_book_one_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaOfClemencyBookTitle1));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.OfClemencyBookOne_1);
        button.setOnClickListener(v -> OfClemencyBookOne_1());

        button = findViewById(R.id.OfClemencyBookOne_2);
        button.setOnClickListener(v -> OfClemencyBookOne_2());

        button = findViewById(R.id.OfClemencyBookOne_3);
        button.setOnClickListener(v -> OfClemencyBookOne_3());

        button = findViewById(R.id.OfClemencyBookOne_4);
        button.setOnClickListener(v -> OfClemencyBookOne_4());

        button = findViewById(R.id.OfClemencyBookOne_5);
        button.setOnClickListener(v -> OfClemencyBookOne_5());

        button = findViewById(R.id.OfClemencyBookOne_6);
        button.setOnClickListener(v -> OfClemencyBookOne_6());

        button = findViewById(R.id.OfClemencyBookOne_7);
        button.setOnClickListener(v -> OfClemencyBookOne_7());

        button = findViewById(R.id.OfClemencyBookOne_8);
        button.setOnClickListener(v -> OfClemencyBookOne_8());

        button = findViewById(R.id.OfClemencyBookOne_9);
        button.setOnClickListener(v -> OfClemencyBookOne_9());

        button = findViewById(R.id.OfClemencyBookOne_10);
        button.setOnClickListener(v -> OfClemencyBookOne_10());

        button = findViewById(R.id.OfClemencyBookOne_11);
        button.setOnClickListener(v -> OfClemencyBookOne_11());

        button = findViewById(R.id.OfClemencyBookOne_12);
        button.setOnClickListener(v -> OfClemencyBookOne_12());

        button = findViewById(R.id.OfClemencyBookOne_13);
        button.setOnClickListener(v -> OfClemencyBookOne_13());

        button = findViewById(R.id.OfClemencyBookOne_14);
        button.setOnClickListener(v -> OfClemencyBookOne_14());

        button = findViewById(R.id.OfClemencyBookOne_15);
        button.setOnClickListener(v -> OfClemencyBookOne_15());

        button = findViewById(R.id.OfClemencyBookOne_16);
        button.setOnClickListener(v -> OfClemencyBookOne_16());

        button = findViewById(R.id.OfClemencyBookOne_17);
        button.setOnClickListener(v -> OfClemencyBookOne_17());

        button = findViewById(R.id.OfClemencyBookOne_18);
        button.setOnClickListener(v -> OfClemencyBookOne_18());

        button = findViewById(R.id.OfClemencyBookOne_19);
        button.setOnClickListener(v -> OfClemencyBookOne_19());

        button = findViewById(R.id.OfClemencyBookOne_20);
        button.setOnClickListener(v -> OfClemencyBookOne_20());

        button = findViewById(R.id.OfClemencyBookOne_21);
        button.setOnClickListener(v -> OfClemencyBookOne_21());

        button = findViewById(R.id.OfClemencyBookOne_22);
        button.setOnClickListener(v -> OfClemencyBookOne_22());

        button = findViewById(R.id.OfClemencyBookOne_23);
        button.setOnClickListener(v -> OfClemencyBookOne_23());

        button = findViewById(R.id.OfClemencyBookOne_24);
        button.setOnClickListener(v -> OfClemencyBookOne_24());

        button = findViewById(R.id.OfClemencyBookOne_25);
        button.setOnClickListener(v -> OfClemencyBookOne_25());

        button = findViewById(R.id.OfClemencyBookOne_26);
        button.setOnClickListener(v -> OfClemencyBookOne_26());
    }

    //Activity call methods, called by buttons above
    public void OfClemencyBookOne_1() {
        Intent intent = new Intent(this, OfClemencyBookOne_1.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_2() {
        Intent intent = new Intent(this, OfClemencyBookOne_2.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_3() {
        Intent intent = new Intent(this, OfClemencyBookOne_3.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_4() {
        Intent intent = new Intent(this, OfClemencyBookOne_4.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_5() {
        Intent intent = new Intent(this, OfClemencyBookOne_5.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_6() {
        Intent intent = new Intent(this, OfClemencyBookOne_6.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_7() {
        Intent intent = new Intent(this, OfClemencyBookOne_7.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_8() {
        Intent intent = new Intent(this, OfClemencyBookOne_8.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_9() {
        Intent intent = new Intent(this, OfClemencyBookOne_9.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_10() {
        Intent intent = new Intent(this, OfClemencyBookOne_10.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_11() {
        Intent intent = new Intent(this, OfClemencyBookOne_11.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_12() {
        Intent intent = new Intent(this, OfClemencyBookOne_12.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_13() {
        Intent intent = new Intent(this, OfClemencyBookOne_13.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_14() {
        Intent intent = new Intent(this, OfClemencyBookOne_14.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_15() {
        Intent intent = new Intent(this, OfClemencyBookOne_15.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_16() {
        Intent intent = new Intent(this, OfClemencyBookOne_16.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_17() {
        Intent intent = new Intent(this, OfClemencyBookOne_17.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_18() {
        Intent intent = new Intent(this, OfClemencyBookOne_18.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_19() {
        Intent intent = new Intent(this, OfClemencyBookOne_19.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_20() {
        Intent intent = new Intent(this, OfClemencyBookOne_20.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_21() {
        Intent intent = new Intent(this, OfClemencyBookOne_21.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_22() {
        Intent intent = new Intent(this, OfClemencyBookOne_22.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_23() {
        Intent intent = new Intent(this, OfClemencyBookOne_23.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_24() {
        Intent intent = new Intent(this, OfClemencyBookOne_24.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_25() {
        Intent intent = new Intent(this, OfClemencyBookOne_25.class);
        startActivity(intent);
    }

    public void OfClemencyBookOne_26() {
        Intent intent = new Intent(this, OfClemencyBookOne_26.class);
        startActivity(intent);
    }
}
