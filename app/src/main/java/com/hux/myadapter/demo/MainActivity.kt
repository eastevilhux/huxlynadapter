package com.hux.myadapter.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.hux.myadapter.demo.adapter.StringAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rv = findViewById<RecyclerView>(R.id.text_recyclerview);

        var list = mutableListOf<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        var adapter = StringAdapter(this,list);
        rv.adapter = adapter;
    }
}