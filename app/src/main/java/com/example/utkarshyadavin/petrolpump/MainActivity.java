package com.example.utkarshyadavin.petrolpump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ApiService apiService ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiService = ApiClient.getApiService();
    }

    public void submit(View view){
        sendAddress();
    }

    public void sendAddress(){
        apiService.saveAddress("edf67ceceac530751ff5d30c8a61733a", "Hello", "Hello","Hello","Hello","Hello","Hello","Hello","814","Hello","Hello","Hello","Hello","Hello").enqueue(new Callback<Address>() {
            @Override
            public void onResponse(Call<Address> call, Response<Address> response) {

                if(response.isSuccessful()) {

                    Log.i("This is mainactivity", "post submitted to API." );
                }
            }

            @Override
            public void onFailure(Call<Address> call, Throwable t) {
                Log.e("This is Mainactivity", "Unable to submit post to API.");
            }
        });
    }

}
