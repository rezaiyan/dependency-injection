package ir.alirezaiyan.dependencyinjection.dagger.core.data;

import java.util.List;

import ir.alirezaiyan.dependencyinjection.dagger.core.domain.Database;


public class DiRepositoryImpl implements DiRepository {

    private Database database;

    public DiRepositoryImpl(Database database) {
        this.database = database;
    }

    @Override
    public List<String> getOfflineLayers() {
        return database.getLayers();
    }

}
