package com.conway.replace;

import java.util.Collection;

import com.conway.values.Coordinates;
import com.conway.values.Outcome;
import com.conway.values.Point;
import com.conway.values.World;

public class ReplacesCell {

  GathersNeighbors gathersNeighbors = new GathersNeighbors();
  DeterminesNextContents determinesNextContents = new DeterminesNextContents(); 
  
  public Outcome replace(World world, Coordinates coordinates) {
    Collection<Point> neighbors = gathersNeighbors.gather(world, coordinates);
    return new Outcome(determinesNextContents.determine(world.at(coordinates), neighbors), neighbors);
  }

}
