package com.goeswhere.minwizard;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class SimpleConfiguration extends Configuration {
    @JsonProperty
    @NotEmpty
    public String defaultName = "v9k";
}
