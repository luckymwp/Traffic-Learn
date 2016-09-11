package thailand.mwp.lucky.trafficlearn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by DELL NB on 11/9/2559.
 */
public class TrafficAdapter extends BaseAdapter{

    //Explicit
    private Context context;
    private String[] titleStrings, detailStrings;
    private int[] ints;

    public TrafficAdapter(Context context,
                          String[] titleStrings,
                          String[] detailStrings,
                          int[] ints) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
        this.ints = ints;
    }

    @Override
    public int getCount() {
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.traffic_listview,viewGroup,false);

        //Bind Widget
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);
        ImageView imageView = (ImageView) view1.findViewById(R.id.imageView);

        //Show View
        titleTextView.setText(titleStrings[i]);
        detailTextView.setText(detailStrings[i]);
        imageView.setImageResource(ints[i]);

        return view1;
    }
}  //Main Class
