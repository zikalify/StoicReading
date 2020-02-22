package app.reading.stoic.stoicreading.AsclepiodotusTactics;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class AsclepiodotusTacticsHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_asclepiodotus_tactics_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.AsclepiodotusTacticsTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.asclepiodotus_tactics_1);
        button.setOnClickListener(v -> AsclepiodotusTactics1());

        button = findViewById(R.id.asclepiodotus_tactics_2);
        button.setOnClickListener(v -> AsclepiodotusTactics2());

        button = findViewById(R.id.asclepiodotus_tactics_3);
        button.setOnClickListener(v -> AsclepiodotusTactics3());

        button = findViewById(R.id.asclepiodotus_tactics_4);
        button.setOnClickListener(v -> AsclepiodotusTactics4());

        button = findViewById(R.id.asclepiodotus_tactics_5);
        button.setOnClickListener(v -> AsclepiodotusTactics5());

        button = findViewById(R.id.asclepiodotus_tactics_6);
        button.setOnClickListener(v -> AsclepiodotusTactics6());

        button = findViewById(R.id.asclepiodotus_tactics_7);
        button.setOnClickListener(v -> AsclepiodotusTactics7());

        button = findViewById(R.id.asclepiodotus_tactics_8);
        button.setOnClickListener(v -> AsclepiodotusTactics8());

        button = findViewById(R.id.asclepiodotus_tactics_9);
        button.setOnClickListener(v -> AsclepiodotusTactics9());

        button = findViewById(R.id.asclepiodotus_tactics_10);
        button.setOnClickListener(v -> AsclepiodotusTactics10());

        button = findViewById(R.id.asclepiodotus_tactics_11);
        button.setOnClickListener(v -> AsclepiodotusTactics11());

        button = findViewById(R.id.asclepiodotus_tactics_12);
        button.setOnClickListener(v -> AsclepiodotusTactics12());
    }

    //Activity call methods, called by buttons above
    public void AsclepiodotusTactics1() {
        Intent intent = new Intent(this, AsclepiodotusTactics1.class);
        startActivity(intent);
    }

    public void AsclepiodotusTactics2() {
        Intent intent = new Intent(this, AsclepiodotusTactics2.class);
        startActivity(intent);
    }

    public void AsclepiodotusTactics3() {
        Intent intent = new Intent(this, AsclepiodotusTactics3.class);
        startActivity(intent);
    }

    public void AsclepiodotusTactics4() {
        Intent intent = new Intent(this, AsclepiodotusTactics4.class);
        startActivity(intent);
    }

    public void AsclepiodotusTactics5() {
        Intent intent = new Intent(this, AsclepiodotusTactics5.class);
        startActivity(intent);
    }

    public void AsclepiodotusTactics6() {
        Intent intent = new Intent(this, AsclepiodotusTactics6.class);
        startActivity(intent);
    }

    public void AsclepiodotusTactics7() {
        Intent intent = new Intent(this, AsclepiodotusTactics7.class);
        startActivity(intent);
    }

    public void AsclepiodotusTactics8() {
        Intent intent = new Intent(this, AsclepiodotusTactics8.class);
        startActivity(intent);
    }

    public void AsclepiodotusTactics9() {
        Intent intent = new Intent(this, AsclepiodotusTactics9.class);
        startActivity(intent);
    }

    public void AsclepiodotusTactics10() {
        Intent intent = new Intent(this, AsclepiodotusTactics10.class);
        startActivity(intent);
    }

    public void AsclepiodotusTactics11() {
        Intent intent = new Intent(this, AsclepiodotusTactics11.class);
        startActivity(intent);
    }

    public void AsclepiodotusTactics12() {
        Intent intent = new Intent(this, AsclepiodotusTactics12.class);
        startActivity(intent);
    }
}