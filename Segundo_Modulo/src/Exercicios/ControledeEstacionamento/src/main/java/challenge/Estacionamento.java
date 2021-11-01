package Exercicios.ControledeEstacionamento.src.main.java.challenge;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    List<Carro> parking = new ArrayList<>();

    public void estacionar(Carro carro) {
        if(parking.size() == 10){
            boolean olderDriver = parking.stream().anyMatch(x -> x.getMotorista().getIdade() >= 55);
            if(olderDriver) throw new EstacionamentoException("Crowded parking lot");

            for(int i=0; i < parking.size(); i++){
//                int driverAge = parking.get(i).getMotorista().getIdade();
                if(parking.get(i).getMotorista().getIdade() < 55){
                    parking.remove(i);
                    parking.add(i, carro);
                    break;
                }
            }
        }else {
            parking.add(carro);
        }
    }

    public int carrosEstacionados() {
        int occupiedParkingSpaces = parking.size();
        return occupiedParkingSpaces;
    }

    public boolean carroEstacionado(Carro carro) {
        for(int i = 0; i < parking.size(); i++){
            boolean parkedCar = parking.get(i).equals(carro);
            if (parkedCar) return true;
        }
        return false;
    }
}
