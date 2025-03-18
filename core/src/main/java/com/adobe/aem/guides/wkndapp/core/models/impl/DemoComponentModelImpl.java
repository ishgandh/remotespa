package com.adobe.aem.guides.wkndapp.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.wkndapp.core.models.DemoComponentModel;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;

@Model(adaptables = SlingHttpServletRequest.class,
adapters = {DemoComponentModel.class,ComponentExporter.class} ,
resourceType = DemoComponentModelImpl.RESOURCE_TYPE,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL 
)
@Exporter(
		name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
		extensions = ExporterConstants.SLING_MODEL_EXTENSION
		)
public class DemoComponentModelImpl implements DemoComponentModel{
  static final String RESOURCE_TYPE ="wknd-app/components/democomponent";
  
  @ValueMapValue
  private String message;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public String getExportedType() {
		// TODO Auto-generated method stub
		return DemoComponentModelImpl.RESOURCE_TYPE;
	}
	

}
