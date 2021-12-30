package Charl12_gb.locker;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Locker extends AppCompatActivity {

    private EditText _pass;
    private Button _btnp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locker);

        _pass = (EditText) findViewById(R.id.pin);
        _btnp = (Button) findViewById(R.id.pinbtn);

        _btnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pinT = "";

                try {
                    InputStream is = getAssets().open("pinFile.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    pinT = new String( buffer );
                }catch (IOException ex){
                    ex.printStackTrace();
                }
                String val1 = pinT.trim();
                String val2 = _pass.getText().toString().trim();
                if(val1.equals(val2)){
                    afficheListe();
                }else {
                    Toast.makeText(getApplicationContext(), "PIN INCORRECT", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void afficheListe(){
        Intent liste = new Intent(this, Liste.class);
        startActivity(liste);
    }

//    public void entrez(View view) {
//        String pass = _pass.getText().toString().trim();
//        if( pass.equals("1234") ){
//            Intent liste = new Intent(this, Liste.class);
//            startActivity(liste);
//        }else{
//            Toast.makeText(getApplicationContext(), "PIN INCORRECT", Toast.LENGTH_LONG).show();
//        }
//    }
}