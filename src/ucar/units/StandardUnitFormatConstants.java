/*
 * Copyright 1998-2014 University Corporation for Atmospheric Research/Unidata
 *
 *   Portions of this software were developed by the Unidata Program at the
 *   University Corporation for Atmospheric Research.
 *
 *   Access and use of this software shall impose the following obligations
 *   and understandings on the user. The user is granted the right, without
 *   any fee or cost, to use, copy, modify, alter, enhance and distribute
 *   this software, and any derivative works thereof, and its supporting
 *   documentation for any purpose whatsoever, provided that this entire
 *   notice appears in all copies of the software, derivative works and
 *   supporting documentation.  Further, UCAR requests that the user credit
 *   UCAR/Unidata in any publications that result from the use of this
 *   software or in any product that includes this software. The names UCAR
 *   and/or Unidata, however, may not be used in any advertising or publicity
 *   to endorse or promote any products or commercial entity unless specific
 *   written permission is obtained from UCAR/Unidata. The user also
 *   understands that UCAR/Unidata is not obligated to provide the user with
 *   any support, consulting, training or assistance of any kind with regard
 *   to the use, operation and performance of this software nor to provide
 *   the user with any updates, revisions, new versions or "bug fixes."
 *
 *   THIS SOFTWARE IS PROVIDED BY UCAR/UNIDATA "AS IS" AND ANY EXPRESS OR
 *   IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *   WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *   DISCLAIMED. IN NO EVENT SHALL UCAR/UNIDATA BE LIABLE FOR ANY SPECIAL,
 *   INDIRECT OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING
 *   FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT,
 *   NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION
 *   WITH THE ACCESS, USE OR PERFORMANCE OF THIS SOFTWARE.
 */

/* Generated By:JavaCC: Do not edit this line. StandardUnitFormatConstants.java */
package ucar.units;


/** 
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface StandardUnitFormatConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SP = 1;
  /** RegularExpression Id. */
  int PLUS = 2;
  /** RegularExpression Id. */
  int MINUS = 3;
  /** RegularExpression Id. */
  int COLON = 4;
  /** RegularExpression Id. */
  int UINT = 5;
  /** RegularExpression Id. */
  int SIGN = 6;
  /** RegularExpression Id. */
  int LETTER = 7;
  /** RegularExpression Id. */
  int LPAREN = 8;
  /** RegularExpression Id. */
  int RPAREN = 9;
  /** RegularExpression Id. */
  int REAL_EXP = 10;
  /** RegularExpression Id. */
  int RAISE = 11;
  /** RegularExpression Id. */
  int PERIOD = 12;
  /** RegularExpression Id. */
  int STAR = 13;
  /** RegularExpression Id. */
  int DIVIDE = 14;
  /** RegularExpression Id. */
  int SHIFT = 15;
  /** RegularExpression Id. */
  int SYMBOL = 16;
  /** RegularExpression Id. */
  int T = 17;
  /** RegularExpression Id. */
  int NAME = 18;
  /** RegularExpression Id. */
  int LB = 19;
  /** RegularExpression Id. */
  int LN = 20;
  /** RegularExpression Id. */
  int LG = 21;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<SP>",
    "\"+\"",
    "\"-\"",
    "\":\"",
    "<UINT>",
    "<SIGN>",
    "<LETTER>",
    "\"(\"",
    "\")\"",
    "<REAL_EXP>",
    "\"^\"",
    "\".\"",
    "\"*\"",
    "<DIVIDE>",
    "<SHIFT>",
    "<SYMBOL>",
    "\"t\"",
    "<NAME>",
    "<LB>",
    "<LN>",
    "<LG>",
  };

}