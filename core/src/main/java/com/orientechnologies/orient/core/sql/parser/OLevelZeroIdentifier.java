/* Generated By:JJTree: Do not edit this line. OLevelZeroIdentifier.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

public
class OLevelZeroIdentifier extends SimpleNode {
  public OLevelZeroIdentifier(int id) {
    super(id);
  }

  public OLevelZeroIdentifier(OrientSql p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=0305fcf120ba9395b4c975f85cdade72 (do not edit this line) */
