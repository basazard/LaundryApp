package com.example.laundryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView homeCard, infoCard, mapsCard, joinCard, contactCard, promoCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        homeCard = (CardView) findViewById(R.id.home_card);
        infoCard = (CardView) findViewById(R.id.info_card);
        mapsCard = (CardView) findViewById(R.id.maps_card);
        joinCard = (CardView) findViewById(R.id.join_card);
        contactCard = (CardView) findViewById(R.id.contact_card);
        promoCard = (CardView) findViewById(R.id.promo_card);

        homeCard.setOnClickListener(this);
        infoCard.setOnClickListener(this);
        mapsCard.setOnClickListener(this);
        joinCard.setOnClickListener(this);
        contactCard.setOnClickListener(this);
        promoCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent i;

        switch(v.getId()){
            case R.id.home_card : i = new Intent(this, HomeActivity.class);startActivity(i); break;
            case R.id.info_card : i = new Intent(this, InfoActivity.class);startActivity(i); break;
            case R.id.maps_card : i = new Intent(this, MapsActivity.class); startActivity(i);break;
            case R.id.join_card : i = new Intent(this, JoinActivity.class); startActivity(i);break;
            case R.id.contact_card : i = new Intent(this, ContactActivity.class);startActivity(i); break;
            case R.id.promo_card : i = new Intent(this, PromoActivity.class);startActivity(i); break;
            default:break;
        }
    }
}