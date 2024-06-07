package io.github.isaquearaujo.factory.app.factory;

import io.github.isaquearaujo.factory.app.db.DB;
import io.github.isaquearaujo.factory.app.db.OracleDB;

public class OracleFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new OracleDB();
    }

}
