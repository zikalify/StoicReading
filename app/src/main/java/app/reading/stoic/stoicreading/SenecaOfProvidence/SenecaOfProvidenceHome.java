package app.reading.stoic.stoicreading.SenecaOfProvidence;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class SenecaOfProvidenceHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_of_providence_home);
        setTitle(this.getString(R.string.SenecaOfProvidenceTitle));

        //Call each activity when click corresponding button
        button = findViewById(R.id.seneca_of_providence_chapter_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOfProvidenceChapter1();
            }
        });

        button = findViewById(R.id.seneca_of_providence_chapter_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOfProvidenceChapter2();
            }
        });

        button = findViewById(R.id.seneca_of_providence_chapter_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOfProvidenceChapter3();
            }
        });

        button = findViewById(R.id.seneca_of_providence_chapter_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOfProvidenceChapter4();
            }
        });

        button = findViewById(R.id.seneca_of_providence_chapter_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOfProvidenceChapter5();
            }
        });

        button = findViewById(R.id.seneca_of_providence_chapter_6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOfProvidenceChapter6();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void SenecaOfProvidenceChapter1() {
        Intent intent = new Intent(this, SenecaOfProvidence_1.class);
        startActivity(intent);
    }

    public void SenecaOfProvidenceChapter2() {
        Intent intent = new Intent(this, SenecaOfProvidence_2.class);
        startActivity(intent);
    }

    public void SenecaOfProvidenceChapter3() {
        Intent intent = new Intent(this, SenecaOfProvidence_3.class);
        startActivity(intent);
    }

    public void SenecaOfProvidenceChapter4() {
        Intent intent = new Intent(this, SenecaOfProvidence_4.class);
        startActivity(intent);
    }

    public void SenecaOfProvidenceChapter5() {
        Intent intent = new Intent(this, SenecaOfProvidence_5.class);
        startActivity(intent);
    }

    public void SenecaOfProvidenceChapter6() {
        Intent intent = new Intent(this, SenecaOfProvidence_6.class);
        startActivity(intent);
    }

}