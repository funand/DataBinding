package com.example.prince.databindingass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.squareup.leakcanary.LeakCanary;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    UFCViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this.getApplication());
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.root_recycle);
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        viewModel = new UFCViewModel(rv);
        viewModel.getArticles();
    }
}
