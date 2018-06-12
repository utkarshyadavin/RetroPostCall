package com.example.utkarshyadavin.petrolpump;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by utkarshyadavin on 12/6/18.
 */

public interface ApiService {

    @POST("/optimized/mobiconnect/customer_account/saveCustomerAddress")
    @FormUrlEncoded
    Call<Address> saveAddress(@Field("hashkey") String hashkey,
                              @Field("street") String Street,
                              @Field("country") String Country,
                              @Field("pincode") String Pincode,
                              @Field("mobile") String Mobile,
                              @Field("city") String City,
                              @Field("lastname") String Lastname,
                              @Field("email") String Email,
                              @Field("customer_id") String CustomerId,
                              @Field("state") String State,
                              @Field("firstname") String FirstName,
                              @Field("gmap_lng") String Gmap_Lng,
                              @Field("gmap_lat") String Gmap_Lat,
                              @Field("gmap_plus_code") String Gmap_Plus_Code);
}
