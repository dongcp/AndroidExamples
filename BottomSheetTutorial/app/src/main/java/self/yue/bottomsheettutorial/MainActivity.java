package self.yue.bottomsheettutorial;

import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private BottomSheetBehavior mBottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View bottomSheet = findViewById(R.id.bottom_sheet);
        mBottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
        mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

        Log.e("expanded", BottomSheetBehavior.STATE_EXPANDED + "");
        Log.e("collapsed", BottomSheetBehavior.STATE_COLLAPSED + "");
        Log.e("hidden", BottomSheetBehavior.STATE_HIDDEN + "");
        Log.e("dragging", BottomSheetBehavior.STATE_DRAGGING + "");
        Log.e("dragging", BottomSheetBehavior.STATE_SETTLING + "");

        findViewById(R.id.btn_bottom_sheet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Fuck", mBottomSheetBehavior.getState() + "");
                if (mBottomSheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                    Log.e("Fuck", "Ahuhu");
                    mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
    }
}
