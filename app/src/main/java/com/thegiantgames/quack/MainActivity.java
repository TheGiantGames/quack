
package com.thegiantgames.quack;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<quake_details> details = queryUtils.extractEarthquakes();


            wordAdaptor adaptor = new wordAdaptor(this , details);
            ListView listView = (ListView)findViewById(R.id.list);
            listView.setAdapter(adaptor);

        ArrayList<String > urls = queryUtils.urls();

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(MainActivity.this,  position+1 + " item clicked ", Toast.LENGTH_SHORT).show();

                        String url = queryUtils.urls().get(position);

                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);



                }
            });

    }
}