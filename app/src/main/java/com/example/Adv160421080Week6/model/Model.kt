package com.example.Adv160421080Week6.model

data class Brand(
    var id:String?,
    var name:String?,
    var founded:String?,
    var products:List<String>?,
    var images:String?,
    var founder:BrandFounder?
)

data class BrandFounder(
    var name:String?,
    var birth_year:String?
)