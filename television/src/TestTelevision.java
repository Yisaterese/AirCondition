import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTelevision {
    @Test
    public void testTelevisionIsOff_televisionIsOff(){
        Television tv = new Television();
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        tv.isOff();
        assertFalse(tv.isPoweredOn());
    }
    @Test
    public void testTelevisionIsOn_televisionIsOn(){
        Television tv = new Television();
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        tv.isOff();
        assertFalse(tv.isPoweredOn());
        assertTrue(tv.toggleSwitch());
    }

    @Test
    public void testTelevisionCanAddVolume_televisionCanAddVolume(){
        Television tv = new Television();
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        assertEquals(2,tv.addVolume(2));
    }

    @Test
    public void testTelevisionCanAddChannels_televisionCanAddChannels(){
        Television tv = new Television();
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        assertEquals(2,tv.addVolume(2));
        tv.subScribeChannels("superSport");
        assertEquals(1,tv.numberOfChannelsSubscribed());
    }
    @Test
    public void testTelevisionCanAddManyChannels_televisionCanAddManyChannels(){
        Television tv = new Television();
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        assertEquals(2,tv.addVolume(2));
        tv.subScribeChannels("superSport","Wazobia Tv","NTA","Channels Tv","AIT");
        assertEquals(5,tv.numberOfChannelsSubscribed());
    }

    @Test
    public void testTelevisionCanAddRemoveSomeChannels_televisionCanAddRomeoveSomeChannels(){
        Television tv = new Television();
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        assertEquals(2,tv.addVolume(2));
        tv.subScribeChannels("superSport","Wazobia Tv","NTA","Channels Tv","AIT");
        assertEquals(5,tv.numberOfChannelsSubscribed());
        tv.unsubscribeChannels("superSport","AIT");
        assertEquals(3,tv.numberOfChannelsSubscribed());
    }


}

