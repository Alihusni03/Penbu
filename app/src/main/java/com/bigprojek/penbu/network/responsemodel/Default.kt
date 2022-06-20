package com.bigprojek.penbu.network.responsemodel
import com.google.gson.annotations.SerializedName

data class Default (

    @SerializedName("Nama_Bunga")
    var nm_bunga:String?,
    @SerializedName("Nama_Lain")
    var nm_Lain:String?,
    @SerializedName("Musim_Tumbuh")
    var musim:String?,
    @SerializedName("Warna")
    var warna:String?,
    @SerializedName("Asal_Bunga")
    var asal:String?,
    @SerializedName("Message")
    var message:String?

)