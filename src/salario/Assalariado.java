/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

public class Assalariado extends Empregado{
public double Salario;
public String Nome;
public String Sobrenome;
public String CPF;

public void setSalario(double Salario){
  this.Salario = Salario;
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
  return Salario;
}









}