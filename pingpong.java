class pingpong
{
static Boolean isping=true;
public static void main(String[] args)
{
pingpong p=new pingpong();
Thread printping=new Thread(
new Runnable{
run()
{
while(true)
{
p.printping();
}
}
}
);
Thread printpong=new Thread(new Runnable
{
run()
{
while(true)
{
p.printpong();
}
}
}
);
printping.start();
printpong.start();
}
synchronized void printping()
{
if(isPingOn)
{
System.out.println("Pong");
isPongOn=false;
}
else
{
try()
{
Thread.sleep(500);
}
catch(Exception e)
{
System.out.println("The code consists of errors);

}
