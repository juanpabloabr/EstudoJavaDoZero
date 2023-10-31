// Itens na MainActivity devem ser trabalhados para saídas em uma tela principal ou pela tela refenciadada por ela

package com.training.javadozero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}