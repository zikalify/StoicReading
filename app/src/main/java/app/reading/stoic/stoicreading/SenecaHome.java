package app.reading.stoic.stoicreading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SenecaHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seneca_home);
        setTitle(this.getString(R.string.Seneca));
    }
}
