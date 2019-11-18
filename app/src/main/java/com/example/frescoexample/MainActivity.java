package com.example.frescoexample;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    private Button button,button2;
    private SimpleDraweeView sdvImage,view;


    private void findViews() {
        button = (Button) findViewById(R.id.button);
        sdvImage = (SimpleDraweeView) findViewById(R.id.sdv_image);
        button2=findViewById(R.id.button2);
        view=findViewById(R.id.view);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        findViews();

        final Uri imageUri = Uri.parse("https://static.naewna.com/uploads/news/source/376538.jpg");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sdvImage.setImageURI(imageUri);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setImageURI(imageUri);

            }
        });

    }
}
