package app.reading.stoic.stoicreading.EpictetusDiscourses.BookThree;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class BookThree_Home extends AppCompatActivity {
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
        setContentView(R.layout.activity_book_three__home);
        setTitle(this.getString(R.string.EpictetusDiscoursesBookThreeTitle));

        //Call each activity when click corresponding button
        button = findViewById(R.id.BookThree_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_1();
            }
        });

        button = findViewById(R.id.BookThree_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_2();
            }
        });

        button = findViewById(R.id.BookThree_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_3();
            }
        });

        button = findViewById(R.id.BookThree_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_4();
            }
        });

        button = findViewById(R.id.BookThree_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_5();
            }
        });

        button = findViewById(R.id.BookThree_6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_6();
            }
        });

        button = findViewById(R.id.BookThree_7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_7();
            }
        });

        button = findViewById(R.id.BookThree_8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_8();
            }
        });

        button = findViewById(R.id.BookThree_9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_9();
            }
        });

        button = findViewById(R.id.BookThree_10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_10();
            }
        });

        button = findViewById(R.id.BookThree_11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_11();
            }
        });

        button = findViewById(R.id.BookThree_12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_12();
            }
        });

        button = findViewById(R.id.BookThree_13);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_13();
            }
        });

        button = findViewById(R.id.BookThree_14);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_14();
            }
        });

        button = findViewById(R.id.BookThree_15);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_15();
            }
        });

        button = findViewById(R.id.BookThree_16);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_16();
            }
        });

        button = findViewById(R.id.BookThree_17);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_17();
            }
        });

        button = findViewById(R.id.BookThree_18);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_18();
            }
        });

        button = findViewById(R.id.BookThree_19);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_19();
            }
        });

        button = findViewById(R.id.BookThree_20);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_20();
            }
        });

        button = findViewById(R.id.BookThree_21);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_21();
            }
        });

        button = findViewById(R.id.BookThree_22);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_22();
            }
        });

        button = findViewById(R.id.BookThree_23);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_23();
            }
        });

        button = findViewById(R.id.BookThree_24);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_24();
            }
        });

        button = findViewById(R.id.BookThree_25);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_25();
            }
        });

        button = findViewById(R.id.BookThree_26);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookThree_26();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void BookThree_1() {
        Intent intent = new Intent(this, BookThree_1.class);
        startActivity(intent);
    }

    public void BookThree_2() {
        Intent intent = new Intent(this, BookThree_2.class);
        startActivity(intent);
    }

    public void BookThree_3() {
        Intent intent = new Intent(this, BookThree_3.class);
        startActivity(intent);
    }

    public void BookThree_4() {
        Intent intent = new Intent(this, BookThree_4.class);
        startActivity(intent);
    }

    public void BookThree_5() {
        Intent intent = new Intent(this, BookThree_5.class);
        startActivity(intent);
    }

    public void BookThree_6() {
        Intent intent = new Intent(this, BookThree_6.class);
        startActivity(intent);
    }

    public void BookThree_7() {
        Intent intent = new Intent(this, BookThree_7.class);
        startActivity(intent);
    }

    public void BookThree_8() {
        Intent intent = new Intent(this, BookThree_8.class);
        startActivity(intent);
    }

    public void BookThree_9() {
        Intent intent = new Intent(this, BookThree_9.class);
        startActivity(intent);
    }

    public void BookThree_10() {
        Intent intent = new Intent(this, BookThree_10.class);
        startActivity(intent);
    }

    public void BookThree_11() {
        Intent intent = new Intent(this, BookThree_11.class);
        startActivity(intent);
    }

    public void BookThree_12() {
        Intent intent = new Intent(this, BookThree_12.class);
        startActivity(intent);
    }

    public void BookThree_13() {
        Intent intent = new Intent(this, BookThree_13.class);
        startActivity(intent);
    }

    public void BookThree_14() {
        Intent intent = new Intent(this, BookThree_14.class);
        startActivity(intent);
    }

    public void BookThree_15() {
        Intent intent = new Intent(this, BookThree_15.class);
        startActivity(intent);
    }

    public void BookThree_16() {
        Intent intent = new Intent(this, BookThree_16.class);
        startActivity(intent);
    }

    public void BookThree_17() {
        Intent intent = new Intent(this, BookThree_17.class);
        startActivity(intent);
    }

    public void BookThree_18() {
        Intent intent = new Intent(this, BookThree_18.class);
        startActivity(intent);
    }

    public void BookThree_19() {
        Intent intent = new Intent(this, BookThree_19.class);
        startActivity(intent);
    }

    public void BookThree_20() {
        Intent intent = new Intent(this, BookThree_20.class);
        startActivity(intent);
    }

    public void BookThree_21() {
        Intent intent = new Intent(this, BookThree_21.class);
        startActivity(intent);
    }

    public void BookThree_22() {
        Intent intent = new Intent(this, BookThree_22.class);
        startActivity(intent);
    }

    public void BookThree_23() {
        Intent intent = new Intent(this, BookThree_23.class);
        startActivity(intent);
    }

    public void BookThree_24() {
        Intent intent = new Intent(this, BookThree_24.class);
        startActivity(intent);
    }

    public void BookThree_25() {
        Intent intent = new Intent(this, BookThree_25.class);
        startActivity(intent);
    }

    public void BookThree_26() {
        Intent intent = new Intent(this, BookThree_26.class);
        startActivity(intent);
    }
}
