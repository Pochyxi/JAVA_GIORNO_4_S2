package it.Adiener.core.ReduceEx;

import it.Adiener.core.JavaStreams.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.collections.MapUtils;


public class main {

    public static void main( String[] args ) {

        List<Integer> nums = new ArrayList<>( Arrays.asList( 5, 4, 10, 5 ) );
        int initialValue = 0;
        System.out.println( nums.stream().reduce(
                initialValue,
                ( currentValue, nextValue ) -> currentValue + nextValue )
        );

        List<String> words = new ArrayList<>( Arrays.asList( "mela", "banana", "kiwi", "mandarino" ) );
        System.out.println( words.stream().reduce(
                "valore iniziale",
                ( currentValue, nextValue ) -> currentValue + " | " + nextValue ) + " | end" );

        List<Student> students = new ArrayList<>( Arrays.asList(
                new Student( "adiener", new int[] { 10, 5, 6, 9 } ),
                new Student( "marco", new int[] { 10, 5, 6, 9 } ),
                new Student( "manuel", new int[] { 10, 5, 6, 9 } ),
                new Student( "rocco", new int[] { 10, 5, 6, 9 } )
        ) );

        students
                .stream()
                .map( s -> s.votes[ 0 ] )
                .collect( Collectors.toCollection( ArrayList::new ) )
                .forEach( s -> System.out.println( s ) );


        System.out.println( words.stream().collect( Collectors.joining( " | ", "**", "**")));





    }
}
