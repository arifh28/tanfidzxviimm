package com.fasco.tanfidzxviimmonline;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InfoDAMFragment extends Fragment {

    Context context;
    private WebView myWebView;

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        myWebView.saveState(outState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        myWebView.restoreState(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saved)
    {
        View v = inflater.inflate(R.layout.fragment_infodam, container, false);
        final ProgressDialog pd = ProgressDialog.show(getActivity(),  "Menyambungkan...", "Silahkan tunggu Immawan/Immawati.", true);

        myWebView = (WebView) v.findViewById(R.id.webView);
        myWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                pd.dismiss();
            }
        });

        myWebView.getSettings().setBuiltInZoomControls(false);
        myWebView.getSettings().setSupportZoom(false);
        myWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setAllowFileAccess(true);
        myWebView.getSettings().setDomStorageEnabled(true);

        myWebView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);

        myWebView.loadUrl("http://immsetengahabad.blogspot.com/");

        return v;
    }

}

