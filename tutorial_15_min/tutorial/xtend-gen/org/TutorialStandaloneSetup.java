/**
 * generated by Xtext 2.14.0
 */
package org;

import org.TutorialStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class TutorialStandaloneSetup extends TutorialStandaloneSetupGenerated {
  public static void doSetup() {
    new TutorialStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
