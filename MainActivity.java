package com.example.user.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity {

    int num,count=0;
    float fnum;
    int flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bcc,b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot, bmul, bdiv, bsub, bsum, beq;
        final TextView display;
        display = (TextView) findViewById(R.id.display);
        bcc = (Button) findViewById(R.id.buttoncc);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b0 = (Button) findViewById(R.id.button0);
        bdot = (Button) findViewById(R.id.ButtonDot);
        bsub = (Button) findViewById(R.id.buttonMin);
        bdiv = (Button) findViewById(R.id.buttonDiv);
        bmul = (Button) findViewById(R.id.buttonMul);
        bsum = (Button) findViewById(R.id.buttonSum);
        beq = (Button) findViewById(R.id.buttonEq);
        //display.setText("0");

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==0) {
                    display.setText(display.getText() + ".");
                    count=1;
                }else{

                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { display.setText(display.getText() + "1");   }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { display.setText(display.getText() + "2"); }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"0");
            }
        });

        bcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        bsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = 1;
                fnum = Float.parseFloat(display.getText().toString());
                display.setText("");
                count=0;
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=2;
                fnum = Float.parseFloat(display.getText().toString());
                display.setText("");
                count=0;
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=3;
                fnum = Float.parseFloat(display.getText().toString());
                display.setText("");
                count=0;
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=4;
                fnum = Float.parseFloat(display.getText().toString());
                display.setText("");
                count=0;
            }
        });

        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == 1) {
                    fnum = fnum + Float.parseFloat(display.getText().toString());
                    String ans = String.valueOf(fnum);
                    display.setText(ans);
                }else if(flag==2) {
                    fnum = fnum - Float.parseFloat(display.getText().toString());
                    String ans = String.valueOf(fnum);
                    display.setText(ans);
                }else if(flag==3) {
                    fnum = fnum * Float.parseFloat(display.getText().toString());
                    String ans = String.valueOf(fnum);
                    display.setText(ans);
                }else if(flag==4){
                    fnum = fnum / Float.parseFloat(display.getText().toString());
                    String ans = String.valueOf(fnum);
                    display.setText(ans);
                }else{
                    flag=0; 
                }
            }
        });
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
