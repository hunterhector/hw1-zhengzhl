
/* First created by JCasGen Wed Sep 11 14:04:36 EDT 2013 */
package edu.cmu.cs.lti.zhengzhl;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** This type stores the evaluation results.
 * Updated by JCasGen Wed Sep 11 14:04:36 EDT 2013
 * @generated */
public class EvaluatonResult_Type extends ComponentAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (EvaluatonResult_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = EvaluatonResult_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new EvaluatonResult(addr, EvaluatonResult_Type.this);
  			   EvaluatonResult_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new EvaluatonResult(addr, EvaluatonResult_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EvaluatonResult.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.lti.zhengzhl.EvaluatonResult");
 
  /** @generated */
  final Feature casFeat_metricName;
  /** @generated */
  final int     casFeatCode_metricName;
  /** @generated */ 
  public String getMetricName(int addr) {
        if (featOkTst && casFeat_metricName == null)
      jcas.throwFeatMissing("metricName", "edu.cmu.cs.lti.zhengzhl.EvaluatonResult");
    return ll_cas.ll_getStringValue(addr, casFeatCode_metricName);
  }
  /** @generated */    
  public void setMetricName(int addr, String v) {
        if (featOkTst && casFeat_metricName == null)
      jcas.throwFeatMissing("metricName", "edu.cmu.cs.lti.zhengzhl.EvaluatonResult");
    ll_cas.ll_setStringValue(addr, casFeatCode_metricName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_result;
  /** @generated */
  final int     casFeatCode_result;
  /** @generated */ 
  public double getResult(int addr) {
        if (featOkTst && casFeat_result == null)
      jcas.throwFeatMissing("result", "edu.cmu.cs.lti.zhengzhl.EvaluatonResult");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_result);
  }
  /** @generated */    
  public void setResult(int addr, double v) {
        if (featOkTst && casFeat_result == null)
      jcas.throwFeatMissing("result", "edu.cmu.cs.lti.zhengzhl.EvaluatonResult");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_result, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public EvaluatonResult_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_metricName = jcas.getRequiredFeatureDE(casType, "metricName", "uima.cas.String", featOkTst);
    casFeatCode_metricName  = (null == casFeat_metricName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_metricName).getCode();

 
    casFeat_result = jcas.getRequiredFeatureDE(casType, "result", "uima.cas.Double", featOkTst);
    casFeatCode_result  = (null == casFeat_result) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_result).getCode();

  }
}



    