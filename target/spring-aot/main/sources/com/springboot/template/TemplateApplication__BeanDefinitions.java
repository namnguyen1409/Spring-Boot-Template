package com.springboot.template;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link TemplateApplication}.
 */
@Generated
public class TemplateApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'templateApplication'.
   */
  public static BeanDefinition getTemplateApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TemplateApplication.class);
    beanDefinition.setTargetType(TemplateApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(TemplateApplication.class);
    beanDefinition.setInstanceSupplier(TemplateApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
