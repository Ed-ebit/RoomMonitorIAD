package de.iad.ef.model;

public class TestAppSuite {
    static class BasicCounterTest {
        class Tester extends BasicCounter{

            public Tester(){

                super();//Konstruktoraufruf in der Basisklasse
            }
            public Tester(Integer initVal){

                super(initVal);
            }
            @Override
            protected void setCount(Integer count) {

                super.setCount(count);
            }
            @Override
            public void reset() {

                super.reset();
            }

            @Override
            public Integer currentCount() {

                return super.currentCount();
            }
        }

        public static void main(String[] args) {

    /*        BasicCounter counter = new BasicCounter() {
                @Override
                protected void setCount(Integer count) {
                    super.setCount(count);
                }

                @Override
                protected void count() {
                    super.count();
                }

                @Override
                protected void uncount() {
                    super.uncount();
                }

                @Override
                public Integer currentCount() {
                    return super.currentCount();
                }

                @Override
                public void reset() {
                    super.reset();
                }
            }
                }*/
            BasicCounterTest testUmgebung = new BasicCounterTest();
            // Erster Test StandardKonstruktor
            testStandardKonstruktor(testUmgebung);
            testParameterKonstruktor(testUmgebung);
            testSetundReset(testUmgebung);


        }

        private static void testSetundReset(BasicCounterTest testUmgebung) {
            Tester tester = testUmgebung.new Tester(42);// nur in Java, Sonderfall. Klasse in Klasse oder so
            System.out.println(" Test Std Konstruktor erwartet 42 und geliefert wird 42" +
                    (tester.currentCount()== 42 ? " ok":" Fehler"));
            tester.setCount(4711);
            System.out.println(" Test Set Count auf 4711 erwartet und geliefert wird 4711" +
                    (tester.currentCount()== 4711 ? " ok":" Fehler"));
            tester.reset();
            System.out.println(" Test Reset auf 42 erwartet und geliefert wird 42" +
                    (tester.currentCount()== 42 ? " ok":" Fehler"));
        }

        private static void testParameterKonstruktor(BasicCounterTest testUmgebung) {
            Tester tester = testUmgebung.new Tester(4711);// nur in Java, Sonderfall. Klasse in Klasse oder so
            System.out.println(" Test Std Konstruktor erwartet 0 und geliefert wird 0" +
                    (tester.currentCount()== 4711 ? " ok":" Fehler"));
        }

        private static void testStandardKonstruktor(BasicCounterTest testUmgebung) {
            Tester tester = testUmgebung.new Tester();// nur in Java, Sonderfall. Klasse in Klasse oder so
            System.out.println(" Test Std Konstruktor erwartet 0 und geliefert wird 0" +
                    (tester.currentCount()==0 ? " ok":"Fehler"));
        }
    }
}
