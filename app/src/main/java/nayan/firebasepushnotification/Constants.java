package nayan.firebasepushnotification;

/**
 * Created by NAYAN on 5/15/2017.
 */
public class Constants {
    public static final String FIREBASE_APP = "YOUR FIREBASE URL";

    //Constant to store shared preferences
    public static final String SHARED_PREF = "notificationapp";

    //To store boolean in shared preferences for if the device is registered to not
    public static final String REGISTERED = "registered";

    //To store the firebase id in shared preferences
    public static final String UNIQUE_ID = "uniqueid";

    //register.php address in your server
    public static final String REGISTER_URL = "http://192.168.94.1/firebasepushnotification/register.php";
}
