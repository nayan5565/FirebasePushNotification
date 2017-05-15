package nayan.firebasepushnotification;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.firebase.client.Firebase;

/**
 * Created by NAYAN on 5/15/2017.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Initializing firebase

        //Initializing firebase
        Firebase.setAndroidContext(getApplicationContext());
    }
}
