package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

    private List<Integer> numeros = new ArrayList<Integer>();
    
    public int contarMultiplos(int unNumero) {
        int contador = 0;
        for (Integer numero : this.getNumeros()) {
            if( numero % unNumero == 0) contador++;
        }
        return contador;
    }
    
    public int contarImpares() {
        return this.getNumeros().size() - this.contarPares();
    }
    
    public int contarPares() {
        return this.contarMultiplos(2);
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public Counter addNumber(int i) {
        this.getNumeros().add(i);
        return this;
    }
    
    public int mayorCantidadPares(List<Integer> miLista) {
        int masPares = -1;
        for (Integer numero : miLista) {
            if (this.contarParesNumero(numero) > masPares) masPares = numero;
        }
        return masPares;
    }

    private int contarParesNumero(Integer x) {
        int contador = 0;
        while(x > 0) {
            if(x % 10 % 2 == 0) contador++;
            x=x/10;
        }
        return contador;
    }
}