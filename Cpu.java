public class Cpu{
    int price=10000;
    class processor{
        int no_of_cores=2;
        String pmanufacturer="micro";
        static class RAM{
            int memory=500;
            String rmanufacturer="hema";
        }

    }

  public static void main(String args[])
    {
        Cpu obj= new Cpu();
        Cpu.processor myobj1=obj.new processor();
        processor.RAM myobj2= new processor.RAM();

        System.out.println("Ram Details : \nMemory:"+myobj2.memory+"\nManufacturer:"+myobj2.rmanufacturer);
        System.out.println("Processor details : \nnumber of cores : "+myobj1.no_of_cores+"\nManufacturer : "+myobj1.pmanufacturer);

    }
}
