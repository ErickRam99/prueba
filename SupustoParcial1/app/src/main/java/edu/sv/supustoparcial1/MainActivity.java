package edu.sv.supustoparcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edtnumero,edtsaldo;
TextView txvshow,txvacre,txvcontador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtnumero = findViewById(R.id.edtCuenta);
        edtsaldo = findViewById(R.id.edtSaldo);
        txvshow =  findViewById(R.id.txvMostar);
        txvacre = findViewById(R.id.txvAcreeedor);
        txvcontador = findViewById(R.id.txvTotal);
    }

    public void cuenta(View view) {
        int cuenta = Integer.parseInt(edtnumero.getText().toString());
        double Saldo = Double.parseDouble(edtsaldo.getText().toString());
        String mos = "";

        if (Saldo > 0) {
            txvacre.setText("Usted es acareedor de un cuenta ");
            txvshow.setText("Su numero de  de cuenta es: "+cuenta+ " el monto de sus cuenta es de:"+ Saldo);
        }else if(Saldo<0){
            txvacre.setText("Usted es deudor de un cuenta ");
            txvshow.setText("Su numero de cuenta es: "+cuenta+ " el monto de sus cuenta es de:"+ Saldo);
        }else
            txvacre.setText("usted no posee saldo en su cuenta");
        txvshow.setText("Su numero de cuenta es: "+cuenta+ " el monto de sus cuenta es de:"+ Saldo);
    }
}