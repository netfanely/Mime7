package com.netfanely.mime7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    private int[] mFrasesImg={R.drawable.fondo_0,R.drawable.fondo_1,R.drawable.fondo_2,
                              R.drawable.fondo_3,R.drawable.fondo_4,R.drawable.fondo_5,
                              R.drawable.fondo_6,R.drawable.fondo_7,R.drawable.fondo_8,
                              R.drawable.fondo_9,R.drawable.fondo_10,R.drawable.fondo_11,
                              R.drawable.fondo_12,R.drawable.fondo_13,R.drawable.fondo_14,
                              R.drawable.fondo_15};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    private void cambiarImagen(){
        ImageView ivFrase = (ImageView)findViewById(R.id.ivMainFrase);

        //obtener numero aleatorio entre 0 y 14
        Random numeros = new Random();
        int posicion = numeros.nextInt(4);

        //mostrar la imagen
        ivFrase.setImageResource(mFrasesImg[posicion]);

    }

    public void btnCambiarImagen_Click(View view) {
        cambiarImagen();
    }
}
