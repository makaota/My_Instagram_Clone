package com.samakaota.myinstagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ipa9hpR0iZap59ae1oCTFBqwpcbj8hfjeBKtCInD")
                // if defined
                .clientKey("9hIKMrdCyD3PP20pULS7slabfpmA81U52ULmoFpb")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
