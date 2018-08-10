package au.com.kbrsolutions.cloudenotessample.injection.component

import android.app.Application
import android.content.Context
import dagger.Component
import au.com.kbrsolutions.cloudenotessample.data.DataManager
import au.com.kbrsolutions.cloudenotessample.data.remote.PokemonApi
import au.com.kbrsolutions.cloudenotessample.injection.ApplicationContext
import au.com.kbrsolutions.cloudenotessample.injection.module.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    @ApplicationContext
    fun context(): Context

    fun application(): Application

    fun dataManager(): DataManager

    fun pokemonApi(): PokemonApi
}
