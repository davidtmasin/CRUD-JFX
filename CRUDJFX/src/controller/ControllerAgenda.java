package controller;

import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Contato;
import model.ContatoDAO;

public class ControllerAgenda implements Initializable {
			
    @FXML
    private TextField idContato;

    @FXML
    private TextField nome;

    @FXML
    private TextField idade;

    @FXML
    private TextField endereco;

    @FXML
    private TextField telefone;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnListar;

    @FXML
    private Button btnAlterar;

    @FXML
    private Button btnDeletar;
    
    @FXML
    private Button btnLimpar;
    
    @FXML
    private TableView<Contato> tabelaAgenda;

    @FXML
    private TableColumn<Contato, Long> idTabela;

    @FXML
    private TableColumn<Contato, String> nomeTabela;

    @FXML
    private TableColumn<Contato, Integer> idadeTabela;

    @FXML
    private TableColumn<String, String> enderecoTabela;

    @FXML
    private TableColumn<String, String> telefoneTabela;

    
    ContatoDAO dao;
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	dao = new ContatoDAO();
    	
		idTabela.setCellValueFactory(new PropertyValueFactory<>("id"));
		nomeTabela.setCellValueFactory(new PropertyValueFactory<>("nome"));
		idadeTabela.setCellValueFactory(new PropertyValueFactory<>("idade"));
		enderecoTabela.setCellValueFactory(new PropertyValueFactory<>("endereco"));
		telefoneTabela.setCellValueFactory(new PropertyValueFactory<>("telefone"));
		
		listarContato();
		
	}
    
    @FXML
    void cadastrarContato(ActionEvent event) {
    	if(idContato.getText().isEmpty()) {
    		/*if(idade.getText().equals("") || nome.getText().equals("") || telefone.getText().equals("") || endereco.getText().equals("")) {
    			mensagem("Um ou mais campos não foram preenchidos, favor, revise seu cadastro.");
    		} else {
    		*/	
    			Contato contato = new Contato();
        		
        		contato.setNome(nome.getText());
        		contato.setIdade(Integer.parseInt(idade.getText()));
        		contato.setEndereco(endereco.getText());
        		contato.setTelefone(telefone.getText());
        		
        		try {
        			
        			dao.salvarDAO(contato);
        			
        			mensagem("Contato salvo com sucesso!");
        			
        			listarContato();
        			limpaFormulario();
        			
        		} catch(Exception e) {
        			
        			e.printStackTrace();
        		}
    		//}    		
    		    		
    	} else {
    		//mensagemErro("O campo ID não deve ser preenchido!");
    		mensagem("Não é possível cadastrar um contato já existente!");
    	}    	
    }
    
    @FXML
    void alterarContato(ActionEvent event) {
    	
    	if(!idContato.getText().isEmpty()) {
    		System.out.print(idContato.getText().isEmpty());
    		Contato contato = new Contato();
    		
    		contato.setId(Long.parseLong(idContato.getText()));
    		
    		contato.setNome(nome.getText());
    		contato.setIdade(Integer.parseInt(idade.getText()));
    		contato.setEndereco(endereco.getText());
    		contato.setTelefone(telefone.getText());
    		
    		try {
    			
    			dao.editarDAO(contato);
    			
    			mensagem("Contato atualizado com sucesso!");
    			
    			listarContato();
    			limpaFormulario();
    			
    		} catch(Exception e) {
    			
    			e.printStackTrace();
    		}
    		
    	} else {
    		
    		mensagem("Não é possível cadastrar um contato já existente");
    		
    	} 
    	
    }


    @FXML
    void deletarContato(ActionEvent event) {
    	
    	if(tabelaAgenda.getSelectionModel().getSelectedItems() == null) {
    		
    		mensagemErro("Não existe nenhum contato selecionado!");
    		
    	} else {
    		
    		if(mensagemConfirmacao("Você realmente deseja deletar este contato?")) {
    			dao.deletarDAO(tabelaAgenda.getSelectionModel().getSelectedItem().getId());
    			
    			listarContato();
    		}    		
    	}
    }

    @FXML
    void listarContato() {
    	List<Contato> contatos = dao.consultarDAO();
    	
    	if(!contatos.isEmpty()) {
    		
    		tabelaAgenda.setItems(FXCollections.observableArrayList(contatos));
    	}
    }
    
    
    @FXML
    void detalhesContato() {
    	
    	if(tabelaAgenda.getSelectionModel().getSelectedItem() == null) {
    		
    		mensagemErro("Não existe nenhum registro selecionado!");
    		
    	} else {
    		
    		Contato contato = tabelaAgenda.getSelectionModel().getSelectedItem();
    		
    		idContato.setText(String.valueOf(contato.getId()));
    		nome.setText(contato.getNome());
    		idade.setText(String.valueOf(contato.getIdade()));
    		endereco.setText(contato.getEndereco());
    		telefone.setText(contato.getTelefone());
    		
    	}
    }
    
    @FXML
    void limpaFormulario() {
    	
    	idContato.clear();
    	
    	nome.clear();
    	
    	idade.clear();
    	
    	endereco.clear();
    	
    	telefone.clear();
    }
        
	 private void mensagem(String informacao) {
	    	
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Mensagem do sistema");
	    	alert.setHeaderText(null);
	    	alert.setContentText(informacao);
	    	
	    	alert.showAndWait();
	    }
    
    
    private void mensagemErro(String informacao) {
    	
    	Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("Mensagem do sistema");
    	alert.setHeaderText(null);
    	alert.setContentText(informacao);
    	
    	alert.showAndWait();
    }
    
    private boolean mensagemConfirmacao(String informacao) {
    	
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Mensagem do sistema");
    	alert.setHeaderText(null);
    	alert.setContentText(informacao);
    	
    	Optional<ButtonType> opcao = alert.showAndWait();
    	
    	if(opcao.get() == ButtonType.OK) {
    		
    		return true;
    		
    	} else {
    		
    		return false;
    		
    	}
    }

}




