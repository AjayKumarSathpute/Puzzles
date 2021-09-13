










/*abstract class A
{
abstract void m1(); abstract void m2(); abstract void m3();
}
abstract class B extends A
{
void m1() { -----------} 
abstract void m4();
}
class C {    void m2() {}   void m3() {} void m4() {} 
}*/


//There are 3 types of classes:
//1. Concerte class or simply class... 2. Abstract class 3. Wrapper class
//Abstract class: 
abstract class AA
{
//abstract AA()   // abstract constructor in abstract class
void mA() //concrete method simply called as method 
{
System.out.println(" mA method of AA class");
}
abstract void m1();
 abstract void m2();
abstract void m4(); 
}
class AB extends AA
{
/*AA() // super class abstract constructor is implemented in its sub class
{
System.out.println(" AA constructor of AA class");
}*/
void m1()
{
System.out.println("m1 method of A class");
}
void m2()
{
System.out.println("m2 method of A class");
}
void m3()
{
System.out.println("mB() method of B class");
}
}

class AbsCls
{
public static void main(String args[])
{
AA obj1=new AB();//srso
obj1.mA();   obj1.m1();  obj1.m2();
AB obj2=new AB();
obj2.m3();
//obj2.m4();
}
}
//1. function prototype(declaration)
//prototype ex: void add(int,int);
//2. function definition(body of the function)
// void add(int x,int y) {  -----}
//3. function call           add(10,20);


