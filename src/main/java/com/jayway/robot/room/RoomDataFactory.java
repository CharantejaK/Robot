package com.jayway.robot.room;

import java.awt.Point;

import com.jayway.robot.type.RoomType;

public class RoomDataFactory {

	public static Room getRoomByType(RoomType roomType,Point startingPoint, Integer measure) {
		switch (roomType) {
			case CIRCULAR:
				return new CircularRoom(startingPoint, measure);
			case SQUARE:
				return new SquareRoom(startingPoint, measure);
			default:
				return null;
		}
	}
}
