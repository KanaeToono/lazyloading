package com.example.conga.lazyloading;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends Activity {
    Button btn_Fresh;
    ListView listView;
    ImageLoaderAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.lvList);
        adapter = new ImageLoaderAdapter(this, data);
        listView.setAdapter(adapter);
        btn_Fresh = (Button) findViewById(R.id.btn_refresh);
        btn_Fresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.imageLoader.clearCache();
                adapter.notifyDataSetChanged();
            }
        });


    }
private  String[] data ={
        "http://41.media.tumblr.com/a1a5e2b854ec59e830c1fccd4cd6f7a0/tumblr_mmkemtth5J1spz6rro1_500.png",
        "http://sms.latestsms.in/wp-content/uploads/love-wallpapers15.jpg",
      " http://images5.fanpop.com/image/photos/31300000/wallpaper-love-love-31307651-1280-960.jpg",
        "http://www.bhmpics.com/download/love_sad-1920x1200.jpg",
        "http://fc02.deviantart.net/fs70/i/2010/256/d/8/death_note___l_ii_by_felhi-d2ynwnl.png",
        "http://images2.fanpop.com/image/photos/8600000/L-Wallpapers-death-note-8614959-1024-768.jpg",
        "http://cdn.superbwallpapers.com/wallpapers/anime/l-death-note-14078-1680x1050.jpg",
        "http://withfriendship.com/images/h/39490/l-de-death-note.jpeg",
        "http://images5.fanpop.com/image/photos/24600000/Death-Note-L-death-note-24603715-465-296.png",
        "http://images6.fanpop.com/image/photos/35700000/L-Lawliet-death-note-35773750-785-1024.png",
        "http://images2.fanpop.com/images/photos/7900000/Death-Note-death-note-7946511-1919-1283.jpg",
        "http://images1.fanpop.com/images/photos/2100000/L-death-note-l-2170214-1024-768.jpg",
        "http://images1.wikia.nocookie.net/__cb20080413235843/deathnote/images/f/fe/L.png",
        " https://animeipics.files.wordpress.com/2014/01/konoha-thrids-era.jpg",
        "http://images6.fanpop.com/image/photos/35700000/L-lawliet-death-note-35773658-704-392.jpg"


};



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
