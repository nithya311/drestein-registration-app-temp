package com.nithya.slidemenudrestein;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Registration extends Fragment {
    private WebView mwebview;
	public Registration(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_registration, container, false);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_registration);
        mwebview = (WebView) findViewById(R.id.fragment_registration_webview);
        WebSettings webSettings = mwebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mwebview.loadUrl("http://drestein.avyakta.com/index.html");
        mwebview.setWebViewClient(new WebViewClient());

        return rootView;
    }


}
