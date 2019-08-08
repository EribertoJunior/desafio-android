package br.com.eriberto.desafioandroidconcrete.model.pojo

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Proprietario (
    @SerializedName("login")
    var nomeAutor:String,
    var avatar_url:String

): Serializable