package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.User;

@Repository                                        
public interface UserRepository extends CrudRepository<User, Integer> {    // or    JpaRepository<user, Integer>

}




// CrudRepository - its interface use to make database connection 
// <User, Integer> - class name and data type of that wrapper class which is provide 
//to primary key by using @id annotation

//  Primitive type	 Wrapper class	
//   int	          Integer	
//   long	          Long	
//   float	          Float	
//   double	          Double 
