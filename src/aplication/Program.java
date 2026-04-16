package aplication;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entites.Departamento;
import model.entites.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		VendedorDao vendedor = DaoFactory.createVendedorDao();//criando o vendedor
		
		System.out.println("=== TESTE 1: Vendedor findById ===");// teste do vendendo, buscando informaçoes no banco
		Vendedor vend = vendedor.findById(3);
		System.out.println(vend);
		
		System.out.println("\n=== TESTE 2: Vendedor findByDepartamento ===");// buscando informaçoes no banco por departamento
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> list = vendedor.findByDepartamento(departamento);
		for (Vendedor obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 3: Vendedor findAll ===");// teste de busca de todos os vendedores
		list = vendedor.findAll();
		for (Vendedor obj : list) {
			System.out.println(obj);
		}
		/*
		System.out.println("\n=== TESTE 4: Vendedor Insert ===");// Inserindo vendedor no banco
		Vendedor novoVendedor = new Vendedor(null, "Antonio", "antonio@gmail.com", new Date(), 4000.0, departamento );
		vendedor.insert(novoVendedor);
		System.out.println("Inserido! Novo Id - " + novoVendedor.getId());
		*/
		System.out.println("\n=== TESTE 5: Vendedor Updade ===");// Atualizando vendedor no banco
		vend = vendedor.findById(1); //carregando os dados do vendedor com id 1
		vend.setNome("Algusto Cesar");// Alterando o nome 
		vendedor.update(vend);//Realizando a atualização
		System.out.println("Atualização Completa!!!!!");
	}

}
