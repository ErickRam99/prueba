package edu.sv.calculadorapolacainversaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edtNum1,edtNum2,edtSim;
Button btnCalc;
TextView txvResp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1=findViewById(R.id.edtNumero1);
        edtNum2=findViewById(R.id.edtNumero2);
        edtSim=findViewById(R.id.edtSimbolo);
        txvResp=findViewById(R.id.txvRespuesta);

    }


        public void Sw (View view) {
            double numero1, numero2, respuesta;
            String simbolo;
            simbolo = edtSim.getText().toString();
            switch (simbolo) {
                case "+":
                    numero1 = Double.parseDouble(edtNum1.getText().toString());
                    numero2 = Double.parseDouble(edtNum2.getText().toString());
                    respuesta = numero1 + numero2;
                    txvResp.setText("La respueesta es " + String.valueOf(respuesta));
                    break;
                    case "-":
                        numero1 = Double.parseDouble(edtNum1.getText().toString());
                        numero2 = Double.parseDouble(edtNum2.getText().toString());
                        respuesta = numero1 - numero2;
                        txvResp.setText("La respueesta es " + String.valueOf(respuesta));
                        break;
                        case "*":
                            numero1 = Double.parseDouble(edtNum1.getText().toString());
                            numero2 = Double.parseDouble(edtNum2.getText().toString());
                            respuesta = numero1 * numero2;
                            txvResp.setText("La respueesta es " + String.valueOf(respuesta));
                            break;        case "/":
                        numero1 = Double.parseDouble(edtNum1.getText().toString());
                            numero2 = Double.parseDouble(edtNum2.getText().toString());
                            respuesta = numero1 / numero2;
                            txvResp.setText("La respueesta es " + String.valueOf(respuesta));
                            break;
                            default:
                                txvResp.setText("digite un simbolo que sea *+-/");
                                break;
            }
    }
}