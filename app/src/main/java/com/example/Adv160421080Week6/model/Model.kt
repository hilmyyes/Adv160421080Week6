package com.example.Adv160421080Week6.model

data class Artist(
    var id:String?,
    var name:String?,
    var founded:String?,
    var products:List<String>?,
    var images:String?,
    var founder:ArtistDetail?
)

data class ArtistDetail(
    var place:String?,
    var birth_year:String?
)