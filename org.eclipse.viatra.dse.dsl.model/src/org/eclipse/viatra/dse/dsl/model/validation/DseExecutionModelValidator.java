/**
 *
 * $Id$
 */
package org.eclipse.viatra.dse.dsl.model.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.viatra.dse.dsl.model.Configuration;
import org.eclipse.viatra.dse.dsl.model.DseProblem;
import org.eclipse.viatra.dse.dsl.model.DseProblemComponent;

/**
 * A sample validator interface for {@link org.eclipse.viatra.dse.dsl.model.DseExecutionModel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DseExecutionModelValidator {
	boolean validate();

	boolean validatePackageName(String value);
	boolean validateName(String value);
	boolean validateConfigurations(EList<Configuration> value);
	boolean validateDseproblems(EList<DseProblem> value);
	boolean validateDseproblemcomponents(EList<DseProblemComponent> value);
	boolean validateNumberOfRuns(int value);
}
