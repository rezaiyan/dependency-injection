package ir.alirezaiyan.dependencyinjection.dagger.feature;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import javax.inject.Inject;


public class DaggerActivity extends AppCompatActivity {

    @Inject
    DaggerPresenter presenter;
    @Inject
    ViewModelProvider.Factory factory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerAppComponent
                .builder()
                .coreComponent(((DiApp) getApplication()).getComponent())
                .build()
                .inject(this);

        DaggerViewModel daggerViewModel = new ViewModelProvider(this, factory).get(DaggerViewModel.class);

    }
}
