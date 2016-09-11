package thailand.mwp.lucky.trafficlearn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private ListView listView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        listView = (ListView) findViewById(R.id.listView);
        button = (Button) findViewById(R.id.button);

        //Buttom Controller
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                mediaPlayer.start();

                //Show Web View
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/KmYJuCZiJWE"));
                startActivity(intent);

            } //onClick
        });

        //Create ListView
        int[] ints = new int[20];
        ints[0] = R.drawable.traffic_01;
        ints[1] = R.drawable.traffic_02;
        ints[2] = R.drawable.traffic_03;
        ints[3] = R.drawable.traffic_04;
        ints[4] = R.drawable.traffic_05;
        ints[5] = R.drawable.traffic_06;
        ints[6] = R.drawable.traffic_07;
        ints[7] = R.drawable.traffic_08;
        ints[8] = R.drawable.traffic_09;
        ints[9] = R.drawable.traffic_10;
        ints[10] = R.drawable.traffic_11;
        ints[11] = R.drawable.traffic_12;
        ints[12] = R.drawable.traffic_13;
        ints[13] = R.drawable.traffic_14;
        ints[14] = R.drawable.traffic_15;
        ints[15] = R.drawable.traffic_16;
        ints[16] = R.drawable.traffic_17;
        ints[17] = R.drawable.traffic_18;
        ints[18] = R.drawable.traffic_19;
        ints[19] = R.drawable.traffic_20;

        String[] titleStrings = getResources().getStringArray(R.array.title);
        String[] detailStrings = getResources().getStringArray(R.array.detail);

        String[] detailShortString = new String[detailStrings.length];
        for (int i=0;i<detailStrings.length;i+=1) {
            detailShortString[i] = detailStrings[i].substring(0, 30) + "...";
        }

        TrafficAdapter trafficAdapter = new TrafficAdapter(this, titleStrings, detailShortString, ints);
        listView.setAdapter(trafficAdapter);

    }  //Main Method
}   //Main Class
