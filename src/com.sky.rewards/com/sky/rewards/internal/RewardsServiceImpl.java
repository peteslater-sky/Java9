package com.sky.rewards.internal;

import com.sky.rewards.api.RewardsService;
import com.sky.eligibility.api.EligibilityService;

public class RewardsServiceImpl implements RewardsService {
	EligibilityService eligibilityService;

	public RewardsServiceImpl(EligibilityService eligibilityService) {
		this.eligibilityService = eligibilityService;
	}

	public void getRewards(int accountNumber) {
		if(eligibilityService.isEligible(accountNumber)) {
			System.out.println("I can haz rewards?");
		}
		else {
			System.out.println("Boo, nothing for you today");
		}
	}
}
