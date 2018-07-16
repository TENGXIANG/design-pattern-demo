package com.teng.demo.abstractFactory;

/**
 * 抽象工厂模式
 */
public class Client {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        IFactory factory = new MysqlFactory();
        //IFactory factory = new OracleFactory();
        //IFactory factory = new MongoDBFactory();

       IDepartment department1 =  factory.createDepartment();
       department1.insert(department);
       department1.getDepartment(1L);

       IUser user1 = factory.createUser();
       user1.insert(user);
       user1.getUser(1L);
    }
}
