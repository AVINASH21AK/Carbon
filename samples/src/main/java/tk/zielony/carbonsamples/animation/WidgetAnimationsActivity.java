package tk.zielony.carbonsamples.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import carbon.widget.FrameLayout;
import tk.zielony.carbonsamples.R;

/**
 * Created by Marcin on 2014-12-15.
 */
public class WidgetAnimationsActivity extends Activity {
    int fabVisibility = View.VISIBLE;
    int buttonVisibility = View.VISIBLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);

        final View fab = findViewById(R.id.fab);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(view -> {
            if (fabVisibility != View.VISIBLE) {
                fab.setVisibility(View.VISIBLE);
                fabVisibility = View.VISIBLE;
            } else {
                fab.setVisibility(View.INVISIBLE);
                fabVisibility = View.INVISIBLE;
            }
        });

        final View button2 = findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(view -> {
            if (buttonVisibility != View.VISIBLE) {
                button2.setVisibility(View.VISIBLE);
                buttonVisibility = View.VISIBLE;
            } else {
                button2.setVisibility(View.INVISIBLE);
                buttonVisibility = View.INVISIBLE;
            }
        });

        FrameLayout frame = (FrameLayout) findViewById(R.id.frame);
        carbon.widget.Button reveal = (carbon.widget.Button) findViewById(R.id.reveal);
        reveal.setOnClickListener(v -> frame.startReveal(20, 20, 0, (float) Math.sqrt((frame.getWidth() - 20) * (frame.getWidth() - 20) + (frame.getHeight() - 20) * (frame.getHeight() - 20))));
    }
}
