/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ToscaDslStandaloneSetup extends ToscaDslStandaloneSetupGenerated {

	def static void doSetup() {
		new ToscaDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
