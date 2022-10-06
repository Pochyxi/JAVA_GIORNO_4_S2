package it.Adiener.core.Lambda;


@FunctionalInterface
interface StringOperation {
    String start( String s);
}

@FunctionalInterface
interface ArrayOperation {
    int[] start(int n);
}

public class LambdaEx {
    public static void main( String[] args ) {

        StringOperation uc = (s) -> s.toUpperCase();
        StringOperation lc = (s) -> s.toLowerCase();
        StringOperation reverse = (s) -> {
           String s2 = "";
           for (int i = s.length() - 1 ; i >= 0 ; i--) {
               s2 += s.charAt(i);
           }
           return s2;
        };

        System.out.println( uc.start("java"));

        doStringOperation( uc, "java");
        doStringOperation( lc, "Java");
        doStringOperation( reverse, "java");
    }

    public static void doStringOperation( StringOperation op, String s ) {
        System.out.println( op.start( s ));
    }
}
