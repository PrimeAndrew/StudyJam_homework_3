package com.linux.prime.calcuprime;

import android.icu.util.ValueIterator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private  TextView tv_coma;
    private  TextView tv_igual;
    private  TextView tv_cero;
    private  TextView tv_uno;
    private  TextView tv_dos;
    private  TextView tv_tres;
    private  TextView tv_cuatro;
    private  TextView tv_cinco;
    private  TextView tv_seis;
    private  TextView tv_siete;
    private  TextView tv_ocho;
    private  TextView tv_nueve;
    private  TextView tv_div;
    private  TextView tv_mul;
    private  TextView tv_sum;
    private  TextView tv_res;
    private  TextView tv_ce;
    private  TextView tv_espacio1;
    private  TextView tv_espacio2;
    private double cal1 ;
    private double cal2 ;
    private String mos ="";
    private int flag=0;
    private boolean p=false;
    private double aux=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
         tv_coma = (TextView) findViewById(R.id.tv_coma);
         tv_igual = (TextView) findViewById(R.id.tv_igual);
         tv_cero = (TextView) findViewById(R.id.tv_cero);
         tv_uno = (TextView) findViewById(R.id.tv_uno);
         tv_dos = (TextView) findViewById(R.id.tv_dos);
         tv_tres = (TextView) findViewById(R.id.tv_tres);
         tv_cuatro = (TextView) findViewById(R.id.tv_cuatro);
         tv_cinco = (TextView) findViewById(R.id.tv_cinco);
         tv_seis = (TextView) findViewById(R.id.tv_seis);
         tv_siete = (TextView) findViewById(R.id.tv_siete);
         tv_ocho = (TextView) findViewById(R.id.tv_ocho);
         tv_nueve = (TextView) findViewById(R.id.tv_nueve);
         tv_div = (TextView) findViewById(R.id.tv_div);
         tv_mul = (TextView) findViewById(R.id.tv_mul);
         tv_sum = (TextView) findViewById(R.id.tv_sum);
         tv_res = (TextView) findViewById(R.id.tv_res);
         tv_ce = (TextView) findViewById(R.id.tv_ce);
         tv_espacio1 = (TextView) findViewById(R.id.tv_espacio1);
         tv_espacio2 = (TextView) findViewById(R.id.tv_espacio2);

    }
    public void mostrarc (View view){
        //cal = Double.parseDouble(tv_coma.getText().toString());
        String a= tv_coma.getText().toString();
        mos += a;
        tv_espacio1.setText(mos);

    }
    public void mostrar0 (View view){
        //cal = Double.parseDouble(tv_cero.getText().toString());
        String a= tv_cero.getText().toString();
        mos += a;
        tv_espacio1.setText(mos);
        p=true;
    }
    public void mostrari (View view){
        tv_espacio1.setText("");
        tv_espacio2.setText(cal1+"");

    }
    public void mostrar1 (View view){

        String a= tv_uno.getText().toString();
        mos += a;
        tv_espacio1.setText(mos);
        System.out.println(p+"  "+flag);
        if(p==true && flag!=0) {
            cal2 = Double.parseDouble(tv_uno.getText().toString());
            switch (flag) {
                case 1:
                    if(cal2>0) {
                        cal1 = cal1 * cal2;
                        tv_espacio2.setText(cal1 + "");
                    }else{

                    }
                    break;
                case 2:
                    cal1=cal1*cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 3:
                    cal1=cal1-cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 4:
                    cal1=cal1+cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
            }
        }else{
            cal1 = Double.parseDouble(tv_uno.getText().toString());
            aux=aux*10+cal1;
            cal1=aux;
        }
        p=true;
        flag=0;
    }
    public void mostrar2 (View view){
        //cal = Double.parseDouble(tv_dos.getText().toString());
        String a= tv_dos.getText().toString();
        mos += a;
        tv_espacio1.setText(mos);
        if(p==true && flag!=0) {
            cal2 = Double.parseDouble(tv_dos.getText().toString());
            switch (flag) {
                case 1:
                    if(cal2>0) {
                        cal1 = cal1 * cal2;
                        tv_espacio2.setText(cal1 + "");
                    }else{

                    }
                    break;
                case 2:
                    cal1=cal1*cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 3:
                    cal1=cal1-cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 4:
                    cal1=cal1+cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
            }
        }else{
            cal1 = Double.parseDouble(tv_dos.getText().toString());
            aux=aux*10+cal1;
            cal1=aux;
        }
        p=true;
    }
    public void mostrar3 (View view){
        //cal = Double.parseDouble(tv_tres.getText().toString());
        String a= tv_tres.getText().toString();
        mos += a;
        tv_espacio1.setText(mos);
        if(p==true && flag!=0) {
            cal2 = Double.parseDouble(tv_tres.getText().toString());
            switch (flag) {
                case 1:
                    if(cal2>0) {
                        cal1 = cal1 * cal2;
                        tv_espacio2.setText(cal1 + "");
                    }else{

                    }
                    break;
                case 2:
                    cal1=cal1*cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 3:
                    cal1=cal1-cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 4:
                    cal1=cal1+cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
            }
        }else{
            cal1 = Double.parseDouble(tv_tres.getText().toString());
            aux=aux*10+cal1;
            cal1=aux;
        }
        p=true;
    }
    public void mostrar4 (View view){
        //cal = Double.parseDouble(tv_cuatro.getText().toString());
        String a= tv_cuatro.getText().toString();
        mos += a;
        tv_espacio1.setText(mos);
        if(p==true && flag!=0) {
            cal2 = Double.parseDouble(tv_cuatro.getText().toString());
            switch (flag) {
                case 1:
                    if(cal2>0) {
                        cal1 = cal1 * cal2;
                        tv_espacio2.setText(cal1 + "");
                    }else{

                    }
                    break;
                case 2:
                    cal1=cal1*cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 3:
                    cal1=cal1-cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 4:
                    cal1=cal1+cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
            }
        }else{
            cal1 = Double.parseDouble(tv_cuatro.getText().toString());
            aux=aux*10+cal1;
            cal1=aux;
        }
        p=true;
    }
    public void mostrar5 (View view){
        //cal = Double.parseDouble(tv_cinco.getText().toString());
        String a= tv_cinco.getText().toString();
        mos += a;
        tv_espacio1.setText(mos);
        if(p==true && flag!=0) {
            cal2 = Double.parseDouble(tv_cinco.getText().toString());
            switch (flag) {
                case 1:
                    if(cal2>0) {
                        cal1 = cal1 * cal2;
                        tv_espacio2.setText(cal1 + "");
                    }else{

                    }
                    break;
                case 2:
                    cal1=cal1*cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 3:
                    cal1=cal1-cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 4:
                    cal1=cal1+cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
            }
        }else{
            cal1 = Double.parseDouble(tv_cinco.getText().toString());
            aux=aux*10+cal1;
            cal1=aux;
        }
        p=true;
    }
    public  void mostrar6 (View view){
        //cal = Double.parseDouble(tv_seis.getText().toString());
        String a= tv_seis.getText().toString();
        mos += a;
        tv_espacio1.setText(mos);
        if(p==true && flag!=0) {
            cal2 = Double.parseDouble(tv_seis.getText().toString());
            switch (flag) {
                case 1:
                    if(cal2>0) {
                        cal1 = cal1 * cal2;
                        tv_espacio2.setText(cal1 + "");
                    }else{

                    }
                    break;
                case 2:
                    cal1=cal1*cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 3:
                    cal1=cal1-cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 4:
                    cal1=cal1+cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
            }
        }else{
            cal1 = Double.parseDouble(tv_seis.getText().toString());
            aux=aux*10+cal1;
            cal1=aux;
        }
        p=true;
    }
    public void mostrar7 (View view){
        //cal = Double.parseDouble(tv_siete.getText().toString());
        String a= tv_siete.getText().toString();
        mos += a;
        tv_espacio1.setText(mos);
        if(p==true && flag!=0) {
            cal2 = Double.parseDouble(tv_siete.getText().toString());
            switch (flag) {
                case 1:
                    if(cal2>0) {
                        cal1 = cal1 * cal2;
                        tv_espacio2.setText(cal1 + "");
                    }else{

                    }
                    break;
                case 2:
                    cal1=cal1*cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 3:
                    cal1=cal1-cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 4:
                    cal1=cal1+cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
            }
        }else{
            cal1 = Double.parseDouble(tv_siete.getText().toString());
            aux=aux*10+cal1;
            cal1=aux;
        }
        p=true;
    }
    public void mostrar8 (View view) {
        //cal = Double.parseDouble(tv_ocho.getText().toString());
        String a= tv_ocho.getText().toString();
        mos += a;
        tv_espacio1.setText(mos);
        if(p==true && flag!=0) {
            cal2 = Double.parseDouble(tv_ocho.getText().toString());
            switch (flag) {
                case 1:
                    if(cal2>0) {
                        cal1 = cal1 * cal2;
                        tv_espacio2.setText(cal1 + "");
                    }else{

                    }
                    break;
                case 2:
                    cal1=cal1*cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 3:
                    cal1=cal1-cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 4:
                    cal1=cal1+cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
            }
        }else{
            cal1 = Double.parseDouble(tv_ocho.getText().toString());
            aux=aux*10+cal1;
            cal1=aux;
        }
        p=true;
    }
    public void mostrar9 (View view){
        //cal = Double.parseDouble(tv_nueve.getText().toString());
        String a= tv_nueve.getText().toString();
        mos +=a;
        tv_espacio1.setText(mos);
        if(p==true && flag!=0) {
            cal2 = Double.parseDouble(tv_nueve.getText().toString());
            switch (flag) {
                case 1:
                    if(cal2>0) {
                        cal1 = cal1 * cal2;
                        tv_espacio2.setText(cal1 + "");
                    }else{

                    }
                    break;
                case 2:
                    cal1=cal1*cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 3:
                    cal1=cal1-cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
                case 4:
                    cal1=cal1+cal2;
                    tv_espacio2.setText(cal1+"");
                    break;
            }
        }else{
            cal1 = Double.parseDouble(tv_nueve.getText().toString());
            aux=aux*10+cal1;
            cal1=aux;
        }
        p=true;
    }
    public void mostrard (View view){
        flag = 1;
        //cal = Double.parseDouble(tv_siete.getText().toString());
        String a= tv_div.getText().toString();
        mos += a;
        tv_espacio1.setText(mos);
        p=true;
    }
    public void mostrarx (View view){
        flag = 2;
        //cal = Double.parseDouble(tv_siete.getText().toString());
        String a= tv_mul.getText().toString();
        mos += a;
        tv_espacio1.setText(mos);
        p=true;
    }
    public void mostrarr (View view){
        flag = 3;
        //cal = Double.parseDouble(tv_siete.getText().toString());
        String a= tv_res.getText().toString();
        mos += a;
        tv_espacio1.setText(mos);
        p=true;
    }
    public void mostrars (View view) {
        flag = 4;
        String a= tv_sum.getText().toString();
        mos += a;
        tv_espacio1.setText(mos);
        p=true;
    }
    public void mostrarce(View view){
        cal1=0;
        cal2=0;
        mos="";
        aux=0;
        flag = 0;
        p = false;
        tv_espacio1.setText("");
        tv_espacio2.setText("");
    }
}
