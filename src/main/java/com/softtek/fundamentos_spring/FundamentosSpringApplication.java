package com.softtek.fundamentos_spring;

//import com.softtek.fundamentos_spring.modelo.Coche.Coche;
import com.softtek.fundamentos_spring.modelo.Coche.CocheCoche;
import com.softtek.fundamentos_spring.modelo.Coche.Conductor;
import com.softtek.fundamentos_spring.modelo.IDAO.AccesoDesarrollo;
import com.softtek.fundamentos_spring.modelo.IDAO.Cliente;
import com.softtek.fundamentos_spring.modelo.IDAO.ClienteDAO;
import com.softtek.fundamentos_spring.modelo.Taller.SeguroCoche;
import com.softtek.fundamentos_spring.modelo.Taller.Coche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosSpringApplication implements CommandLineRunner {

	@Autowired
	private SeguroCoche s1;

	@Autowired
	private Coche carricoche;

	@Autowired
	private CocheCoche c1;

	@Autowired
	private Conductor cond;

	@Autowired
	private ClienteDAO client;

	@Autowired
	private Cliente cl;

	public static void main(String[] args) {
		SpringApplication.run(FundamentosSpringApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Ejercicio3();
	}

	private void Ejercicio1(){
		System.out.println(s1.reparar(carricoche));
	}
	private void Ejercicio2(){
		System.out.println(cond.conducir());
		((CocheCoche)cond.getVehiculo()).setDeposito(2);
		System.out.println(cond.conducir());
		System.out.println(cond.conducir());
	}

	private void Ejercicio3(){
		cl.setNIF("23332444E");
		cl.setNombre("Ambrosio");
		System.out.println(client.insertar(cl));
	}
}
