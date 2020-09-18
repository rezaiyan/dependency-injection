package ir.alirezaiyan.dependencyinjection.hilt.feature;

import java.util.List;

import ir.alirezaiyan.dependencyinjection.hilt.core.data.DiRepository;

public class HiltPresenter {

    private DiRepository repository;

    public HiltPresenter(DiRepository repository) {
        this.repository = repository;
    }

    public List<String> getOfflineLayers() {
        return repository.getOfflineLayers();
    }

}
