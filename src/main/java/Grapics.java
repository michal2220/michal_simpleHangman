public class Grapics {

    GameBackbone gameBackbone;
    boolean looser = false;

    public Grapics(GameBackbone gameBackbone) {
        this.gameBackbone = gameBackbone;

    }

    public boolean paint(int counter) {
        if (counter==1) {
            System.out.println("""
                    
                    
                    
                    
                    
                    
                    ___|___
                    """);
        } if (counter==2) {
            System.out.println("""
                       
                       |
                       |
                       |
                       |
                       |
                    ___|___
                    """);
        }
        if (counter==3) {
            System.out.println("""
                       _______
                       |
                       |
                       |
                       |
                       |
                    ___|___
                    """);
        }
        if (counter==4) {
            System.out.println("""
                       _______
                       |     |
                       |
                       |
                       |
                       |
                    ___|___
                    """);
        }
        if (counter==5) {
            System.out.println("""
                       _______
                       |     |
                       |     0
                       |    /|\\
                       |
                       |
                    ___|___
                    """);
        }
        if (counter==6) {
            System.out.println("""
                       _______
                       |     |
                       |     0
                       |    /|\\
                       |     |
                       |    / \\
                    ___|___
                             """);
            System.out.println("Przegrana!");
            looser = true;
        }
        return looser;
    }
}
