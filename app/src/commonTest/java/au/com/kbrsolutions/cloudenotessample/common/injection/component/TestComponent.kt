package au.com.kbrsolutions.cloudenotessample.common.injection.component

import dagger.Component
import au.com.kbrsolutions.cloudenotessample.common.injection.module.ApplicationTestModule
import au.com.kbrsolutions.cloudenotessample.injection.component.AppComponent
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationTestModule::class))
interface TestComponent : AppComponent