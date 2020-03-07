package io.github.svagtlys.drystan.models;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class CombatEntity extends AbstractEntity{

    @NotBlank(message="Creature must have non-blank identifier.")
    private String identifier; //what's it called

    @Min(0)
    private int currentHealth;

    @Min(1)
    private int maxHealth;

    @Min(0)
    private int tempHealth;

    private int armorClass;

    private int speed;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getTempHealth() {
        return tempHealth;
    }

    public void setTempHealth(int tempHealth) {
        this.tempHealth = tempHealth;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
