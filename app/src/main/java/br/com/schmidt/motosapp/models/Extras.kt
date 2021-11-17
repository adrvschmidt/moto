package br.com.schmidt.motosapp.models

import android.os.Parcel
import android.os.Parcelable

data class Extras(
    val extra1: String?,
    val extra2: String?,
    val extra3: String?,
    val extra4: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(extra1)
        parcel.writeString(extra2)
        parcel.writeString(extra3)
        parcel.writeString(extra4)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Extras> {
        override fun createFromParcel(parcel: Parcel): Extras {
            return Extras(parcel)
        }

        override fun newArray(size: Int): Array<Extras?> {
            return arrayOfNulls(size)
        }
    }

    fun getAllImages(): Array<String>{
        val array = emptyArray<String>()
        if(extra1 != null) {
            array[0] = extra1
        }
        if(extra2 != null) {
            array[1] = extra2
        }
        if(extra3 != null) {
            array[2] = extra3
        }
        if(extra4 != null) {
            array[3] = extra4
        }
        return array
    }
}
