package com.example.guilh.fresco;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {
    private Button bt_gostar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        bt_gostar = (Button) findViewById(R.id.bt_gostar);


        Uri uri = Uri.parse("http://img-9gag-fun.9cache.com/photo/aAwoeN2_700b.jpg");
        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.first_image);
        draweeView.setImageURI(uri);

        Uri uri2 = Uri.parse("http://www.encontracarros.com/upload/chevrolet/Chevrolet-omega-suprema.jpg");
        SimpleDraweeView draweeView2 = (SimpleDraweeView) findViewById(R.id.second_image);
        draweeView2.setImageURI(uri2);

        bt_gostar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt_gostar.setText("GOSTEI!");
            }
        });

    }

}
