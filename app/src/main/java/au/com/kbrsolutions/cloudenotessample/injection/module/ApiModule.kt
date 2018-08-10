package au.com.kbrsolutions.cloudenotessample.injection.module

import dagger.Module
import dagger.Provides
import au.com.kbrsolutions.cloudenotessample.data.remote.PokemonApi
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by shivam on 8/7/17.
 */
@Module(includes = arrayOf(NetworkModule::class))
class ApiModule {

    @Provides
    @Singleton
    internal fun providePokemonApi(retrofit: Retrofit): PokemonApi =
            retrofit.create(PokemonApi::class.java)
}