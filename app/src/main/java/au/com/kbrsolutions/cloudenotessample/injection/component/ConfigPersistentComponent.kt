package au.com.kbrsolutions.cloudenotessample.injection.component

import dagger.Component
import au.com.kbrsolutions.cloudenotessample.features.base.BaseActivity
import au.com.kbrsolutions.cloudenotessample.features.base.BaseFragment
import au.com.kbrsolutions.cloudenotessample.injection.ConfigPersistent
import au.com.kbrsolutions.cloudenotessample.injection.module.ActivityModule
import au.com.kbrsolutions.cloudenotessample.injection.module.FragmentModule

/**
 * A dagger component that will live during the lifecycle of an Activity or Fragment but it won't
 * be destroy during configuration changes. Check [BaseActivity] and [BaseFragment] to
 * see how this components survives configuration changes.
 * Use the [ConfigPersistent] scope to annotate dependencies that need to survive
 * configuration changes (for example Presenters).
 */
@ConfigPersistent
@Component(dependencies = [AppComponent::class])
interface ConfigPersistentComponent {

    fun activityComponent(activityModule: ActivityModule): ActivityComponent

    fun fragmentComponent(fragmentModule: FragmentModule): FragmentComponent

}
