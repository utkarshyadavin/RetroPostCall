package com.example.utkarshyadavin.petrolpump;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by utkarshyadavin on 12/6/18.
 */

public class ApiClient {
    private static Retrofit retrofit = null;
    private static String ROOT_URL = "https://mypetrolpump.com" ;

    private static Retrofit getClient(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(ROOT_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return  retrofit;
    }

    public static ApiService getApiService(){
        return getClient().create(ApiService.class);
    }
}
