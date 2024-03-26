package com.kaique.alcoolougasolina;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText gasolina,alcool;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gasolina = findViewById(R.id.idgasolina);
        alcool = findViewById(R.id.idalcool);
        resultado = findViewById(R.id.idresultado);
    }
    public void calcular(View view){
        String precoGasolina = gasolina.getText().toString();
        String precoAlcool = alcool.getText().toString();
        Boolean result = validar(precoGasolina,precoAlcool);
        if(result){
            Float g = Float.parseFloat(precoGasolina);
            Float a = Float.parseFloat(precoAlcool);
            if(a/g <=0.7){
                resultado.setText("A melhor opção para o seu carro é o Álcool");
            }else resultado.setText("A melhor opção para o seu carro é a Gasolina");
        }else resultado.setText("Preencha todos os campos primeiro!!");
    }
    public Boolean validar(String g, String a){
        if (g.equals("") || g == null || a.equals("") || a == null){
            return false;
        }else return true;
    }
}