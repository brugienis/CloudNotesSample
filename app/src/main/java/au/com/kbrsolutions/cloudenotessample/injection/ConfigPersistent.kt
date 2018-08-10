package au.com.kbrsolutions.cloudenotessample.injection


import au.com.kbrsolutions.cloudenotessample.injection.component.ConfigPersistentComponent
import javax.inject.Scope

/**
 * A scoping annotation to permit dependencies confirm to the life of the
 * [ConfigPersistentComponent]
 */
@Scope @Retention annotation class ConfigPersistent