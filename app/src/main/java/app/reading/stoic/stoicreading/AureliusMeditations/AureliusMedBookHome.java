package app.reading.stoic.stoicreading.AureliusMeditations;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class AureliusMedBookHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_aurelius_med_book_home);
        setTitle(this.getString(R.string.AureliusMeditationsTitle));

        //Call each activity when click corresponding button
        button = findViewById(R.id.aurelius_book_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AureliusMedBook1();
            }
        });

        button = findViewById(R.id.aurelius_book_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AureliusMedBook2();
            }
        });

        button = findViewById(R.id.aurelius_book_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AureliusMedBook3();
            }
        });

        button = findViewById(R.id.aurelius_book_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AureliusMedBook4();
            }
        });

        button = findViewById(R.id.aurelius_book_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AureliusMedBook5();
            }
        });

        button = findViewById(R.id.aurelius_book_6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AureliusMedBook6();
            }
        });

        button = findViewById(R.id.aurelius_book_7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AureliusMedBook7();
            }
        });

        button = findViewById(R.id.aurelius_book_8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AureliusMedBook8();
            }
        });

        button = findViewById(R.id.aurelius_book_9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AureliusMedBook9();
            }
        });

        button = findViewById(R.id.aurelius_book_10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AureliusMedBook10();
            }
        });

        button = findViewById(R.id.aurelius_book_11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AureliusMedBook11();
            }
        });

        button = findViewById(R.id.aurelius_book_12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AureliusMedBook12();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void AureliusMedBook1() {
        Intent intent = new Intent(this, AureliusMedBook_1.class);
        startActivity(intent);
    }

    public void AureliusMedBook2() {
        Intent intent = new Intent(this, AureliusMedBook_2.class);
        startActivity(intent);
    }

    public void AureliusMedBook3() {
        Intent intent = new Intent(this, AureliusMedBook_3.class);
        startActivity(intent);
    }

    public void AureliusMedBook4() {
        Intent intent = new Intent(this, AureliusMedBook_4.class);
        startActivity(intent);
    }

    public void AureliusMedBook5() {
        Intent intent = new Intent(this, AureliusMedBook_5.class);
        startActivity(intent);
    }

    public void AureliusMedBook6() {
        Intent intent = new Intent(this, AureliusMedBook_6.class);
        startActivity(intent);
    }

    public void AureliusMedBook7() {
        Intent intent = new Intent(this, AureliusMedBook_7.class);
        startActivity(intent);
    }

    public void AureliusMedBook8() {
        Intent intent = new Intent(this, AureliusMedBook_8.class);
        startActivity(intent);
    }

    public void AureliusMedBook9() {
        Intent intent = new Intent(this, AureliusMedBook_9.class);
        startActivity(intent);
    }

    public void AureliusMedBook10() {
        Intent intent = new Intent(this, AureliusMedBook_10.class);
        startActivity(intent);
    }

    public void AureliusMedBook11() {
        Intent intent = new Intent(this, AureliusMedBook_11.class);
        startActivity(intent);
    }

    public void AureliusMedBook12() {
        Intent intent = new Intent(this, AureliusMedBook_12.class);
        startActivity(intent);
    }
}
