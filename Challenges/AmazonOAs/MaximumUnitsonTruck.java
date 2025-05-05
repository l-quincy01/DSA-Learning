package AmazonOAs;

public class MaximumUnitsonTruck {

    int truckSizeLeft = truckSize;
    int unitCount = 0;


for(int i = 0 ; i < boxTypes.length; i++){

    int numOfBoxes = boxTypes[i][0] ;
    int numOfUnits = numOfBoxes *  boxTypes[i][1] ;

    truckSizeLeft = truckSizeLeft - numOfBoxes; // remove num of boxes from truck capacity
    unitCount = (numOfBoxes * numOfUnits) ;

    // if( truckSizeLeft > 0){
    //     unitCount = numOfBoxes * numOfUnits ;
    // }


    }

    return unitCount ;
    
}
