package com.montanha.config;

import org.aeonbits.owner.Config;
@Config.Sources({"file:C:\\projects\\gerenciador-viagens-master\\src\\test\\resources\\properties\\test.properties"})
public interface Configuracoes extends Config {
    @Key("baseURI")
    String baseURI();

    @Key("port")
    Integer port();

    @Key("basePath")
    String basePath();

}
