package br.com.schmidt.motosapp.models

data class Moto(
    val model: String,
    val brand: String,
    val year: String,
    val firstImage: String,
    val secondImage: String?,
    val thirdImage: String?,
    val extras: String,
    val capacidade_tanque: String,
    val motor: Motor,
    val dimensoes: Dimension,
    val penus: Pneu
) {

}