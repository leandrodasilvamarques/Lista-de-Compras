package com.example.listadecompras

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.listadecompras.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val produtosAdapter = ArrayAdapter<String>(this,
            android.R.layout.simple_expandable_list_item_1)
        binding.listViewProdutos.adapter = produtosAdapter

        binding.btnInserir.setOnClickListener() {
            val produto = binding.edtNomeProduto.text.toString()

            if (produto.isNotBlank()){
                binding.txtAvisoValorInvalido.text = ""
                produtosAdapter.add(produto)
            }
            else {
                binding.txtAvisoValorInvalido.text = "Insira um valor valido"
            }
        }
    }
}