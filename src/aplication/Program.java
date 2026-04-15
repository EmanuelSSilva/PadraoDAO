package aplication;

import java.util.Date;

import model.entites.Departamento;
import model.entites.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		Departamento obj = new Departamento(1, "CPD");
		
		Vendedor obj1 = new Vendedor(1, "Emanuel", "emanuel@gmail.com", new Date(), 3000.0, obj);
		System.out.println(obj1);
	}

}
