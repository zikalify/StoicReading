package app.reading.stoic.stoicreading.DidymusEpitome;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;


public class EpitomeHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_epitome_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.AriusDidymusEpitomeTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.epitome_god);
        button.setOnClickListener(v -> EpitomeGod());

        button = findViewById(R.id.epitome_universe);
        button.setOnClickListener(v -> EpitomeUniverse());

        button = findViewById(R.id.epitome_soul);
        button.setOnClickListener(v -> EpitomeSoul());
    }

    //Activity call methods, called by buttons above
    public void EpitomeGod() {
        Intent intent = new Intent(this, EpitomeGod.class);
        startActivity(intent);
    }

    public void EpitomeUniverse() {
        Intent intent = new Intent(this, EpitomeUniverse.class);
        startActivity(intent);
    }

    public void EpitomeSoul() {
        Intent intent = new Intent(this, EpitomeSoul.class);
        startActivity(intent);
    }
}
