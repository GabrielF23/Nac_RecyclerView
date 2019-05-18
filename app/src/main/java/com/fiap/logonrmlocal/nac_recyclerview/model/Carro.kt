package com.fiap.logonrmlocal.nac_recyclerview.model

import android.os.Parcel
import android.os.Parcelable

class Carro (
    val marca:String,
    val modelo:String,
    val urlImagem:String
): Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString()){
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(marca)
        parcel.writeString(modelo)
        parcel.writeString(urlImagem)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Carro> {
        override fun createFromParcel(parcel: Parcel): Carro {
            return Carro(parcel)
        }

        override fun newArray(size: Int): Array<Carro?> {
            return arrayOfNulls(size)
        }
    }
}
