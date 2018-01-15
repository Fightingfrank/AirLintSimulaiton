package japrc2017;


public interface IPlane
{
   
    /** 
     * Returns the callsign of the plane.
     * 
     * @return the callsign of the plane
     */
    public String getName();
           
    /** 
     * Returns the current grid location of the plane
     * 
     * @return the grid location of the plane
     */
    public GridLocation getLocation();
        
    /** 
     * Returns the source airport (the airport that the plane took off from)
     * 
     * @return the source of the plane
     */
    public IAirport getOrigin();
    
    /** 
     * Returns the current destination airport for the plane
     * 
     * @return the destination of the plane
     */
    public IAirport getDestination();
        
    /** 
     * Sets the speed multiplier of the plane.
     * 
     * @param multiplier the new speed of the simulation
     * @throws SimulationException if an invalid speed is entered
     */
    public void setSpeed(double multiplier);    
   
    /** 
     * Tells the plane that one tick of simulation time has passed
     * 
     */
    public void tick();

    
    
}
