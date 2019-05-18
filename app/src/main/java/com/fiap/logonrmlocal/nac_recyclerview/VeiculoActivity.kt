package com.fiap.logonrmlocal.nac_recyclerview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.fiap.logonrmlocal.nac_recyclerview.Dao.LocalCarroDao
import kotlinx.android.synthetic.main.activity_veiculo.*

class VeiculoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veiculo)


        val carroDAO = LocalCarroDao()
        val carros = carroDAO.ListaCarro()

        rvCarros.adapter = DadosCarroAdapter(carros,
                this, {
            val intent = Intent(this, DetalheCarro::class.java)
            intent.putExtra("Carro", it)
            startActivity(intent)
        })


        rvCarros.layoutManager = GridLayoutManager(this, 3)

    }
}

