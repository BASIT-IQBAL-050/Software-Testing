
class Triangle {
    
    int angle1, angle2, angle3;
    
    
    public int getAngle1() {
        return angle1;
    }

    public int getAngle2() {
        return angle2;
    }

    public int getAngle3() {
        return angle3;
    }

    public void setAngle1(int angle1) {
        this.angle1 = angle1;
    }

    public void setAngle2(int angle2) {
        this.angle2 = angle2;
    }

    public void setAngle3(int angle3) {
        this.angle3 = angle3;
    }
    
    public void calculateThirdAngle(){
        if(isValidInput()){
            setAngle3(180 - (getAngle1()+ getAngle2()));            
        }
        
    }
    
    public String typeOfTriangle(){
        String type="";
        if(getAngle1()!=0 && getAngle2()!=0 && getAngle3()!=0){
            if(getAngle1() == 60 && getAngle2() ==60 && getAngle3()==60){
                type = "Equilateral Triangel";
                
            }
            else if(getAngle1() == getAngle2() || getAngle2()== getAngle3() || getAngle1()== getAngle3()){
                type="Isoceles Traingle";
                
            }
            else{
                type = "Scalene Triangle ";
            }
        }
        else{
            System.out.println("Type of triangle can not be specified with invalid inputs");   
        }
        
        return type;
    }
    
    public boolean isValidInput(){
        if(getAngle1()<=0|| getAngle2()<=0){
            System.out.println("Angles Can not be less then zero");
            return false;
        }
        else if(getAngle1()>=180 || getAngle2()>=180){
            System.out.println("Angle can not be greater then 180");
            return false;
        }
        else if(getAngle1() + getAngle2() >= 180){
            System.out.println("Values of Angles are very high Triangle can not be formed");
            return false;
        }
        return true;
    }
    
}
