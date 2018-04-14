package app.reading.stoic.stoicreading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EpictetusHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epictetus_home);
        setTitle(this.getString(R.string.Epictetus));
    }
}
