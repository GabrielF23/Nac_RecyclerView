package com.fiap.logonrmlocal.nac_recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.fiap.logonrmlocal.nac_recyclerview.model.Carro
import kotlinx.android.synthetic.main.activity_detalhe_carro.*

class DetalheCarro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_carro)
        val carro = intent.extras.getParcelable<Carro>("Carro")
        Toast.makeText(this, carro.modelo, Toast.LENGTH_LONG).show()

    }
}
