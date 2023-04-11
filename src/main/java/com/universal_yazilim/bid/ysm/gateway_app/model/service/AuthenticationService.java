package com.universal_yazilim.bid.ysm.gateway_app.model.service;

import com.universal_yazilim.bid.ysm.gateway_app.model.entity.User;
import com.universal_yazilim.bid.ysm.gateway_app.security.model.UserPrincipal;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

// ******4 -> generateJWT() metodunun ne yaptığını anlatmak üzere
// AbstractAuthenticationService'de ilgili unsurlar tanımlanır.
@Service
public class AuthenticationService extends AbstractAuthenticationService
{
    @Override
    public String generateJWT(User user)
    {
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword());
        Authentication authentication = authenticationManager.authenticate(authenticationToken);
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
        return provider.generateToken(userPrincipal);
    }
}
