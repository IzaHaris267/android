package com.uas.API;

import com.uas.Model.ModelData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by JhonDev on 05/10/2016.
 */

public interface ApiService {

    @GET("semua_data.php")
    Call<List<ModelData>> getSemuaMkn();

}
