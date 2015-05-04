package com.genus_species.calculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Advanced extends ActionBarActivity {

    double op1, op2;

    double res;

    boolean check = false;

    String opt;

    private Button c;
    private Button sin;
    private Button cos;
    private Button tan;
    private Button roo;
    private Button mod;
    private Button pi;
    private Button pow;
    private Button fac;
    private Button ln;
    private Button log;
    private Button equ;
   /* private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;  */

    private TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        c = (Button) findViewById(R.id.c);
        sin = (Button) findViewById(R.id.sin);
        cos = (Button) findViewById(R.id.cos);
        tan = (Button) findViewById(R.id.tan);
        mod = (Button) findViewById(R.id.mod);
        roo = (Button) findViewById(R.id.roo);
        ln = (Button) findViewById(R.id.ln);
        log = (Button) findViewById(R.id.log);
        pow = (Button) findViewById(R.id.pow);
        fac = (Button) findViewById(R.id.fac);
        pi = (Button) findViewById(R.id.pi);

        display = (TextView) findViewById(R.id.display);


        //  String data = getIntent().getExtras().getString("from");

        Intent intent = new Intent(Advanced.this, MainActivity.class);
        intent.putExtra("to", "2");
        startActivity(intent);

        //  System.out.println("print adv"+data);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                op1 = 0.0;
                op2 = 0.0;
                opt = null;

                display.setText("0");
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub


                op1 = Double.parseDouble(display.getText().toString());

                res = Math.sin(op1);
                display.setText("" + res);


            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                op1 = Double.parseDouble(display.getText().toString());

                res = Math.cos(op1);
                display.setText("" + res);
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                op1 = Double.parseDouble(display.getText().toString());

                res = Math.tan(op1);
                display.setText("" + res);
            }
        });

        roo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                op1 = Double.parseDouble(display.getText().toString());

                res = Math.sqrt(op1);
                display.setText("" + res);


            }
        });
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                op1 = Double.parseDouble(display.getText().toString());

                res = 3.14 * (op1);
                display.setText("" + res);

            }
        });
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                op1 = Double.parseDouble(display.getText().toString());

                res = Math.pow(op1, 2);
                display.setText("" + res);
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub


                op1 = Double.parseDouble(display.getText().toString());

                res = Math.log(op1);
                display.setText("" + res);
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                op1 = Double.parseDouble(display.getText().toString());

                res = Math.log10(op1);
                display.setText("" + res);
            }
        });
        fac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                op1 = Double.parseDouble(display.getText().toString());

                res = fact(op1);
                display.setText("" + res);
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                op1 = Double.parseDouble(display.getText().toString());

                //    res= Math.mod(op1);
                display.setText("" + res);
            }
        });




    }

    protected double fact(double n) {
        if (n <= 1)
            return n;
        else
            return n * fact(n - 1);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_advanced, menu);
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
