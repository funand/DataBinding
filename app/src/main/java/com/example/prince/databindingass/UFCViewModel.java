package com.example.prince.databindingass;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UFCViewModel{

    RecyclerView recyclerView;

    public UFCViewModel(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public void getArticles(){
        Retrofit retrofit  = new Retrofit.Builder()
                .baseUrl(UFCInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        UFCInterface seriesInterfaceJSON = retrofit.create(UFCInterface.class);
        Call<List<UFC>> call = seriesInterfaceJSON.getData();
        call.enqueue(new Callback<List<UFC>>()
        {
            @Override
            public void onResponse(Call<List<UFC>> call, Response<List<UFC>> response) {
                List<UFC> list = response.body();
                UFCListAdapter adapter = new UFCListAdapter(list);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<UFC>> call, Throwable t) {

            }
        });

    }

}
