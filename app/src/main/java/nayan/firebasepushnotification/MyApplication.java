package nayan.firebasepushnotification;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.firebase.client.Firebase;

/**
 * Created by NAYAN on 5/15/2017.
 */
public class MyApplication extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Initializing firebase
        Firebase.setAndroidContext(getApplicationContext());
    }
}
