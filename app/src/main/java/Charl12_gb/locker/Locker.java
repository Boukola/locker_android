package Charl12_gb.locker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Locker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locker);

    }

    public void entrez(View view) {
        Intent liste = new Intent(this, Liste.class);
        startActivity(liste);
    }
}