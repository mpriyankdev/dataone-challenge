package com.dataone.jsontransformer.model;

import java.util.List;
import java.util.Objects;

public class DataModel {

    private String fruit;
    private String animal;
    private List<String> cityList;

    public DataModel(){

    }

    public DataModel(String fruit, String animal, List<String> cityList) {
        this.fruit = fruit;
        this.animal = animal;
        this.cityList = cityList;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public List<String> getCityList() {
        return cityList;
    }

    public void setCityList(List<String> cityList) {
        this.cityList = cityList;
    }

    @Override
    public String toString() {
        return "DataModel{" +
                "fruit='" + fruit + '\'' +
                ", animal='" + animal + '\'' +
                ", cityList=" + cityList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataModel dataModel = (DataModel) o;
        return Objects.equals(fruit, dataModel.fruit) &&
                Objects.equals(animal, dataModel.animal) &&
                Objects.equals(cityList, dataModel.cityList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruit, animal, cityList);
    }
}
