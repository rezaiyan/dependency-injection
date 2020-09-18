package ir.alirezaiyan.dependencyinjection.dagger.core.domain;

import android.content.Context;

import java.util.Collections;
import java.util.List;

public class Database {
    Context context;

    public Database(Context context) {
        this.context = context;
    }

    public List<String> getLayers() {
        return Collections.singletonList("fake layer");
    }
}
