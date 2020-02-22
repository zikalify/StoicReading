package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.AsclepiodotusTactics.AsclepiodotusTactics1;
import app.reading.stoic.stoicreading.AsclepiodotusTactics.AsclepiodotusTacticsHome;

public class AsclepiodotusHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_asclepiodotus_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.Asclepiodotus_Tacticus));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.asclepiodotus_tactics_home);
        button.setOnClickListener(v -> AsclepiodotusTacticsHome());
    }

    //Activity call methods, called by buttons above
    public void AsclepiodotusTacticsHome() {
        Intent intent = new Intent(this, AsclepiodotusTacticsHome.class);
        startActivity(intent);
    }
}