package br.com.schmidt.motosapp.models

import android.os.Parcel
import android.os.Parcelable

data class Moto(
    val model: String,
    val brand: String,
    val year: Int,
    val firstImage: String,
    val secondImage: String?,
    val thirdImage: String?,
    private val extras: Extras,
    val capacidade_tanque: String,
    private val motor: Motor,
    private val dimensoes: Dimension,
    private val pneus: Pneu
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString(),
        parcel.readString(),
        parcel.readParcelable(Extras::class.java.classLoader)!!,
        parcel.readString()!!,
        parcel.readParcelable(Motor::class.java.classLoader)!!,
        parcel.readParcelable(Dimension::class.java.classLoader)!!,
        parcel.readParcelable(Pneu::class.java.classLoader)!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(model)
        parcel.writeString(brand)
        parcel.writeInt(year)
        parcel.writeString(firstImage)
        parcel.writeString(secondImage)
        parcel.writeString(thirdImage)
        parcel.writeParcelable(extras, flags)
        parcel.writeString(capacidade_tanque)
        parcel.writeParcelable(motor, flags)
        parcel.writeParcelable(dimensoes, flags)
        parcel.writeParcelable(pneus, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Moto> {
        override fun createFromParcel(parcel: Parcel): Moto {
            return Moto(parcel)
        }

        override fun newArray(size: Int): Array<Moto?> {
            return arrayOfNulls(size)
        }
    }

    fun getAllImages():Array<String>{
        return extras.getAllImages()
    }
}