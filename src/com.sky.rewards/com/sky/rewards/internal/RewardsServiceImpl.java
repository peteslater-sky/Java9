package com.sky.rewards.internal;

import com.sky.rewards.api.RewardsService;
import com.sky.eligability.api.EligabilityService;

public class RewardsServiceImpl implements RewardsService {
	EligabilityService eligabilityService;

	public RewardsServiceImpl(EligabilityService eligabilityService) {
		this.eligabilityService = eligabilityService;
	}

	public void getRewards(int accountNumber) {
		if(eligabilityService.isEligable(accountNumber)) {
			System.out.println("I can haz rewards?");
		}
		else {
			System.out.println("Boo, nothing for you today");
		}
	}
}
