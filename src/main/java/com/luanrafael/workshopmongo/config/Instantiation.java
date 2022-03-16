package com.luanrafael.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.luanrafael.workshopmongo.domain.User;
import com.luanrafael.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll(); //para limpar nossa coleção no mongodb
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		User cibele = new User(null, "Cibele purple", "cibele@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria,alex,bob,cibele));
	}

}
