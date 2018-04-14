package app.reading.stoic.stoicreading.HieroclesFragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class HieroclesFragmentsHome extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hierocles_fragments_home);
        setTitle(this.getString(R.string.HieroclesFragmentsTitle));

        //Call each activity when click corresponding button
        button = (Button) findViewById(R.id.hierocles_fragments_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HieroclesFrag1();
            }
        });

        button = (Button) findViewById(R.id.hierocles_fragments_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HieroclesFrag2();
            }
        });

        button = (Button) findViewById(R.id.hierocles_fragments_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HieroclesFrag3();
            }
        });

        button = (Button) findViewById(R.id.hierocles_fragments_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HieroclesFrag4();
            }
        });

        button = (Button) findViewById(R.id.hierocles_fragments_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HieroclesFrag5();
            }
        });

        button = (Button) findViewById(R.id.hierocles_fragments_6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HieroclesFrag6();
            }
        });

        button = (Button) findViewById(R.id.hierocles_fragments_7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HieroclesFrag7();
            }
        });
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
