package com.example.Adv160421080Week6.model

data class Car(
    var id:String?,
    var name:String?,
    var founded:String?,
    var products:List<String>?,
    var images:String?,
    var founder:CarSpesification?
)

data class CarSpesification(
    var name:String?,
    var birth_year:String?
)