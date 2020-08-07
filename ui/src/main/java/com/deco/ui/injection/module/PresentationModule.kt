package com.deco.ui.injection.module


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.deco.presentation.ViewModelFactory
import dagger.Binds
import dagger.MapKey
import dagger.Module
import kotlin.reflect.KClass

@Module
abstract class PresentationModule{


    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    /*@Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel*/

}

@MustBeDocumented
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)