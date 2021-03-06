package org.glsid.metier;

import java.util.Date;

import org.glsid.dao.CompteRepository;
import org.glsid.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteMetierImpl implements CompteMetier {
	@Autowired
	private CompteRepository compteRepo;

	public Compte saveCompte(Compte cp) {
		cp.setDateCreation(new Date());
		return compteRepo.save(cp);
	}

	public Compte getCompte(String codeCompte) {
		// TODO Auto-generated method stub
		return compteRepo.findOne(codeCompte);
	}

}
