package com.localiza.amigos.amigos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmigosApplication implements CommandLineRunner {

	@Autowired RepoHola repoHola;

	public static void main(String[] args) {
		SpringApplication.run(AmigosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Linea de comandos en spring
		//Hola h = new Hola();
		//h.setMensaje("Mi primer entidad a guardad en mongofb");
		//repoHola.save(h);
		//De las operaciones CRUD guardar seria la C de create o save

			Hola hh=new Hola();
			hh.setMensaje("Mi segundo mensajito de spring");
		//De las opreaciones CRUD es es la "C" "create" o guardar o save
		repoHola.save(hh);

		//Esta seria la forma de realizar una consulta
		for(Hola h:repoHola.findAll()){
			System.out.println(h.getMensaje());
		}
	}
}