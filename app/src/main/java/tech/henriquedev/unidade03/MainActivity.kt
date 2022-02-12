package tech.henriquedev.unidade03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * List + Adapter
 * para renderizar um lista na tela e necessario
 * 1. Lista xml > 2. dados tipo List > 3. Adapter
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userList = mutableListOf<User>()
        for (i in 1..200) {
            userList.add(
                User(
                    id = i,
                    name = "Nome $i",
                    age = 30 + i
                )
            )
        }

        // dados
        // recycler view + item da lista
        // adapter
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = RecyclerVIewAdapter(userList)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}