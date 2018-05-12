package gradle.cucumber;


public class Pacman {

    private Estado estado;

    public Pacman(){
        this.estado = new EstadoVivo();
    }

    public void choca(Fantasma fantasma) {
        this.estado = new EstadoMuerto();
    }

    public boolean estaVivo() {
        return this.estado.estaVivo();
    }
}