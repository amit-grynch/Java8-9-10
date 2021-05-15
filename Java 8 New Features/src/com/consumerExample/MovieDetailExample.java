package com.consumerExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MovieDetailExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movie> movieList = new ArrayList<Movie>();
		populate(movieList);
		Consumer<Movie> consumer = movie -> {
			System.out.print(" Movie Name is :" + movie.getName());
			System.out.print(" ");
			System.out.print("Actor Name is :" + movie.getActor());
			System.out.println(" ");

		};
		for (Movie movie : movieList) {
			consumer.accept(movie);
		}
	}

	public static void populate(List<Movie> movieList) {
		movieList.add(new Movie("Don", "Amit"));
		movieList.add(new Movie("Dengal", "Amir"));

	}
}

class Movie {
	String name;
	String actor;

	public Movie(String name, String actor) {
		super();
		this.name = name;
		this.actor = actor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", actor=" + actor + "]";
	}

}