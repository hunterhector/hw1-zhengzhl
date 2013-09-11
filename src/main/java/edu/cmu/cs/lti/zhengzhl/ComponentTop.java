

/* First created by JCasGen Wed Sep 11 00:03:59 EDT 2013 */
package edu.cmu.cs.lti.zhengzhl;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** A base type that extends TOP, with 2 new features:
  1. Component Id, that indicate the source of annotation
  2. Confidence, that indicate the confidence the annotator gives
 * Updated by JCasGen Wed Sep 11 13:34:28 EDT 2013
 * XML source: /Users/hector/Documents/homeworks/11791/hw1-zhengzhl/src/main/resources/hw1-zhengzhl-typesystem.xml
 * @generated */
public class ComponentTop extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ComponentTop.class);
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
  protected ComponentTop() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ComponentTop(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ComponentTop(JCas jcas) {
    super(jcas);
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
    if (ComponentTop_Type.featOkTst && ((ComponentTop_Type)jcasType).casFeat_componentId == null)
      jcasType.jcas.throwFeatMissing("componentId", "edu.cmu.cs.lti.zhengzhl.ComponentTop");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ComponentTop_Type)jcasType).casFeatCode_componentId);}
    
  /** setter for componentId - sets the component identifier used to indicate the source where the annotation comes from. 
   * @generated */
  public void setComponentId(String v) {
    if (ComponentTop_Type.featOkTst && ((ComponentTop_Type)jcasType).casFeat_componentId == null)
      jcasType.jcas.throwFeatMissing("componentId", "edu.cmu.cs.lti.zhengzhl.ComponentTop");
    jcasType.ll_cas.ll_setStringValue(addr, ((ComponentTop_Type)jcasType).casFeatCode_componentId, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets the confidence score by the annotator that produce this annotation
   * @generated */
  public double getConfidence() {
    if (ComponentTop_Type.featOkTst && ((ComponentTop_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.cs.lti.zhengzhl.ComponentTop");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((ComponentTop_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets the confidence score by the annotator that produce this annotation 
   * @generated */
  public void setConfidence(double v) {
    if (ComponentTop_Type.featOkTst && ((ComponentTop_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.cs.lti.zhengzhl.ComponentTop");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((ComponentTop_Type)jcasType).casFeatCode_confidence, v);}    
  }

    