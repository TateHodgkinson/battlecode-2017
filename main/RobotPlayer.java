package main;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.RobotController;

/**
 * Created by tate on 13/01/17.
 */
public class RobotPlayer {

    static RobotController rc;


    public static void run(RobotController rc) throws GameActionException {

        // This is the RobotController object. You use it to perform actions from this robot,
        // and to get information on its current status.
        RobotPlayer.rc = rc;

        // Here, we've separated the controls into a different method for each RobotType.
        // You can add the missing ones or rewrite this into your own control structure.
        switch (rc.getType()) {
            case ARCHON:
                Archon.loop();
                break;
            case GARDENER:
                Gardener.loop();
                break;
            case SOLDIER:
                Soldier.loop();
                break;
            case LUMBERJACK:
                LumberJack.loop();
                break;
            case SCOUT:
                Scout.loop();
                break;

        }
    }

}
