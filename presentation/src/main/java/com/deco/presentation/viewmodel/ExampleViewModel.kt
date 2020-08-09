package com.deco.presentation.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.deco.domain.usecase.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel  @ViewModelInject internal constructor(

private val exampleUseCase: ExampleUseCase

): ViewModel(){

    init {
        exampleUseCase.test()
    }

    private val liveData = MutableLiveData<String>()

    fun setLiveData(test: String){
        liveData.value = test
    }


}
