package onlyme.sengupta.mon.observer;

import android.database.Observable;

        import java.util.ArrayList;
import java.util.Objects;


/**
 * Created by mondrita on 11/12/16.
 */
public class ObservableSubject {
    static ArrayList<Objects> subscriberList=new ArrayList<>();

    ObservableSubject() {

    }
    public static void subscribe(Objects subscriber) {
        subscriberList.add(subscriber);
    }

    public static void unsubscribe(Objects subscriber) {
        subscriberList.remove(subscriber);
    }

    public static void notifySubscriber() {
        for (int i=0; i<subscriberList.size(); i++) {
            //subscriberList.get(i).update();
        }
    }


}