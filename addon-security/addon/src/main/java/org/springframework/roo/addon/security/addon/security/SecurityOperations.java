package org.springframework.roo.addon.security.addon.security;

import java.util.List;

import org.springframework.roo.addon.security.addon.security.providers.SecurityProvider;
import org.springframework.roo.model.JavaSymbolName;
import org.springframework.roo.model.JavaType;
import org.springframework.roo.project.Feature;
import org.springframework.roo.project.FeatureNames;
import org.springframework.roo.project.maven.Pom;

/**
 * Interface for {@link SecurityOperationsImpl}.
 * 
 * @author Ben Alex
 * @author Sergio Clares
 * @author Juan Carlos García
 * @since 1.0
 */
public interface SecurityOperations extends Feature {

  String SECURITY_FEATURE_NAME = FeatureNames.SECURITY;

  /**
   * Defines install operation that will be used by implementations to install
   * the necessary components of Spring Security.
   * 
   * @param type
   *            SecurityProvider type that will be install
   * @param module
   *            Pom of the application module where Spring Security will be
   *            installed.
   */
  void installSecurity(SecurityProvider type, Pom module);

  /**
   * Defines getAllSecurityProviders operation that will be used by
   * implementations to get all security providers registered on the Spring
   * Roo Shell.
   * 
   * @return List with the registered security providers on the Spring Roo
   *         Shell.
   */
  List<SecurityProvider> getAllSecurityProviders();

  /**
   * Defines getSpringSecurityAnnotationValue method that will be used by
   * implementations to calculate the value of the Spring Security Annotations
   * 
   * 
   * @param roles separated comma list with the roles to include in Spring Security annotation.
   * @param usernames separated comma list with the usernames to include in Spring Security annotation
   * 
   * @return String with the value of the Spring Security annotation
   */
  String getSpringSecurityAnnotationValue(String roles, String usernames);

  /**
   * Defines addPreAuthorizeAnnotation method that will be used by
   * implementations to include @PreAuthorize annotation in service methods.
   * 
   * @param klass
   * @param methodName
   * @param value
   */
  void addPreAuthorizeAnnotation(JavaType klass, String methodName, String value);

  /**
   * Defines addPreFilterAnnotation method that will be used by
   * implementations to include @PreFilter annotation in service methods.
   * 
   * @param klass
   * @param methodName
   * @param value
   */
  void addPreFilterAnnotation(JavaType klass, String methodName, String value);

  /**
   * Defines addPostFilterAnnotation method that will be used by
   * implementations to include @PostFilter annotation in service methods.
   * 
   * @param klass
   * @param methodName
   * @param value
   */
  void addPostFilterAnnotation(JavaType klass, String methodName, String value);
}
