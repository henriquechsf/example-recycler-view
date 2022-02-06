package tech.henriquedev.unidade03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

/**
 * List + Adapter
 * para renderizar um lista na tela e necessario
 * 1. Lista xml > 2. dados tipo List > 3. Adapter
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // lista
        val listView = findViewById<ListView>(R.id.list_view)

        // dados
        val data = listOf<String>("Umuarama", "Maringa", "Cascavel", "Curitiba")

        // adapter
        val adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            data
        )

        listView.adapter = adapter
    }
}