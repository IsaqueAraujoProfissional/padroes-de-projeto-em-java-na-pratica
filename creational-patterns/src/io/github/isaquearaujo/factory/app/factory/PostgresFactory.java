package io.github.isaquearaujo.factory.app.factory;

import io.github.isaquearaujo.factory.app.db.DB;
import io.github.isaquearaujo.factory.app.db.PostgresDB;

public class PostgresFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new PostgresDB();
    }

}
