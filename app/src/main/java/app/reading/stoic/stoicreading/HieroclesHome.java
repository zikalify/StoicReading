package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.HieroclesFragments.HieroclesFragmentsHome;

public class HieroclesHome extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hierocles_home);
        setTitle(this.getString(R.string.Hierocles));

        //Call each activity when click corresponding button
        button = (Button) findViewById(R.id.hierocles_fragments_home);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HieroclesFragmentsHome();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void HieroclesFragmentsHome() {
        Intent intent = new Intent(this, HieroclesFragmentsHome.class);
        startActivity(intent);
    }
}
