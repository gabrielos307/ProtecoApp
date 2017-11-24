package com.example.gabri.protecoapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by gabri on 24/11/2017.
 */

public class CursoAdapter  extends ArrayAdapter<Curso>{

    Context mycontext;
    int mylayoutResourseID;
    Curso elementos[] = null;

    public CursoAdapter(Context context, int layoutResourseID, Curso[] elementos){
        super(context, layoutResourseID, elementos);
        this.mycontext = context;
        this.mylayoutResourseID = layoutResourseID;
        this.elementos = elementos;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        View row =  convertView;
        CursosHolder holder = null;
        if(row == null){
            LayoutInflater inflater = ((Activity)mycontext).getLayoutInflater();
            row = inflater.inflate(mylayoutResourseID, parent, false);
            holder = new CursosHolder();
            holder.imagen = (ImageView) row.findViewById(R.id.imagen);
            holder.texto = (TextView) row.findViewById(R.id.textview);
            row.setTag(holder);
        }else{
            holder = (CursosHolder)row.getTag();

        }

        Curso curso = elementos[position];
        holder.texto.setText(curso.titulo);
        holder.imagen.setImageResource(curso.icono);

        return row;
    }

    static class CursosHolder{
        ImageView imagen;
        TextView texto;
    }
}
