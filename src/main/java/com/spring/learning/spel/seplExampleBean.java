package com.spring.learning.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class seplExampleBean {

	
	@Value("#{ T(java.lang.Math).sqrt(100+100) }")
	private double sqrt;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double pie;
	
	@Value("#{50+50}")
	private double add;
	
	@Value("#{'Ash'+'Shweta'}")
	private String friend;
	
	@Value("#{10==0}")
	private boolean equalsOrNot;
	
	@Value("#{209 > 500 && 400 < 300}")
	private boolean isLogical;
	
	@Value("#{ 2>1 ? 'a' :'b' }")
	private String ternary;
	
	@Value("#{friends}")
	private List<String> friends;

	@Override
	public String toString() {
		return "seplExampleBean [sqrt=" + sqrt + ", pie=" + pie + ", add=" + add + ", friend=" + friend
				+ ", equalsOrNot=" + equalsOrNot + ", isLogical=" + isLogical + ", ternary=" + ternary + ", friends="
				+ friends + "]";
	}
	
	
}
