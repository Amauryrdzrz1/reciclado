package com.Amauryrdz.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerId);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        List<ModelClass> modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "Este es el titulo 1", "este es el cuerpo 1"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "Este es el titulo 2", "este es el cuerpo 2"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "Este es el titulo 3", "este es el cuerpo 3"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "Este es el titulo 4", "este es el cuerpo 4"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "Este es el titulo 5", "este es el cuerpo 5"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "Este es el titulo 6", "este es el cuerpo 6"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "Este es el titulo 7", "este es el cuerpo 7"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "Este es el titulo 8", "este es el cuerpo 8"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "Este es el titulo 9", "este es el cuerpo 9"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "Este es el titulo 10", "este es el cuerpo 10"));

        Adapter adapter = new Adapter(modelClassList);
        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }
}