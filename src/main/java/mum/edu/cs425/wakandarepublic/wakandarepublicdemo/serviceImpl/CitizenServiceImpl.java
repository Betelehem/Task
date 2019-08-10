package mum.edu.cs425.wakandarepublic.wakandarepublicdemo.serviceImpl;

import mum.edu.cs425.wakandarepublic.wakandarepublicdemo.domin.Citizen;
import mum.edu.cs425.wakandarepublic.wakandarepublicdemo.repository.CitizenRepository;
import mum.edu.cs425.wakandarepublic.wakandarepublicdemo.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  CitizenServiceImpl implements CitizenService {
    @Autowired
    CitizenRepository citizenRepository;

    @Override
    public void save(Citizen citizen) {
        citizenRepository.save(citizen);
    }

    @Override
    public List<Citizen> orderbyAsc() {
        return citizenRepository.orderbyAsc();
    }



    @Override
    public Double computeyearly() {
        Double yearto = 0.0;
        List<Citizen> citizens = citizenRepository.findAll();
        for(Citizen citizen : citizens) {

                yearto += citizen.getYearlyIncome();

        }
        return yearto;
    }
}
