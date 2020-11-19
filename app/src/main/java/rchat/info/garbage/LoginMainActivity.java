package rchat.info.garbage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
                anim.setDuration(1000);
                anim.setRepeatCount(0);
                findViewById(R.id.welcome).setAlpha(1.0f);
                findViewById(R.id.welcome).startAnimation(anim);
                anim.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        new Handler().postDelayed(new Runnable(){
                            @Override
                            public void run() {
                                Intent intent = new Intent(LoginMainActivity.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        }, 1000);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        }, 500);


    }

    @Override
    public void onBackPressed() {
        
    }
}
