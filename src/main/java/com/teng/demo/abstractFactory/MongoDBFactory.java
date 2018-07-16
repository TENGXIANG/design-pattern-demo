package com.teng.demo.abstractFactory;

public class MongoDBFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new MongoDBUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MongoDBDepartment();
    }
}
