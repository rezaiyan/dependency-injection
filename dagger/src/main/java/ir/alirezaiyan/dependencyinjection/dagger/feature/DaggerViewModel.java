package ir.alirezaiyan.dependencyinjection.dagger.feature;

import androidx.lifecycle.ViewModel;

import java.util.List;

import javax.inject.Inject;

import ir.alirezaiyan.dependencyinjection.dagger.core.data.DiRepository;


public class DaggerViewModel extends ViewModel {

    private DiRepository repository;

    @Inject
    public DaggerViewModel(DiRepository repository) {
        this.repository = repository;
    }

    public List<String> getOfflineLayers() {
        return repository.getOfflineLayers();
    }

}
