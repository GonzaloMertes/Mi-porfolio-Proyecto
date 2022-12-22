/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.ap.Security.repository;

import com.portfolio.ap.Security.Entity.Rol;
import com.portfolio.ap.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Gonzalo Mertes
 */
public interface iRolRepository extends JpaRepository<Rol,Integer>{
    Optional <Rol> findByNombre(RolNombre rolNombre);
}
