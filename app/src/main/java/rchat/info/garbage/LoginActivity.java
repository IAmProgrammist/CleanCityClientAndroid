package rchat.info.garbage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        findViewById(R.id.enter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
                    View vv = findViewById(R.id.ico);
                    if (vv != null) {
                        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this, vv, "ico");
                        bundle = options.toBundle();
                    }
                }
                Intent intent = new Intent(LoginActivity.this, LoginMainActivity.class);
                if (bundle == null) {
                    startActivity(intent);
                    finish();
                } else {
                    startActivity(intent, bundle);
                    finish();
                }
            }
        });
    }
}