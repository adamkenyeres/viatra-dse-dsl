/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.viatra.dse.ui;

import com.google.inject.Injector;
import org.eclipse.viatra.dse.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DdslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DslActivator.getInstance().getInjector(DslActivator.ORG_ECLIPSE_VIATRA_DSE_DDSL);
	}
	
}
