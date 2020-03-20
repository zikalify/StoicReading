package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;


public class MainActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        CheckBox toggle = findViewById(R.id.toggle_dark_theme);
        toggle.setChecked(useDarkTheme);

        toggle.setOnCheckedChangeListener((view, isChecked) -> toggleTheme(isChecked));

        if(toggle.isChecked()){
            toggle.setTextColor(Color.parseColor("#e2e2e2"));
        }

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.rufus_button);
        button.setOnClickListener(v -> rufusHome());

        button = findViewById(R.id.epictetus_button);
        button.setOnClickListener(v -> epictetusHome());

        button = findViewById(R.id.hierocles_button);
        button.setOnClickListener(v -> hieroclesHome());

        button = findViewById(R.id.seneca_button);
        button.setOnClickListener(v -> senecaHome());

        button = findViewById(R.id.aurelius_button);
        button.setOnClickListener(v -> aureliusHome());

        button = findViewById(R.id.zeno_button);
        button.setOnClickListener(v -> zenoHome());

        button = findViewById(R.id.cleanthes_button);
        button.setOnClickListener(v -> cleanthesHome());

        button = findViewById(R.id.chrysippus_button);
        button.setOnClickListener(v -> chrysippusHome());

        button = findViewById(R.id.zenodotus_button);
        button.setOnClickListener(v -> zenodotusHome());

        button = findViewById(R.id.aratus_button);
        button.setOnClickListener(v -> aratusHome());

        button = findViewById(R.id.didymus_button);
        button.setOnClickListener(v -> didymusHome());

        button = findViewById(R.id.posidonius_button);
        button.setOnClickListener(v -> posidoniusHome());

        button = findViewById(R.id.panaetius_button);
        button.setOnClickListener(v -> panaetiusHome());

        button = findViewById(R.id.attalus_button);
        button.setOnClickListener(v -> attalusHome());

        button = findViewById(R.id.asclepiodotus_button);
        button.setOnClickListener(v -> asclepiodotusHome());
    }

    //Activity call methods, called by buttons above
    public void rufusHome() {
        Intent intent = new Intent(this, RufusHome.class);
        startActivity(intent);
    }

    public void epictetusHome() {
        Intent intent = new Intent(this, EpictetusHome.class);
        startActivity(intent);
    }

    public void hieroclesHome() {
        Intent intent = new Intent(this, HieroclesHome.class);
        startActivity(intent);
    }

    public void aureliusHome() {
        Intent intent = new Intent(this, AureliusHome.class);
        startActivity(intent);
    }

    public void senecaHome() {
        Intent intent = new Intent(this, SenecaHome.class);
        startActivity(intent);
    }

    public void zenoHome() {
        Intent intent = new Intent(this, ZenoHome.class);
        startActivity(intent);
    }

    public void cleanthesHome() {
        Intent intent = new Intent(this, CleanthesHome.class);
        startActivity(intent);
    }

    public void chrysippusHome() {
        Intent intent = new Intent(this, ChrysippusHome.class);
        startActivity(intent);
    }

    public void zenodotusHome() {
        Intent intent = new Intent(this, ZenodotusHome.class);
        startActivity(intent);
    }

    public void aratusHome() {
        Intent intent = new Intent(this, AratusHome.class);
        startActivity(intent);
    }

    public void didymusHome() {
        Intent intent = new Intent(this, DidymusHome.class);
        startActivity(intent);
    }

    public void posidoniusHome() {
        Intent intent = new Intent(this, PosidoniusHome.class);
        startActivity(intent);
    }

    public void panaetiusHome() {
        Intent intent = new Intent(this, PanaetiusHome.class);
        startActivity(intent);
    }

    public void attalusHome() {
        Intent intent = new Intent(this, AttalusHome.class);
        startActivity(intent);
    }

    public void asclepiodotusHome() {
        Intent intent = new Intent(this, AsclepiodotusHome.class);
        startActivity(intent);
    }

    private void toggleTheme(boolean darkTheme) {
        SharedPreferences.Editor editor = getSharedPreferences(PREFS_NAME, MODE_PRIVATE).edit();
        editor.putBoolean(PREF_DARK_THEME, darkTheme);
        editor.apply();

        Intent intent = getIntent();
        finish();

        startActivity(intent);
    }

}