package ch.studer;



public class DemoMavenReleasePlugin {
    public static void main(String args[]){

        System.out.println("Hello Explorer");
        System.out.println();
        System.out.println();
        System.out.println("This program is running version : "+
                DemoMavenReleasePlugin.class.getPackage().getImplementationVersion());

        System.out.println("mvn package   ==> build  ==> in \\target");
        System.out.println("mvn release:prepare   ==> release and push to github");
        System.out.println("mvn release:perform   ==> get the release from github an put it to \\target\\checkout\\AppName\\target\\");

    }
}
