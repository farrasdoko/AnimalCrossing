package com.idn.farras.animalcrossing.Main.View;

import com.idn.farras.animalcrossing.Base.BaseView;
import com.idn.farras.animalcrossing.Main.Model.AmiiboItem;

import java.util.List;

public interface MainView extends BaseView {
    void onError(String msg);
    void onSuccess(List<AmiiboItem> data);
}
