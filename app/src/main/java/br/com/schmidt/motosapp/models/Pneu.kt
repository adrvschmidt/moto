package br.com.schmidt.motosapp.models

import android.os.Parcel
import android.os.Parcelable

data class Pneu(
    val medida_dianteiro: String,
    val medida_traseiro: String,
    val hasCamera: Boolean,
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(medida_dianteiro)
        parcel.writeString(medida_traseiro)
        parcel.writeByte(if (hasCamera) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pneu> {
        override fun createFromParcel(parcel: Parcel): Pneu {
            return Pneu(parcel)
        }

        override fun newArray(size: Int): Array<Pneu?> {
            return arrayOfNulls(size)
        }
    }
}
