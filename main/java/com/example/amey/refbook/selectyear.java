package com.example.amey.refbook;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class selectyear extends ActionBarActivity {
private Button yr11,yr22,yr33,yr44,extc1,coms1,it1,extc13,coms13,it13,extc14,coms14,it14,osextc1,esextc1,osextc13,esextc13,osextc14,esextc14,oscoms1,escoms1,oscoms13,escoms13,oscoms14,escoms14,osit1,esit1,osit13,esit13,osit14,esit14,os1,es1;
    private TextView sy1,sb1,ss1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectyear);
        yr11=(Button)findViewById(R.id.yr1);
        yr22=(Button)findViewById(R.id.yr2);
        yr33=(Button)findViewById(R.id.yr3);
        yr44=(Button)findViewById(R.id.yr4);
        extc1=(Button)findViewById(R.id.extc);
        coms1=(Button)findViewById(R.id.coms);
        it1=(Button)findViewById(R.id.it);
        extc13=(Button)findViewById(R.id.extc3);
        coms13=(Button)findViewById(R.id.coms3);
        it13=(Button)findViewById(R.id.it3);
        extc14=(Button)findViewById(R.id.extc4);
        coms14=(Button)findViewById(R.id.coms4);
        it14=(Button)findViewById(R.id.it4);
        osextc1=(Button)findViewById(R.id.osextc);
        esextc1=(Button)findViewById(R.id.esextc);
        osextc13=(Button)findViewById(R.id.osextc3);
        esextc13=(Button)findViewById(R.id.esextc3);
        osextc14=(Button)findViewById(R.id.osextc4);
        esextc14=(Button)findViewById(R.id.esextc4);
        oscoms1=(Button)findViewById(R.id.oscoms);
        escoms1=(Button)findViewById(R.id.escoms);
        oscoms13=(Button)findViewById(R.id.oscoms3);
        escoms13=(Button)findViewById(R.id.escoms3);
        oscoms14=(Button)findViewById(R.id.oscoms4);
        escoms14=(Button)findViewById(R.id.escoms4);
        osit1=(Button)findViewById(R.id.osit);
        esit1=(Button)findViewById(R.id.esit);
        osit13=(Button)findViewById(R.id.osit3);
        esit13=(Button)findViewById(R.id.esit3);
        osit14=(Button)findViewById(R.id.osit4);
        esit14=(Button)findViewById(R.id.esit4);
        os1=(Button)findViewById(R.id.os);
        es1=(Button)findViewById(R.id.es);
        sy1=(TextView)findViewById(R.id.sy);
        sb1=(TextView)findViewById(R.id.sb);
        ss1=(TextView)findViewById(R.id.ss);
        os1.setVisibility(View.INVISIBLE);
        es1.setVisibility(View.INVISIBLE);
        extc1.setVisibility(View.INVISIBLE);
        coms1.setVisibility(View.INVISIBLE);
        it1.setVisibility(View.INVISIBLE);
        extc13.setVisibility(View.INVISIBLE);
        coms13.setVisibility(View.INVISIBLE);
        it13.setVisibility(View.INVISIBLE);
        extc14.setVisibility(View.INVISIBLE);
        coms14.setVisibility(View.INVISIBLE);
        it14.setVisibility(View.INVISIBLE);
        osextc1.setVisibility(View.INVISIBLE);
        esextc1.setVisibility(View.INVISIBLE);
        osextc13.setVisibility(View.INVISIBLE);
        esextc13.setVisibility(View.INVISIBLE);
        osextc14.setVisibility(View.INVISIBLE);
        esextc14.setVisibility(View.INVISIBLE);
        oscoms1.setVisibility(View.INVISIBLE);
        escoms1.setVisibility(View.INVISIBLE);
        oscoms13.setVisibility(View.INVISIBLE);
        escoms13.setVisibility(View.INVISIBLE);
        oscoms14.setVisibility(View.INVISIBLE);
        escoms14.setVisibility(View.INVISIBLE);
        osit1.setVisibility(View.INVISIBLE);
        esit1.setVisibility(View.INVISIBLE);
        osit13.setVisibility(View.INVISIBLE);
        esit13.setVisibility(View.INVISIBLE);
        osit14.setVisibility(View.INVISIBLE);
        esit14.setVisibility(View.INVISIBLE);
        sb1.setVisibility(View.INVISIBLE);
        ss1.setVisibility(View.INVISIBLE);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_selectyear, menu);
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

    public void on1styrclick(View view) {
        yr11.setVisibility(View.INVISIBLE);
        yr22.setVisibility(View.INVISIBLE);
       yr33.setVisibility(View.INVISIBLE);
        yr44.setVisibility(View.INVISIBLE);
        sy1.setVisibility(View.INVISIBLE);
        ss1.setVisibility(View.VISIBLE);
        os1.setVisibility(View.VISIBLE);
        es1.setVisibility(View.VISIBLE);
    }

     public void on2ndyrclick(View view) {
         yr11.setVisibility(View.INVISIBLE);
         yr22.setVisibility(View.INVISIBLE);
         yr33.setVisibility(View.INVISIBLE);
         yr44.setVisibility(View.INVISIBLE);
         sy1.setVisibility(View.INVISIBLE);
         extc1.setVisibility(View.VISIBLE);
         coms1.setVisibility(View.VISIBLE);
         it1.setVisibility(View.VISIBLE);
         sb1.setVisibility(View.VISIBLE);

    }
    public void on3rdyrclick(View view) {
        yr11.setVisibility(View.INVISIBLE);
        yr22.setVisibility(View.INVISIBLE);
        yr33.setVisibility(View.INVISIBLE);
        yr44.setVisibility(View.INVISIBLE);
        sy1.setVisibility(View.INVISIBLE);
        extc13.setVisibility(View.VISIBLE);
        coms13.setVisibility(View.VISIBLE);
        it13.setVisibility(View.VISIBLE);
        sb1.setVisibility(View.VISIBLE);
    }

    public void on4thyrclick(View view) {
        yr11.setVisibility(View.INVISIBLE);
        yr22.setVisibility(View.INVISIBLE);
        yr33.setVisibility(View.INVISIBLE);
        yr44.setVisibility(View.INVISIBLE);
        sy1.setVisibility(View.INVISIBLE);
        extc14.setVisibility(View.VISIBLE);
        coms14.setVisibility(View.VISIBLE);
        it14.setVisibility(View.VISIBLE);
        sb1.setVisibility(View.VISIBLE);
    }

    public void onextcclick(View view) {
        extc1.setVisibility(View.INVISIBLE);
        coms1.setVisibility(View.INVISIBLE);
        it1.setVisibility(View.INVISIBLE);
        sb1.setVisibility(View.INVISIBLE);
        ss1.setVisibility(View.VISIBLE);
        osextc1.setVisibility(View.VISIBLE);
        esextc1.setVisibility(View.VISIBLE);
    }

    public void oncomsclick(View view) {
        extc1.setVisibility(View.INVISIBLE);
        coms1.setVisibility(View.INVISIBLE);
        it1.setVisibility(View.INVISIBLE);
        sb1.setVisibility(View.INVISIBLE);
        ss1.setVisibility(View.VISIBLE);
        oscoms1.setVisibility(View.VISIBLE);
        escoms1.setVisibility(View.VISIBLE);
    }

    public void onitclick(View view) {
        extc1.setVisibility(View.INVISIBLE);
        coms1.setVisibility(View.INVISIBLE);
        it1.setVisibility(View.INVISIBLE);
        sb1.setVisibility(View.INVISIBLE);
        ss1.setVisibility(View.VISIBLE);
        osit1.setVisibility(View.VISIBLE);
        esit1.setVisibility(View.VISIBLE);
    }

    public void onosclick(View view) {
        startActivity(new Intent("sem1"));
    }

    public void onesclick(View view) {
        startActivity(new Intent("sem2"));
    }

    public void onesitclick(View view) {
        startActivity(new Intent("sem4it"));
    }

    public void onositclick(View view) {
        startActivity(new Intent("sem3it"));
    }

    public void onescomsclick(View view) {
        startActivity(new Intent("sem4coms"));
    }

    public void onoscomsclick(View view) {
        startActivity(new Intent("sem3coms"));
    }

    public void onesextcclick(View view) {
        startActivity(new Intent("sem4extc"));
    }

    public void onosextcclick(View view) {
        startActivity(new Intent("sem3extc"));
    }

    public void onextc3click(View view) {
        extc13.setVisibility(View.INVISIBLE);
        coms13.setVisibility(View.INVISIBLE);
        it13.setVisibility(View.INVISIBLE);
        sb1.setVisibility(View.INVISIBLE);
        ss1.setVisibility(View.VISIBLE);
        osextc13.setVisibility(View.VISIBLE);
        esextc13.setVisibility(View.VISIBLE);
    }

    public void oncoms3click(View view) {
        extc13.setVisibility(View.INVISIBLE);
        coms13.setVisibility(View.INVISIBLE);
        it13.setVisibility(View.INVISIBLE);
        sb1.setVisibility(View.INVISIBLE);
        ss1.setVisibility(View.VISIBLE);
        oscoms13.setVisibility(View.VISIBLE);
        escoms13.setVisibility(View.VISIBLE);
    }

    public void onit3click(View view) {
        extc13.setVisibility(View.INVISIBLE);
        coms13.setVisibility(View.INVISIBLE);
        it13.setVisibility(View.INVISIBLE);
        sb1.setVisibility(View.INVISIBLE);
        ss1.setVisibility(View.VISIBLE);
        osit13.setVisibility(View.VISIBLE);
        esit13.setVisibility(View.VISIBLE);
    }

    public void onextc4click(View view) {
        extc14.setVisibility(View.INVISIBLE);
        coms14.setVisibility(View.INVISIBLE);
        it14.setVisibility(View.INVISIBLE);
        sb1.setVisibility(View.INVISIBLE);
        ss1.setVisibility(View.VISIBLE);
        osextc14.setVisibility(View.VISIBLE);
        esextc14.setVisibility(View.VISIBLE);
    }

    public void oncoms4click(View view) {
        extc14.setVisibility(View.INVISIBLE);
        coms14.setVisibility(View.INVISIBLE);
        it14.setVisibility(View.INVISIBLE);
        sb1.setVisibility(View.INVISIBLE);
        ss1.setVisibility(View.VISIBLE);
        oscoms14.setVisibility(View.VISIBLE);
        escoms14.setVisibility(View.VISIBLE);
    }

    public void onit4click(View view) {
        extc14.setVisibility(View.INVISIBLE);
        coms14.setVisibility(View.INVISIBLE);
        it14.setVisibility(View.INVISIBLE);
        sb1.setVisibility(View.INVISIBLE);
        ss1.setVisibility(View.VISIBLE);
        osit14.setVisibility(View.VISIBLE);
        esit14.setVisibility(View.VISIBLE);
    }

    public void onosextc3click(View view) {
        startActivity(new Intent("sem5extc"));
    }

    public void onesextc3click(View view) {
        startActivity(new Intent("sem6extc"));
    }

    public void onosextc4click(View view) {
        startActivity(new Intent("sem7extc"));
    }

    public void onesextc4click(View view) {
        startActivity(new Intent("sem8extc"));
    }

    public void onescoms4click(View view) {
        startActivity(new Intent("sem8coms"));
    }

    public void onoscoms4click(View view) {
        startActivity(new Intent("sem7coms"));
    }

    public void onescoms3click(View view) {
        startActivity(new Intent("sem6coms"));
    }

    public void onoscoms3click(View view) {
        startActivity(new Intent("sem5coms"));
    }

    public void onesit4click(View view) {
        startActivity(new Intent("sem8it"));
    }

    public void onosit4click(View view) {
        startActivity(new Intent("sem7it"));
    }

    public void onesit3click(View view) {
        startActivity(new Intent("sem6it"));
    }

    public void onosit3click(View view) {
        startActivity(new Intent("sem5it"));
    }
}
