package Control;

import Entity.Entity;

import static GameRunner.BombermanGame.*;

public class Blocked {

    /**
     * Block the downward movement of a mob.
     * @param entity the entity to be blocked.
     * @return true if the entity is blocked.
     */
    public static boolean block_down(Entity entity) {
        return id_objects[entity.getX() / 32][entity.getY() / 32 + 1] == 0;
    }

    /**
     * Block the upward movement of a mob.
     * @param entity the entity to be blocked.
     * @return true if the entity is blocked.
     */
    public static boolean block_up(Entity entity) {
        return id_objects[entity.getX() / 32][entity.getY() / 32 - 1] == 0;
    }

    /**
     * Block the leftward movement of a mob.
     * @param entity the entity to be blocked.
     * @return true if the entity is blocked.
     */
    public static boolean block_left(Entity entity) {
        return id_objects[entity.getX() / 32 - 1][entity.getY() / 32] == 0;
    }

    /**
     * Block the rightward movement of a mob.
     * @param entity the entity to be blocked.
     * @return true if the entity is blocked.
     */
    public static boolean block_right(Entity entity) {
        return id_objects[entity.getX() / 32 + 1][entity.getY() / 32] == 0;
    }

    /**
     * Limit downward range of the bomb.
     * @param entity the current bomb.
     * @param power the current power of the bomb.
     * @return the range of the bomb.
     */
    public static boolean block_down_bomb(Entity entity, int power) {
        return id_objects[entity.getX() / 32][entity.getY() / 32 + 1 + power] == 0
                || id_objects[entity.getX() / 32][entity.getY() / 32 + 1 + power] == 3
                || id_objects[entity.getX() / 32][entity.getY() / 32 + 1 + power] == 6
                || id_objects[entity.getX() / 32][entity.getY() / 32 + 1 + power] == 7
                || id_objects[entity.getX() / 32][entity.getY() / 32 + 1 + power] == 8;
    }

    /**
     * Limit upward range of the bomb.
     * @param entity the current bomb.
     * @param power the current power of the bomb.
     * @return the range of the bomb.
     */
    public static boolean block_up_bomb(Entity entity, int power) {
        return id_objects[entity.getX() / 32][entity.getY() / 32 - 1 - power] == 0
                || id_objects[entity.getX() / 32][entity.getY() / 32 - 1 - power] == 3
                || id_objects[entity.getX() / 32][entity.getY() / 32 - 1 - power] == 6
                || id_objects[entity.getX() / 32][entity.getY() / 32 - 1 - power] == 7
                || id_objects[entity.getX() / 32][entity.getY() / 32 - 1 - power] == 8;
    }

    /**
     * Limit leftward range of the bomb.
     * @param entity the current bomb.
     * @param power the current power of the bomb.
     * @return the range of the bomb.
     */
    public static boolean block_left_bomb(Entity entity, int power) {
        return id_objects[entity.getX() / 32 - 1 - power][entity.getY() / 32] == 0
                || id_objects[entity.getX() / 32 - 1 - power][entity.getY() / 32] == 3
                || id_objects[entity.getX() / 32 - 1 - power][entity.getY() / 32] == 6
                || id_objects[entity.getX() / 32 - 1 - power][entity.getY() / 32] == 7
                || id_objects[entity.getX() / 32 - 1 - power][entity.getY() / 32] == 8;
    }

    /**
     * Limit rightward range of the bomb.
     * @param entity the current bomb.
     * @param power the current power of the bomb.
     * @return the range of the bomb.
     */
    public static boolean block_right_bomb(Entity entity, int power) {
        return id_objects[entity.getX() / 32 + 1 + power][entity.getY() / 32] == 0
                || id_objects[entity.getX() / 32 + 1 + power][entity.getY() / 32] == 3
                || id_objects[entity.getX() / 32 + 1 + power][entity.getY() / 32] == 6
                || id_objects[entity.getX() / 32 + 1 + power][entity.getY() / 32] == 7
                || id_objects[entity.getX() / 32 + 1 + power][entity.getY() / 32] == 8;
    }
}