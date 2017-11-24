package com.example.gabri.protecoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Cursos extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
        Curso curso[] = new Curso[]{
                new Curso(R.drawable.ic_launcher, "Holi"),
                new Curso(R.drawable.ic_launcher, "Holi1"),
                new Curso(R.drawable.ic_launcher, "Holi2"),
                new Curso(R.drawable.ic_launcher, "Holi3"),
                new Curso(R.drawable.ic_launcher, "Holi4")
        };
        CursoAdapter adapter = new CursoAdapter(this,R.layout.listview_item_row, curso);
        listView = (ListView) findViewById(R.id.listview);
        View header = (View) getLayoutInflater().inflate(R.layout.list_header_row, null);
        listView.addHeaderView(header);
        listView.setAdapter(adapter);



    }
}
