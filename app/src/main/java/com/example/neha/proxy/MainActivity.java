package com.example.neha.proxy;





import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.VideoView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String url = "http://proxynotes.com/assignment/test.mp4?videoid=xxxx";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Proxy> proxies = new ArrayList<Proxy>();
        proxies.add(new Proxy(R.string.video_title, R.drawable.ss,url, R.string.video_duration, R.string.video_description));
        proxies.add(new Proxy(R.string.video_title, R.drawable.ss,url, R.string.video_duration, R.string.video_description));


        ProxyAdapter adapter = new ProxyAdapter(this, proxies);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Proxy proxy=proxies.get(position);
                String urlVideo=proxy.getUrlId();
                Fragment videoFragment=new VideoFragment();
                Bundle data = new Bundle();
                data.putString("data", urlVideo);
                videoFragment.setArguments(data);
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, videoFragment)
                        .addToBackStack("VideoFragment")
                        .commit();
            }
        });
    }
}








