package au.com.kbrsolutions.cloudenotessample

import android.content.Context
import android.support.multidex.MultiDexApplication
import com.facebook.stetho.Stetho
import com.singhajit.sherlock.core.Sherlock
import com.squareup.leakcanary.LeakCanary
import com.tspoon.traceur.Traceur
import au.com.kbrsolutions.cloudenotessample.injection.component.AppComponent
import au.com.kbrsolutions.cloudenotessample.injection.component.DaggerAppComponent
import au.com.kbrsolutions.cloudenotessample.injection.module.AppModule
import au.com.kbrsolutions.cloudenotessample.injection.module.NetworkModule
import timber.log.Timber

class MvpStarterApplication : MultiDexApplication() {

    private var appComponent: AppComponent? = null

    companion object {
        operator fun get(context: Context): MvpStarterApplication {
            return context.applicationContext as MvpStarterApplication
        }
    }

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            Stetho.initializeWithDefaults(this)
            LeakCanary.install(this)
            Sherlock.init(this)
            Traceur.enableLogging()
        }
    }

    // Needed to replace the component with a test specific one
    var component: AppComponent
        get() {
            if (appComponent == null) {
                appComponent = DaggerAppComponent.builder()
                        .appModule(AppModule(this))
                        .networkModule(NetworkModule(this))
                        .build()
            }
            return appComponent as AppComponent
        }
        set(appComponent) {
            this.appComponent = appComponent
        }

}