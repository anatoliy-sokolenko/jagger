package com.griddynamics.jagger.xml.beanParsers.workload.listener;

import com.griddynamics.jagger.engine.e1.collector.ValidationCollectorProvider;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * Created with IntelliJ IDEA.
 * User: kgribov
 * Date: 2/7/13
 * Time: 3:19 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractValidatorDefinitionParser extends AbstractSimpleBeanDefinitionParser {
    @Override
    protected Class getBeanClass(Element element) {
        return ValidationCollectorProvider.class;
    }
}
