package com.example.aaron.compsapp.base

import androidx.lifecycle.ViewModel
import com.trello.rxlifecycle3.LifecycleProvider
import com.trello.rxlifecycle3.LifecycleTransformer
import com.trello.rxlifecycle3.RxLifecycle
import io.reactivex.Observable
import io.reactivex.subjects.BehaviorSubject

/**
 * 支持RxLifecycle的ViewModel基类
 * Created by jph on 2019-07-29.
 */
open class RxVM : ViewModel(), LifecycleProvider<RxVM.VMEvent> {

    private val lifecycleSubject: BehaviorSubject<VMEvent> = BehaviorSubject.createDefault(VMEvent.CREATED)

    enum class VMEvent {
        CREATED, CLEARED
    }

    override fun lifecycle(): Observable<VMEvent> {
        return lifecycleSubject.hide()
    }

    override fun <T : Any?> bindUntilEvent(event: VMEvent): LifecycleTransformer<T> {
        return RxLifecycle.bindUntilEvent(lifecycleSubject, event)
    }

    override fun <T : Any?> bindToLifecycle(): LifecycleTransformer<T> {
        return bindUntilEvent(VMEvent.CLEARED)
    }

    override fun onCleared() {
        lifecycleSubject.onNext(VMEvent.CLEARED)
        super.onCleared()
    }
}