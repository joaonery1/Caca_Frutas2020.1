package cata;

/**
 * 
 * Classe Avatar
 * @author joao
 *
 */

public class Avatar {
    String Nome;
    int PForça;
    int PDefesa;
    int PAgilidade;
    int PVitoria;
    boolean doente;
    boolean estatico;

    public Avatar(String Nome, int PForça, int PDefesa, int PAgilidade, int PVitoria, boolean doente, boolean estatico) {
        this.Nome = Nome;
        this.PForça = PForça;
        this.PDefesa = PDefesa;
        this.PAgilidade = PAgilidade;
        this.PVitoria = PVitoria;
        this.doente = doente;
        this.estatico = estatico;
    }
}