package app.reading.stoic.stoicreading.SenecaOfClemency;

import androidx.appcompat.app.AppCompatActivity;
import app.reading.stoic.stoicreading.R;
import app.reading.stoic.stoicreading.SenecaOfClemency.BookOne.OfClemencyBookOne_home;
import app.reading.stoic.stoicreading.SenecaOfClemency.BookTwo.OfClemencyBookTwo_home;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class SenecaOfClemencyHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_of_clemency_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaOfClemencyTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.OfClemencyBookOne);
        button.setOnClickListener(v -> OfClemencyBookOne());

        button = findViewById(R.id.OfClemencyBookTwo);
        button.setOnClickListener(v -> OfClemencyBookTwo());

    }

    //Activity call methods, called by buttons above
    public void OfClemencyBookOne() {
        Intent intent = new Intent(this, OfClemencyBookOne_home.class);
        startActivity(intent);
    }

    public void OfClemencyBookTwo() {
        Intent intent = new Intent(this, OfClemencyBookTwo_home.class);
        startActivity(intent);
    }
}
