/**
 * Copyright (C) 2010-2014 Leon Blakey <lord.quackstar at gmail.com>
 *
 * This file is part of PircBotX.
 *
 * PircBotX is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * PircBotX is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * PircBotX. If not, see <http://www.gnu.org/licenses/>.
 */
package org.pircbotx.delay;

import static com.google.common.base.Preconditions.checkArgument;

public class StaticReadonlyDelay implements Delay {
	
	private long delay;
	
	public StaticReadonlyDelay( long delay) {
		checkArgument(delay >= 0, "Delay may not be negative");
		
		this.delay = delay;
	}
	

	@Override
	public long getDelay() {
		return delay;
	}
	
}
