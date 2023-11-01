# encoding: UTF-8

Feature: Modulo pacientes de Medilapp
  Yo como usuario
  Quiero que se agregue un paciente nuevo
  Para que valide el ingreso correcto pacientes

  Background:
    Given quiero ingresar a medilapp
    When ingreso los datos de inicio de sesion
      |     strUser     |  strPassword |
      | certificacion   |    12345678  |

  Scenario: Crear paciente mediante el submenu pacientes
    When ingreso al modulo de paciente
    Then Ingreso a la opcion de crear paciente paciente e ingresos los datos
      | strCedula | strNombre | strApellido  |  strFechaNacimiento  | strTelefono | strCorreo | strComentarios  |
      | 34286706  | Armando | Casas De La Roca  | 18061990        | +684275097303 | armando@gmail.com | paciente diabetico|
    And se debe mostrar un mensaje de creacion exitosa
      |                 strRegistroCorrecto             |
      | Se Agregó el Nuevo Paciente |
