package com.example.listadecompras

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.listadecompras.databinding.ActivityCadastroBinding

class CadastroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cadastroBtnInserir.setOnClickListener() {
//            val imagem = binding.cadastroImage.ima
            val produto = binding.cadastroNomeProduto.text.toString()
            val quantidade = binding.cadastroQuantidade.text
            val valor = binding.cadastroValor.text

            if (produto.isNotBlank()){

                binding.cadastroNomeProduto.text.clear()
            } else {
                binding.cadastroNomeProduto.error = "Insira um valor valido"
            }
        }

    }
}