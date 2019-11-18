/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swen6301.builder;

/**
 *
 * @author User
 */
public class PatientBuilder {
        private         String firstName = RandomUtils.randomIdentifier();
	private 	String middleName = RandomUtils.randomIdentifier();
	private 	String lastName = RandomUtils.randomIdentifier();
	private 	int age = RandomUtils.randomNumber(150);
	private 	int weight = RandomUtils.randomNumber(400);
	private 	String sex = RandomUtils.randomSexString();
	private 	int height = RandomUtils.randomNumber(300);
	private 	String bloodType = RandomUtils.randomBloodType();
        public PatientBuilder setfirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public PatientBuilder setmiddleName(String middleName){
            this.middleName = middleName;
            return this;
        }
        public PatientBuilder setlastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public PatientBuilder setage(int age){
            this.age = age;
            return this;
        }
        public PatientBuilder setweight(int weight){
            this.weight = weight;
            return this;
        }
        public PatientBuilder setsex(String sex){
            this.sex = sex;
            return this;
        }
        public PatientBuilder setheight(int height){
            this.height = height;
            return this;
        }
        public PatientBuilder setbloodType(String bloodType){
            this.bloodType = bloodType;
            return this;
        }
         public Driver build() {
        return new Driver(firstName, middleName,lastName,age,weight,sex,height,bloodType);
    }
}
