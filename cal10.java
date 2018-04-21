package sol10;
public final class cal {
    
    public static double area(int sqr2Diagonal){
    return (0.5*sqr2Diagonal);//ผลคูณเส้นทแยงมุม
    }
    
    public static double area(int toplus,int high){
    return (0.5*toplus*high);//ผลบวกด้านคู่ขนาน กับ ความสูง
    }
    
    public static double area(double Diagonal,double left){
    return (0.5*Diagonal*left);//เส้นทแยงมุม กับ ผลบวกเส้นกิ่ง
    }
}

