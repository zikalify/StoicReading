package app.reading.stoic.stoicreading.HieroclesFragments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class HieroclesFragmentsHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_hierocles_fragments_home);
        setTitle(this.getString(R.string.HieroclesFragmentsTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.hierocles_fragments_1);
        button.setOnClickListener(v -> HieroclesFrag1());

        button = findViewById(R.id.hierocles_fragments_2);
        button.setOnClickListener(v -> HieroclesFrag2());

        button = findViewById(R.id.hierocles_fragments_3);
        button.setOnClickListener(v -> HieroclesFrag3());

        button = findViewById(R.id.hierocles_fragments_4);
        button.setOnClickListener(v -> HieroclesFrag4());

        button = findViewById(R.id.hierocles_fragments_5);
        button.setOnClickListener(v -> HieroclesFrag5());

        button = findViewById(R.id.hierocles_fragments_6);
        button.setOnClickListener(v -> HieroclesFrag6());

        button = findViewById(R.id.hierocles_fragments_7);
        button.setOnClickListener(v -> HieroclesFrag7());
    }

    //Activity call methods, called by buttons above
    public void HieroclesFrag1() {
        Intent intent = new Intent(this, HieroclesFragments1.class);
        startActivity(intent);
    }

    public void HieroclesFrag2() {
        Intent intent = new Intent(this, HieroclesFragments2.class);
        startActivity(intent);
    }

    public void HieroclesFrag3() {
        Intent intent = new Intent(this, HieroclesFragments3.class);
        startActivity(intent);
    }

    public void HieroclesFrag4() {
        Intent intent = new Intent(this, HieroclesFragments4.class);
        startActivity(intent);
    }

    public void HieroclesFrag5() {
        Intent intent = new Intent(this, HieroclesFragments5.class);
        startActivity(intent);
    }

    public void HieroclesFrag6() {
        Intent intent = new Intent(this, HieroclesFragments6.class);
        startActivity(intent);
    }

    public void HieroclesFrag7() {
        Intent intent = new Intent(this, HieroclesFragments7.class);
        startActivity(intent);
    }
}
