package com.cursokotlin.examplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cursokotlin.examplemvvm.model.QuoteModel
import com.cursokotlin.examplemvvm.model.QuoteProvider

class QuoteViewModel:ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote:QuoteModel = QuoteProvider.random()

        quoteModel.postValue(currentQuote)
    }

}