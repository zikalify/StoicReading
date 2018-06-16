package app.reading.stoic.stoicreading.AratusPhaenomena;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class AratusPhaenomenaHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_aratus_phaenomena_home);
        setTitle(this.getString(R.string.AratusPhaenomenaTitle));

        //Call each activity when click corresponding button
        button = findViewById(R.id.aratus_phaenomena_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AratusPhaenomenaChapter1();
            }
        });

        button = findViewById(R.id.aratus_phaenomena_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AratusPhaenomenaChapter2();
            }
        });

        button = findViewById(R.id.aratus_phaenomena_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AratusPhaenomenaChapter3();
            }
        });

        button = findViewById(R.id.aratus_phaenomena_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AratusPhaenomenaChapter4();
            }
        });

        button = findViewById(R.id.aratus_phaenomena_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AratusPhaenomenaChapter5();
            }
        });

        button = findViewById(R.id.aratus_phaenomena_6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AratusPhaenomenaChapter6();
            }
        });

        button = findViewById(R.id.aratus_phaenomena_7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AratusPhaenomenaChapter7();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void AratusPhaenomenaChapter1() {
        Intent intent = new Intent(this, AratusPhaenomenaChapter1.class);
        startActivity(intent);
    }

    public void AratusPhaenomenaChapter2() {
        Intent intent = new Intent(this, AratusPhaenomenaChapter2.class);
        startActivity(intent);
    }

    public void AratusPhaenomenaChapter3() {
        Intent intent = new Intent(this, AratusPhaenomenaChapter3.class);
        startActivity(intent);
    }

    public void AratusPhaenomenaChapter4() {
        Intent intent = new Intent(this, AratusPhaenomenaChapter4.class);
        startActivity(intent);
    }

    public void AratusPhaenomenaChapter5() {
        Intent intent = new Intent(this, AratusPhaenomenaChapter5.class);
        startActivity(intent);
    }

    public void AratusPhaenomenaChapter6() {
        Intent intent = new Intent(this, AratusPhaenomenaChapter6.class);
        startActivity(intent);
    }

    public void AratusPhaenomenaChapter7() {
        Intent intent = new Intent(this, AratusPhaenomenaChapter7.class);
        startActivity(intent);
    }
}