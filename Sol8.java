package sol8;
public class Sol8 {
    public static void main(String[] args) {
            double high;
            double base;
            double corner;
            double areaRecNor= RecNor(10,7);//base,hight
            double areaRecConner= RecConner(7);//corner
            double areaRecHigh = RecHigh(12,8);//base,corner
            double areaRecCon90 = RecCon90(5);//corner
            
            System.out.println("areaRecNor : "+areaRecNor);
            System.out.println("areaRecCon : "+areaRecConner);
            System.out.println("areaRecHigh : "+areaRecHigh);
            System.out.println("areaRecCon90 : "+areaRecCon90);
            /*  areaRecNor : 35.0
                areaRecCon : 21.217622392718745
                areaRecHigh : 31.74901573277509
                areaRecCon90 : 25.0
            */
    }
    
    public static double RecNor(double base,double hight){
        return (0.5*(base*hight));
    }
    public static double RecConner(double corner){
        return (Math.sqrt(3)/4)*corner*corner;
    }
    public static double RecHigh(double base,double corner){
        return ((base/4)*Math.sqrt(4*(corner*corner)-(base*base)));
    }
    public static double RecCon90(double corner){
        return (corner*corner);
    }     
}
