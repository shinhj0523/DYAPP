package kr.hs.dukyoung.dyap.schedule.model.schedule;

import java.util.HashMap;

public class ScheduleManager {

    private static ScheduleManager instance = null;

    private HashMap<Integer, Schedule> scheduleList = new HashMap<>();

    private ScheduleManager() {

    }

    public static ScheduleManager getInstance() {
        if(instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public int addInstance(int month, int day, String menus) {
        if(!menus.equals("")) {
            scheduleList.put(day, new Schedule(month, day, menus));
        }
        return day;
    }

    public Schedule getScheduleByDay(int day) {
        if(!scheduleList.containsKey(day)) {
            return null;
        }
        return scheduleList.get(day);
    }

    public void wipeList() {
        scheduleList.clear();
    }
}
