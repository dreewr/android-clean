package io.ubivis.ihm.domain.interactor

import io.reactivex.Completable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableCompletableObserver
import io.reactivex.schedulers.Schedulers


abstract class CompletableUseCase<in Params> constructor(
        private val postExecutionThread: com.deco.domain.executor.PostExecutionThread
) {

    private val disposables = CompositeDisposable()

    protected abstract fun buildUseCase(params: Params? = null): Completable

    //TODO generalize the execute method to be able to execute in computation and
    open fun execute(observer: DisposableCompletableObserver, params: Params? = null) {
        val completable = this.buildUseCase(params)
                .subscribeOn(Schedulers.io())
                .observeOn(postExecutionThread.scheduler)
        addDisposable(completable.subscribeWith(observer))
    }

    fun addDisposable(disposable: Disposable) {
        disposables.add(disposable)
    }

    fun dispose() {
        if (!disposables.isDisposed) disposables.dispose()
    }

}