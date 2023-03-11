package com.Test.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<User,Integer> { //class cant extends interface so i made repo as interface
                                              //table name,pk -data type & wrapper class

}
