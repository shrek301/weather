package until;

/**
 * Created by admin on 22.03.2018.
 */

import android.app.Activity;
import android.content.SharedPreferences;

public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity) {
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

//  ну так в примере было, я спать хочу по этому менят ьне буду
    String getCity() {
        return prefs.getString("city", "Sydney, AU");
    }

    public void setCity(String city) {
        prefs.edit().putString("city", city).commit();
    }

}