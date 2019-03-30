package app.reading.stoic.stoicreading.SenecaOfAnger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;
import app.reading.stoic.stoicreading.SenecaOfAnger.BookOne.OfAngerBookOne_home;
import app.reading.stoic.stoicreading.SenecaOfAnger.BookThree.OfAngerBookThree_home;
import app.reading.stoic.stoicreading.SenecaOfAnger.BookTwo.OfAngerBookTwo_home;


public class SenecaOfAngerHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_of_anger_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaOfAngerTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.OfAngerBookOne);
        button.setOnClickListener(v -> OfAngerBookOne());

        button = findViewById(R.id.OfAngerBookTwo);
        button.setOnClickListener(v -> OfAngerBookTwo());

        button = findViewById(R.id.OfAngerBookThree);
        button.setOnClickListener(v -> OfAngerBookThree());

    }

    //Activity call methods, called by buttons above
    public void OfAngerBookOne() {
        Intent intent = new Intent(this, OfAngerBookOne_home.class);
        startActivity(intent);
    }

    public void OfAngerBookTwo() {
        Intent intent = new Intent(this, OfAngerBookTwo_home.class);
        startActivity(intent);
    }

    public void OfAngerBookThree() {
        Intent intent = new Intent(this, OfAngerBookThree_home.class);
        startActivity(intent);
    }

}
