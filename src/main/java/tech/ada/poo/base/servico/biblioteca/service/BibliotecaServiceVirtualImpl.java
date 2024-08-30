package tech.ada.poo.base.servico.biblioteca.service;

import tech.ada.poo.base.servico.biblioteca.repository.BibliotecaRepositorio;

public class BibliotecaServiceVirtualImpl
    extends BibliotecaServiceImpl
        implements BibliotecaServiceVirtual {

    public BibliotecaServiceVirtualImpl(BibliotecaRepositorio repositorio) {
        super.setRepositorio(repositorio);
    }


    @Override
    public void compartilharPorEmail(String email, String titulo) {
        
    }

    @Override
    public byte[] baixarItem(String titulo) {
        return new byte[0];
    }

    @Override
    public boolean verificarDisponibilidadeOnline(String titulo) {
        return false;
    }

    @Override
    public void adicionarAosFavoritos(String titulo) {

    }

    @Override
    public String obterPrevia(String titulo) {
        return "";
    }

    @Override
    public void avaliarItem(String titulo, int avaliacao) {

    }
}
