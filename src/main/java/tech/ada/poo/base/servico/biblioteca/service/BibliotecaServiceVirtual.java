package tech.ada.poo.base.servico.biblioteca.service;

import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;

public interface BibliotecaServiceVirtual extends BibliotecaService {

    // Assinaturas dos métodos adicionais

    void compartilharPorEmail(String email, String titulo);

    byte[] baixarItem(String titulo);

    boolean verificarDisponibilidadeOnline(String titulo);

    void adicionarAosFavoritos(String titulo);

    String obterPrevia(String titulo);

    void avaliarItem(String titulo, int avaliacao);

    // Métodos herdados da interface BibliotecaService

    @Override
    String reservar(String titulo);

    @Override
    ItemCatalogo consultar(String titulo);
}
