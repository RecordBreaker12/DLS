package dlfs;


public class DLFS {

        
    public static void main(String[] args) {
        Node n1 = new Node("Arad");
        Node n2 = new Node("Zerind");
        Node n3 = new Node("Sibui");
        Node n4 = new Node("Timisoara");
        Node n5 = new Node("Oradea");
        Node n6 = new Node("Fagaras");
        Node n7 = new Node("Rimnicu Vilcea");
        Node n8 = new Node("Lugoj");
        Node n9 = new Node("Bucharest");
        Node n10 = new Node("Craiova");
        Node n11 = new Node("Pitesti");
        Node n12 = new Node("Mehadia");
        Node n13 = new Node("Giurgiu");
        Node n14 = new Node("Urziceni");
        Node n15 = new Node("Dobreta");
        Node n16 = new Node("Vaslui");
        Node n17 = new Node("Hirsova");
        Node n18 = new Node("Iasi");
        Node n19 = new Node("Eforie");
        Node n20 = new Node("Neamt");
        //Arad
        n1.adj.add(n2);
        n1.adj.add(n3);
        n1.adj.add(n4);
        //Zerind
        n2.adj.add(n1);
        n2.adj.add(n5);
        //Sibui
        n3.adj.add(n1);
        n3.adj.add(n5);
        n3.adj.add(n6);
        n3.adj.add(n7);
        //Timisoara
        n4.adj.add(n1);
        n4.adj.add(n8);
        //Oradea
        n5.adj.add(n2);
        n5.adj.add(n3);
        //Fagaras
        n6.adj.add(n2);
        n6.adj.add(n9);
        //Rimnicu Vilcea
        n7.adj.add(n2);
        n7.adj.add(n10);
        n7.adj.add(n11);
        //Lugoj
        n8.adj.add(n4);
        n8.adj.add(n12);
        //Bucharest
        n9.adj.add(n6);
        n9.adj.add(n11);
        n9.adj.add(n13);
        n9.adj.add(n14);
        //Craiova
        n10.adj.add(n7);
        n10.adj.add(n11);
        n10.adj.add(n15);
        //Pitesti
        n11.adj.add(n7);
        n11.adj.add(n9);
        n11.adj.add(n10);
        //Mehadia
        n12.adj.add(n8);
        n12.adj.add(n15);
        //Giurgiu
        n13.adj.add(n9);
        //Urziceni
        n14.adj.add(n9);
        n14.adj.add(n16);
        n14.adj.add(n17);
        //Dobreta
        n15.adj.add(n10);
        n15.adj.add(n12);
        //Vaslui
        n16.adj.add(n14);
        n16.adj.add(n18);
        //Hirsova
        n17.adj.add(n14);
        n17.adj.add(n19);
        //Iasi
        n18.adj.add(n16);
        n18.adj.add(n20);
        //Eforie
        n19.adj.add(n17);
        //Neamt
        n20.adj.add(n18);
        Grafo grafo = new Grafo(n1, n9);
        grafo.execute();
    }
    
}
