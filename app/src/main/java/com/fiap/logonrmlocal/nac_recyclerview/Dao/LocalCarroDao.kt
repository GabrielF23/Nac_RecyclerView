package com.fiap.logonrmlocal.nac_recyclerview.Dao

import com.fiap.logonrmlocal.nac_recyclerview.model.Carro

class LocalCarroDao {
    fun ListaCarro(): List<Carro>{
        return listOf(
                getCorolla(),
                getCelta(),
                getCorsa()
        )
    }

    fun getCelta() : Carro{
        return  Carro(
                "Chevrolet",
                "Celta",
                "http://2.bp.blogspot.com/-PuIWPqtDvLE/TX5dNNvFFVI/AAAAAAAAAcM/hGX4PYjgIdA/s1600/Celta%2B2012%2Bb.jpg"

        )
    }
    fun getCorolla() : Carro{
        return  Carro(
                "Toyota",
                "Corolla",
                "https://images.noticiasautomotivas.com.br/img/f/novo-corolla-2018-video.jpg"

        )
    }
    fun getCorsa() : Carro{
        return  Carro(
                "Chevrolet",
                "Corsa",
                "https://upload.wikimedia.org/wikipedia/commons/3/35/Opel_Corsa_1.3_CDTI_ecoFLEX_Innovation_%28E%29_%E2%80%93_Frontansicht%2C_24._Dezember_2015%2C_Ratingen.jpg"

        )
    }
}