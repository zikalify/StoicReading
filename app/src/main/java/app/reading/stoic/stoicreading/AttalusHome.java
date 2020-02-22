package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.AttalusOnRiches.AttalusOnRiches;
import app.reading.stoic.stoicreading.AttalusQuotations.AttalusQuotations;

public class AttalusHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_attalus_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.Attalus));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.attalus_on_riches);
        button.setOnClickListener(v -> AttalusOnRiches());

        button = findViewById(R.id.attalus_quotations);
        button.setOnClickListener(v -> AttalusQuotations());
    }

    //Activity call methods, called by buttons above
    public void AttalusOnRiches() {
        Intent intent = new Intent(this, AttalusOnRiches.class);
        startActivity(intent);
    }

    public void AttalusQuotations() {
        Intent intent = new Intent(this, AttalusQuotations.class);
        startActivity(intent);
    }
}
