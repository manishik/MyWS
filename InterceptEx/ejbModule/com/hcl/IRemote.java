package com.hcl;

import javax.ejb.Remote;

@Remote
public interface IRemote {

	public int multiplier(int i, int z);

}
