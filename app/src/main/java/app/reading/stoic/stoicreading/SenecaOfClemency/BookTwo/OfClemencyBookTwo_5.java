package app.reading.stoic.stoicreading.SenecaOfClemency.BookTwo;

import androidx.appcompat.app.AppCompatActivity;
import app.reading.stoic.stoicreading.R;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;

public class OfClemencyBookTwo_5 extends AppCompatActivity {
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
        setContentView(R.layout.activity_of_clemency_book_two_5);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaOfClemencyBookTwoTitle5));
    }
}
