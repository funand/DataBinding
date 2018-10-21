package com.example.prince.databindingass;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UFCRepository {

    private UFCInterface cakeAPI;

    public UFCRepository(){
        cakeAPI = new Retrofit.Builder()
                .baseUrl(UFCInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(UFCInterface.class);
    }

    private static class SingletonHelper
    {
        private static final UFCRepository INSTANCE = new UFCRepository();
    }

    public static UFCRepository getInstance()
    {
        return SingletonHelper.INSTANCE;
    }


    public LiveData<List<UFC>> getCakes() {
        final MutableLiveData<List<UFC>> data = new MutableLiveData<>();
        cakeAPI.getData()
                .enqueue(new Callback<List<UFC>>()
                {
                    @Override
                    public void onResponse(Call<List<UFC>> call, Response<List<UFC>> response)
                    {
                        data.setValue(response.body());
                    }

                    @Override
                    public void onFailure(Call<List<UFC>> call, Throwable t) {
                        data.setValue(null);
                    }
                });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return data;
    }
}
