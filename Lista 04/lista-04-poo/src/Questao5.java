import questao5.model.*;

void main() {

    //Array do tipo da classe abstrata guardando objetos das subclasses
    Personagem[] personagens = {
            new Arqueiro("Legolas", 90, 14, 5),
            new Mago("Merlin", 80, 12, 90),
            new Guerreiro("Conan", 100, 18)
    };

    System.out.println("=== Personagens ===");
    for (Personagem p : personagens) {
        System.out.println(p);
    }

    int turno = 1;
    while (contarVivos(personagens) > 1) {
        System.out.println("\n=== Turno " + turno + " ===");
        for (int i = 0; i < personagens.length; i++) {
            Personagem atacante = personagens[i];
            if (!atacante.estaVivo() || contarVivos(personagens) == 1) {
                continue;
            }
            //Polimorfismo: atacar() executa a logica de cada subclasse
            atacante.atacar(proximoVivo(personagens, i));
        }
        turno++;
    }

    for (Personagem p : personagens) {
        if (p.estaVivo()) {
            System.out.println("\nVencedor: " + p);
        }
    }

}

int contarVivos(Personagem[] personagens) {
    int vivos = 0;
    for (Personagem p : personagens) {
        if (p.estaVivo()) {
            vivos++;
        }
    }
    return vivos;
}

//Retorna o proximo personagem vivo depois da posicao informada
Personagem proximoVivo(Personagem[] personagens, int posicao) {
    for (int i = 1; i < personagens.length; i++) {
        Personagem p = personagens[(posicao + i) % personagens.length];
        if (p.estaVivo()) {
            return p;
        }
    }
    return null;
}
