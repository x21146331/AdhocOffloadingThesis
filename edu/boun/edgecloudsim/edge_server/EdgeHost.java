/*
 * Title:        EdgeCloudSim - EdgeHost
 * 
 * Description: 
 * EdgeHost adds location information over CloudSim's Host class
 *               
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 * Copyright (c) 2017, Bogazici University, Istanbul, Turkey
 */

package edu.boun.edgecloudsim.edge_server;

import java.util.List;

import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.VmScheduler;
import org.cloudbus.cloudsim.provisioners.BwProvisioner;
import org.cloudbus.cloudsim.provisioners.RamProvisioner;

import edu.boun.edgecloudsim.utils.Location;

public class EdgeHost extends Host {
	private Location location;
	private String adhocVersion;
	private String adhocOS;
	private String adhocDeviceType;
	
	public EdgeHost(int id, RamProvisioner ramProvisioner,
			BwProvisioner bwProvisioner, long storage,
			List<? extends Pe> peList, VmScheduler vmScheduler) {
		super(id, ramProvisioner, bwProvisioner, storage, peList, vmScheduler);

	}
	
	public void setPlace(Location _location){
		location=_location;
	}
	
	public Location getLocation(){
		return location;
	}

	public String getAdhocVersion() {
		return adhocVersion;
	}

	public void setAdhocVersion(String adhocVersion) {
		this.adhocVersion = adhocVersion;
	}

	public String getAdhocOS() {
		return adhocOS;
	}

	public void setAdhocOS(String adhocOS) {
		this.adhocOS = adhocOS;
	}

	public String getAdhocDeviceType() {
		return adhocDeviceType;
	}

	public void setAdhocDeviceType(String adhocDeviceType) {
		this.adhocDeviceType = adhocDeviceType;
	}
	
	
}
