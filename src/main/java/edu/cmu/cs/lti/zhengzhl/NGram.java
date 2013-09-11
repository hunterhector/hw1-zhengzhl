

/* First created by JCasGen Wed Sep 11 00:03:59 EDT 2013 */
package edu.cmu.cs.lti.zhengzhl;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** NGram is a language unit that span over N tokens, where N is a integer larger or equal than 0.
 * Updated by JCasGen Wed Sep 11 00:03:59 EDT 2013
 * XML source: /Users/hector/Documents/homeworks/11791/hw1-zhengzhl/src/main/resources/hw1-zhengzhl-typesystem.xml
 * @generated */
public class NGram extends ComponentAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
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
  //* Feature: n

  /** getter for n - gets N that corresponding to this NGram, for example, 2 represents a bigram.
   * @generated */
  public int getN() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "edu.cmu.cs.lti.zhengzhl.NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_n);}
    
  /** setter for n - sets N that corresponding to this NGram, for example, 2 represents a bigram. 
   * @generated */
  public void setN(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "edu.cmu.cs.lti.zhengzhl.NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_n, v);}    
  }

    