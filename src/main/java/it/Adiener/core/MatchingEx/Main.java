package it.Adiener.core.MatchingEx;

import it.Adiener.core.JavaStreams.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main( String[] args ) {

        List<String> words = new ArrayList<>( Arrays.asList( "epicodea", "java", "back-end" ) );

        boolean allElementsContainsA = words.stream().allMatch( s -> s.contains( "a" ) );

        System.out.println( allElementsContainsA );

        System.out.println(
                Stream.<Integer>builder()
                        .add( 10 )
                        .add( 5 )
                        .add( 100 )
                        .build()
                        .noneMatch( s -> s < 0 )
        );

        System.out.println(
                Stream.<Integer>builder()
                        .add( 10 )
                        .add( 5 )
                        .add( 100 )
                        .build()
                        .anyMatch( s -> s < 0 )
        );

        Predicate<Student> promosso = (s -> s.getAvg() > 6);
        System.out.println(
                Stream.<Student>builder()
                        .add( new Student( "adiener", new int[] { 10, 5, 6, 9 } ) )
                        .add( new Student( "marco", new int[] { 10, 5, 6, 9 } ) )
                        .add( new Student( "manuel", new int[] { 10, 5, 6, 9 } ) )
                        .add( new Student( "rocco", new int[] { 10, 5, 6, 9 } ) )
                        .build()
                        .anyMatch( promosso )
        );



    }
}
