package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task2.Figure.Cube;
import task2.Figure.Cylinder;
import task2.Figure.Sphere;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortedFigureTest {

    @Test
    void sorting() {
        SortedFigure sortedFigure = new SortedFigure();

        Cube cube = new Cube(2);
        Cube cube1 = new Cube(1);
        Cylinder cylinder = new Cylinder(2, 3);
        Cylinder cylinder1 = new Cylinder(1, 9);
        Cylinder cylinder2 = new Cylinder(3, 4);
        Sphere sphere = new Sphere(5);
        Sphere sphere1 = new Sphere(9);

        List<AbilityToCalculateVolume> result = sortedFigure.sorting(new ArrayList<>(List.of(cylinder, cube, sphere, cube1, cylinder1, cylinder2, sphere1)));
        List<AbilityToCalculateVolume> expected = List.of(cube1, cube, cylinder1, cylinder, cylinder2, sphere, sphere1);

        assertEquals(expected, result);
    }

    @Test
    void sortingIfListIsEmpty() {
        SortedFigure sortedFigure = new SortedFigure();

        List<AbilityToCalculateVolume> list = new ArrayList<>();

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            List<AbilityToCalculateVolume> result = sortedFigure.sorting(list);
        });

        Assertions.assertEquals("List cannot be empty", thrown.getMessage());

    }
}