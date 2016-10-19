package display.a.joke.jokedisplayer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Project : FinalProject
 * Created by Sanat Dutta on 16-Oct-16.
 * http://www.satandigital.com/
 */

public class JokeDisplayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displayer);

        String joke = getIntent().getStringExtra("joke");

        TextView jokeTV = (TextView) findViewById(R.id.jokeTexeView);
        jokeTV.setText(joke);
    }
}
