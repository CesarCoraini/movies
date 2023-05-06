package dev.coraini.movies.service;

import dev.coraini.movies.persistence.model.Movie;
import dev.coraini.movies.persistence.model.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
}
