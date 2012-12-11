package com.griddynamics.jagger.xml.beanParsers;

import com.griddynamics.jagger.user.ProcessingConfig;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.beans.factory.xml.BeanDefinitionParserDelegate;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kgribov
 * Date: 12/6/12
 * Time: 5:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class TpsDefinitionParser extends AbstractSimpleBeanDefinitionParser {

    @Override
    protected Class getBeanClass(Element element) {
        return ProcessingConfig.Test.Task.Tps.class;
    }
}
