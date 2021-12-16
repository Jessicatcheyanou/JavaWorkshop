package main.chapter19;

import java.util.Arrays;
import java.util.List;

public class ClassInfo {
    private String fullName;
    private String simpleName;
    private boolean isEnum = false;
    private boolean isAnnotation = false;
    private boolean isMammal = false;
    private boolean isInterface = false;
    private List<Class> interfaces;
    private String superClass;

    private void extractInfo(Class c){
        fullName = c.getName();
        simpleName = c.getSimpleName();

        isEnum = c.isEnum();
        isAnnotation = c.isAnnotation();
        isInterface = c.isInterface();

        Class sup = c.getSuperclass();
        if (sup != null){
            superClass = sup.getName();
        }

        interfaces = Arrays.asList(c.getInterfaces());

        if (Mammal.class.isAssignableFrom(c)){
            isMammal = true;
        }
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(simpleName + "-" + fullName);

        stringBuilder.append("\n super class:" + superClass);
        stringBuilder.append("\n is Enum:" + isEnum);
        stringBuilder.append("\n is Annotation" + isAnnotation);
        stringBuilder.append("\n is interface:" + isInterface);
        stringBuilder.append("\n is assignable from Mammal:" + isMammal);

        stringBuilder.append("\n interfaces:");
        if (interfaces.size() > 0){
            interfaces.forEach( inf ->
                    stringBuilder.append(inf.getSimpleName() + ""));
        } else {
            stringBuilder.append("none");
        }
        return stringBuilder.toString();
    }

    /* A simple constructor that expects a class*/
    public ClassInfo(Class c){
        extractInfo(c);
    }

    public static void main(String[] args) {
        ClassInfo classInfo = new ClassInfo(Tiger.class);
        System.out.println(classInfo.toString());

        classInfo = new ClassInfo(SiberianTiger.class);
        System.out.println(classInfo.toString());

        classInfo = new ClassInfo(Pets.class);
        System.out.println(classInfo.toString());

        classInfo = new ClassInfo(java.lang.String.class);
        System.out.println(classInfo.toString());

        classInfo = new ClassInfo(Mammal.class);
        System.out.println(classInfo.toString());

        classInfo = new ClassInfo(ClassInfo.class);
        System.out.println(classInfo.toString());

        if (Mammal.class.isAssignableFrom(Tiger.class)){
            System.out.println("A Tiger can be cast to a Mammal.");
        }
    }

}
