package com.springboot.template;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HelloWorldController}.
 */
@Generated
public class HelloWorldController__BeanDefinitions {
  /**
   * Get the bean definition for 'helloWorldController'.
   */
  public static BeanDefinition getHelloWorldControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HelloWorldController.class);
    beanDefinition.setInstanceSupplier(HelloWorldController::new);
    return beanDefinition;
  }
}
