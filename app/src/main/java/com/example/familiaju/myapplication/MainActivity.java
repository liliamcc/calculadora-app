package com.example.familiaju.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, bt_soma,
            bt_resta, bt_multiplicar, bt_dividir, bt_igualdad, bt_ponto, bt_ce, bt_back;

    TextView tv_1, tv_2, tv_3, tv_resultado;
    Calculadora calculadora;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt0 = (Button) findViewById(R.id.bt0);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        bt_dividir = (Button) findViewById(R.id.bt_dividir);
        bt_igualdad = (Button) findViewById(R.id.bt_dividir);
        bt_multiplicar = (Button) findViewById(R.id.bt_multiplicar);
        bt_ponto = (Button) findViewById(R.id.bt_ponto);
        bt_resta = (Button) findViewById(R.id.bt_resta);
        bt_soma = (Button) findViewById(R.id.bt_soma);
        bt_ce = (Button) findViewById(R.id.bt_ce);
        bt_back = (Button) findViewById(R.id.bt_back);
        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        tv_3 = (TextView) findViewById(R.id.tv_3);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);

        calculadora = new Calculadora();
    }

    boolean bool = false;

    public void Bt_soma(View v) {
        bool = true;
        tv_3.setText("+");
    }

    public void Bt_resta(View v) {
        bool = true;
        tv_3.setText("-");
    }

    public void Bt_multiplicar(View v) {
        bool = true;
        tv_3.setText("*");
    }

    public void Bt_dividir(View v) {
        bool = true;
        tv_3.setText("/");
    }


    public void Bt_igualdad(View v) {
        calculadora.setValor1(Float.parseFloat(tv_1.getText().toString()));
        calculadora.setValor2(Float.parseFloat(tv_2.getText().toString()));
        calculadora.setOperador(tv_3.getText().toString());
        tv_resultado.setText(calculadora.Resultado());
    }


    public void Bt_ponto(View v) {
        if (bool == false) {
            String strponto = tv_1.getText().toString();
            if (strponto.contains(".")) {
                Toast.makeText(MainActivity.this, " ", Toast.LENGTH_SHORT).show();
            } else {
                String str = tv_1.getText().toString();
                tv_1.setText(str + ".");
            }
        } else {
            String strPonto = tv_2.getText().toString();
            if (strPonto.contains(".")) {
                Toast.makeText(MainActivity.this, " ", Toast.LENGTH_SHORT).show();
            } else {
                String str = tv_2.getText().toString();
                tv_2.setText(str + ".");
            }
        }
    }

    public void Bt_ce(View v) {
        bool = false;
        tv_1.setText("");
        tv_2.setText("");
        tv_3.setText("");
        tv_resultado.setText("");
    }

    public void Bt_back(View v) {
        if (bool == false) {
            String str = tv_1.getText().toString();
            if (str.length() > 0) {
                String str_sub = str.substring(0, str.length() - 1);
                tv_3.setText("");
                tv_1.setText(str_sub);

            } else {
                tv_1.setText("");
                bool = false;
            }
        } else {
            String str = tv_2.getText().toString();
            if (str.length() > 0) {
                String str_sub = str.substring(0, str.length() - 1);
                tv_2.setText(str_sub);
            }
            if (tv_2.getText().length() <= 0) {
                tv_2.setText("");
                bool = false;
            }
        }
    }

    public void Bt_0(View v) {
        if (bool == false) {
            String str = tv_1.getText().toString();
            tv_1.setText(str + "0");
        } else {
            String str = tv_2.getText().toString();
            tv_2.setText(str + "0");
        }
    }

    public void Bt_1(View v) {
        if (bool == false) {
            String str = tv_1.getText().toString();
            tv_1.setText(str + "1");
        } else {
            String str = tv_2.getText().toString();
            tv_2.setText(str + "1");
        }

    }

    public void Bt_2(View v) {
        if (bool == false) {
            String str = tv_1.getText().toString();
            tv_1.setText(str + "2");
        } else {
            String str = tv_2.getText().toString();
            tv_2.setText(str + "2");
        }
    }

    public void Bt_3(View v) {
        if (bool == false) {
            String str = tv_1.getText().toString();
            tv_1.setText(str + "3");
        } else {
            String str = tv_2.getText().toString();
            tv_2.setText(str + "3");
        }
    }

    public void Bt_4(View v) {
        if (bool == false) {
            String str = tv_1.getText().toString();
            tv_1.setText(str + "4");
        } else {
            String str = tv_2.getText().toString();
            tv_2.setText(str + "4");
        }
    }

    public void Bt_5(View v) {
        if (bool == false) {
            String str = tv_1.getText().toString();
            tv_1.setText(str + "5");
        } else {
            String str = tv_2.getText().toString();
            tv_2.setText(str + "5");
        }
    }

    public void Bt_6(View v) {
        if (bool == false) {
            String str = tv_1.getText().toString();
            tv_1.setText(str + "6");
        } else {
            String str = tv_2.getText().toString();
            tv_2.setText(str + "6");
        }
    }

    public void Bt_7(View v) {
        if (bool == false) {
            String str = tv_1.getText().toString();
            tv_1.setText(str + "7");
        } else {
            String str = tv_2.getText().toString();
            tv_2.setText(str + "7");
        }
    }

    public void Bt_8(View v) {
        if (bool == false) {
            String str = tv_1.getText().toString();
            tv_1.setText(str + "8");
        } else {
            String str = tv_2.getText().toString();
            tv_2.setText(str + "8");
        }

    }

    public void Bt_9(View v) {
        if (bool == false) {
            String str = tv_1.getText().toString();
            tv_1.setText(str + "9");
        } else {
            String str = tv_2.getText().toString();
            tv_2.setText(str + "9");
        }
    }
}