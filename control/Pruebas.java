package control;

//1º Prueba
//import org.junit.Test;
//import static org.junit.Assert.assertArrayEquals;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class SolutionTest {
//  
//  @Test
//    public void should_handleBasicCases() {
//        int[] exp0 = {5, 5, 5, 5, 5};
//        int[] exp1 = {6, 5, 5, 5, 5};
//        int[] input0 = {4, 1, 3, 2, 5};
//
//        assertArrayEquals(exp0, Solution.balancer(input0, 25));
//        assertArrayEquals(exp1, Solution.balancer(input0, 26));
//    }
//
//    @Test
//    public void should_handleNonActionCases() {
//        int[] exp0 = {5, 5, 5, 5, 5};
//        int[] input0 = {5, 5, 5, 5, 5};
//
//        assertArrayEquals(exp0, Solution.balancer(input0, 25));
//    }
//}

//2º Prueba
//import org.junit.*;
//import static org.junit.Assert.*;
//
//
//public class SolutionTest { 
//  
//    @Test
//    public void should_createDog_when_usingConstructorWithAllProperties() {
//
//       Dog a = new Dog("kyle", 16, "Husky", 1483);
//       assertEquals(a.getName(), "kyle");
//       assertEquals(a.getAge(), 16);
//       assertEquals(a.getBreed(), "Husky");
//       assertEquals(a.getId(), 1483);
//    }
//  
//    @Test
//    public void should_updateName_when_usingSetName() {
//       Dog a = new Dog("kyle", 16, "Husky", 1483);
//       a.setName("Carl");
//       assertEquals(a.getName(), "Carl");
//    }
//  
//    @Test
//    public void should_updateAge_when_usingSetAge() {
//       Dog a = new Dog("kyle", 16, "Husky", 1483);
//       a.setAge(12);
//       assertEquals(a.getAge(), 12);
//    }
//  
//    @Test
//    public void should_updateBreed_when_usingSetBreed() {
//       Dog a = new Dog("kyle", 16, "Husky", 1483);
//       a.setBreed("Labrador");
//       assertEquals(a.getBreed(), "Labrador");
//    }
//  
//    @Test
//    public void should_createDog_when_usingConstructorWithIdOnly() {
//       Dog a = new Dog(1483);
//       assertEquals(a.getId(), 1483);
//    }
//  
//    @Test
//    public void should_setId_notExist() {
//      try {
//        Dog.class.getMethod("setId", long.class);
//        fail("id should not have a setter");
//      } catch (Exception e) {
//        
//      }
//    }
//}
//3ºPrueba
//import org.junit.Test;
//import static org.junit.Assert.*;
//import java.math.BigDecimal;
//
//public class SolutionTest { 
//  
//    @Test
//    public void should_createSalesPerson_when_usingConstructorWithAllProperties() {
//       Employee sup = new Employee("Jamie", new BigDecimal("200000"), null);
//       SalesPerson a = new SalesPerson("Jane", new BigDecimal("1600"), sup, 1.4);
//       assertEquals(a.getName(), "Jane");
//       assertEquals(a.getSalary(), new BigDecimal("1600"));
//       assertEquals(a.getSupervisor(), sup);
//    }
//  
//      @Test
//    public void salesPerson_shouldBe_anInstanceOfEmployee() {
//       Employee sup = new Employee("Jamie", new BigDecimal("200000"), null);
//       SalesPerson a = new SalesPerson("Jane", new BigDecimal("1600"), sup, 1.4);
//       assertTrue(a instanceof Employee);
//    }
//  
//      @Test
//    public void should_returnCommissionRate_when_callingGetCommissionRate() {
//       Employee sup = new Employee("Jamie", new BigDecimal("200000"), null);
//       SalesPerson a = new SalesPerson("Jane", new BigDecimal("1600"), sup, 1.4);
//       assertEquals(a.getCommissionRate(), 1.4, 0.00001);
//    }
//  
//}
// 4º Prueba
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//import java.util.*;
//
//public class InterfaceTesting {
// 
//
//    @Test
//    public void Player_shouldBe_instanceOfMoveable() {
//        Player a = new Player();
//        assertTrue(a instanceof Moveable);
//    }
//
//    @Test
//    public void Enemy_shouldBe_instanceOfMoveable() {
//        Enemy a = new Enemy();
//        assertTrue(a instanceof Moveable);
//    }
//
//     @Test
//    public void increaseSpeed_should_existInInterface(){
//        try {
//          Moveable.class.getMethod("increaseSpeed");
//        } catch (NoSuchMethodException e) {
//          fail("increaseSpeed() does not exist on the Moveable interface");
//        }
//        
//    }
//  
//  @Test
//    public void decreaseSpeed_should_existInInterface(){
//        try {
//          Moveable.class.getMethod("decreaseSpeed");
//        } catch (NoSuchMethodException e) {
//          fail("decreaseSpeed() does not exist on the Moveable interface");
//        }
//        
//    }
//  
//  @Test
//    public void moveLeft_should_existInInterface(){
//        try {
//          Moveable.class.getMethod("moveLeft");
//        } catch (NoSuchMethodException e) {
//          fail("moveLeft() does not exist on the Moveable interface");
//        }
//        
//    }
//  
//  @Test
//    public void moveRight_should_existInInterface(){
//        try {
//          Moveable.class.getMethod("moveRight");
//        } catch (NoSuchMethodException e) {
//          fail("moveRight() does not exist on the Moveable interface");
//        }
//        
//    }
//
//}



public class Pruebas {

}
