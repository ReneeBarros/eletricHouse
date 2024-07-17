package com.dasare.eletrichouse.EletricHouse.model;

import com.dasare.eletrichouse.EletricHouse.model.enums.TypeAC;

public class EletricHouseModel {
    Long id;
    Double width;
    Double length;
    Double area;
    Double perimeter;
    String ambience;
    Integer voltage;
    Integer ambienceLumens;
    Integer luminaireLumens;
    Double powerFactor;
    Double showersWatts; // potencia chuveiro-eletrico
    Double distanceEletricalPanelToShower;
    Boolean haveEletronicEquipament;
    Integer amountEletronicEquipment;
    Integer amountPeopleInAmbience;
    Long totalBtus;
    Long totalLumens;
    Integer amountLuminaire;
    Integer amountEletricalOutlet;
    Integer amountAC;
    TypeAC typeArcondic;

    public EletricHouseModel() {
    }
}
