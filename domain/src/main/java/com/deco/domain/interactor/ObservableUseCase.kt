package io.ubivis.ihm.domain.interactor

import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers


/**
 * Created by André Santos
 * andre.santos@ubivis.io
 * on ubivisnb10
 * on 3/1/19.
 */

abstract class ObservableUseCase<T, in Params> constructor(
        //private val threadExecutor:  ThreadExecutor,
        private val postExecutionThread: com.deco.domain.executor.PostExecutionThread
) {

    private val disposables = CompositeDisposable()

    protected abstract fun buildUseCase(params: Params? = null): Observable<T>

    //Quando vou usar esse cara, eu passo uma innerClass como observer que decide o que
    //fazer
    open fun execute(singleObserver: DisposableObserver<T>, params: Params? = null) {

        val single = this.buildUseCase(params)
                .subscribeOn(Schedulers.io())
                .observeOn(postExecutionThread.scheduler)

        addDisposable(single.subscribeWith(singleObserver))
    }

    fun addDisposable(disposable: Disposable) {
        disposables.add(disposable)
    }

    fun dispose() {
        if (!disposables.isDisposed) disposables.dispose()
    }

}