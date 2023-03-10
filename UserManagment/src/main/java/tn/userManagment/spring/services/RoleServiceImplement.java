package tn.userManagment.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.userManagment.spring.entities.Role;
import tn.userManagment.spring.repository.RoleRepository;


@Service
public class RoleServiceImplement implements IRoleService {

	
	@Autowired
	RoleRepository roleRep;
	@Override
	public Role addRole(Role r) {
		// TODO Auto-generated method stub
		return roleRep.save(r);
	}
}
