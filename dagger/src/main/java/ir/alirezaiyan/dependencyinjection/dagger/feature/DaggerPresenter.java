package ir.alirezaiyan.dependencyinjection.dagger.feature;

import java.util.List;

import javax.inject.Inject;

import ir.alirezaiyan.dependencyinjection.dagger.core.data.DiRepository;


public class DaggerPresenter {

    private DiRepository repository;

    @Inject
    public DaggerPresenter(DiRepository repository) {
        this.repository = repository;
    }

    public List<String> getOfflineLayers() {
        return repository.getOfflineLayers();
    }

}
