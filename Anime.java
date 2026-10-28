package estudos.ModificadoresEstaticos;

public class Anime {
    private String name;
    private static int[] ep;

    static {
        ep = new int[100];
        for (int i = 0; i < ep.length; i++) {
            ep[i] = i;
        }
        for (int j = 0; j < ep.length; j++) {
            System.out.print(ep[j] + " ");
        }
        System.out.println(" ");

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEp(int[] ep) {
        this.ep = ep;
    }

    public String getName() {
        return name;
    }

    public int[] getEp() {
        return ep;
    }
}
