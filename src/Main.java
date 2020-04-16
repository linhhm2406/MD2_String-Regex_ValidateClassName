public class Main {
    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();

        String test1 ="C0318G";
        String test2 ="M0318G";
        String test3 ="P0323A";

        System.out.println(classNameExample.validate(test1));
        System.out.println(classNameExample.validate(test2));
        System.out.println(classNameExample.validate(test3));
    }
}
