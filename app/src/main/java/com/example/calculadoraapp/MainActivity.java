package com.example.calculadoraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eNumero;
    Button bMas, bMenos, bPor, bDiv, bIgual, bC;
    double Oper1, Oper2, Resul;
    String Operac, Conca="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNumero= (EditText) findViewById(R.id.eNumero);
        bMas= (Button) findViewById(R.id.bMas);
        bMenos= (Button) findViewById(R.id.bMenos);
        bPor= (Button) findViewById(R.id.bPor);
        bDiv= (Button) findViewById(R.id.bDiv);
        bIgual= (Button) findViewById(R.id.bIgual);
        bC= (Button) findViewById(R.id.bC);

        bMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operac="+";
                Oper1=Double.parseDouble(eNumero.getText().toString());
                Conca="";
                eNumero.setText("+");
            }
        });

        bMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operac="-";
                Oper1=Double.parseDouble(eNumero.getText().toString());
                Conca="";
                eNumero.setText("-");
            }
        });

        bPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operac="*";
                Oper1=Double.parseDouble(eNumero.getText().toString());
                Conca="";
                eNumero.setText("*");
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operac="/";
                Oper1=Double.parseDouble(eNumero.getText().toString());
                Conca="";
                eNumero.setText("/");
            }
        });

        bIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Oper2=Double.parseDouble(eNumero.getText().toString());
                if(Operac.equals("+")){
                    eNumero.setText("");
                    Resul=Oper1+Oper2;
                }

                if(Operac.equals("-")){
                    eNumero.setText("");
                    Resul=Oper1-Oper2;
                }

                if(Operac.equals("*")){
                    eNumero.setText("");
                    Resul=Oper1*Oper2;
                }

                if(Operac.equals("/")){
                    eNumero.setText("");
                    Resul=Oper1/Oper2;
                }

                eNumero.setText(String.valueOf(Resul));
            }
        });

        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Oper1=0;
                Oper2=0;
                Conca="";

                eNumero.setText("");
            }
        });

    }


    public void click(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.b0:
                Conca = Conca + '0';
                eNumero.setText(Conca);
                break;
            case R.id.b1:
                Conca = Conca + '1';
                eNumero.setText(Conca);
                break;
            case R.id.b2:
                Conca = Conca + '2';
                eNumero.setText(Conca);
                break;
            case R.id.b3:
                Conca = Conca + '3';
                eNumero.setText(Conca);
                break;
            case R.id.b4:
                Conca = Conca + '4';
                eNumero.setText(Conca);
                break;
            case R.id.b5:
                Conca = Conca + '5';
                eNumero.setText(Conca);
                break;
            case R.id.b6:
                Conca = Conca + '6';
                eNumero.setText(Conca);
                break;
            case R.id.b7:
                Conca = Conca + '7';
                eNumero.setText(Conca);
                break;
            case R.id.b8:
                Conca = Conca + '8';
                eNumero.setText(Conca);
                break;
            case R.id.b9:
                Conca = Conca + '9';
                eNumero.setText(Conca);
                break;
            case R.id.bPunto:
                Conca = Conca + '.';
                eNumero.setText(Conca);
                break;
        }
    }
}
