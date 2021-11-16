package com.example.vitrineapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvProgram;
    String[] programName = {"Camisa", "Conjuntos", "Intimas", "Kids", "Paletos"};
    String[] programDescription = {"Camisa Desc", "Conjuntos Desc", "Intimas Desc", "Kids Desc", "Paletos Desc"};
    int[] programImages = {R.drawable.camisa, R.drawable.conjuntos, R.drawable.intimas, R.drawable.kids, R.drawable.paletos};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvProgram = findViewById(R.id.lvProgram);
        ProgramAdapter programAdapter = new ProgramAdapter(this, programName, programImages, programDescription);
        lvProgram.setAdapter(programAdapter);
    }
}