package annotationsExamples;

public class Child extends Parent{
    @Override //this can catch errors if superclass method name, for example, gets change
    public void sayHello(){
        System.out.println("Hello from child class!");
    }

    /**
     * @deprecated Use newMethod instead {@link #imAMethod()}
     */
    @Deprecated
    public void deprecatedMethod(){
        System.out.println("I'm a deprecated method!");
    }

    public void imAMethod(){
        System.out.println("I'm a method!");
    }
}
