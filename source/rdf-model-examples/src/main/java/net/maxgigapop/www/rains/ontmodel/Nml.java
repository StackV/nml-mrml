/* CVS $Id: $ */
package net.maxgigapop.www.rains.ontmodel; 
import com.hp.hpl.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from /Users/xyang/Work/RAINS/nml-mrs-model/source/rdf-model-examples/src/main/resources/nml-base-ext.owl 
 * @author Auto-generated by schemagen on 14 Nov 2014 15:48 
 */
public class Nml {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://schemas.ogf.org/nml/2013/03/base#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final Property adaptationFunction = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#adaptationFunction" );
    
    public static final Property address = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#address" );
    
    public static final Property alt = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#alt" );
    
    public static final Property belongsTo = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#belongsTo" );
    
    public static final Property canProvidePort = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#canProvidePort" );
    
    public static final Property encoding = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#encoding" );
    
    public static final Property end = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#end" );
    
    public static final Property existsDuring = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#existsDuring" );
    
    public static final Property hasBidirectionalLink = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#hasBidirectionalLink" );
    
    public static final Property hasBidirectionalPort = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#hasBidirectionalPort" );
    
    public static final Property hasInboundPort = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#hasInboundPort" );
    
    public static final Property hasLabel = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#hasLabel" );
    
    public static final Property hasLabelGroup = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#hasLabelGroup" );
    
    public static final Property hasLink = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#hasLink" );
    
    public static final Property hasNode = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#hasNode" );
    
    public static final Property hasOutboundPort = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#hasOutboundPort" );
    
    public static final Property hasPort = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#hasPort" );
    
    public static final Property hasService = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#hasService" );
    
    public static final Property hasTopology = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#hasTopology" );
    
    public static final Property implementedBy = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#implementedBy" );
    
    public static final Property isAlias = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#isAlias" );
    
    public static final Property isSerialCompoundLink = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#isSerialCompoundLink" );
    
    public static final Property isSink = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#isSink" );
    
    public static final Property isSource = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#isSource" );
    
    public static final Property item = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#item" );
    
    public static final Property labelSwapping = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#labelSwapping" );
    
    public static final Property labeltype = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#labeltype" );
    
    public static final Property lat = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#lat" );
    
    public static final Property locatedAt = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#locatedAt" );
    
    public static final Property long_ = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#long" );
    
    public static final Property name = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#name" );
    
    public static final Property next = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#next" );
    
    public static final Property noReturnTraffic = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#noReturnTraffic" );
    
    public static final Property parameter = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#parameter" );
    
    public static final Property providesLink = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#providesLink" );
    
    public static final Property providesPort = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#providesPort" );
    
    public static final Property serviceProvidedBy = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#serviceProvidedBy" );
    
    public static final Property start = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#start" );
    
    public static final Property unlocode = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#unlocode" );
    
    public static final Property value = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#value" );
    
    public static final Property values = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#values" );
    
    public static final Property version = m_model.createProperty( "http://schemas.ogf.org/nml/2013/03/base#version" );
    
    public static final Resource AdaptationService = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#AdaptationService" );
    
    public static final Resource BidirectionalLink = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#BidirectionalLink" );
    
    public static final Resource BidirectionalPort = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#BidirectionalPort" );
    
    public static final Resource DeadaptationService = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#DeadaptationService" );
    
    public static final Resource Group = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#Group" );
    
    public static final Resource Label = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#Label" );
    
    public static final Resource LabelGroup = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#LabelGroup" );
    
    public static final Resource Lifetime = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#Lifetime" );
    
    public static final Resource Link = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#Link" );
    
    public static final Resource LinkGroup = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#LinkGroup" );
    
    public static final Resource ListItem = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#ListItem" );
    
    public static final Resource Location = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#Location" );
    
    public static final Resource NetworkObject = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#NetworkObject" );
    
    public static final Resource Node = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#Node" );
    
    public static final Resource Port = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#Port" );
    
    public static final Resource PortGroup = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#PortGroup" );
    
    public static final Resource Service = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#Service" );
    
    public static final Resource SwitchingService = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#SwitchingService" );
    
    public static final Resource Topology = m_model.createResource( "http://schemas.ogf.org/nml/2013/03/base#Topology" );
    
}
