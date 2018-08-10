package au.com.kbrsolutions.cloudenotessample.injection.component

import au.com.kbrsolutions.cloudenotessample.injection.PerActivity
import au.com.kbrsolutions.cloudenotessample.injection.module.ActivityModule
import au.com.kbrsolutions.cloudenotessample.features.base.BaseActivity
import au.com.kbrsolutions.cloudenotessample.features.detail.DetailActivity
import au.com.kbrsolutions.cloudenotessample.features.main.MainActivity
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(baseActivity: BaseActivity)

    fun inject(mainActivity: MainActivity)

    fun inject(detailActivity: DetailActivity)
}
