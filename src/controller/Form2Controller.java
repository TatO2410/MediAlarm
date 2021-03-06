package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Form2Controller implements Initializable {

    private static String myVariable;
    
    @FXML
    private Label IdUser;

    @FXML
    private Label MedicinesName;
    
    @FXML
    private Label nameUser;
    
    @FXML
    private ListView<String> ListView;
  
    
    ObservableList <String > items = FXCollections.observableArrayList("Pastilla","Solución","Inyección","Gotas","Inhalador");
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    ListView.setItems(items);
        
    }    

    void onGetData(String id, String Medicine,String name) {
        IdUser.setText(id);
        MedicinesName.setText(Medicine);
        nameUser.setText(name);
        
    }
    
    @FXML
    void OnNextForm(ActionEvent event) throws IOException {
        
        String selected = ListView.getSelectionModel().getSelectedItem();
     
        if("Pastilla".equals(selected)){
            
            String imgSource = "/image/pastille.png";
            String id = IdUser.getText();
            String nameMedi = MedicinesName.getText();
            String name =  nameUser.getText();
            
            setMyVariable(selected);
            
              ListView.getScene().getWindow().hide();
            
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Form3.fxml"));
                Parent root = (Parent) loader.load();           
                Form3Controller secController = loader.getController();
                secController.onGetData(id,nameMedi,imgSource,selected,name);     
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL); 
                stage.setScene(new Scene(root));
                stage.setTitle("MediAlarm");
                stage.getIcons().add(new Image("/image/clockW.png"));
                stage.show();
            
        }if("Solución".equals(selected)){
            
             String imgSource = "/image/solucion.png";
             String id = IdUser.getText();
             String nameMedi = MedicinesName.getText();
             String name =  nameUser.getText();

              setMyVariable(selected);
              
              ListView.getScene().getWindow().hide();
            
                 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Form3.fxml"));
                Parent root = (Parent) loader.load();           
                Form3Controller secController = loader.getController();
                secController.onGetData(id,nameMedi,imgSource,selected,name);     
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.initModality(Modality.APPLICATION_MODAL); 
                stage.setTitle("MediAlarm");
                stage.getIcons().add(new Image("/image/clockW.png"));
                stage.show();
 
        }if("Inyección".equals(selected)){
            String imgSource = "/image/inyeccion.png";
            String id = IdUser.getText();
            String nameMedi = MedicinesName.getText();
            String name =  nameUser.getText();

             setMyVariable(selected);
             
             ListView.getScene().getWindow().hide();
            
                 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Form3.fxml"));
                Parent root = (Parent) loader.load();           
                Form3Controller secController = loader.getController();
                secController.onGetData(id,nameMedi,imgSource,selected,name);     
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.initModality(Modality.APPLICATION_MODAL); 
                stage.setTitle("MediAlarm");
                stage.getIcons().add(new Image("/image/clockW.png"));
                stage.show();
        
        }if("Gotas".equals(selected)){
             String imgSource = "/image/gotero.png";
             String id = IdUser.getText();
             String nameMedi = MedicinesName.getText();
             String name =  nameUser.getText();

             setMyVariable(selected);
             
             ListView.getScene().getWindow().hide();
            
                 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Form3.fxml"));
                Parent root = (Parent) loader.load();           
                Form3Controller secController = loader.getController();
                secController.onGetData(id,nameMedi,imgSource,selected,name);     
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.initModality(Modality.APPLICATION_MODAL); 
                stage.setTitle("MediAlarm");
                stage.getIcons().add(new Image("/image/clockW.png"));
                stage.show();
            
        }if("Inhalador".equals(selected)){
             String imgSource = "/image/inhalador.png";
             String id = IdUser.getText();
             String nameMedi = MedicinesName.getText();
             String name =  nameUser.getText();

              setMyVariable(selected);
              
              ListView.getScene().getWindow().hide();
            
                 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Form3.fxml"));
                Parent root = (Parent) loader.load();           
                Form3Controller secController = loader.getController();
                secController.onGetData(id,nameMedi,imgSource,selected,name);     
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.initModality(Modality.APPLICATION_MODAL); 
                stage.setTitle("MediAlarm");
                stage.getIcons().add(new Image("/image/clockW.png"));
                stage.show();
            
        }     
    
    }
    
      public static String getMyVariable() {
        return myVariable;
    }

    public static void setMyVariable(String myVariable) {
        Form2Controller.myVariable = myVariable;
    }
}
