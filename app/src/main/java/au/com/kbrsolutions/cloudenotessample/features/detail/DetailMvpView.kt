package au.com.kbrsolutions.cloudenotessample.features.detail

import au.com.kbrsolutions.cloudenotessample.data.model.Pokemon
import au.com.kbrsolutions.cloudenotessample.data.model.Statistic
import au.com.kbrsolutions.cloudenotessample.features.base.MvpView

interface DetailMvpView : MvpView {

    fun showPokemon(pokemon: Pokemon)

    fun showStat(statistic: Statistic)

    fun showProgress(show: Boolean)

    fun showError(error: Throwable)

}