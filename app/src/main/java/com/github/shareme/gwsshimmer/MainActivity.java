package com.github.shareme.gwsshimmer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.shareme.gwsshimmer.library.Shimmer;
import com.github.shareme.gwsshimmer.library.ShimmerTextView;

public class MainActivity extends AppCompatActivity {

    ShimmerTextView tv;
    Shimmer shimmer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (ShimmerTextView) findViewById(R.id.shimmer_tv);
    }

    public void toggleAnimation(View target) {
        if (shimmer != null && shimmer.isAnimating()) {
            shimmer.cancel();
        } else {
            shimmer = new Shimmer();
            shimmer.start(tv);
        }
    }
}
