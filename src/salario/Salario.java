/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

import java.util.List;
import java.util.ArrayList;

public class Salario {
public static void main(String[] args) { 
   Assalariado A1 = new Assalariado();
  A1.setNome("Renato");
  A1.setSobrenome("Silva");
  A1.setCPF("999.999.999-99");
  A1.setSalario(1000);

Comissionado C1 = new Comissionado();
  C1.setNome("Pedro");
  C1.setSobrenome("Costa");
  C1.setCPF("888.888.888-88");
  C1.settotalVenda(10000);
  C1.settaxaComissao(30);

Horista H1 = new Horista();
  H1.setNome("Maria");
  H1.setSobrenome("Aparecida");
  H1.setCPF("777.777.777-77");
  H1.setprecoHora(10);
  H1.sethorasTrabalhadas(160);




  List<Empregado> empregados = new ArrayList<Empregado>();
    empregados.add(A1);
    empregados.add(C1);
    empregados.add(H1);
   

  for (Empregado empregado : empregados){
    System.out.println("Nome: " + empregado.getNome() +" " + empregado.getSobrenome());
    
    System.out.println("CPF: " + empregado.getCPF());
    System.out.println("Vencimento R$" + empregado.Vencimento());

    }
  }
}
