package rchat.info.garbage;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.core.util.Pair;
import androidx.drawerlayout.widget.DrawerLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Pair<String, Integer>> pairs = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pairs.add(new androidx.core.util.Pair<String, Integer>(getResources().getString(R.string.menu), null));
        pairs.add(new androidx.core.util.Pair<String, Integer>(getResources().getString(R.string.account), R.drawable.account_menu_item));
        pairs.add(new androidx.core.util.Pair<String, Integer>(getResources().getString(R.string.points), R.drawable.points_menu_item));
        pairs.add(new androidx.core.util.Pair<String, Integer>(getResources().getString(R.string.news), R.drawable.news_menu_item));
        pairs.add(new androidx.core.util.Pair<String, Integer>(getResources().getString(R.string.partners), R.drawable.partners_menu_item));
        pairs.add(new androidx.core.util.Pair<String, Integer>(getResources().getString(R.string.project), R.drawable.project_menu_item));
        pairs.add(new androidx.core.util.Pair<String, Integer>(getResources().getString(R.string.map), R.drawable.map_menu_item));
        pairs.add(new androidx.core.util.Pair<String, Integer>(getResources().getString(R.string.about), R.drawable.about_menu_item));
        pairs.add(new androidx.core.util.Pair<String, Integer>(getResources().getString(R.string.contacts), R.drawable.contacts_menu_item));
        pairs.add(new androidx.core.util.Pair<String, Integer>(getResources().getString(R.string.options), R.drawable.options_menu_item));
        NavigationAdapter adapter = new NavigationAdapter(pairs, this);
        ListView list = findViewById(R.id.listView);
        list.setAdapter(adapter);
        ImageButton but = findViewById(R.id.open_menu);
        DrawerLayout drawerLayout = findViewById(R.id.drawer);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });
    }
}
