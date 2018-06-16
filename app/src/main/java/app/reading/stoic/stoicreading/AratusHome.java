package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.AratusPhaenomena.AratusPhaenomenaHome;

public class AratusHome extends AppCompatActivity {
    private Button button;
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
        setContentView(R.layout.activity_aratus_home);
        setTitle(this.getString(R.string.Aratus));

        //Call each activity when click corresponding button
        button = findViewById(R.id.aratus_phaenomena_home);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AratusPhaenomenaHome();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void AratusPhaenomenaHome() {
        Intent intent = new Intent(this, AratusPhaenomenaHome.class);
        startActivity(intent);
    }
}