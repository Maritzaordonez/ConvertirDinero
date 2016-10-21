package edu.tecii.android.convertirdinero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText NumeDecimal;
    private TextView txtv1,txtv2,txtv3,txtv4,txtv5,txtv6,txtv7,txtv8,txtv9,txtv10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumeDecimal=(EditText)findViewById(R.id.edt1);
        txtv1=(TextView)findViewById(R.id.txt1);
        txtv2=(TextView)findViewById(R.id.txt2);
        txtv3=(TextView)findViewById(R.id.txt3);
        txtv4=(TextView)findViewById(R.id.txt4);
        txtv5=(TextView)findViewById(R.id.txt5);
        txtv6=(TextView)findViewById(R.id.txt6);
        txtv7=(TextView)findViewById(R.id.txt7);
        txtv8=(TextView)findViewById(R.id.txt8);
        txtv9=(TextView)findViewById(R.id.txt9);
        txtv10=(TextView)findViewById(R.id.txt10);
    }

    public void ConvercionDinero (View view){

        int parteentera, partedecimal;
        int blls100, blls50, blls20, blls10, mds5, mds2, mds1, cts05, cts02, cts01;
        String Cantidad= NumeDecimal.getText().toString();
        double nro1=Double.parseDouble(Cantidad);
        parteentera= (int)(nro1);
        blls100= parteentera / 100;
        parteentera= parteentera % 100;
        blls50 = parteentera / 50;
        parteentera = parteentera % 50;
        blls20 = parteentera / 20;
        parteentera = parteentera % 20;
        blls10 = parteentera / 10;
        parteentera = parteentera % 10;
        mds5 = parteentera /5;
        parteentera = parteentera % 5;
        mds2 = parteentera / 2;
        parteentera = parteentera %2;
        mds1 = parteentera;
        partedecimal = (int)(nro1 * 1000+ 0.5);
        cts05 = partedecimal / 500;
        partedecimal = partedecimal %500;
        cts02 = partedecimal / 200;
        partedecimal = partedecimal %200;
        cts01 = partedecimal / 100;

        String resu="", resu1="", resu2="", resu3="", resu4="", resu5="",resu6="",resu7="", resu8= "",
                resu9="";

        resu="El total de los Billetes de 100 es: " + blls100 + " \n";
        resu1="El total de los Billetes de 50 es: "+ blls50 + "\n";
        resu2="El total de los Billetes de 20 es: "+ blls20 + "\n";
        resu3="El total de los Billetes de 10 es: "+ blls10 + "\n";
        resu4="El total de Monedas de 5 pesos es: "+ mds5 +  "\n";
        resu5="El total de las Monedas de 2 pesos es: "+mds2 + "\n";
        resu6="El total de las Monedas de 1 pesos es: "+mds1 + "\n";
        resu7="El total de los Monedas de 50 Centavos es: "+ cts05 + "\n";
        resu8="El tottal de las Monedas de 20 Centavos es: "+ cts02 + "\n";
        resu9="El total de las Monedas de 10 Centavos es: "+ cts01 + "\n";

        txtv1.setText(resu);
        txtv2.setText(resu1);
        txtv3.setText(resu2);
        txtv4.setText(resu3);
        txtv5.setText(resu4);
        txtv6.setText(resu5);
        txtv7.setText(resu6);
        txtv8.setText(resu7);
        txtv9.setText(resu8);
        txtv10.setText(resu9);

    }
}
