package com.kashmirvolunteer.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button1;
    Button button2;

    private AdView mAdView;
    private InterstitialAd interstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                interstitial = new InterstitialAd(getApplicationContext());
                interstitial.setAdUnitId(getString(R.string.ad_id_interstitial));
                AdRequest adRequest9 = new AdRequest.Builder()
                        .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)


                        .build();
                interstitial.loadAd(adRequest9);
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        if (interstitial.isLoaded()) {
                            // Step 1: Display the interstitial
                            interstitial.show();
                            // Step 2: Attach an AdListener
                            interstitial.setAdListener(new AdListener() {
                                @Override
                                public void onAdClosed() {
                                    // Step 2.1: Load another ad
                                    AdRequest adRequest = new AdRequest.Builder()
                                            .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                                            .build();
                                    interstitial.loadAd(adRequest);

                                    // Step 2.2: Start the new activity
                                    startActivity(new Intent(MainActivity.this, HomeActivity.class));
                                }
                            });
                        }
// If it has not loaded due to any reason simply load the next activity
                        else {
                            startActivity(new Intent(MainActivity.this, HomeActivity.class));
                        }
                        // Start NewActivity.class
                    }
                });
            }
        });

        button1 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                interstitial = new InterstitialAd(getApplicationContext());
                interstitial.setAdUnitId(getString(R.string.ad_id_interstitial));
                AdRequest adRequest9 = new AdRequest.Builder()
                        .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)


                        .build();
                interstitial.loadAd(adRequest9);
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        if (interstitial.isLoaded()) {
                            // Step 1: Display the interstitial
                            interstitial.show();
                            // Step 2: Attach an AdListener
                            interstitial.setAdListener(new AdListener() {
                                @Override
                                public void onAdClosed() {
                                    // Step 2.1: Load another ad
                                    AdRequest adRequest = new AdRequest.Builder()
                                            .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                                            .build();
                                    interstitial.loadAd(adRequest);

                                    // Step 2.2: Start the new activity
                                    startActivity(new Intent(MainActivity.this, RegisterActivity.class));
                                }
                            });
                        }
// If it has not loaded due to any reason simply load the next activity
                        else {
                            startActivity(new Intent(MainActivity.this, RegisterActivity.class));
                        }
                        // Start NewActivity.class
                    }
                });
            }
        });

        button2 = (Button) findViewById(R.id.button3);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                interstitial = new InterstitialAd(getApplicationContext());
                interstitial.setAdUnitId(getString(R.string.ad_id_interstitial));
                AdRequest adRequest9 = new AdRequest.Builder()
                        .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)


                        .build();
                interstitial.loadAd(adRequest9);
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        if (interstitial.isLoaded()) {
                            // Step 1: Display the interstitial
                            interstitial.show();
                            // Step 2: Attach an AdListener
                            interstitial.setAdListener(new AdListener() {
                                @Override
                                public void onAdClosed() {
                                    // Step 2.1: Load another ad
                                    AdRequest adRequest = new AdRequest.Builder()
                                            .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                                            .build();
                                    interstitial.loadAd(adRequest);

                                    // Step 2.2: Start the new activity
                                    startActivity(new Intent(MainActivity.this, TotalActivity.class));
                                }
                            });
                        }
// If it has not loaded due to any reason simply load the next activity
                        else {
                            startActivity(new Intent(MainActivity.this, TotalActivity.class));
                        }
                        // Start NewActivity.class
                    }
                });
            }
        });


    }

}
