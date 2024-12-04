package br.com.rodrigo.dataintegration.legacysystem.config;

import org.springframework.boot.web.servlet.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import org.springframework.core.io.*;
import org.springframework.ws.config.annotation.*;
import org.springframework.ws.transport.http.*;
import org.springframework.ws.wsdl.wsdl11.*;
import org.springframework.xml.xsd.*;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    // bean definitions
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "legacyObjectInsertion")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("LegacyObjectPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.rodrigo.com.br/dataintegration/model/gen");
        wsdl11Definition.setSchema(countriesSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema countriesSchema() {
        return new SimpleXsdSchema(new ClassPathResource("legacyObject.xsd"));
    }
}