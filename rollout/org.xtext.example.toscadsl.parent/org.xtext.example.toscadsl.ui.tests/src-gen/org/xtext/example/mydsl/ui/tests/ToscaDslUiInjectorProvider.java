/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.xtext.example.toscadsl.ui.internal.ToscadslActivator;

public class ToscaDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ToscadslActivator.getInstance().getInjector("org.xtext.example.mydsl.ToscaDsl");
	}

}
