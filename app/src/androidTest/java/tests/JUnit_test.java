package tests;
import android.test.ActivityInstrumentationTestCase2;
import com.android.lab3b.MainActivity;

/**
 * Created by Vanna on 4/16/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();
        double tester = mainActivity.sum(3.1, 4.3);
        assertEquals(7.4, tester);
    }
}
