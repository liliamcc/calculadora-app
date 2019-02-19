package com.example.familiaju.myapplication;

import android.app.Activity;

public class Calculadora extends Activity {


    public float valor1;
        public float valor2;
        public String operador;


        public String Resultado() {
            float conta = 0;
            String str = "";
            if(valor2 > 0) {
                if (operador.contains("/")) {
                    conta = valor1 / valor2;
                    str = Float.toString(conta);
                } else if (operador.contains("*")) {
                    conta = valor1 * valor2;
                    str = Float.toString(conta);
                } else if (operador.contains("+")) {
                    conta = valor1 + valor2;
                    str = Float.toString(conta);
                } else if (operador.contains("-")) {
                    conta = valor1 - valor2;
                    str = Float.toString(conta);
                }
            }
            return str;
        }

    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }


}
