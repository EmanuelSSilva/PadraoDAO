package aplication;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entites.Departamento;
import model.entites.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		VendedorDao vendedor = DaoFactory.createVendedorDao();
		System.out.println("=== TESTE 1: Vendedor findById ===");// teste do vendendo, buscando informaçoes no banco
		Vendedor vend = vendedor.findById(3);
		System.out.println(vend);
		
		System.out.println("\n=== TESTE 2: Vendedor findByDepartamento ===");// teste do vendendo, buscando informaçoes no banco
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> list = vendedor.findByDepartamento(departamento);
		for (Vendedor obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 3: Vendedor findAll ===");// teste do vendendo, buscando informaçoes no banco
		list = vendedor.findAll();
		for (Vendedor obj : list) {
			System.out.println(obj);
		}
		
	}

}
