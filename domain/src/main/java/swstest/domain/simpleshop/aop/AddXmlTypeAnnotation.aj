package swstest.domain.simpleshop.aop;

import javax.xml.bind.annotation.XmlType;

/**
 * Add namespace to all the simpleshop models.
 */
public aspect AddXmlTypeAnnotation {

    //how to write type patterns in AJ: https://eclipse.org/aspectj/doc/released/progguide/semantics-pointcuts.html#type-patterns
    //cannot use this as xjc compiles from Java source code.
    //declare @type: swstest.domain.simpleshop.model..*: @XmlType(namespace = "https://github.com/zhy2002/swstest/simpleshop");

}