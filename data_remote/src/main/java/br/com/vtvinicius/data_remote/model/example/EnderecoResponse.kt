package br.com.vtvinicius.data_remote.model.example

import com.google.gson.annotations.SerializedName

data class EnderecoResponse(
    @SerializedName("cep")
    val cep: String?,
    @SerializedName("logradouro")
    val logradouro: String?,
    @SerializedName("complemento")
    val complemento: String?,
    @SerializedName("bairro")
    val bairro: String?,
    @SerializedName("localidade")
    val localidade: String?,
    @SerializedName("uf")
    val uf: String?,
    @SerializedName("ibge")
    val ibge: String?,
    @SerializedName("gia")
    val gia: String?,
    @SerializedName("ddd")
    val ddd: String?,
    @SerializedName("siafi")
    val siafi: String?,
)
