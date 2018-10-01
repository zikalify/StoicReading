package app.reading.stoic.stoicreading.SenecaMoralLettersLucilius;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;
import app.reading.stoic.stoicreading.SenecaOfProvidence.SenecaOfProvidence_1;

public class SenecaMoralLettersLuciliusHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_moral_letters_lucilius_home);
        setTitle(this.getString(R.string.SenecaMoralLettersToLuciliusTitle));

        //Call each activity when click corresponding button
        button = findViewById(R.id.seneca_letter_001);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter001();
            }
        });

        button = findViewById(R.id.seneca_letter_002);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter002();
            }
        });

        button = findViewById(R.id.seneca_letter_003);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter003();
            }
        });

        button = findViewById(R.id.seneca_letter_004);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter004();
            }
        });

        button = findViewById(R.id.seneca_letter_005);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter005();
            }
        });

        button = findViewById(R.id.seneca_letter_006);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter006();
            }
        });

        button = findViewById(R.id.seneca_letter_007);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter007();
            }
        });

        button = findViewById(R.id.seneca_letter_008);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter008();
            }
        });

        button = findViewById(R.id.seneca_letter_009);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter009();
            }
        });

        button = findViewById(R.id.seneca_letter_010);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter010();
            }
        });

        button = findViewById(R.id.seneca_letter_011);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter011();
            }
        });

        button = findViewById(R.id.seneca_letter_012);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter012();
            }
        });

        button = findViewById(R.id.seneca_letter_013);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter013();
            }
        });

        button = findViewById(R.id.seneca_letter_014);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter014();
            }
        });

        button = findViewById(R.id.seneca_letter_015);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter015();
            }
        });

        button = findViewById(R.id.seneca_letter_016);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter016();
            }
        });

        button = findViewById(R.id.seneca_letter_017);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter017();
            }
        });

        button = findViewById(R.id.seneca_letter_018);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter018();
            }
        });

        button = findViewById(R.id.seneca_letter_019);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter019();
            }
        });

        button = findViewById(R.id.seneca_letter_020);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter020();
            }
        });

        button = findViewById(R.id.seneca_letter_021);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter021();
            }
        });

        button = findViewById(R.id.seneca_letter_022);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter022();
            }
        });

        button = findViewById(R.id.seneca_letter_023);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter023();
            }
        });

        button = findViewById(R.id.seneca_letter_024);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter024();
            }
        });

        button = findViewById(R.id.seneca_letter_025);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter025();
            }
        });

        button = findViewById(R.id.seneca_letter_026);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter026();
            }
        });

        button = findViewById(R.id.seneca_letter_027);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter027();
            }
        });

        button = findViewById(R.id.seneca_letter_028);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter028();
            }
        });

        button = findViewById(R.id.seneca_letter_029);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter029();
            }
        });

        button = findViewById(R.id.seneca_letter_030);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter030();
            }
        });

        button = findViewById(R.id.seneca_letter_031);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter031();
            }
        });

        button = findViewById(R.id.seneca_letter_032);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter032();
            }
        });

        button = findViewById(R.id.seneca_letter_033);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter033();
            }
        });

        button = findViewById(R.id.seneca_letter_034);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter034();
            }
        });

        button = findViewById(R.id.seneca_letter_035);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter035();
            }
        });

        button = findViewById(R.id.seneca_letter_036);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter036();
            }
        });

        button = findViewById(R.id.seneca_letter_037);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter037();
            }
        });

        button = findViewById(R.id.seneca_letter_038);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter038();
            }
        });

        button = findViewById(R.id.seneca_letter_039);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter039();
            }
        });

        button = findViewById(R.id.seneca_letter_040);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter040();
            }
        });

        button = findViewById(R.id.seneca_letter_041);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter041();
            }
        });

        button = findViewById(R.id.seneca_letter_042);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter042();
            }
        });

        button = findViewById(R.id.seneca_letter_043);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter043();
            }
        });

        button = findViewById(R.id.seneca_letter_044);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter044();
            }
        });

        button = findViewById(R.id.seneca_letter_045);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter045();
            }
        });

        button = findViewById(R.id.seneca_letter_046);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter046();
            }
        });

        button = findViewById(R.id.seneca_letter_047);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter047();
            }
        });

        button = findViewById(R.id.seneca_letter_048);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter048();
            }
        });

        button = findViewById(R.id.seneca_letter_049);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter049();
            }
        });

        button = findViewById(R.id.seneca_letter_050);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter050();
            }
        });

        button = findViewById(R.id.seneca_letter_051);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter051();
            }
        });

        button = findViewById(R.id.seneca_letter_052);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter052();
            }
        });

        button = findViewById(R.id.seneca_letter_053);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter053();
            }
        });

        button = findViewById(R.id.seneca_letter_054);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter054();
            }
        });

        button = findViewById(R.id.seneca_letter_055);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter055();
            }
        });

        button = findViewById(R.id.seneca_letter_056);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter056();
            }
        });

        button = findViewById(R.id.seneca_letter_057);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter057();
            }
        });

        button = findViewById(R.id.seneca_letter_058);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter058();
            }
        });

        button = findViewById(R.id.seneca_letter_059);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter059();
            }
        });

        button = findViewById(R.id.seneca_letter_060);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter060();
            }
        });

        button = findViewById(R.id.seneca_letter_061);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter061();
            }
        });

        button = findViewById(R.id.seneca_letter_062);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter062();
            }
        });

        button = findViewById(R.id.seneca_letter_063);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter063();
            }
        });

        button = findViewById(R.id.seneca_letter_064);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter064();
            }
        });

        button = findViewById(R.id.seneca_letter_065);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter065();
            }
        });

        button = findViewById(R.id.seneca_letter_066);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter066();
            }
        });

        button = findViewById(R.id.seneca_letter_067);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter067();
            }
        });

        button = findViewById(R.id.seneca_letter_068);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter068();
            }
        });

        button = findViewById(R.id.seneca_letter_069);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter069();
            }
        });

        button = findViewById(R.id.seneca_letter_070);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter070();
            }
        });

        button = findViewById(R.id.seneca_letter_071);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter071();
            }
        });

        button = findViewById(R.id.seneca_letter_072);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter072();
            }
        });

        button = findViewById(R.id.seneca_letter_073);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter073();
            }
        });

        button = findViewById(R.id.seneca_letter_074);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter074();
            }
        });

        button = findViewById(R.id.seneca_letter_075);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter075();
            }
        });

        button = findViewById(R.id.seneca_letter_076);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter076();
            }
        });

        button = findViewById(R.id.seneca_letter_077);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter077();
            }
        });

        button = findViewById(R.id.seneca_letter_078);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter078();
            }
        });

        button = findViewById(R.id.seneca_letter_079);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter079();
            }
        });

        button = findViewById(R.id.seneca_letter_080);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter080();
            }
        });

        button = findViewById(R.id.seneca_letter_081);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter081();
            }
        });

        button = findViewById(R.id.seneca_letter_082);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter082();
            }
        });

        button = findViewById(R.id.seneca_letter_083);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter083();
            }
        });

        button = findViewById(R.id.seneca_letter_084);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter084();
            }
        });

        button = findViewById(R.id.seneca_letter_085);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter085();
            }
        });

        button = findViewById(R.id.seneca_letter_086);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter086();
            }
        });

        button = findViewById(R.id.seneca_letter_087);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter087();
            }
        });

        button = findViewById(R.id.seneca_letter_088);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter088();
            }
        });

        button = findViewById(R.id.seneca_letter_089);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter089();
            }
        });

        button = findViewById(R.id.seneca_letter_090);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter090();
            }
        });

        button = findViewById(R.id.seneca_letter_091);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter091();
            }
        });

        button = findViewById(R.id.seneca_letter_092);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter092();
            }
        });

        button = findViewById(R.id.seneca_letter_093);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter093();
            }
        });

        button = findViewById(R.id.seneca_letter_094);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter094();
            }
        });

        button = findViewById(R.id.seneca_letter_095);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter095();
            }
        });

        button = findViewById(R.id.seneca_letter_096);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter096();
            }
        });

        button = findViewById(R.id.seneca_letter_097);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter097();
            }
        });

        button = findViewById(R.id.seneca_letter_098);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter098();
            }
        });

        button = findViewById(R.id.seneca_letter_099);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter099();
            }
        });

        button = findViewById(R.id.seneca_letter_100);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter100();
            }
        });

        button = findViewById(R.id.seneca_letter_101);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter101();
            }
        });

        button = findViewById(R.id.seneca_letter_102);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter102();
            }
        });

        button = findViewById(R.id.seneca_letter_103);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter103();
            }
        });

        button = findViewById(R.id.seneca_letter_104);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter104();
            }
        });

        button = findViewById(R.id.seneca_letter_105);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter105();
            }
        });

        button = findViewById(R.id.seneca_letter_106);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter106();
            }
        });

        button = findViewById(R.id.seneca_letter_107);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter107();
            }
        });

        button = findViewById(R.id.seneca_letter_108);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter108();
            }
        });

        button = findViewById(R.id.seneca_letter_109);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter109();
            }
        });

        button = findViewById(R.id.seneca_letter_110);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter110();
            }
        });

        button = findViewById(R.id.seneca_letter_111);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter111();
            }
        });

        button = findViewById(R.id.seneca_letter_112);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter112();
            }
        });

        button = findViewById(R.id.seneca_letter_113);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter113();
            }
        });

        button = findViewById(R.id.seneca_letter_114);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter114();
            }
        });

        button = findViewById(R.id.seneca_letter_115);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter115();
            }
        });

        button = findViewById(R.id.seneca_letter_116);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter116();
            }
        });

        button = findViewById(R.id.seneca_letter_117);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter117();
            }
        });

        button = findViewById(R.id.seneca_letter_118);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter118();
            }
        });

        button = findViewById(R.id.seneca_letter_119);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter119();
            }
        });

        button = findViewById(R.id.seneca_letter_120);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter120();
            }
        });

        button = findViewById(R.id.seneca_letter_121);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter121();
            }
        });

        button = findViewById(R.id.seneca_letter_122);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter122();
            }
        });

        button = findViewById(R.id.seneca_letter_123);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter123();
            }
        });

        button = findViewById(R.id.seneca_letter_124);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaLetter124();
            }
        });

    }

    //Activity call methods, called by buttons above
    public void SenecaLetter001() {
        Intent intent = new Intent(this, SenecaLetter_001.class);
        startActivity(intent);
    }

    public void SenecaLetter002() {
        Intent intent = new Intent(this, SenecaLetter_002.class);
        startActivity(intent);
    }

    public void SenecaLetter003() {
        Intent intent = new Intent(this, SenecaLetter_003.class);
        startActivity(intent);
    }

    public void SenecaLetter004() {
        Intent intent = new Intent(this, SenecaLetter_004.class);
        startActivity(intent);
    }

    public void SenecaLetter005() {
        Intent intent = new Intent(this, SenecaLetter_005.class);
        startActivity(intent);
    }

    public void SenecaLetter006() {
        Intent intent = new Intent(this, SenecaLetter_006.class);
        startActivity(intent);
    }

    public void SenecaLetter007() {
        Intent intent = new Intent(this, SenecaLetter_007.class);
        startActivity(intent);
    }

    public void SenecaLetter008() {
        Intent intent = new Intent(this, SenecaLetter_008.class);
        startActivity(intent);
    }

    public void SenecaLetter009() {
        Intent intent = new Intent(this, SenecaLetter_009.class);
        startActivity(intent);
    }

    public void SenecaLetter010() {
        Intent intent = new Intent(this, SenecaLetter_010.class);
        startActivity(intent);
    }

    public void SenecaLetter011() {
        Intent intent = new Intent(this, SenecaLetter_011.class);
        startActivity(intent);
    }

    public void SenecaLetter012() {
        Intent intent = new Intent(this, SenecaLetter_012.class);
        startActivity(intent);
    }

    public void SenecaLetter013() {
        Intent intent = new Intent(this, SenecaLetter_013.class);
        startActivity(intent);
    }

    public void SenecaLetter014() {
        Intent intent = new Intent(this, SenecaLetter_014.class);
        startActivity(intent);
    }

    public void SenecaLetter015() {
        Intent intent = new Intent(this, SenecaLetter_015.class);
        startActivity(intent);
    }

    public void SenecaLetter016() {
        Intent intent = new Intent(this, SenecaLetter_016.class);
        startActivity(intent);
    }

    public void SenecaLetter017() {
        Intent intent = new Intent(this, SenecaLetter_017.class);
        startActivity(intent);
    }

    public void SenecaLetter018() {
        Intent intent = new Intent(this, SenecaLetter_018.class);
        startActivity(intent);
    }

    public void SenecaLetter019() {
        Intent intent = new Intent(this, SenecaLetter_019.class);
        startActivity(intent);
    }

    public void SenecaLetter020() {
        Intent intent = new Intent(this, SenecaLetter_020.class);
        startActivity(intent);
    }

    public void SenecaLetter021() {
        Intent intent = new Intent(this, SenecaLetter_021.class);
        startActivity(intent);
    }

    public void SenecaLetter022() {
        Intent intent = new Intent(this, SenecaLetter_022.class);
        startActivity(intent);
    }

    public void SenecaLetter023() {
        Intent intent = new Intent(this, SenecaLetter_023.class);
        startActivity(intent);
    }

    public void SenecaLetter024() {
        Intent intent = new Intent(this, SenecaLetter_024.class);
        startActivity(intent);
    }

    public void SenecaLetter025() {
        Intent intent = new Intent(this, SenecaLetter_025.class);
        startActivity(intent);
    }

    public void SenecaLetter026() {
        Intent intent = new Intent(this, SenecaLetter_026.class);
        startActivity(intent);
    }

    public void SenecaLetter027() {
        Intent intent = new Intent(this, SenecaLetter_027.class);
        startActivity(intent);
    }

    public void SenecaLetter028() {
        Intent intent = new Intent(this, SenecaLetter_028.class);
        startActivity(intent);
    }

    public void SenecaLetter029() {
        Intent intent = new Intent(this, SenecaLetter_029.class);
        startActivity(intent);
    }

    public void SenecaLetter030() {
        Intent intent = new Intent(this, SenecaLetter_030.class);
        startActivity(intent);
    }

    public void SenecaLetter031() {
        Intent intent = new Intent(this, SenecaLetter_031.class);
        startActivity(intent);
    }

    public void SenecaLetter032() {
        Intent intent = new Intent(this, SenecaLetter_032.class);
        startActivity(intent);
    }

    public void SenecaLetter033() {
        Intent intent = new Intent(this, SenecaLetter_033.class);
        startActivity(intent);
    }

    public void SenecaLetter034() {
        Intent intent = new Intent(this, SenecaLetter_034.class);
        startActivity(intent);
    }

    public void SenecaLetter035() {
        Intent intent = new Intent(this, SenecaLetter_035.class);
        startActivity(intent);
    }

    public void SenecaLetter036() {
        Intent intent = new Intent(this, SenecaLetter_036.class);
        startActivity(intent);
    }

    public void SenecaLetter037() {
        Intent intent = new Intent(this, SenecaLetter_037.class);
        startActivity(intent);
    }

    public void SenecaLetter038() {
        Intent intent = new Intent(this, SenecaLetter_038.class);
        startActivity(intent);
    }

    public void SenecaLetter039() {
        Intent intent = new Intent(this, SenecaLetter_039.class);
        startActivity(intent);
    }

    public void SenecaLetter040() {
        Intent intent = new Intent(this, SenecaLetter_040.class);
        startActivity(intent);
    }

    public void SenecaLetter041() {
        Intent intent = new Intent(this, SenecaLetter_041.class);
        startActivity(intent);
    }

    public void SenecaLetter042() {
        Intent intent = new Intent(this, SenecaLetter_042.class);
        startActivity(intent);
    }

    public void SenecaLetter043() {
        Intent intent = new Intent(this, SenecaLetter_043.class);
        startActivity(intent);
    }

    public void SenecaLetter044() {
        Intent intent = new Intent(this, SenecaLetter_044.class);
        startActivity(intent);
    }

    public void SenecaLetter045() {
        Intent intent = new Intent(this, SenecaLetter_045.class);
        startActivity(intent);
    }

    public void SenecaLetter046() {
        Intent intent = new Intent(this, SenecaLetter_046.class);
        startActivity(intent);
    }

    public void SenecaLetter047() {
        Intent intent = new Intent(this, SenecaLetter_047.class);
        startActivity(intent);
    }

    public void SenecaLetter048() {
        Intent intent = new Intent(this, SenecaLetter_048.class);
        startActivity(intent);
    }

    public void SenecaLetter049() {
        Intent intent = new Intent(this, SenecaLetter_049.class);
        startActivity(intent);
    }

    public void SenecaLetter050() {
        Intent intent = new Intent(this, SenecaLetter_050.class);
        startActivity(intent);
    }

    public void SenecaLetter051() {
        Intent intent = new Intent(this, SenecaLetter_051.class);
        startActivity(intent);
    }

    public void SenecaLetter052() {
        Intent intent = new Intent(this, SenecaLetter_052.class);
        startActivity(intent);
    }

    public void SenecaLetter053() {
        Intent intent = new Intent(this, SenecaLetter_053.class);
        startActivity(intent);
    }

    public void SenecaLetter054() {
        Intent intent = new Intent(this, SenecaLetter_054.class);
        startActivity(intent);
    }

    public void SenecaLetter055() {
        Intent intent = new Intent(this, SenecaLetter_055.class);
        startActivity(intent);
    }

    public void SenecaLetter056() {
        Intent intent = new Intent(this, SenecaLetter_056.class);
        startActivity(intent);
    }

    public void SenecaLetter057() {
        Intent intent = new Intent(this, SenecaLetter_057.class);
        startActivity(intent);
    }

    public void SenecaLetter058() {
        Intent intent = new Intent(this, SenecaLetter_058.class);
        startActivity(intent);
    }

    public void SenecaLetter059() {
        Intent intent = new Intent(this, SenecaLetter_059.class);
        startActivity(intent);
    }

    public void SenecaLetter060() {
        Intent intent = new Intent(this, SenecaLetter_060.class);
        startActivity(intent);
    }

    public void SenecaLetter061() {
        Intent intent = new Intent(this, SenecaLetter_061.class);
        startActivity(intent);
    }

    public void SenecaLetter062() {
        Intent intent = new Intent(this, SenecaLetter_062.class);
        startActivity(intent);
    }

    public void SenecaLetter063() {
        Intent intent = new Intent(this, SenecaLetter_063.class);
        startActivity(intent);
    }

    public void SenecaLetter064() {
        Intent intent = new Intent(this, SenecaLetter_064.class);
        startActivity(intent);
    }

    public void SenecaLetter065() {
        Intent intent = new Intent(this, SenecaLetter_065.class);
        startActivity(intent);
    }

    public void SenecaLetter066() {
        Intent intent = new Intent(this, SenecaLetter_066.class);
        startActivity(intent);
    }

    public void SenecaLetter067() {
        Intent intent = new Intent(this, SenecaLetter_067.class);
        startActivity(intent);
    }

    public void SenecaLetter068() {
        Intent intent = new Intent(this, SenecaLetter_068.class);
        startActivity(intent);
    }

    public void SenecaLetter069() {
        Intent intent = new Intent(this, SenecaLetter_069.class);
        startActivity(intent);
    }

    public void SenecaLetter070() {
        Intent intent = new Intent(this, SenecaLetter_070.class);
        startActivity(intent);
    }

    public void SenecaLetter071() {
        Intent intent = new Intent(this, SenecaLetter_071.class);
        startActivity(intent);
    }

    public void SenecaLetter072() {
        Intent intent = new Intent(this, SenecaLetter_072.class);
        startActivity(intent);
    }

    public void SenecaLetter073() {
        Intent intent = new Intent(this, SenecaLetter_073.class);
        startActivity(intent);
    }

    public void SenecaLetter074() {
        Intent intent = new Intent(this, SenecaLetter_074.class);
        startActivity(intent);
    }

    public void SenecaLetter075() {
        Intent intent = new Intent(this, SenecaLetter_075.class);
        startActivity(intent);
    }

    public void SenecaLetter076() {
        Intent intent = new Intent(this, SenecaLetter_076.class);
        startActivity(intent);
    }

    public void SenecaLetter077() {
        Intent intent = new Intent(this, SenecaLetter_077.class);
        startActivity(intent);
    }

    public void SenecaLetter078() {
        Intent intent = new Intent(this, SenecaLetter_078.class);
        startActivity(intent);
    }

    public void SenecaLetter079() {
        Intent intent = new Intent(this, SenecaLetter_079.class);
        startActivity(intent);
    }

    public void SenecaLetter080() {
        Intent intent = new Intent(this, SenecaLetter_080.class);
        startActivity(intent);
    }

    public void SenecaLetter081() {
        Intent intent = new Intent(this, SenecaLetter_081.class);
        startActivity(intent);
    }

    public void SenecaLetter082() {
        Intent intent = new Intent(this, SenecaLetter_082.class);
        startActivity(intent);
    }

    public void SenecaLetter083() {
        Intent intent = new Intent(this, SenecaLetter_083.class);
        startActivity(intent);
    }

    public void SenecaLetter084() {
        Intent intent = new Intent(this, SenecaLetter_084.class);
        startActivity(intent);
    }

    public void SenecaLetter085() {
        Intent intent = new Intent(this, SenecaLetter_085.class);
        startActivity(intent);
    }

    public void SenecaLetter086() {
        Intent intent = new Intent(this, SenecaLetter_086.class);
        startActivity(intent);
    }

    public void SenecaLetter087() {
        Intent intent = new Intent(this, SenecaLetter_087.class);
        startActivity(intent);
    }

    public void SenecaLetter088() {
        Intent intent = new Intent(this, SenecaLetter_088.class);
        startActivity(intent);
    }

    public void SenecaLetter089() {
        Intent intent = new Intent(this, SenecaLetter_089.class);
        startActivity(intent);
    }

    public void SenecaLetter090() {
        Intent intent = new Intent(this, SenecaLetter_090.class);
        startActivity(intent);
    }

    public void SenecaLetter091() {
        Intent intent = new Intent(this, SenecaLetter_091.class);
        startActivity(intent);
    }

    public void SenecaLetter092() {
        Intent intent = new Intent(this, SenecaLetter_092.class);
        startActivity(intent);
    }

    public void SenecaLetter093() {
        Intent intent = new Intent(this, SenecaLetter_093.class);
        startActivity(intent);
    }

    public void SenecaLetter094() {
        Intent intent = new Intent(this, SenecaLetter_094.class);
        startActivity(intent);
    }

    public void SenecaLetter095() {
        Intent intent = new Intent(this, SenecaLetter_095.class);
        startActivity(intent);
    }

    public void SenecaLetter096() {
        Intent intent = new Intent(this, SenecaLetter_096.class);
        startActivity(intent);
    }

    public void SenecaLetter097() {
        Intent intent = new Intent(this, SenecaLetter_097.class);
        startActivity(intent);
    }

    public void SenecaLetter098() {
        Intent intent = new Intent(this, SenecaLetter_098.class);
        startActivity(intent);
    }

    public void SenecaLetter099() {
        Intent intent = new Intent(this, SenecaLetter_099.class);
        startActivity(intent);
    }

    public void SenecaLetter100() {
        Intent intent = new Intent(this, SenecaLetter_100.class);
        startActivity(intent);
    }

    public void SenecaLetter101() {
        Intent intent = new Intent(this, SenecaLetter_101.class);
        startActivity(intent);
    }

    public void SenecaLetter102() {
        Intent intent = new Intent(this, SenecaLetter_102.class);
        startActivity(intent);
    }

    public void SenecaLetter103() {
        Intent intent = new Intent(this, SenecaLetter_103.class);
        startActivity(intent);
    }

    public void SenecaLetter104() {
        Intent intent = new Intent(this, SenecaLetter_104.class);
        startActivity(intent);
    }

    public void SenecaLetter105() {
        Intent intent = new Intent(this, SenecaLetter_105.class);
        startActivity(intent);
    }

    public void SenecaLetter106() {
        Intent intent = new Intent(this, SenecaLetter_106.class);
        startActivity(intent);
    }

    public void SenecaLetter107() {
        Intent intent = new Intent(this, SenecaLetter_107.class);
        startActivity(intent);
    }

    public void SenecaLetter108() {
        Intent intent = new Intent(this, SenecaLetter_108.class);
        startActivity(intent);
    }

    public void SenecaLetter109() {
        Intent intent = new Intent(this, SenecaLetter_109.class);
        startActivity(intent);
    }

    public void SenecaLetter110() {
        Intent intent = new Intent(this, SenecaLetter_110.class);
        startActivity(intent);
    }

    public void SenecaLetter111() {
        Intent intent = new Intent(this, SenecaLetter_111.class);
        startActivity(intent);
    }

    public void SenecaLetter112() {
        Intent intent = new Intent(this, SenecaLetter_112.class);
        startActivity(intent);
    }

    public void SenecaLetter113() {
        Intent intent = new Intent(this, SenecaLetter_113.class);
        startActivity(intent);
    }

    public void SenecaLetter114() {
        Intent intent = new Intent(this, SenecaLetter_114.class);
        startActivity(intent);
    }

    public void SenecaLetter115() {
        Intent intent = new Intent(this, SenecaLetter_115.class);
        startActivity(intent);
    }

    public void SenecaLetter116() {
        Intent intent = new Intent(this, SenecaLetter_116.class);
        startActivity(intent);
    }

    public void SenecaLetter117() {
        Intent intent = new Intent(this, SenecaLetter_117.class);
        startActivity(intent);
    }

    public void SenecaLetter118() {
        Intent intent = new Intent(this, SenecaLetter_118.class);
        startActivity(intent);
    }

    public void SenecaLetter119() {
        Intent intent = new Intent(this, SenecaLetter_119.class);
        startActivity(intent);
    }

    public void SenecaLetter120() {
        Intent intent = new Intent(this, SenecaLetter_120.class);
        startActivity(intent);
    }

    public void SenecaLetter121() {
        Intent intent = new Intent(this, SenecaLetter_121.class);
        startActivity(intent);
    }

    public void SenecaLetter122() {
        Intent intent = new Intent(this, SenecaLetter_122.class);
        startActivity(intent);
    }

    public void SenecaLetter123() {
        Intent intent = new Intent(this, SenecaLetter_123.class);
        startActivity(intent);
    }

    public void SenecaLetter124() {
        Intent intent = new Intent(this, SenecaLetter_124.class);
        startActivity(intent);
    }
}
