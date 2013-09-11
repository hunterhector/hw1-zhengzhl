

/* First created by JCasGen Wed Sep 11 00:03:59 EDT 2013 */
package edu.cmu.cs.lti.zhengzhl;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import org.apache.uima.jcas.cas.FSList;


/** The question type refers the one single question.
 * Updated by JCasGen Wed Sep 11 13:34:28 EDT 2013
 * XML source: /Users/hector/Documents/homeworks/11791/hw1-zhengzhl/src/main/resources/hw1-zhengzhl-typesystem.xml
 * @generated */
public class Question extends ComponentAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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
  //* Feature: candidateAnswers

  /** getter for candidateAnswers - gets the candidate answers of this question
   * @generated */
  public FSList getCandidateAnswers() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_candidateAnswers == null)
      jcasType.jcas.throwFeatMissing("candidateAnswers", "edu.cmu.cs.lti.zhengzhl.Question");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_candidateAnswers)));}
    
  /** setter for candidateAnswers - sets the candidate answers of this question 
   * @generated */
  public void setCandidateAnswers(FSList v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_candidateAnswers == null)
      jcasType.jcas.throwFeatMissing("candidateAnswers", "edu.cmu.cs.lti.zhengzhl.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_candidateAnswers, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    