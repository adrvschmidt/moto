package br.com.schmidt.motosapp.models

import android.os.Parcel
import android.os.Parcelable

data class Dimension(val comprimento: String,
                     val largura: String,
                     val altura: String,
                     val altura_solo: String,
                     val altura_assento: String,
                     val peso: String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(comprimento)
        parcel.writeString(largura)
        parcel.writeString(altura)
        parcel.writeString(altura_solo)
        parcel.writeString(altura_assento)
        parcel.writeString(peso)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Dimension> {
        override fun createFromParcel(parcel: Parcel): Dimension {
            return Dimension(parcel)
        }

        override fun newArray(size: Int): Array<Dimension?> {
            return arrayOfNulls(size)
        }
    }
}