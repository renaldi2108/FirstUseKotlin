package id.renaldirey.firstusekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import id.renaldirey.firstusekotlin.adapter.AdapterBio
import id.renaldirey.firstusekotlin.model.Models
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // set variable global
    companion object {
        private var models :MutableList<Models> = mutableListOf()
        var adapter : AdapterBio? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupAdapter()
    }

    fun setupAdapter(){
        for (i in 1..4){
            models.add(Models("Renaldi", "Suka begadang"))
        }

        adapter = AdapterBio(this, models)

        rv_lists.layoutManager = LinearLayoutManager(this)
        rv_lists.adapter = adapter
    }
}
