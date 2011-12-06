<?xml version="1.0"?>
<xsl:stylesheet
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	version="1.0"
	xmlns:xalan="http://xml.apache.org/xalan"
	xmlns:xsdMappingProject="xsdMappingProjectExtensions"
	extension-element-prefixes="xsdMappingProject">



	<xalan:component prefix="xsdMappingProject"
		functions="ConceptConcat ConceptGenerator TextValueGenerator IndexConcat IndexValueGenerator NameConcat NameGenerator IDConcat IDGenerator DosageQuantityConcat DosageQuantityGenerator RateQuantityConcat RateQuantityGenerator RouteGenerator">
		<xalan:script lang="javascript">	
			function ConceptConcat(param0, param1)
			{return param0 + " : " + param1;

			}

			function ConceptGenerator()
			{return "Concept ( Name : Source )";

			}

			function TextValueGenerator()
			{return "Text Value";

			}

			function IndexConcat(param0, param1)
			{return param0 + " with precision " + param1;
			}

			function IndexValueGenerator()
			{return "Index Value";
			}

			function NameConcat(param0, param1)
			{return param0 + ", " + param1;
			}

			function NameGenerator()
			{return "Surname, Name";
			}

			function IDConcat(param0, param1)
			{return param0 + ":: " + param1;

			}

			function IDGenerator()
			{return "Patient ID";

			}

			function DosageQuantityConcat(param0, param1, param2)
			{return "\n\t\tName : " + param0 + "\n\t\tValue : " + param1 + ", " + param2;
			}

			function DosageQuantityGenerator()
			{return "Dosage Quantity";
			}

			function RateQuantityConcat(param0, param1, param2)
			{return "\n\t\tName : " + param0 + "\n\t\tValue : " + param1 + ", " + param2;
			}

			function RateQuantityGenerator()
			{return "Rate Quantity";
			}

			function RouteGenerator()
			{return "Route";
			}
		</xalan:script>

	</xalan:component>



	<xsl:template match="/">
		<Data>

			<!-- Temporary Approach **************************>
			<*** the following transformation will be ********>
			<*** eliminated as soon as the xsd is modified. -->

			<xsl:for-each select="/Data/Patient_Data/Id">
				<xsl:variable name="_Data_Patient_Data_Id" select="current()" />
				<Presentable_Pair>
					<Name>
						<xsl:value-of select="xsdMappingProject:IDGenerator()"/>
					</Name>
					<Value>
						<xsl:value-of select="."/>
					</Value>
				</Presentable_Pair>
			</xsl:for-each>

			<!-- END-OF Temporary Approach *****************-->

			<xsl:for-each select="/Data/Patient_Data/Patient_ID">
				<xsl:variable name="_Data_Patient_Data_Patient_ID" select="current()" />
				<Presentable_Pair>
					<Name>
						<xsl:value-of select="xsdMappingProject:IDGenerator()"/>
					</Name>
					<Value>
						<xsl:value-of select="xsdMappingProject:IDConcat(string (External_ID), string (Internal_ID))"/>
					</Value>
				</Presentable_Pair>
			</xsl:for-each>

			<xsl:for-each select="/Data/Patient_Data/Name">
				<xsl:variable name="_Data_Patient_Data_Name" select="current()" />
				<Presentable_Pair>
					<Name>
						<xsl:value-of select="xsdMappingProject:NameGenerator()"/>
					</Name>
					<Value>
						<xsl:value-of select="xsdMappingProject:NameConcat(string (../Surname), string (.))"/>
					</Value>
				</Presentable_Pair>
			</xsl:for-each>

			<xsl:for-each select="/Data/Observation/Service_Cd_OB">
				<xsl:variable name="_Data_Observation_Service_Cd_OB" select="current()" />
				<Presentable_Pair>
					<Name>
						<xsl:value-of select="xsdMappingProject:ConceptGenerator()"/>
					</Name>
					<Value>
						<xsl:value-of select="xsdMappingProject:ConceptConcat(string (Concept_Name_C), string (Concept_Source_C))"/>
					</Value>
				</Presentable_Pair>
			</xsl:for-each>

			<xsl:for-each select="/Data/Observation/Method_Cd_OB">
				<xsl:variable name="_Data_Observation_Method_Cd_OB" select="current()" />
				<Presentable_Pair>
					<Name>
						<xsl:value-of select="xsdMappingProject:ConceptGenerator()"/>
					</Name>
					<Value>
						<xsl:value-of select="xsdMappingProject:ConceptConcat(string (Concept_Name_C), string (Concept_Source_C))"/>
					</Value>
				</Presentable_Pair>
			</xsl:for-each>

			<xsl:for-each select="/Data/Observation/Text_Value">
				<xsl:variable name="_Data_Observation_Text_Value" select="current()" />
				<Presentable_Pair>
					<Name>
						<xsl:value-of select="xsdMappingProject:TextValueGenerator()"/>
					</Name>
					<Value>
						<xsl:value-of select = "."/>
					</Value>
				</Presentable_Pair>
			</xsl:for-each>

			<xsl:for-each select="/Data/Observation/Index_Value">
				<xsl:variable name="_Data_Observation_Index_Value" select="current()" />
				<Presentable_Pair>
					<Name>
						<xsl:value-of select="xsdMappingProject:IndexValueGenerator()"/>
					</Name>
					<Value>
						<xsl:value-of select="xsdMappingProject:IndexConcat(string (Index_IV), string (Precision_IV))"/>
					</Value>
				</Presentable_Pair>
			</xsl:for-each>

			<xsl:for-each select="/Data/Medication/Method_Cd_ME">
				<xsl:variable name="_Data_Medication_Method_Cd_ME" select="current()" />
				<Presentable_Pair>
					<Name>
						<xsl:value-of select="xsdMappingProject:ConceptGenerator()"/>
					</Name>
					<Value>
						<xsl:value-of select="xsdMappingProject:ConceptConcat(string (Concept_Name_C), string (Concept_Source_C))"/>
					</Value>
				</Presentable_Pair>
			</xsl:for-each>

			<xsl:for-each select="/Data/Medication/Service_Cd_ME">
				<xsl:variable name="_Data_Medication_Service_Cd_ME" select="current()" />
				<Presentable_Pair>
					<Name>
						<xsl:value-of select="xsdMappingProject:ConceptGenerator()"/>
					</Name>
					<Value>
						<xsl:value-of select="xsdMappingProject:ConceptConcat(string (Concept_Name_C), string (Concept_Source_C))"/>
					</Value>
				</Presentable_Pair>
			</xsl:for-each>

			<xsl:for-each select="/Data/Medication/Dosage_Quantity_ME">
				<xsl:variable name="_Data_Medication_Dosage_Quantity_ME" select="current()" />
				<Presentable_Pair>
					<Name>
						<xsl:value-of select="xsdMappingProject:DosageQuantityGenerator()"/>
					</Name>
					<Value>
						<xsl:value-of select="xsdMappingProject:DosageQuantityConcat(string (Display_Name_PQ), string (PQ_Value_PQ), string (Unit_PQ))"/>
					</Value>
				</Presentable_Pair>
			</xsl:for-each>

			<xsl:for-each select="/Data/Medication/Rate_Quantity_ME">
				<xsl:variable name="_Data_Medication_Rate_Quantity_ME" select="current()" />
				<Presentable_Pair>
					<Name>
						<xsl:value-of select="xsdMappingProject:RateQuantityGenerator()"/>
					</Name>
					<Value>
						<xsl:value-of select="xsdMappingProject:RateQuantityConcat(string (Display_Name_PQ), string (PQ_Value_PQ), string (Unit_PQ))"/>
					</Value>
				</Presentable_Pair>
			</xsl:for-each>

			<xsl:for-each select="/Data/Medication/Route_Cd_ME/Name2_S">
				<xsl:variable name="_Data_Medication_Route_Cd_ME_Name2_S" select="current()" />
				<Presentable_Pair>
					<Name>
						<xsl:value-of select="xsdMappingProject:RouteGenerator()"/>
					</Name>
					<Value>
						<xsl:value-of select = "."/>
					</Value>
				</Presentable_Pair>
			</xsl:for-each>

			<xsl:for-each select="/Data/Medication/Route_Cd_ME/Symbol_Value_S">
				<xsl:variable name="_Data_Medication_Route_Cd_ME_Name2_S2" select="current()" />
				<Presentable_Pair>
					<Name>
						<xsl:value-of select="xsdMappingProject:RouteGenerator()"/>
					</Name>
					<Value>
						<xsl:value-of select = "."/>
					</Value>
				</Presentable_Pair>
			</xsl:for-each>

		</Data>
	</xsl:template>
</xsl:stylesheet>
