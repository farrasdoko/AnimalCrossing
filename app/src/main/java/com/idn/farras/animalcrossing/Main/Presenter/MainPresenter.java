package com.idn.farras.animalcrossing.Main.Presenter;

import com.idn.farras.animalcrossing.Base.BasePresenter;
import com.idn.farras.animalcrossing.Main.Model.AmiiboItem;
import com.idn.farras.animalcrossing.Main.Model.ResponseAnimalCrossing;
import com.idn.farras.animalcrossing.Main.View.MainView;
import com.idn.farras.animalcrossing.Rest.ApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter implements BasePresenter<MainView> {

    MainView mainView;

    public void getData(){
        call().enqueue(new Callback<ResponseAnimalCrossing>() {
            @Override
            public void onResponse(Call<ResponseAnimalCrossing> call, Response<ResponseAnimalCrossing> response) {
//               5.TODO pengecekan berhasil tidaknya
//                if (response.isSuccessful()){
//                    6. TODO jika data berhasil didapatkan
                    List<AmiiboItem> recipesItems = response.body().getAmiibo();
//                    7. TODO data dikembalikan ke view
                    mainView.onSuccess(recipesItems);
//                }else {
//                    mainView.onError("Gagal Mengambil Data");
//                }
            }

            @Override
            public void onFailure(Call<ResponseAnimalCrossing> call, Throwable t) {
                mainView.onError(t.getMessage());
            }
        });
    }


    @Override
    public void onAttach(MainView v) {
        mainView = v;
    }

    @Override
    public void onDetach() {
        mainView = null;
    }

    Call<ResponseAnimalCrossing> call(){
        return ApiClient.getInstance().getAnimal();
    }
}
