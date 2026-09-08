//annotations over annotations

public class PreDefined2{
    @Target(ElementType.METHOD) //tell us where this annotation can be used -> method, class, field, constructor, parameter, local variable, package
    @Retention(RetentionPolicy.RUNTIME) //tell us how long this annotation will be retained -> source, class, runtime
    @Documented // to show this annotation in javadoc
    @Inherited //to inherit this annotation to subclass
    @Repeatable(MyAnnotations.class) //to allow multiple annotations of same type on same element
    public @interface MyAnnotation{ //custom annotation
        String name() default "default name";
        int age() default 0;
    }
}