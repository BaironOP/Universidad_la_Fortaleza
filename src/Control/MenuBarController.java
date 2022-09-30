/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;

/**
 * FXML Controller class
 *
 * @author Solan
 */
public class MenuBarController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private MenuBar myMenuBar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    void about(ActionEvent event) {

    }
    
    @FXML
    void registrarEsudiantes(ActionEvent event){
        
    }

    @FXML
    void crearDepartamento(ActionEvent event) {

    }

    @FXML
    void crearHorarios(ActionEvent event) {

    }

    @FXML
    void listarAsignaturas(ActionEvent event) {

    }

    @FXML
    void matricularMateria(ActionEvent event) {

    }

    @FXML
    void registrarDocentes(ActionEvent event) {

    }

    @FXML
    void registrarGrupos(ActionEvent event) {

    }

    @FXML
    void registrarProgramas(ActionEvent event) {

    }

    @FXML
    void verHorarios(ActionEvent event) {

    }
    
}
