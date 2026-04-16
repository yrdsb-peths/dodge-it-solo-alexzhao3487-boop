import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mergeconflictertester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mergeconflictertester extends SadFace
{
    /**
     * Act - do whatever the mergeconflictertester wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean atTop = true;
    
    public void act()
    {
        if(Greenfoot.mouseClicked(null)) {
            atTop = !atTop;
        }
        
        if(atTop) {
            setLocation(200, 100);
        }
        else {
            setLocation(200, 300);
        }
    }
}
