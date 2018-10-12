package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.SenecaMoralLettersLucilius.SenecaMoralLettersLuciliusHome;
import app.reading.stoic.stoicreading.SenecaOfProvidence.SenecaOfProvidenceHome;
import app.reading.stoic.stoicreading.SenecaOnTheFirmnessOfTheWiseMan.SenecaOnTheFirmnessOfTheWiseManHome;
import app.reading.stoic.stoicreading.SenecaOnTheShortnessOfLife.SenecaOnTheShortnessOfLifeHome;

public class SenecaHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_home);
        setTitle(this.getString(R.string.Seneca));

        //Call each activity when click corresponding button
        button = findViewById(R.id.seneca_of_providence);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOfProvidenceHome();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManHome();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessOfLifeHome();
            }
        });

        button = findViewById(R.id.seneca_moral_letters_lucilius);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaMoralLettersLuciliusHome();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void SenecaOfProvidenceHome() {
        Intent intent = new Intent(this, SenecaOfProvidenceHome.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManHome() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseManHome.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessOfLifeHome() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLifeHome.class);
        startActivity(intent);
    }

    public void SenecaMoralLettersLuciliusHome() {
        Intent intent = new Intent(this, SenecaMoralLettersLuciliusHome.class);
        startActivity(intent);
    }
}
