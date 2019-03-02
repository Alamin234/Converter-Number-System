package com.example.alamin.converternumbersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class WelcomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome_screen);

        getSupportActionBar().hide();
        Screen screen = new Screen();
        screen.start();


    }
    private class Screen extends Thread{
        public void run(){
            try{
                sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            Intent intent = new Intent(WelcomeScreenActivity.this,MainActivity.class);
            startActivity(intent);
            WelcomeScreenActivity.this.finish();
        }
    }
}
