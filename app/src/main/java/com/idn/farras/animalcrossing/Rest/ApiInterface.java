package com.idn.farras.animalcrossing.Rest;

import com.idn.farras.animalcrossing.Main.Model.ResponseAnimalCrossing;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api/amiibo/?gameseries=Animal Crossing")
    Call<ResponseAnimalCrossing> getAnimal();
}
