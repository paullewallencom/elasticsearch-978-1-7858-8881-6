package pl.solr.elasticsearch.examples.scripts;

import java.util.Map;

import org.elasticsearch.script.AbstractSearchScript;

public class HashCodeSortScript extends AbstractSearchScript {
  private String field = "name";

  public HashCodeSortScript(Map<String, Object> params) {
    if (params != null && params.containsKey("field")) {
      this.field = params.get("field").toString();
    }
  }

  @Override
  public Object run() {
    Object value = source().get(field);
    if (value != null) {
      return value.hashCode();
    }
    return 0;
  }

}