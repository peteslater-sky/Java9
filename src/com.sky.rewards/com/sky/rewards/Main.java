package com.sky.rewards;

import com.sky.rewards.api.RewardsService;
import com.sky.rewards.internal.RewardsServiceImpl;
import com.sky.eligability.internal.EligibilityServiceImpl;

public class Main {
	public static void main(String[] args) {
		RewardsService rewardsService = new RewardsServiceImpl(new EligibilityServiceImpl());
		rewardsService.getRewards(123456);
	}
}
