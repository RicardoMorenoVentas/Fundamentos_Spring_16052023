package com.softtek.fundamentos_spring;

import com.softtek.fundamentos_spring.modelo.Coche.Coche;
import com.softtek.fundamentos_spring.modelo.Coche.Conductor;
import com.softtek.fundamentos_spring.modelo.IDAO.AccesoDesarrollo;
import com.softtek.fundamentos_spring.modelo.IDAO.Cliente;
import com.softtek.fundamentos_spring.modelo.IDAO.ClienteDAO;
import com.softtek.fundamentos_spring.modelo.Taller.SeguroCoche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosSpringApplication implements CommandLineRunner {

/*	@Autowired
	private SeguroCoche s1;*/

	/*@Autowired
	private Coche c1;*/

	@Autowired
	private ClienteDAO client;

	@Autowired
	private Cliente cl;

	@Autowired
	private AccesoDesarrollo ac;

	public static void main(String[] args) {
		SpringApplication.run(FundamentosSpringApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
/*		s1 = new SeguroCoche();
		Coche carricoche = new Coche();
		System.out.println(s1.reparar(carricoche));*/

		/*c1 = new Coche(1);
		Conductor cond = new Conductor(c1);
		System.out.println(cond.conducir());*/

		ac = new AccesoDesarrollo();
		client = new ClienteDAO(ac);
		cl = new Cliente();
		System.out.println(client.insertar(cl));
	}
}
