package com.E_commerce.Demo.ServiceImpl;

import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTService {
private String secretKey = "581a8f7848a72d80bdebaf7385ad8199936d5b06b711a48509cdfd4a72ce54012347264b667f509f587c696b349f01b123dbca9a2c639425956029d974513a8a0efd96f4e01d7c8c2686f8ad65f88995685ba67d9f2ec8c40d7c9c64fbea9cf99bf1ceb5ce4a8d92096fe48411c9b13f46705b6db87f2ecc85afd7a54b9daef1bebf7b14ccf5956fb5e95b358a807973ef75e8de47d68aa5fb00e37457e7508067be9b3228d8a0fecc5301c5116e6530d14519b0ed1875d045add1bcc638760f517f09c9af51ef897ff69885919b53ed66aa7777dc29256c9e7bff56e1787703f4b3f29b2eaac4706f1f9d335a39e0b93e9ee09c61596463d18e6dcf1f7232fc";
	JWTService() 
	{
        
        
	}

	public String generateToken(String username) {
		Map<String,Object> Claims = new HashMap<>();
	return	Jwts.builder()
		.claims()
		.add(Claims)
		.subject(username)
		.issuedAt(new Date(System.currentTimeMillis()))
		.expiration(new Date(System.currentTimeMillis() + 60*60*1000))
		.and().signWith(getKey())
		.compact();
		
	}

	private SecretKey getKey() {
		byte[]	keyBytes = Decoders.BASE64.decode(secretKey);	
				return Keys.hmacShaKeyFor(keyBytes);
	}

	  public String extractUserName(String token) {
	        
	        return extractClaim(token, Claims::getSubject);
	    }

	    private <T> T extractClaim(String token, Function<Claims, T> claimResolver) {
	        final Claims claims = extractAllClaims(token);
	        return claimResolver.apply(claims);
	    }

	    private Claims extractAllClaims(String token) {
	        return Jwts.parser()
	                .verifyWith(getKey())
	                .build()
	                .parseSignedClaims(token)
	                .getPayload();
	    }

	    public boolean validateToken(String token, UserDetails userDetails) {
	        final String userName = extractUserName(token);
	        return (userName.equals(userDetails.getUsername()) && !isTokenExpired(token));
	    }

	    private boolean isTokenExpired(String token) {
	        return extractExpiration(token).before(new Date());
	    }

	    private Date extractExpiration(String token) {
	        return extractClaim(token, Claims::getExpiration);
	    }

}
