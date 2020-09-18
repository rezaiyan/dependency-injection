package ir.alirezaiyan.dependencyinjection.hilt.feature;

import androidx.lifecycle.ViewModel;

import java.util.List;

import javax.inject.Inject;

import ir.alirezaiyan.dependencyinjection.hilt.core.data.DiRepository;


public class HiltViewModel extends ViewModel {

    private DiRepository repository;

    @Inject
    public HiltViewModel(DiRepository repository) {
        this.repository = repository;
    }

    public List<String> getOfflineLayers() {
        return repository.getOfflineLayers();
    }

}
