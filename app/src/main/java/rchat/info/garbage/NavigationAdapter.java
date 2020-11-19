package rchat.info.garbage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.util.Pair;

import java.util.List;

public class NavigationAdapter extends BaseAdapter {

    List<androidx.core.util.Pair<String, Integer>> pairs;
    LayoutInflater inflater;

    public NavigationAdapter(List<Pair<String, Integer>> pairs, Context ctx) {
        this.pairs = pairs;
        inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return pairs.size();
    }

    @Override
    public Object getItem(int i) {
        return pairs.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (i == 0) {
            view = inflater.inflate(R.layout.menu_item_active, null);
        } else {
            view = inflater.inflate(R.layout.menu_item_inactive, null);
            ((ImageView) view.findViewById(R.id.menu_image)).setImageResource(pairs.get(i).second);
        }
        ((TextView) view.findViewById(R.id.menu_item_name)).setText(pairs.get(i).first);
        return view;
    }
}
