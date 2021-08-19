package com.example.viewmodel_practice


import androidx.lifecycle.ViewModel

class viewmodel_main : ViewModel()
{
     var number : Int = 0

    fun increaseByOne ()
    {
        number ++
    }
}