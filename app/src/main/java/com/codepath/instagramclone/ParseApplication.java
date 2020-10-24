package com.codepath.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize( new Parse.Configuration.Builder( this )
                .applicationId( "o06d9PUNQpmJQlYBiwKfejrazVenXO5WjSPM8ulD" )
                .clientKey( "5l37ZrKOLmmZgiJxToIscgbMbdLOHFFtQeM6mUSg" )
                .server( "https://parseapi.back4app.com" )
                .build()
        );

    }

}
