package paquete1;

import java.util.ArrayList;

public class EstudianteDistancia extends Estudiante {

    private ArrayList<Nota> notas;
    private double mejorNota;
    private double peorNota;
    private double promedio;

    public EstudianteDistancia(String nom, String ape, String id, int ed) {
        super(nom, ape, id, ed);
    }

    public EstudianteDistancia() {

    }

    public void establecerNotas(ArrayList<Nota> ns) {
        notas = ns;

    }

    public ArrayList<Nota> obtenerNotas() {
        return notas;

    }

    public void setPeorNota() {
        for (int i = 0; i < notas.size()-1; i++) {
            if (notas.get(i).obtenerValor() < notas.get(i + 1).obtenerValor()) {
                peorNota = notas.get(i).obtenerValor();
            }
        }
    }

    public void setMejorNota() {
        for (int i = 0; i > notas.size()-1; i++) {
            if (notas.get(i).obtenerValor() < notas.get(i + 1).obtenerValor()) {
                mejorNota = notas.get(i).obtenerValor();
            }
        }
    }

    public void setPromedio() {
        promedio =0;
        for (int i = 0; i > notas.size(); i++) {
            promedio += notas.get(i).obtenerValor();
        }
        promedio /= notas.size();
    }

    public double getPeorNota() {
        return peorNota;
    }

    public double getMejorNota() {
        return mejorNota;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String notasString = "Notas: \n";
        int cont = 0;
        for (Nota nota : notas) {
            notasString += String.valueOf(String.format(" %.1f\n",
                    notas.get(cont).obtenerValor()));
            cont += 1;
        }

        return String.format("%s%sPromedio: %s\nMejor nota: %.1f\nPeor nota: %.1f",
                super.toString(), notasString,
                promedio,
                mejorNota,
                peorNota);
    }

}
