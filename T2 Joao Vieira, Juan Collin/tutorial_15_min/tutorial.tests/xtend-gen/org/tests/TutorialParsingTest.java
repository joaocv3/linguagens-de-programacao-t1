/**
 * generated by Xtext 2.14.0
 */
package org.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.tests.TutorialInjectorProvider;
import org.tutorial.Domainmodel;

@RunWith(XtextRunner.class)
@InjectWith(TutorialInjectorProvider.class)
@SuppressWarnings("all")
public class TutorialParsingTest {
  @Inject
  private ParseHelper<Domainmodel> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("datatype String");
      _builder.newLine();
      _builder.append("datatype Int");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity Aluno {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("name: String");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("age: Int");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("matricula: Int");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity Escola {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("name: String");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("address: String");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity Materia {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("name: String");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("id: Int");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      final Domainmodel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assert.assertTrue(_builder_1.toString(), errors.isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
