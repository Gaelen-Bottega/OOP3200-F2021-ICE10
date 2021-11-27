package ca.durhamcollege;

import java.util.Random;

public class RandomVector
{
    public static Vector2D createVector2D(Vector2D start, Vector2D end)
    {
        Random rand = new Random();

        // Generate random X value
        float minX = Math.min(start.getX(), end.getX());
        float maxX = Math.max(start.getX(), end.getX());

        float randomX = (rand.nextFloat() * maxX) + minX;

        // Generate random Y value
        float minY = Math.min(start.getY(), end.getY());
        float maxY = Math.max(start.getY(), end.getY());

        float randomY = (rand.nextFloat() * maxY) + minY;

        return new Vector2D(randomX, randomY);

    }
}
