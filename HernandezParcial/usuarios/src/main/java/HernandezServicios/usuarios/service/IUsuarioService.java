package HernandezServicios.usuarios.service;


import HernandezServicios.usuarios.dto.LoginRequest;
import HernandezServicios.usuarios.dto.LoginResponse;
import HernandezServicios.usuarios.model.UsuarioModel;

public interface IUsuarioService {
	public LoginResponse login(LoginRequest login);
	public Iterable<UsuarioModel>  findAll() ;

    

}