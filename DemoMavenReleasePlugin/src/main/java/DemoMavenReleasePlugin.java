public class DemoMavenReleasePlugin {
    public static void main(String args[]){

        System.out.println("Hello Explorer");
        System.out.println();
        System.out.println("This progrm is running version : "+
                DemoMavenReleasePlugin.class.getPackage().getImplementationVersion());

    }
}
