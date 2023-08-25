package com.example.smvitadminapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
6
import com.example.smvitadminapp.faculty.UpdateFaculty;
import com.example.smvitadminapp.news.DeleteNewsActivity;
import com.example.smvitadminapp.news.UploadNews;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener
 {

     CardView uploadNews,addGalleryImage,addEbook, faculty, deleteNews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNews = findViewById(R.id.addNews);
        addGalleryImage=findViewById(R.id.addGalleryImage);
        addEbook = findViewById(R.id.addEbook);
        faculty = findViewById(R.id.faculty);
        deleteNews = findViewById(R.id.deleteNotice);

        uploadNews.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
        addEbook.setOnClickListener(this);
        faculty.setOnClickListener(this);
        deleteNews.setOnClickListener(this);
    }

     @Override
     public void onClick(View view) {
         Intent intent;
         switch (view.getId()){

             case R.id.addNews:
                 intent = new Intent(MainActivity.this, UploadNews.class);
                 startActivity(intent);
                 break;

             case R.id.addGalleryImage:
                 intent = new Intent(MainActivity.this,UploadImage.class);
                 startActivity(intent);
                 break;
             case R.id.addEbook:
                 intent = new Intent(MainActivity.this,UploadPdfActivity.class);
                 startActivity(intent);
                 break;

             case R.id.faculty:
                 intent = new Intent(MainActivity.this, UpdateFaculty.class);
                 startActivity(intent);
                 break;

             case R.id.deleteNotice:
                 intent = new Intent(MainActivity.this, DeleteNewsActivity.class);
                 startActivity(intent);
                 break;
         }
     }
 }