package org.example.entities;

public class Course {
  private String coursename;
  private double price;
  private int year;
  private Instructor instructor;
  private Category category;
  public Course(String coursename,double price, int year,Instructor instructor,Category category){
    this.coursename = coursename;
    this.price = price;
    this.year = year;
    this.instructor = instructor;
    this.category = category;
  }

  public String getCoursename() {
    return coursename;
  }

  public void setCoursename(String coursename) {
    this.coursename = coursename;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public Instructor getInstructor() {
    return instructor;
  }

  public void setInstructor(Instructor instructor) {
    this.instructor = instructor;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
