package com.example.amey.refbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import static android.R.layout.select_dialog_item;
import static android.R.layout.simple_expandable_list_item_1;


public class sem4coms extends ActionBarActivity {
    Spinner ssub1;
    TextView ssub2, sb2,am1,am2,ac1,ac2,ap1,ap2,eme1,eme2,bee1,bee2,evs1,evs2;
    Button gtol1,gtol2,gtol3,gtol4,gtol5,gtol6,gsy1;
    String gtol,gtoll,gtolll,gtollll,gtolllll,gtollllll,gsy11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4coms);
        gtol1 = (Button) findViewById(R.id.gtol1);
        gtol2 = (Button) findViewById(R.id.gtol2);
        gtol3 = (Button) findViewById(R.id.gtol3);
        gtol4 = (Button) findViewById(R.id.gtol4);
        gtol5 = (Button) findViewById(R.id.gtol5);
        gtol6 = (Button) findViewById(R.id.gtol6);
        gsy1=(Button)findViewById(R.id.gsy);
        ssub1 = (Spinner) findViewById(R.id.spinner);
        am1=(TextView)findViewById(R.id.am11);
        am2=(TextView)findViewById(R.id.am12);
        ap1=(TextView)findViewById(R.id.ap11);
        ap2=(TextView)findViewById(R.id.ap12);
        ac1=(TextView)findViewById(R.id.ac11);
        ac2=(TextView)findViewById(R.id.ac12);
        eme1=(TextView)findViewById(R.id.eme11);
        eme2=(TextView)findViewById(R.id.eme12);
        bee1=(TextView)findViewById(R.id.bee11);
        bee2=(TextView)findViewById(R.id.bee12);
        evs1=(TextView)findViewById(R.id.evs11);
        evs2=(TextView)findViewById(R.id.evs12);
        ssub2 =(TextView) findViewById(R.id.ssub11);
        sb2 =(TextView) findViewById(R.id.sbk1);
        gsy1.setVisibility(View.INVISIBLE);
        am1.setVisibility(View.INVISIBLE);
        am2.setVisibility(View.INVISIBLE);
        ac1.setVisibility(View.INVISIBLE);
        ac2.setVisibility(View.INVISIBLE);
        ap1.setVisibility(View.INVISIBLE);
        ap2.setVisibility(View.INVISIBLE);
        eme1.setVisibility(View.INVISIBLE);
        eme2.setVisibility(View.INVISIBLE);
        bee1.setVisibility(View.INVISIBLE);
        bee2.setVisibility(View.INVISIBLE);
        evs1.setVisibility(View.INVISIBLE);
        evs2.setVisibility(View.INVISIBLE);
        sb2.setVisibility(View.INVISIBLE);
        gtol1.setVisibility(View.INVISIBLE);
        gtol2.setVisibility(View.INVISIBLE);
        gtol3.setVisibility(View.INVISIBLE);
        gtol4.setVisibility(View.INVISIBLE);
        gtol5.setVisibility(View.INVISIBLE);
        gtol6.setVisibility(View.INVISIBLE);

        ArrayAdapter<CharSequence> ssubject = ArrayAdapter.createFromResource(this, R.array.sem4coms, select_dialog_item);
        ssubject.setDropDownViewResource(simple_expandable_list_item_1);
        ssub1.setAdapter(ssubject);
        ssub1.setOnItemSelectedListener(new function());

    }
    public void ongetonlineclick1(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(gtol));
        startActivity(intent);

    }


    public void ongetonlineclick2(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(gtoll));
        startActivity(intent);

    }

    public void ongetonlineclick3(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(gtolll));
        startActivity(intent);
    }
    public void ongetonlineclick4(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(gtollll));
        startActivity(intent);
    }

    public void ongetonlineclick5(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(gtolllll));
        startActivity(intent);
    }
    public void ongetonlineclick6(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(gtollllll));
        startActivity(intent);
    }

    public void ongtsyclick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(gsy11));
        startActivity(intent);

    }

    public class function implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> parent, View arg1, int pos, long id) {
            String str = parent.getItemAtPosition(pos).toString();

            switch (str) {


                case "Applied Mathaematics IV":
                    gtol1.setVisibility(View.VISIBLE);
                    gtol2.setVisibility(View.VISIBLE);
                    gsy1.setVisibility(View.VISIBLE);
                    gtol3.setVisibility(View.INVISIBLE);
                    gtol4.setVisibility(View.INVISIBLE);
                    gtol5.setVisibility(View.INVISIBLE);
                    gtol6.setVisibility(View.INVISIBLE);
                    sb2.setVisibility(View.VISIBLE);
                    am1.setVisibility(View.VISIBLE);
                    am2.setVisibility(View.VISIBLE);
                    ac1.setVisibility(View.INVISIBLE);
                    ac2.setVisibility(View.INVISIBLE);
                    ap1.setVisibility(View.INVISIBLE);
                    ap2.setVisibility(View.INVISIBLE);
                    bee1.setVisibility(View.INVISIBLE);
                    bee2.setVisibility(View.INVISIBLE);
                    evs1.setVisibility(View.INVISIBLE);
                    evs2.setVisibility(View.INVISIBLE);
                    eme1.setVisibility(View.INVISIBLE);
                    eme2.setVisibility(View.INVISIBLE);
                    gsy11="http://www.sfitengg.org/CMPN/syllabus/SESEM4/AM-4.pdf";
                    gtol="https://books.google.co.in/books?isbn=8174091955";
                    gtoll="https://books.google.co.in/books?isbn=8121902819 ";
                    break;
                case "Analysis of Algorithm":
                    gtol1.setVisibility(View.VISIBLE);
                    gtol2.setVisibility(View.VISIBLE);
                    gsy1.setVisibility(View.VISIBLE);
                    gtol3.setVisibility(View.INVISIBLE);
                    gtol4.setVisibility(View.INVISIBLE);
                    gtol5.setVisibility(View.INVISIBLE);
                    gtol6.setVisibility(View.INVISIBLE);
                    sb2.setVisibility(View.VISIBLE);
                    ac1.setVisibility(View.VISIBLE);
                    ac2.setVisibility(View.VISIBLE);
                    am1.setVisibility(View.INVISIBLE);
                    am2.setVisibility(View.INVISIBLE);
                    ap1.setVisibility(View.INVISIBLE);
                    ap2.setVisibility(View.INVISIBLE);
                    bee1.setVisibility(View.INVISIBLE);
                    bee2.setVisibility(View.INVISIBLE);
                    evs1.setVisibility(View.INVISIBLE);
                    evs2.setVisibility(View.INVISIBLE);
                    eme1.setVisibility(View.INVISIBLE);
                    eme2.setVisibility(View.INVISIBLE);
                    gsy11="http://www.sfitengg.org/CMPN/syllabus/SESEM4/AOA.pdf";
                    gtol="https://books.google.co.in/books?isbn=0273020722";
                    gtoll="https://books.google.co.in/books?isbn=0201435780";
                    break;
                case "Computer Organization and Architecture":
                    gsy1.setVisibility(View.VISIBLE);
                    gtol1.setVisibility(View.INVISIBLE);
                    gtol2.setVisibility(View.INVISIBLE);
                    gtol5.setVisibility(View.INVISIBLE);
                    gtol6.setVisibility(View.INVISIBLE);
                    gtol3.setVisibility(View.VISIBLE);
                    gtol4.setVisibility(View.VISIBLE);
                    sb2.setVisibility(View.VISIBLE);
                    ap1.setVisibility(View.VISIBLE);
                    ap2.setVisibility(View.VISIBLE);
                    am1.setVisibility(View.INVISIBLE);
                    am2.setVisibility(View.INVISIBLE);
                    ac1.setVisibility(View.INVISIBLE);
                    ac2.setVisibility(View.INVISIBLE);
                    eme1.setVisibility(View.INVISIBLE);
                    eme2.setVisibility(View.INVISIBLE);
                    bee1.setVisibility(View.INVISIBLE);
                    bee2.setVisibility(View.INVISIBLE);
                    evs1.setVisibility(View.INVISIBLE);
                    evs2.setVisibility(View.INVISIBLE);
                    gsy11="http://www.sfitengg.org/CMPN/syllabus/SESEM4/COA.pdf";
                    gtolll="https://books.google.co.in/books?isbn=0071122184";
                    gtollll="https://books.google.co.in/books?isbn=0070273553";
                    break;
                case "Database Management System":
                    gsy1.setVisibility(View.VISIBLE);
                    gtol1.setVisibility(View.INVISIBLE);
                    gtol2.setVisibility(View.INVISIBLE);
                    gtol5.setVisibility(View.INVISIBLE);
                    gtol6.setVisibility(View.INVISIBLE);
                    gtol3.setVisibility(View.VISIBLE);
                    gtol4.setVisibility(View.VISIBLE);
                    sb2.setVisibility(View.VISIBLE);
                    am1.setVisibility(View.INVISIBLE);
                    am2.setVisibility(View.INVISIBLE);
                    ac1.setVisibility(View.INVISIBLE);
                    ac2.setVisibility(View.INVISIBLE);
                    ap1.setVisibility(View.INVISIBLE);
                    ap2.setVisibility(View.INVISIBLE);
                    bee1.setVisibility(View.INVISIBLE);
                    bee2.setVisibility(View.INVISIBLE);
                    evs1.setVisibility(View.INVISIBLE);
                    evs2.setVisibility(View.INVISIBLE);
                    eme1.setVisibility(View.VISIBLE);
                    eme2.setVisibility(View.VISIBLE);
                    gsy11="http://www.sfitengg.org/CMPN/syllabus/SESEM4/Dbms.pdf";
                    gtolll="https://books.google.co.in/books?isbn=007107273X";
                    gtollll="https://books.google.co.in/books?isbn=0071289593";
                    break;
                case "Theoretical Computer Science":
                    gsy1.setVisibility(View.VISIBLE);
                    gtol1.setVisibility(View.INVISIBLE);
                    gtol2.setVisibility(View.INVISIBLE);
                    gtol3.setVisibility(View.INVISIBLE);
                    gtol4.setVisibility(View.INVISIBLE);
                    gtol5.setVisibility(View.VISIBLE);
                    gtol6.setVisibility(View.VISIBLE);
                    sb2.setVisibility(View.VISIBLE);
                    bee1.setVisibility(View.VISIBLE);
                    bee2.setVisibility(View.VISIBLE);
                    evs1.setVisibility(View.INVISIBLE);
                    evs2.setVisibility(View.INVISIBLE);
                    am1.setVisibility(View.INVISIBLE);
                    am2.setVisibility(View.INVISIBLE);
                    ac1.setVisibility(View.INVISIBLE);
                    ac2.setVisibility(View.INVISIBLE);
                    ap1.setVisibility(View.INVISIBLE);
                    ap2.setVisibility(View.INVISIBLE);
                    eme1.setVisibility(View.INVISIBLE);
                    eme2.setVisibility(View.INVISIBLE);
                    gsy11="http://www.sfitengg.org/CMPN/syllabus/SESEM4/TCS.pdf";
                    gtolllll="https://books.google.co.in/books?isbn=1285401069";
                    gtollllll="https://books.google.co.in/books?isbn=0071289593";
                    break;
                case "Computer Graphics":
                    gsy1.setVisibility(View.VISIBLE);
                    gtol1.setVisibility(View.INVISIBLE);
                    gtol2.setVisibility(View.INVISIBLE);
                    gtol3.setVisibility(View.INVISIBLE);
                    gtol4.setVisibility(View.INVISIBLE);
                    gtol5.setVisibility(View.VISIBLE);
                    gtol6.setVisibility(View.VISIBLE);
                    sb2.setVisibility(View.VISIBLE);
                    bee1.setVisibility(View.INVISIBLE);
                    bee2.setVisibility(View.INVISIBLE);
                    evs1.setVisibility(View.VISIBLE);
                    evs2.setVisibility(View.VISIBLE);
                    am1.setVisibility(View.INVISIBLE);
                    am2.setVisibility(View.INVISIBLE);
                    ac1.setVisibility(View.INVISIBLE);
                    ac2.setVisibility(View.INVISIBLE);
                    ap1.setVisibility(View.INVISIBLE);
                    ap2.setVisibility(View.INVISIBLE);
                    eme1.setVisibility(View.INVISIBLE);
                    eme2.setVisibility(View.INVISIBLE);
                    gsy11="http://www.sfitengg.org/CMPN/syllabus/SESEM4/CG.pdf";
                    gtolllll="https://books.google.co.in/books?isbn=817758765X";
                    gtollllll="https://books.google.co.in/books?isbn=0131362623";
                    break;
                default:gsy1.setVisibility(View.INVISIBLE);
                    am1.setVisibility(View.INVISIBLE);
                    am2.setVisibility(View.INVISIBLE);
                    ac1.setVisibility(View.INVISIBLE);
                    ac2.setVisibility(View.INVISIBLE);
                    ap1.setVisibility(View.INVISIBLE);
                    ap2.setVisibility(View.INVISIBLE);
                    eme1.setVisibility(View.INVISIBLE);
                    eme2.setVisibility(View.INVISIBLE);
                    bee1.setVisibility(View.INVISIBLE);
                    bee2.setVisibility(View.INVISIBLE);
                    evs1.setVisibility(View.INVISIBLE);
                    evs2.setVisibility(View.INVISIBLE);
                    sb2.setVisibility(View.INVISIBLE);
                    gtol1.setVisibility(View.INVISIBLE);
                    gtol2.setVisibility(View.INVISIBLE);
                    gtol3.setVisibility(View.INVISIBLE);
                    gtol4.setVisibility(View.INVISIBLE);
                    gtol5.setVisibility(View.INVISIBLE);
                    gtol6.setVisibility(View.INVISIBLE);


            }


        }


        public void onNothingSelected(AdapterView<?> arg0) {

        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sem4coms, menu);
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
