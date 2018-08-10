package au.com.kbrsolutions.cloudenotessample.features.main

import au.com.kbrsolutions.cloudenotessample.data.DataManager
import au.com.kbrsolutions.cloudenotessample.features.base.BasePresenter
import au.com.kbrsolutions.cloudenotessample.injection.ConfigPersistent
import au.com.kbrsolutions.cloudenotessample.util.rx.scheduler.SchedulerUtils
import javax.inject.Inject

@ConfigPersistent
class MainPresenter @Inject
constructor(private val dataManager: DataManager) : BasePresenter<MainMvpView>() {

    fun getPokemon(limit: Int) {
        checkViewAttached()
        mvpView?.showProgress(true)
        dataManager.getPokemonList(limit)
                .compose(SchedulerUtils.ioToMain<List<String>>())
                .subscribe({ pokemons ->
                    mvpView?.apply {
                        showProgress(false)
                        showPokemon(pokemons)
                    }
                }) { throwable ->
                    mvpView?.apply {
                        showProgress(false)
                        showError(throwable)
                    }
                }
    }
}