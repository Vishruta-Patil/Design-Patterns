package solid.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */


interface Resource {
    int findFreeSlot () {};
    void markSlotBusy (int resourceId) {};
    void markSlotFree (int resourceId) {};
}

class TimeResource implements resource {
    public int findFreeSlot () {return 0;}
    public void markSlotBusy (int resourceId) {}
    public void markSlotFree (int resourceId) {}
}


class SpaceResource implements resource {
    public int findFreeSlot () {return 0;}
    public void markSlotBusy (int resourceId) {}
    public void markSlotFree (int resourceId) {}
}

public class ResourceAllocator {
    int resourceId;
    public int allocate(Resource resource) {
        int resourceId = resource.findFreeSlot();
        resource.markSlotBusy(resourceId);
        return resourceId;
    }
    public void free(Resource resource, int resourceId) {
        resource.markTimeSlotFree(resourceId);
    }
}


// Question: 

// public class ResourceAllocator {
//     final static private int INVALID_RESOURCE_ID = -1;

//     public int allocate(ResourceType resourceType) {
//         int resourceId;
//         switch (resourceType) {
//             case TIME_SLOT:
//                 resourceId = findFreeTimeSlot();
//                 markTimeSlotBusy(resourceId);
//                 break;
//             case SPACE_SLOT:
//                 resourceId = findFreeSpaceSlot();
//                 markSpaceSlotBusy(resourceId);
//                 break;
//             default:
//                 System.out.println("ERROR: Attempted to allocate invalid resource");
//                 resourceId = INVALID_RESOURCE_ID;
//                 break;
//         }
//         return resourceId;
//     }

//     public void free(ResourceType resourceType, int resourceId) {
//         switch (resourceType) {
//             case TIME_SLOT:
//                 markTimeSlotFree(resourceId);
//                 break;
//             case SPACE_SLOT:
//                 markSpaceSlotFree(resourceId);
//                 break;

//             default:
//                 System.out.println("ERROR: attempted to free invalid resource");
//                 break;
//         }
//     }


//     private void markTimeSlotFree(int resourceId) {
//     }
    
//     private void markSpaceSlotFree(int resourceId) {
//     }

//     private void markSpaceSlotBusy(int resourceId) {
//     }

//     private int findFreeSpaceSlot() {
//         return 0;
//     }

//     private void markTimeSlotBusy(int resourceId) {
//     }

//     private int findFreeTimeSlot() {
//         return 0;
//     }
// }
