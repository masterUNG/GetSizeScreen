package app.ewtc.masterung.getsizescreen;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Check Size Screen
        Display display = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        int widthScreenAint = point.x;
        int heightScreenAint = point.y;
        Log.d("1SepV1", "WidthScreen ==> " + widthScreenAint);
        Log.d("1SepV1", "HeightScreen ==> " + heightScreenAint);

    }
}
