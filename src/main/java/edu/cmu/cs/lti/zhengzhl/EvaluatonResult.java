

/* First created by JCasGen Wed Sep 11 14:04:36 EDT 2013 */
package edu.cmu.cs.lti.zhengzhl;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** This type stores the evaluation results.
 * Updated by JCasGen Wed Sep 11 14:04:36 EDT 2013
 * XML source: /Users/hector/Documents/homeworks/11791/hw1-zhengzhl/src/main/resources/hw1-zhengzhl-typesystem.xml
 * @generated */
public class EvaluatonResult extends ComponentAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EvaluatonResult.class);
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
  protected EvaluatonResult() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public EvaluatonResult(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public EvaluatonResult(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public EvaluatonResult(JCas jcas, int begin, int end) {
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
  //* Feature: metricName

  /** getter for metricName - gets the name of the metric used.
   * @generated */
  public String getMetricName() {
    if (EvaluatonResult_Type.featOkTst && ((EvaluatonResult_Type)jcasType).casFeat_metricName == null)
      jcasType.jcas.throwFeatMissing("metricName", "edu.cmu.cs.lti.zhengzhl.EvaluatonResult");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EvaluatonResult_Type)jcasType).casFeatCode_metricName);}
    
  /** setter for metricName - sets the name of the metric used. 
   * @generated */
  public void setMetricName(String v) {
    if (EvaluatonResult_Type.featOkTst && ((EvaluatonResult_Type)jcasType).casFeat_metricName == null)
      jcasType.jcas.throwFeatMissing("metricName", "edu.cmu.cs.lti.zhengzhl.EvaluatonResult");
    jcasType.ll_cas.ll_setStringValue(addr, ((EvaluatonResult_Type)jcasType).casFeatCode_metricName, v);}    
   
    
  //*--------------*
  //* Feature: result

  /** getter for result - gets a numeric value represent evaluation result.
   * @generated */
  public double getResult() {
    if (EvaluatonResult_Type.featOkTst && ((EvaluatonResult_Type)jcasType).casFeat_result == null)
      jcasType.jcas.throwFeatMissing("result", "edu.cmu.cs.lti.zhengzhl.EvaluatonResult");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((EvaluatonResult_Type)jcasType).casFeatCode_result);}
    
  /** setter for result - sets a numeric value represent evaluation result. 
   * @generated */
  public void setResult(double v) {
    if (EvaluatonResult_Type.featOkTst && ((EvaluatonResult_Type)jcasType).casFeat_result == null)
      jcasType.jcas.throwFeatMissing("result", "edu.cmu.cs.lti.zhengzhl.EvaluatonResult");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((EvaluatonResult_Type)jcasType).casFeatCode_result, v);}    
  }

    