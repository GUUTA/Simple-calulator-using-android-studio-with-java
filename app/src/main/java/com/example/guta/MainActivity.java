package com.example.guta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
    * initialization all buttons
    * */
 Button ba,bc,bb1,bb2,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bequal,bdot,bpi,bplus,bminus,bmult,bfact,bsquere,bsqrt,bdiv,binv,bsin,bcos,btan,bln,blog;
TextView tvmains, tvtsec;
String pi="3.14159265";
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        bdot=findViewById(R.id.bdot);
        bpi=findViewById(R.id.bpi);
        binv=findViewById(R.id.binv);
        bdiv=findViewById(R.id.bdiv);
        bplus=findViewById(R.id.bplus);
        bmult=findViewById(R.id.bmult);
        bminus=findViewById(R.id.bminus);
        bequal=findViewById(R.id.bequal);
        bsin=findViewById(R.id.bsin);
        bcos=findViewById(R.id.bcos);
        btan=findViewById(R.id.btan);
        blog=findViewById(R.id.blog);
        bln=findViewById(R.id.bln);
        bfact=findViewById(R.id.bfact);
        ba=findViewById(R.id.ba);
        bc=findViewById(R.id.bc);
        bb1=findViewById(R.id.bb1);
        bb2=findViewById(R.id.bb2);
        tvmains=findViewById(R.id.tvmains);
        tvtsec=findViewById(R.id.tvsec);

        /*
        click listeners
         */
      b1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            tvmains.setText(tvmains.getText()+"1");
          }
      });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+".");
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText("");
                tvtsec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=tvmains.getText().toString();
                val=val.substring(0,val.length()-1);
                tvmains.setText(val);
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"+");
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"-");
            }
        });
        bmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"×");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"÷");
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=tvmains.getText().toString();
                Double r=Math.sqrt(Double.parseDouble(val));
                tvmains.setText(String.valueOf(r));
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              tvmains.setText(tvmains.getText()+"(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtsec.setText(bpi.getText());
                tvmains.setText(tvmains.getText()+pi);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"sin");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"cos");
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"tan");
            }
        });
        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvmains.setText(tvmains.getText()+"^"+"-1");
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val =Integer.parseInt(tvmains.getText().toString());
                int fact=factorial(val);
                tvmains.setText(String.valueOf(fact));
                tvtsec.setText(val+"!");

            }
        });
    bsqrt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Double d =Double.parseDouble(tvmains.getText().toString());
            Double square=d*d;
            tvmains.setText(String.valueOf(square));
           tvtsec.setText(d +"²");
        }
    });
    bln.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            tvmains.setText(tvmains.getText()+"ln");
        }
    });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmains.setText(tvmains.getText()+"log");
            }
        });
    bequal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String val= tvmains.getText().toString();
            char oldChar, newChar;
            String replacedstr=val.replace(oldChar='+', newChar='/').replace(oldChar='×',newChar= '*');

            Double result=eval(replacedstr);
            tvmains.setText(String.valueOf(result));
            tvtsec.setText(val);
        }
    });

    }
    //factorial function
    int factorial(int n){
return (n==0||n==1)?1:n*factorial(n-1);
    }

    public static double eval(final String str){
        return new Object(){
            int pos =  -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat){
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse(){
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }





            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if      (eat('+')) x += parseTerm(); //addition
                    else if (eat('-')) x -= parseTerm(); //subtraction
                    else return x;
                }
            }
            double parseTerm(){
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseTerm(); //multiplication
                    else if (eat( '/')) x /= parseTerm(); //division
                    else return x;
                }
            }

            double parseFactor(){
                if (eat('+')) return parseFactor(); //unary plus
                if (eat('-')) return -parseFactor(); //unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')){ //parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { //numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { //functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sroot")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x =Math.pow(x, parseFactor());

                return x;
            }
        }.parse();
    }
}
