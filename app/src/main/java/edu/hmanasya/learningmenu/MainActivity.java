package edu.hmanasya.learningmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button vibrationButton;
    private Vibrator vibrator;
    @Override
    public boolean onCreateOptionsMenu(Menu m){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, m);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        if(item.getItemId() == R.id.quit_menu_item){
            finish();
            return true;
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vibrationButton = findViewById(R.id.vibrationButton);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        vibrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Vibrate for 500 milliseconds (0.5 seconds)
                vibrator.vibrate(500);
            }
        });
    }
}