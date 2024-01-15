package ExercisesToMethods;
public class barkingDog {
    public static void main(String[] args) {
        
    }

    public static boolean shouldWakeUp(boolean IsBarking, int hourOfDay ){
        Boolean WhatToDo=false;
        if (hourOfDay>23 || hourOfDay<0){
            WhatToDo=false;
        }else{
            if ((IsBarking && hourOfDay <8) || (IsBarking && hourOfDay >22)){
                WhatToDo=true;
            }
        }
        return WhatToDo;
}
}
