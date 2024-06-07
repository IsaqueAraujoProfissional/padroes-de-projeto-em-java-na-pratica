package io.github.isaquearaujo.bridge.backend;


import io.github.isaquearaujo.bridge.backend.dao.UserMongoDao;
import io.github.isaquearaujo.bridge.backend.dao.UserMysqlDao;
import io.github.isaquearaujo.bridge.backend.dao.UserOracleDao;
import io.github.isaquearaujo.bridge.backend.dao.UserPostgresDao;
import io.github.isaquearaujo.bridge.backend.model.User;
import io.github.isaquearaujo.bridge.backend.services.UserEJB;
import io.github.isaquearaujo.bridge.backend.services.UserRest;
import io.github.isaquearaujo.bridge.backend.services.UserService;
import io.github.isaquearaujo.bridge.backend.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);
		
		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);
		
		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);
		
		//.......
		
		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
		
	}
}
