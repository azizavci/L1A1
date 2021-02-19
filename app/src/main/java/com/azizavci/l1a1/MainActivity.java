package com.azizavci.l1a1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    Bitmap gandalf;
    Bitmap gollum;
    Bitmap galadriel;
    Bitmap legolas;
    Bitmap gimli;
    Bitmap frodo;
    Bitmap merrypippin;
    Bitmap saruman;
    Bitmap samwise;
    Drawable gandalf2;

    Button next;
    Button preview;
    ImageView imageView;
    int sayac=0;
    ArrayList<Bitmap> lotr=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gandalf= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.gandalf);
        galadriel= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.galadriel);
        gollum= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.gollum);
        legolas= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.legolas);
        gimli= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.gimli);
        frodo= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.frodo);
        merrypippin= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.merrypippin);
        saruman= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.saruman);
        samwise= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.samwise);

        lotr.add(0,galadriel);
        lotr.add(1,gimli);
        lotr.add(2,legolas);
        lotr.add(3,samwise);
        lotr.add(4,frodo);
        lotr.add(5,merrypippin);
        lotr.add(6,saruman);
        lotr.add(7,gandalf);
        lotr.add(8,gollum);

        next=findViewById(R.id.next);
        preview=findViewById(R.id.preview);
        imageView=findViewById(R.id.imageView3);
        imageView.setImageBitmap(lotr.get(sayac));
    }

    public void next(View view){

        sayac=sayac+1;
        if (sayac<lotr.size()){
            imageView.setImageBitmap(lotr.get(sayac));
        }
        else{
            sayac=8;
        }
    }
    public void preview(View view){

        sayac=sayac-1;
        if (sayac>=0){
            imageView.setImageBitmap(lotr.get(sayac));
        }else{
            sayac=0;
        }
    }
}