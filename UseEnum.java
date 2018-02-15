
    enum Houses {
        BHK1(9000),BHK2(20000), BHK3(50000);
        private int price;

        Houses(int p) {
            price = p;
        }

        int getPrice() {
            return price;
        }
    }

        public class UseEnum{
            public static void main(String[] args){
                System.out.println("All Houses prices:");
                for (Houses h : Houses.values()){
                    System.out.println(h + " costs " + h.getPrice() + " thousand.");
                }
            }
        }

