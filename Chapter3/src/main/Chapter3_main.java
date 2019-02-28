/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import chapter3.A;
import chapter3.ArithmeticMethods;
import chapter3.ArithmeticMethods2;
import chapter3.BankAccount;
import chapter3.Card;
import chapter3.CarlysEventPriceWithMethods;
import chapter3.Event;
import chapter3.EventDemo;
import chapter3.GasPrices;
import chapter3.MetricConversion;
import chapter3.PaintCalculator;
import chapter3.Percentages;
import chapter3.Percenteges2;
import java.util.Scanner;
import chapter3.Insurance;
import chapter3.Interest;
import chapter3.MyCharacter;
import chapter3.Painting;
import chapter3.PickTwoCards;
import chapter3.Rental;
import chapter3.Salary;
import chapter3.SammysRentalPriceWithMethods;
import chapter3.Sandwich;
import chapter3.ShowStudent;
import chapter3.ShowStudent2;
import chapter3.Student;
import chapter3.TestBankAccount;
import chapter3.TestPainting;
import chapter3.TestSandwich;
import chapter3.TwoCharacters;
//import chapter3.Excercise_one;
/**
 *
 * @author Victor
 */
public class Chapter3_main {
     public static void main(String[] args){
        A obA = new A();
        //No permite realizarlo directo porque es privado
        //obA.b=12;
        //es permitido porque es publico
        obA.setC((Integer) 5);
        obA.setD((Integer) 23);
        //No permite realizarlo directo porque es privado
        //A.b = 4;
        //no puede ser referenciada desde un contexto static
        //A.c = 33;
        A.setD((Integer) 99);
        System.out.println("\tEjercicio 2");
        System.out.println("obA.c=5; es permitido por el metodo set porque no es privado\nobA.d=23; pasa lo mismo");
        System.out.println("ClassA.c=33; es permitido con el metodo set\nClassA.d=99; es permitido si se usa el metodo set");
        System.out.println(A.getD());
        System.out.println(obA.getD());
        System.out.println(obA.getC());
        System.out.println("\tArithmeticMethods");
        ArithmeticMethods ar=new  ArithmeticMethods();
        System.out.println(ar.displayNumberPlus10(13));
        System.out.println(ar.displayNumberPlus100(13));
        System.out.println(ar.displayNumberPlus1000(13));
        System.out.println("\tArithmeticMethods2");
        ArithmeticMethods2 ari = new ArithmeticMethods2();
        System.out.println(ari.displayNumberPlus10(13, 5));
        System.out.println(ari.displayNumberPlus100(13, 5));
        System.out.println(ari.displayNumberPlus1000(13,5));
        System.out.println("\tPercentages");
        Percentages pr = new Percentages(2.0,5.0);
        System.out.println(pr.toString());
        Percentages pr2 = new Percentages(5.0,2.0);
        System.out.println(pr2.toString());
        System.out.println("\tPercenteges2");
        Percenteges2 p2 = new Percenteges2(3.0,5.0);
        System.out.println(p2.toString());
        System.out.println("\tGasPrices");
        Integer a1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("¡Ingrese la cantidad del precio de la gasolina por galon!: ");
        a1=entrada.nextInt();
        GasPrices gp = new GasPrices(a1);
        System.out.println(gp);
        System.out.println("\tMetricConversion");
        Integer a2;
        System.out.println("Ingrese un numero para convertir a centímetros y litros");
        a2=entrada.nextInt();
        MetricConversion mt = new MetricConversion(a2);
        System.out.println(mt);
        System.out.println("\tPaintCalculator");
        PaintCalculator x = new PaintCalculator(9,15,20);
        System.out.println(x.costo());
        System.out.println("\tInsurance");
        Integer b1,b2;
        System.out.println("¡Ingrese el año actual!:");
        b1=entrada.nextInt();
        System.out.println("¡Ingrese su año de nacimiento!:");
        b2=entrada.nextInt();
        Insurance ins = new Insurance(b1,b2);
        System.out.println(ins);
        System.out.println("\tSalary");
        Integer c1,c2,c3;
        System.out.println("Ingrese la tarifa de pago semanal: ");
        c1=entrada.nextInt();
        System.out.println("Ingrese las horas regulares que trabajó en la semana:");
        c2=entrada.nextInt();
        System.out.println("Ingrese las horas extra: ");
        c3=entrada.nextInt();
        Salary sa=new Salary(c1,c2,c3);
        System.out.println(sa);
        System.out.println("\tInterest");
        Interest inter = new Interest(10000);
        System.out.println(inter);
        System.out.println("\tSandwich");
        Scanner ent = new Scanner(System.in);
        String s,r;
        System.out.println("Ingrese el ingrediente");
        s=ent.nextLine();
        System.out.println("Ingrese el tipo de pan");
        r=ent.nextLine();
        Double i;
        System.out.println("Ingrese precio");
        i=ent.nextDouble();
        Sandwich san=new Sandwich(s,r,i);
        System.out.println(san);
        System.out.println("\tTestSandwich");
        TestSandwich tg = new TestSandwich(san);
        System.out.println("Uso del get");
        System.out.println(tg.getSand());
        System.out.println("Uso del set");
        //al Objeto tg le asignamos nuevos valores de un nuevo objeto san2
        Sandwich san2=new Sandwich("Quesillo","Blanco",45.3);
        tg.setSand(san2);
        System.out.println(tg.getSand());
         System.out.println("\tStudent, ShowStudent y ShowStudent2");
        //Inciso b
        Student sn=new Student(23,2,20);
        ShowStudent std = new ShowStudent(sn);
        System.out.println(std.getStud());
        //Instanciando Student con el constructor definido que pide el inciso c
        Student sn2 = new Student();
        ShowStudent2 std2=new ShowStudent2(sn2);
        System.out.println(std2.getShow2());
        System.out.println("\tBankAccount & TestBankAccount");
        BankAccount ban1=new BankAccount(3123,"Karimnot",13832);
       BankAccount ban2=new BankAccount(3423,"Victor",123);
       BankAccount ban3=new BankAccount(12342,"Manuel",321);
       BankAccount ban4=new BankAccount();
       TestBankAccount tst = new TestBankAccount(ban1);
       TestBankAccount tst2 = new TestBankAccount(ban2);
       TestBankAccount tst3 = new TestBankAccount(ban3);
       TestBankAccount tst4 = new TestBankAccount(ban4);
       System.out.println(tst);
       System.out.println(tst2);
       System.out.println(tst3);
       System.out.println(tst4);
       System.out.println("\tPainting & TestPainting");
       Painting paint1 = new Painting("Mona Lisa","Da Vinci","Agua",50.0);
       Painting paint2 = new Painting("Fuerte hermosura","Calamardo","Agua",50.0);
       Painting paint3 = new Painting();
       TestPainting tpaint1 = new TestPainting(paint1);
       TestPainting tpaint2 = new TestPainting(paint2);
       TestPainting tpaint3 = new TestPainting(paint3);
       System.out.println(tpaint1);
       System.out.println(tpaint2);
       System.out.println(tpaint3);
       System.out.println("\tCard & PickTwoCards");
       Card cart = new Card();
       Card cart2 = new Card();
       PickTwoCards p = new PickTwoCards(cart);
       PickTwoCards p22 = new PickTwoCards(cart2);
       System.out.println(p);
       System.out.println(p22);
       System.out.println("\tMyCharacter & TwoCharacters");
       MyCharacter chara =new MyCharacter("Blanco","Mago",2,3);
       TwoCharacters twch=new TwoCharacters(chara);
       System.out.println(twch);
       System.out.println("\tCarlysEventPriceWithMethods");
       System.out.println(CarlysEventPriceWithMethods.mensaje());
       System.out.println(CarlysEventPriceWithMethods.calculate());
       System.out.println("\tEvent & EventDemo");
       Integer b;
       b=CarlysEventPriceWithMethods.invitados();
       String str,srtt;
       str=CarlysEventPriceWithMethods.num_Event();
       Event ev = new Event(str,b);
       srtt=CarlysEventPriceWithMethods.mensaje();
       EventDemo evd = new EventDemo(ev,srtt);
       System.out.println(evd);
       System.out.println("\tRental & SammysRentalPriceWithMethods");
       SammysRentalPriceWithMethods samys = new SammysRentalPriceWithMethods(120);
       Rental rent = new Rental(samys);
       System.out.println(rent);
       
       
       
    }
}
