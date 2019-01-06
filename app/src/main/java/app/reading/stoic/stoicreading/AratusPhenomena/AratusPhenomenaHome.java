package app.reading.stoic.stoicreading.AratusPhenomena;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class AratusPhenomenaHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_aratus_phenomena_home);
        setTitle(this.getString(R.string.AratusPhenomenaTitle));

        //Call each activity when click corresponding button
        button = findViewById(R.id.aratus_phenomena_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AratusPhenomenaChapter1();
            }
        });

        button = findViewById(R.id.aratus_phenomena_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AratusPhenomenaChapter2();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void AratusPhenomenaChapter1() {
        Intent intent = new Intent(this, AratusPhenomenaChapter1.class);
        startActivity(intent);
    }

    public void AratusPhenomenaChapter2() {
        Intent intent = new Intent(this, AratusPhenomenaChapter2.class);
        startActivity(intent);
    }
}