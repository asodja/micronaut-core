package io.micronaut.lombok.test;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.beans.BeanIntrospection;
import io.micronaut.core.type.Argument;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@Introspected
@AllArgsConstructor
public class LombokIntrospectedClass {

    private String field1;

    private String field2;

    private String field3;


    public static void main(String[] args) {
        Argument<?>[] arguments = BeanIntrospection
                .getIntrospection(LombokIntrospectedClass.class)
                .getConstructorArguments();

        assert arguments[0].getName().equals("field1");
        assert arguments[1].getName().equals("field2");
        assert arguments[1].getName().equals("field3");
    }

}
