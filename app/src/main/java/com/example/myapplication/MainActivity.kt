package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encontrando o ListView pelo ID
        val listView: ListView = findViewById(R.id.listView)

        // Dados para o ListView
        val items = arrayOf("Item 1", "Item 2", "Item 3", "Item 4")

        // Criar um ArrayAdapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)

        // Configurar o ArrayAdapter no ListView
        listView.adapter = adapter
    }
}
