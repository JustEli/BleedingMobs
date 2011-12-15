/*
 * BleedingMobs - make your monsters and players bleed
 * Copyright (C) 2011  snowleo
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package my.bukkit.plugins.bleedingmobs;

import org.bukkit.World;
import org.bukkit.plugin.Plugin;


public interface IBleedingMobs extends Plugin
{
	ParticleStorage getStorage();

	boolean isWorldEnabled(World world);
	
	boolean isSpawning();
	
	void setSpawning(boolean set);
}
