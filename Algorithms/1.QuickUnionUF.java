/*
class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
*/

/*
import java.util.Scanner;

class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public static void main(String[] args) {
        greetUser();

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Elements: ");
        int n = input.nextInt();

        QuickUnionUF uf = new QuickUnionUF(n);

        while (true) {
            System.out.println("\nChoose An Operation: ");
            System.out.println("1. Union");
            System.out.println("2. Connected");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            int choice = input.nextInt();

            if (choice == 3) break;

            System.out.print("Enter Two Elements (Separated By Space, 0 To " + (n - 1) + "): ");
            int p = input.nextInt();
            int q = input.nextInt();

            if (p < 0 || p >= n || q < 0 || q >= n) {
                System.out.println("Invalid Input! Please Enter Numbers Between 0 And " + (n - 1));
                continue;
            }

            if (choice == 1) {
                uf.union(p, q);
                System.out.println("Connected " + p + " And " + q);
            } else if (choice == 2) {
                if (uf.connected(p, q)) {
                    System.out.println(p + " And " + q + " Are Connected.");
                } else {
                    System.out.println(p + " And " + q + " Are Not Connected.");
                }
            }
        }

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close();
    }

    public static void greetUser() {
        System.out.println(">>>> Welcome To The Quick Union Algorithm <<<<");
    }
}
*/

import java.util.Scanner;

class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i != j) {
            id[i] = j;
            System.out.println("Connected " + p + " And " + q);
        } else {
            System.out.println(p + " And " + q + " Are Already Connected.");
        }
        printTree(); // Print tree after every union
    }

    public void printTree() {
        System.out.print("Tree Structure: ");
        for (int i = 0; i < id.length; i++) {
            System.out.print(i + "->" + id[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        greetUser();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number Of Elements: ");
        int n = input.nextInt();

        QuickUnionUF uf = new QuickUnionUF(n);

        while (true) {
            System.out.println("\nChoose An Operation: ");
            System.out.println("1. Union");
            System.out.println("2. Connected");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            int choice = input.nextInt();

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter Two Elements (Separated By Space, 0 To " + (n - 1) + "): ");
            int p = input.nextInt();
            int q = input.nextInt();

            if (p < 0 || p >= n || q < 0 || q >= n) {
                System.out.println("Invalid Input. Try Again.");
                continue;
            }

            if (choice == 1) {
                uf.union(p, q);
            } else if (choice == 2) {
                if (uf.connected(p, q)) {
                    System.out.println(p + " And " + q + " Are Connected.");
                } else {
                    System.out.println(p + " And " + q + " Are Not Connected.");
                }
            } else {
                System.out.println("Invalid Choice. Try Again.");
            }
        }

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");
        input.close();

    }
    public static void greetUser() {
        System.out.println(">>>> Welcome To The Quick Union Algorithm <<<<");
    }
}

