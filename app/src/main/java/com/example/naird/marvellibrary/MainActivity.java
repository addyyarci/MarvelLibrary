package com.example.naird.marvellibrary;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.v4.widget.ListViewCompat;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends ListActivity implements View.OnClickListener {

    protected ArrayList<HashMap<String,String>> nSuperHeroes = new ArrayList<HashMap<String, String>>();

    /*
    hashMap, parecido a una tabla
    HasMap de nombres
    "usuario_uno", "uriel"
    "usuario_dos", "codigo facilito"
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nSuperHeroes.add(crearSuperHeroe("super_heroe", "Wolverine"));
        nSuperHeroes.add(crearSuperHeroe("super_heroe", "Spiderman"));
        nSuperHeroes.add(crearSuperHeroe("super_heroe", "Tor"));


        SimpleAdapter adapter = new SimpleAdapter(this,this.nSuperHeroes,android.R.layout.simple_list_item_1, new String[]{"super_heroe"},
                new int[]{android.R.id.text1});
        setListAdapter(adapter);

    }

    private HashMap<String,String> crearSuperHeroe(String clave, String valor){
        HashMap<String,String> hashMapSuperHeroe = new HashMap<String, String>();
        hashMapSuperHeroe.put(clave,valor);
        return hashMapSuperHeroe;
    }

    @Override
    public void onClick(View view) {

    }



}
