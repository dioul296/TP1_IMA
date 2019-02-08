











package ca.ulaval.ima.tp1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Date;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    Date date= new Date(1996,04,22);
    final Profil user= new Profil("Diallo","Mamadou Diouldé", (Date) date,"111244797");
    final String UrlToLoad="https://www.youtube.com/";





    public void SiteWebActivity(View view){
        Intent siteWebIntent=new Intent(Intent.ACTION_VIEW,Uri.parse(UrlToLoad));
        startActivity(siteWebIntent);
    }

    public void MonProfilActivity(View view){
        Intent profilActivity= new Intent(MainActivity.this, WebViewActivity.class).putExtra("UrlToLoad",UrlToLoad);
        startActivity(profilActivity);
    }

    public void UlavalActivity(View view){
        Intent ulavalActivity= new Intent(MainActivity.this, UlavalActivity.class);
        startActivity(ulavalActivity);
    }

    public void InfosProfil(View view){
        Intent infosProfilActivity= new Intent(MainActivity.this, InfosProfilActivity.class).putExtra("user",user);
        startActivity(infosProfilActivity);
    }




}

