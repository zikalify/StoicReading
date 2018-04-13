package app.reading.stoic.stoicreading.RufusLectures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class LecHome extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lec_home);
        setTitle(this.getString(R.string.RufusLecTitle));

        //Call each activity when click corresponding button
        button = (Button) findViewById(R.id.rufus_lec_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec1();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec2();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec3();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec4();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec5();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec6();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec7();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec8();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec9();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec10();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec11();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec12();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_13A);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec13A();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_13B);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec13B();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_14);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec14();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_15);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec15();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_16);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec16();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_17);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec17();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_18A);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec18A();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_18B);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec18B();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_19);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec19();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_20);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec20();
            }
        });

        button = (Button) findViewById(R.id.rufus_lec_21);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec21();
            }
        });

    }

    //Activity call methods, called by buttons above
    public void Lec1() {
        Intent intent = new Intent(this, Lec1.class);
        startActivity(intent);
    }

    public void Lec2() {
        Intent intent = new Intent(this, Lec2.class);
        startActivity(intent);
    }

    public void Lec3() {
        Intent intent = new Intent(this, Lec3.class);
        startActivity(intent);
    }

    public void Lec4() {
        Intent intent = new Intent(this, Lec4.class);
        startActivity(intent);
    }

    public void Lec5() {
        Intent intent = new Intent(this, Lec5.class);
        startActivity(intent);
    }

    public void Lec6() {
        Intent intent = new Intent(this, Lec6.class);
        startActivity(intent);
    }

    public void Lec7() {
        Intent intent = new Intent(this, Lec7.class);
        startActivity(intent);
    }

    public void Lec8() {
        Intent intent = new Intent(this, Lec8.class);
        startActivity(intent);
    }

    public void Lec9() {
        Intent intent = new Intent(this, Lec9.class);
        startActivity(intent);
    }

    public void Lec10() {
        Intent intent = new Intent(this, Lec10.class);
        startActivity(intent);
    }

    public void Lec11() {
        Intent intent = new Intent(this, Lec11.class);
        startActivity(intent);
    }

    public void Lec12() {
        Intent intent = new Intent(this, Lec12.class);
        startActivity(intent);
    }

    public void Lec13A() {
        Intent intent = new Intent(this, Lec13.class);
        startActivity(intent);
    }

    public void Lec13B() {
        Intent intent = new Intent(this, Lec13B.class);
        startActivity(intent);
    }

    public void Lec14() {
        Intent intent = new Intent(this, Lec14.class);
        startActivity(intent);
    }

    public void Lec15() {
        Intent intent = new Intent(this, Lec15.class);
        startActivity(intent);
    }

    public void Lec16() {
        Intent intent = new Intent(this, Lec16.class);
        startActivity(intent);
    }

    public void Lec17() {
        Intent intent = new Intent(this, Lec17.class);
        startActivity(intent);
    }

    public void Lec18A() {
        Intent intent = new Intent(this, Lec18.class);
        startActivity(intent);
    }

    public void Lec18B() {
        Intent intent = new Intent(this, Lec18B.class);
        startActivity(intent);
    }

    public void Lec19() {
        Intent intent = new Intent(this, Lec19.class);
        startActivity(intent);
    }

    public void Lec20() {
        Intent intent = new Intent(this, Lec20.class);
        startActivity(intent);
    }

    public void Lec21() {
        Intent intent = new Intent(this, Lec21.class);
        startActivity(intent);
    }


}
