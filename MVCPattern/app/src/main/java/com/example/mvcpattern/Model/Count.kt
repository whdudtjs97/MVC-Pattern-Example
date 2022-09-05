package com.example.mvcpattern.Model

class Count {
    var count = 0
    fun increase(){
        ++count
    }

    fun discrease(){
        --count
        if(count < 0)
            count = 0
    }
}