/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jorge Rojas
 */
public class PersonaModel {

    private int id_carnet;
    private String password;
    private String id_curso;

    public PersonaModel() {
    }

    public PersonaModel(int id_carnet, String password, String id_curso) {
        this.id_carnet = id_carnet;
        this.password = password;
        this.id_curso = id_curso;
    }

    public int getId_carnet() {
        return id_carnet;
    }

    public void setId_carnet(int id_carnet) {
        this.id_carnet = id_carnet;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId_curso() {
        return id_curso;
    }

    public void setId_curso(String id_curso) {
        this.id_curso = id_curso;
    }

}
