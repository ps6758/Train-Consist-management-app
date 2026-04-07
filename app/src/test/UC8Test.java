package test;

import main.UC8;
import main.Bogie;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UC8Test{

    private List<Bogie> getSampleBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 60));
        list.add(new Bogie("First Class", 24));
        return list;
    }

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> result = UseCase8TrainConsistMgmt.filterBogies(getSampleBogies(), 70);
        assertEquals(1, result.size());
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> result = UseCase8TrainConsistMgmt.filterBogies(getSampleBogies(), 60);
        assertFalse(result.stream().anyMatch(b -> b.capacity == 60));
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> result = UseCase8TrainConsistMgmt.filterBogies(getSampleBogies(), 100);
        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> result = UseCase8TrainConsistMgmt.filterBogies(getSampleBogies(), 10);
        assertEquals(3, result.size());
    }

    @Test
    void testFilter_EmptyBogieList() {
        List<Bogie> result = UseCase8TrainConsistMgmt.filterBogies(new ArrayList<>(), 50);
        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();
        UseCase8TrainConsistMgmt.filterBogies(original, 60);
        assertEquals(3, original.size());
    }
}