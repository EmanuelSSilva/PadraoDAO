package aplication;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entites.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		VendedorDao vendedor = DaoFactory.createVendedorDao();
		System.out.println("=== TESTE 1: Vendedor findById ===");
		Vendedor vend = vendedor.findById(3);
		System.out.println(vend);
	}

}
