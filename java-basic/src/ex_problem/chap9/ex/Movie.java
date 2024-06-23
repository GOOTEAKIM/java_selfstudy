package ex_problem.chap9.ex;

import jdk.jfr.BooleanFlag;

public class Movie extends Item {

    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        System.out.println("- 감독: " + director + ", 배우: " +actor );
    }
}
