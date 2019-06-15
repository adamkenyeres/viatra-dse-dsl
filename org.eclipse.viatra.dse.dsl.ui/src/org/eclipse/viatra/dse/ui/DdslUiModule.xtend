/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.viatra.dse.ui

import com.google.inject.Binder
import javax.inject.Singleton
import org.eclipse.viatra.dse.generator.DseOutputConfigurationProvider
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.generator.IOutputConfigurationProvider

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class DdslUiModule extends AbstractDdslUiModule {
//	new(AbstractUIPlugin plugin) {
//		super(plugin)
//	}
	override void  configure(Binder binder){
		super.configure(binder);
		binder.bind(IOutputConfigurationProvider)
		.to(DseOutputConfigurationProvider)
		.in(Singleton);
	}
}
