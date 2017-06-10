package dynatic.smartvocsensor;

import android.graphics.SurfaceTexture;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.TextureView;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    private static String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.textureView)
    TextureView mTextureView;
    @BindView(R.id.mainRelativeLayout)
    RelativeLayout mMainView;
    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUnbinder = ButterKnife.bind(this);
        init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
    }

    private void init() {

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
            actionBar.hide();

        mTextureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            @Override
            public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
                Log.e(TAG, "onSurfaceTextureAvailable, width = " + width + ", height = " + height);
                openCamera();
            }

            @Override
            public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
                Log.e(TAG, "onSurfaceTextureSizeChanged");
                // Do Nothing
            }

            @Override
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
                // Do Nothing
                return false;
            }

            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surface) {
                // Do Nothing
            }
        });
    }

    public void openCamera() {

    }
}
