package br.com.alura.codechella;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuarioComArquivos {
    public static void main(String[] args) {
        RepositorioDeUsuarioEmArquivo repositorioDeUsuarioEmArquivo = new RepositorioDeUsuarioEmArquivo();
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("232.324.111-33", "João",
                LocalDate.parse("2000-10-15"), "joao@email.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("232.324.111-33", "Pedro",
                LocalDate.parse("2000-10-15"), "pedro@email.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("232.324.111-33", "Jose",
                LocalDate.parse("2000-10-15"), "jose@email.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("232.324.111-33", "Antonio",
                LocalDate.parse("2000-10-15"), "antonio@email.com"));

        //System.out.println(repositorioDeUsuarioEmArquivo.listarTodos());
        repositorioDeUsuarioEmArquivo.gravaEmArquivo("usuarios.txt");
    }
}
