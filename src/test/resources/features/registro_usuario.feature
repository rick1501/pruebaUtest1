#Autor: Ricardo Narvaez
@stories
Feature: Registro de usuario en Utest
  @scenario

  Scenario:  Registro de manuel en la pagina de Utest
    Given grego desea registrarse en Utest
    When el usuario ingresa los datos requeridos por el sistems

      |strNombre |strApellido |strEmail             |strDia |strMes |strAno|strCiudad |strZip|strPais     |strDispositivo|strModelo|strSistemaOperativo|strClave      |
      |rick      |Narvaez     |grego00625@gmail.com | 25    |October|1996  |Bogota    |00000 |Colombia    |Apple         |iPhone 7 |iOS 15             |*Larry1598      |
    Then  el registro se completa al ver el boton de complete setup

      |strTextoFinal|
      |Complete Setup|
