package mum.edu.cs425.wakandarepublic.wakandarepublicdemo.service;

import mum.edu.cs425.wakandarepublic.wakandarepublicdemo.domin.Citizen;

import java.util.List;

public interface CitizenService {

    public void save(Citizen citizen);
    public List<Citizen> orderbyAsc();


    public Double computeyearly();
}
