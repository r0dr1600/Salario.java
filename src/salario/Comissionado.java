/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

public class Comissionado extends Empregado{
public double totalVenda;
public double taxaComissao;
public String Nome;
public String Sobrenome;
public String CPF;

public void settotalVenda(double totalVenda){
  this.totalVenda = totalVenda;
}

public void settaxaComissao(double taxaComissao){
  this.taxaComissao = taxaComissao;
}

public void setNome(String Nome){
    this.Nome = Nome;
}

public void setSobrenome(String Sobrenome){
    this.Sobrenome = Sobrenome;
}

public void setCPF(String CPF){
    this.CPF = CPF;
}

@Override
  public String getNome(){
  return Nome;
}
@Override
  public String getSobrenome(){
  return Sobrenome;
}
@Override
  public String getCPF(){
  return CPF;
}
@Override
  public double Vencimento(){
  return totalVenda*(taxaComissao/100);
}
}