package com.example.pruebaunitarias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pruebaunitarias.Validar.Correo;

public class MainActivity extends AppCompatActivity {
    private EditText fieldCorreo, fieldUser;
    private Button Button_Enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fieldCorreo = findViewById(R.id.correo);
        fieldUser = findViewById(R.id.usuario);
        Button_Enviar = findViewById(R.id.btn_enviar);
//        Button_Enviar.setOnClickListener();
    }
    public void Enviar_datos(View view){
        Llenar();
    }

    private  void Llenar(){
        if (Correo.correo(fieldCorreo.getText().toString())){
            Toast.makeText(this,"Correo no valido", Toast.LENGTH_LONG).show();
        }else{
            if (Correo.CamposSinLLenar(fieldUser.getText().toString())){
                Toast.makeText(this, "usuario sin llenar, colocar su usuario",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"Enviado Correctamente",Toast.LENGTH_LONG).show();
            }
        }
    }
}