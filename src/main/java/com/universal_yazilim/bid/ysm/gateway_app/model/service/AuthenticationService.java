package com.universal_yazilim.bid.ysm.gateway_app.model.service;

import com.universal_yazilim.bid.ysm.gateway_app.model.entity.User;
import org.springframework.stereotype.Service;

// ******4 -> generateJWT() metodunun ne yaptığını anlatmak üzere
// AbstractAuthenticationService'de ilgili unsurlar tanımlanır.
@Service
public class AuthenticationService extends AbstractAuthenticationService
{
    @Override
    public String generateJWT(User user)
    {
        return null;
    }
}
