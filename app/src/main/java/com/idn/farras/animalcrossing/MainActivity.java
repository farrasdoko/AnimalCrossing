package com.idn.farras.animalcrossing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.idn.farras.animalcrossing.Adapter.MainAdapter;
import com.idn.farras.animalcrossing.Main.Model.AmiiboItem;
import com.idn.farras.animalcrossing.Main.Presenter.MainPresenter;
import com.idn.farras.animalcrossing.Main.View.MainView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.rv_recycler)
    RecyclerView rvRecycler;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mainPresenter = new MainPresenter();
        onAttachView();
    }

    @Override
    public void onError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccess(List<AmiiboItem> data) {
        rvRecycler.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        rvRecycler.setAdapter(new MainAdapter(MainActivity.this, data));
    }

    @Override
    public void onAttachView() {
        mainPresenter.getData();
        mainPresenter.onAttach(this);
    }

    @Override
    public void onDetachView() {

    }
}
