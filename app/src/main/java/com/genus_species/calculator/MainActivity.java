package com.genus_species.calculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    double op1,op2;

    boolean check=false;

    String opt;

    private Button c;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button dot;
    private Button equ;
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;

    private TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c = (Button) findViewById(R.id.c);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        dot = (Button) findViewById(R.id.dot);
        equ = (Button) findViewById(R.id.equ);
        display = (TextView) findViewById(R.id.display);


     //   Intent intent = new Intent(this, Advanced.class);
     //   intent.putExtra("from",1);
     //   startActivity(intent);

//        String data= getIntent().getStringExtra("to");

   //     System.out.println("print main "+data);


            c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                op1=0.0;
                op2=0.0;
                opt=null;

                display.setText("0");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                type(zero);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                type(one);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                type(two);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                type(three);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                type(four);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                type(five);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                type(six);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                type(seven);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                type(eight);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                type(nine);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub


                if (check)
                {
                    System.out.println("true");
                    op2=Double.parseDouble((String)display.getText());
                    cal(opt,op1,op2);
                    opt="add";
                    op1=Double.parseDouble((String)display.getText());
                }
                else
                {
                    System.out.println("false");
                    op1=Double.parseDouble((String)display.getText());
                    opt="add";
                    check=true;
                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (check)
                {
                    System.out.println("true");
                    op2=Double.parseDouble((String)display.getText());
                    cal(opt,op1,op2);
                    opt="sub";
                    op1=Double.parseDouble((String)display.getText());
                }
                else
                {
                    System.out.println("false");
                    op1=Double.parseDouble((String)display.getText());
                    opt="sub";
                    check=true;
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (check)
                {
                    System.out.println("true");
                    op2=Double.parseDouble((String)display.getText());
                    cal(opt,op1,op2);
                    opt="mul";
                    op1=Double.parseDouble((String)display.getText());
                }
                else
                {
                    System.out.println("false");
                    op1=Double.parseDouble((String)display.getText());
                    opt="mul";
                    check=true;
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (check)
                {
                    System.out.println("true");
                    op2=Double.parseDouble((String)display.getText());
                    cal(opt,op1,op2);
                    opt="div";
                    op1=Double.parseDouble((String)display.getText());
                }
                else
                {
                    System.out.println("false");
                    op1=Double.parseDouble((String)display.getText());
                    opt="div";
                    check=true;
                }
            }
        });


        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                type(dot);
            }
        });


        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                op2=Double.parseDouble((String)display.getText());
                double res;

                cal(opt,op1,op2);
                check=false;
            }
        });


    }

    public void type(Button num){
        String n;
        n= (String)num.getText();
        if (display.getText()==".")
        {
            display.setText("0"+n);
            System.out.println("0-------------"+display.getText());
        }
        //System.out.println((String)display.getText());
        else if (Double.parseDouble((String)display.getText())==0)
        {
            display.setText(n);
            System.out.println("1----------"+display.getText());
        }
        else
        {
            if(check)
            {
                display.setText(n);
                System.out.println("2----t-------"+display.getText());
            }
            else
            {
                display.setText(display.getText() + n);
                System.out.println("2-----f------" + display.getText());
            }
        }
    }


    public void cal(String oper,double oper1,double oper2){
        double res;

        if (oper=="add")
        {
            res=oper1+oper2;
            display.setText(""+res);
        }
        if (oper=="sub")
        {
            res=oper1-oper2;
            display.setText(""+res);
        }
        if (oper=="mul")
        {
            res=oper1*oper2;
            display.setText(""+res);
        }
        if (oper=="div")
        {
            res=oper1/oper2;
            display.setText("" + res);
        }
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        super.onOptionsItemSelected(item);

        if(item.getItemId() == R.id.advance)
        {
            System.out.println(display.getText());
            Intent intent = new Intent(MainActivity.this, Advanced.class);
            intent.putExtra("result", display.getText().toString());
            startActivityForResult(intent, 1);
        }

        return true;
    }
}
