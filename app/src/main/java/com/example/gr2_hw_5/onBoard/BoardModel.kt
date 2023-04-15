package com.example.gr2_hw_5.onBoard

data class BoardModel(
    var image : Int? = null,
    var title : String? = null,
    var isLast : Boolean? = false

) : java.io.Serializable
