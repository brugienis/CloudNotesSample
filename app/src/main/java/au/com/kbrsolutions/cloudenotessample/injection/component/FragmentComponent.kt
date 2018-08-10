package au.com.kbrsolutions.cloudenotessample.injection.component

import au.com.kbrsolutions.cloudenotessample.injection.PerFragment
import au.com.kbrsolutions.cloudenotessample.injection.module.FragmentModule
import dagger.Subcomponent

/**
 * This component inject dependencies to all Fragments across the application
 */
@PerFragment
@Subcomponent(modules = [FragmentModule::class])
interface FragmentComponent