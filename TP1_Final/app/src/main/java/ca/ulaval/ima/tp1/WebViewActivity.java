package ca.ulaval.ima.tp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        //final String UrlToLoad="https://www.youtube.com/";
        String UrlToLoad=this.getIntent().getStringExtra("UrlToLoad");
        WebView webView=(WebView) findViewById(R.id.webView);
        webView.loadUrl(UrlToLoad);

        webView.setWebViewClient(new WebViewClient(){
            public void onPageFinished(WebView view, String url){}
        });


        Button buttonWebView = (Button) findViewById(R.id.buttonwebview);
        buttonWebView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}
