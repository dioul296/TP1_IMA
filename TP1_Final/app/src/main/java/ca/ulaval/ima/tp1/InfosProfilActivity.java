package ca.ulaval.ima.tp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfosProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos_profil);

         Profil user=getIntent().getExtras().getParcelable("user");
        String userStr="";

        if (user!=null){
            userStr+="\nNom                            :"+user.getNom()+"\nPrenom                      :"+user.getPrenom()+"\nDate de naissance   :"+user.getDateNaissance().getYear()+"/"+user.getDateNaissance().getMonth()+"/"+user.getDateNaissance().getDate()+"\nIdul                              :"+user.getIdul();
            TextView textView=(TextView) findViewById(R.id.textViewInfos);
            textView.setText(userStr);

        }



        Button buttonWebView = (Button) findViewById(R.id.buttonInfos);
        buttonWebView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }
}
