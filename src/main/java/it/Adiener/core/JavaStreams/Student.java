package it.Adiener.core.JavaStreams;

public class Student {
    String name;
    public int[] votes;

    public Student( String name, int[] votes ) {
        this.name = name;
        this.votes = votes;
    }

    public double getAvg() {
        double sum = 0;
        for( int i = 0 ; i < votes.length ; i++ ) {
            sum += this.votes[ i ];
        }
        return sum / this.votes.length;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.getAvg() + ")";
    }
}
