package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.AureliusMeditations.AureliusMedBookHome;

public class AureliusHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_aurelius_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.Marcus_Aurelius));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.aurelius_meditations);
        button.setOnClickListener(v -> AureliusMedHome());
    }

    //Activity call methods, called by buttons above
    public void AureliusMedHome() {
        Intent intent = new Intent(this, AureliusMedBookHome.class);
        startActivity(intent);
    }
}
