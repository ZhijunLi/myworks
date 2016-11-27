package me.lizhijun.myworks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_movie,btn_shares,btn_reader,btn_news,btn_graduation_design;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_movie = (Button) findViewById(R.id.btn_movie);
        btn_shares = (Button) findViewById(R.id.btn_shares);
        btn_reader = (Button) findViewById(R.id.btn_reader);
        btn_news = (Button) findViewById(R.id.btn_news);
        btn_graduation_design = (Button) findViewById(R.id.btn_graduation_design);

        btn_movie.setOnClickListener(this);
        btn_shares.setOnClickListener(this);
        btn_reader.setOnClickListener(this);
        btn_news.setOnClickListener(this);
        btn_graduation_design.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_movie:
                Toast.makeText(MainActivity.this,getResources().getString(R.string.open_app)+getResources().getString(R.string.app_movies),Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_shares:
                Toast.makeText(MainActivity.this,getResources().getString(R.string.open_app)+getResources().getString(R.string.app_shares),Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_reader:
                Toast.makeText(MainActivity.this,getResources().getString(R.string.open_app)+getResources().getString(R.string.app_reader),Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_news:
                Toast.makeText(MainActivity.this,getResources().getString(R.string.open_app)+getResources().getString(R.string.app_news),Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_graduation_design:
                Toast.makeText(MainActivity.this,getResources().getString(R.string.open_app)+getResources().getString(R.string.app_graduation_design),Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(MainActivity.this,getResources().getString(R.string.no_app),Toast.LENGTH_SHORT).show();

        }
    }
}
