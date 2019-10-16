package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //  forget it        getSupportActionBar().hide();

        setContentView(R.layout.activity_splash);
        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();


    }

    private class LogoLauncher extends Thread {
        public void run() {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(Splash.this, MainActivity.class);
            startActivity(intent);
            Splash.this.finish();
        }
    }
}
