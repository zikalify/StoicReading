package app.reading.stoic.stoicreading.AratusPhenomena;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class AratusPhenomenaHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_aratus_phenomena_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.AratusPhenomenaTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.aratus_phenomena_1);
        button.setOnClickListener(v -> AratusPhenomenaChapter1());

        button = findViewById(R.id.aratus_phenomena_2);
        button.setOnClickListener(v -> AratusPhenomenaChapter2());
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