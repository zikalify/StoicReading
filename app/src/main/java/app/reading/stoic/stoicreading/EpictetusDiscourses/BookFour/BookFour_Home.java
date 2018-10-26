package app.reading.stoic.stoicreading.EpictetusDiscourses.BookFour;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class BookFour_Home extends AppCompatActivity {
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
        setContentView(R.layout.activity_book_four__home);
        setTitle(this.getString(R.string.EpictetusDiscoursesBookFourTitle));

        //Call each activity when click corresponding button
        button = findViewById(R.id.BookFour_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookFour_1();
            }
        });

        button = findViewById(R.id.BookFour_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookFour_2();
            }
        });

        button = findViewById(R.id.BookFour_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookFour_3();
            }
        });

        button = findViewById(R.id.BookFour_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookFour_4();
            }
        });

        button = findViewById(R.id.BookFour_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookFour_5();
            }
        });

        button = findViewById(R.id.BookFour_6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookFour_6();
            }
        });

        button = findViewById(R.id.BookFour_7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookFour_7();
            }
        });

        button = findViewById(R.id.BookFour_8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookFour_8();
            }
        });

        button = findViewById(R.id.BookFour_9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookFour_9();
            }
        });

        button = findViewById(R.id.BookFour_10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookFour_10();
            }
        });

        button = findViewById(R.id.BookFour_11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookFour_11();
            }
        });

        button = findViewById(R.id.BookFour_12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookFour_12();
            }
        });

        button = findViewById(R.id.BookFour_13);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookFour_13();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void BookFour_1() {
        Intent intent = new Intent(this, BookFour_1.class);
        startActivity(intent);
    }

    public void BookFour_2() {
        Intent intent = new Intent(this, BookFour_2.class);
        startActivity(intent);
    }

    public void BookFour_3() {
        Intent intent = new Intent(this, BookFour_3.class);
        startActivity(intent);
    }

    public void BookFour_4() {
        Intent intent = new Intent(this, BookFour_4.class);
        startActivity(intent);
    }

    public void BookFour_5() {
        Intent intent = new Intent(this, BookFour_5.class);
        startActivity(intent);
    }

    public void BookFour_6() {
        Intent intent = new Intent(this, BookFour_6.class);
        startActivity(intent);
    }

    public void BookFour_7() {
        Intent intent = new Intent(this, BookFour_7.class);
        startActivity(intent);
    }

    public void BookFour_8() {
        Intent intent = new Intent(this, BookFour_8.class);
        startActivity(intent);
    }

    public void BookFour_9() {
        Intent intent = new Intent(this, BookFour_9.class);
        startActivity(intent);
    }

    public void BookFour_10() {
        Intent intent = new Intent(this, BookFour_10.class);
        startActivity(intent);
    }

    public void BookFour_11() {
        Intent intent = new Intent(this, BookFour_11.class);
        startActivity(intent);
    }

    public void BookFour_12() {
        Intent intent = new Intent(this, BookFour_12.class);
        startActivity(intent);
    }

    public void BookFour_13() {
        Intent intent = new Intent(this, BookFour_13.class);
        startActivity(intent);
    }
}
