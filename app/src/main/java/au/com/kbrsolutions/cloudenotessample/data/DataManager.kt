package au.com.kbrsolutions.cloudenotessample.data

import au.com.kbrsolutions.cloudenotessample.data.model.Pokemon
import au.com.kbrsolutions.cloudenotessample.data.remote.PokemonApi
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataManager @Inject
constructor(private val pokemonApi: PokemonApi) {

    fun getPokemonList(limit: Int): Single<List<String>> {
        return pokemonApi.getPokemonList(limit)
                .toObservable()
                .flatMapIterable { (results) -> results }
                .map { (name) -> name }
                .toList()
    }

    fun getPokemon(name: String): Single<Pokemon> {
        return pokemonApi.getPokemon(name)
    }
}