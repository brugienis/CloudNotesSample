package au.com.kbrsolutions.cloudenotessample.features.main

import au.com.kbrsolutions.cloudenotessample.features.base.MvpView

interface MainMvpView : MvpView {

    fun showPokemon(pokemon: List<String>)

    fun showProgress(show: Boolean)

    fun showError(error: Throwable)

}