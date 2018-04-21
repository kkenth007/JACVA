package sol10;
public class Sol10 {
public double areaOne;
    public double areatwo;
    public double areathree;
    public static void main(String[] args) {
        Sol10 myArea = new Sol10();
    }
    public Sol10(){//Constructor
        areaOne = cal.area(38);
        areatwo = cal.area(16,8);
        areathree= cal.area(12, 8);
        this.display();
        }
    
    public void display(){
        System.out.println("พื้นที่รูปสี่เหลี่ยม รูปว่าว : "+areaOne);
        System.out.println("พื้นที่รูปสี่เหลี่ยม คางหมู : "+areatwo);
        System.out.println("พื้นที่รูปสี่เหลี่ยม ด้านไม่เท่า : "+areathree);
    }
    
}
