/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

public class Horista extends Empregado{
public double precoHora;
public double horasTrabalhadas;
public String Nome;
public String Sobrenome;
public String CPF;

public void setprecoHora(double precoHora){
  this.precoHora = precoHora;
}

public void sethorasTrabalhadas(double horasTrabalhadas){
  this.horasTrabalhadas = horasTrabalhadas;
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
  return horasTrabalhadas*precoHora;
}
}