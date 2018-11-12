package com.idn.farras.animalcrossing.Base;

public interface BasePresenter<T extends BaseView> {
    void onAttach(T v);
    void onDetach();
}
