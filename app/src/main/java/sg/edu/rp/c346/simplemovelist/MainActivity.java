package sg.edu.rp.c346.simplemovelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<movie> movies;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = (ListView) findViewById(R.id.listViewMovie);
        movies = new ArrayList<movie>();

        caMovie = new CustomAdapter(this, R.layout.movie_row, movies);
        lvMovie.setAdapter(caMovie);

        movie item1 = new movie("War for the Planet of the Apes", "A 2017 sequel of the Planet of the Apes science fiction franchise", "By French author Pierre Boulle's");
        movies.add(item1);

        movie item2 = new movie("King Kong", "Movie about a giant ape, first appeared in 1930s", "By Merian C. Cooper");
        movies.add(item2);


    }
}
