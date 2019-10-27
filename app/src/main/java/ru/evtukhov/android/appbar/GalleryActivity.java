package ru.evtukhov.android.appbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class GalleryActivity extends AppCompatActivity {

    TextView link;
    Button before;
    Button after;
    Random linkItem;
    int number = 0;
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        link = findViewById(R.id.link);
        linkItem = new Random();
        number = linkItem.nextInt(100);
        after = findViewById(R.id.next);
        after.setOnClickListener(next);
        result = getString(R.string.app_link) + number;
        link.setText(result);
        before = findViewById(R.id.back);
        before.setOnClickListener(back);
    }

    View.OnClickListener next = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(GalleryActivity.this, GalleryActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener back = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}
