package vwfsbr.provider;

import java.util.List;

import org.keycloak.Config.Scope;
import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.provider.ProviderConfigProperty;
import org.keycloak.provider.ProviderConfigurationBuilder;
import org.keycloak.storage.UserStorageProviderFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FederationProviderFactory implements UserStorageProviderFactory<FederationProvider> {
  private Logger logger = LoggerFactory.getLogger(FederationProviderFactory.class);

  @Override
  public void init(Scope arg0) {
    logger.info("Creating Federation Provider Factory");
  }

  @Override
  public void postInit(KeycloakSessionFactory arg0) {
    logger.info("Finish creating Federation Provider Factory");
  }

  @Override
  public void close() {
    logger.info("Closing Federation Provider Factory");
  }

  @Override
  public FederationProvider create(KeycloakSession session, ComponentModel model) {
    logger.info("Calling create");
    return new FederationProvider(session, model);
  }

  @Override
  public String getId() {
    logger.info("Calling getId()");
    return "SecuritySvc Federation Provider";
  }

  @Override
  public List<ProviderConfigProperty> getConfigProperties() {
    return ProviderConfigurationBuilder.create()
        .property("service_url", "SecuritySvc URL", "Inform the URL for reach to the Security Service",
            ProviderConfigProperty.STRING_TYPE, "https://security.dev/SecuritySvc.svc", null)
        .build();
  }
}
