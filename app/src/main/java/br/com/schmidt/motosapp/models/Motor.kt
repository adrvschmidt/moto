package br.com.schmidt.motosapp.models

import android.os.Parcel
import android.os.Parcelable

data class Motor(val torque: String,
                 val power: String,
                 val cilindradas: String,
                 val tipo: String,
                 val quant_oleo: String,
                 val transmissao: String,
                 val combustivel: String,
                 val compressao: String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(torque)
        parcel.writeString(power)
        parcel.writeString(cilindradas)
        parcel.writeString(tipo)
        parcel.writeString(quant_oleo)
        parcel.writeString(transmissao)
        parcel.writeString(combustivel)
        parcel.writeString(compressao)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Motor> {
        override fun createFromParcel(parcel: Parcel): Motor {
            return Motor(parcel)
        }

        override fun newArray(size: Int): Array<Motor?> {
            return arrayOfNulls(size)
        }
    }
}
