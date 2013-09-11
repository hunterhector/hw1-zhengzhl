

/* First created by JCasGen Wed Sep 11 00:03:59 EDT 2013 */
package edu.cmu.cs.lti.zhengzhl;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The base type that extends annotation. Two features are added into this type:
  1. componentId
  2. confidence
 * Updated by JCasGen Wed Sep 11 13:34:28 EDT 2013
 * XML source: /Users/hector/Documents/homeworks/11791/hw1-zhengzhl/src/main/resources/hw1-zhengzhl-typesystem.xml
 * @generated */
public class ComponentAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ComponentAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ComponentAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ComponentAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ComponentAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ComponentAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: componentId

  /** getter for componentId - gets the component identifier used to indicate the source where the annotation comes from.
   * @generated */
  public String getComponentId() {
    if (ComponentAnnotation_Type.featOkTst && ((ComponentAnnotation_Type)jcasType).casFeat_componentId == null)
      jcasType.jcas.throwFeatMissing("componentId", "edu.cmu.cs.lti.zhengzhl.ComponentAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ComponentAnnotation_Type)jcasType).casFeatCode_componentId);}
    
  /** setter for componentId - sets the component identifier used to indicate the source where the annotation comes from. 
   * @generated */
  public void setComponentId(String v) {
    if (ComponentAnnotation_Type.featOkTst && ((ComponentAnnotation_Type)jcasType).casFeat_componentId == null)
      jcasType.jcas.throwFeatMissing("componentId", "edu.cmu.cs.lti.zhengzhl.ComponentAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((ComponentAnnotation_Type)jcasType).casFeatCode_componentId, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets the confidence score by the annotator that produce this annotation
   * @generated */
  public double getConfidence() {
    if (ComponentAnnotation_Type.featOkTst && ((ComponentAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.cs.lti.zhengzhl.ComponentAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((ComponentAnnotation_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets the confidence score by the annotator that produce this annotation 
   * @generated */
  public void setConfidence(double v) {
    if (ComponentAnnotation_Type.featOkTst && ((ComponentAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.cs.lti.zhengzhl.ComponentAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((ComponentAnnotation_Type)jcasType).casFeatCode_confidence, v);}    
  }

    