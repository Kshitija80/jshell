
package myproject2;
import java.util.Stack;

public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMul = new javax.swing.JButton();
        j0 = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        jSub = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jDiv = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        j1 = new javax.swing.JButton();
        jAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        j8 = new javax.swing.JButton();
        j9 = new javax.swing.JButton();
        jPoint = new javax.swing.JButton();
        j7 = new javax.swing.JButton();
        jEqual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMul.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jMul.setForeground(new java.awt.Color(255, 102, 0));
        jMul.setText("*");
        jMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMulActionPerformed(evt);
            }
        });

        j0.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        j0.setText("0");
        j0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j0ActionPerformed(evt);
            }
        });

        j5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        j5.setText("5");
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });

        jSub.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jSub.setForeground(new java.awt.Color(255, 102, 0));
        jSub.setText("-");
        jSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubActionPerformed(evt);
            }
        });

        j6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        j6.setText("6");
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });

        jClear.setBackground(new java.awt.Color(255, 153, 51));
        jClear.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jClear.setText("Clear");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });

        j4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        j4.setText("4");
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });

        jDelete.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jDiv.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jDiv.setForeground(new java.awt.Color(255, 102, 0));
        jDiv.setText("/");
        jDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDivActionPerformed(evt);
            }
        });

        j2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        j2.setText("2");
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });

        j3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        j3.setText("3");
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });

        j1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        j1.setText("1");
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });

        jAdd.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jAdd.setForeground(new java.awt.Color(255, 102, 0));
        jAdd.setText("+");
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-By Kshitija More");

        jTextField1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        j8.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        j8.setText("8");
        j8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8ActionPerformed(evt);
            }
        });

        j9.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        j9.setText("9");
        j9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9ActionPerformed(evt);
            }
        });

        jPoint.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jPoint.setText(".");
        jPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPointActionPerformed(evt);
            }
        });

        j7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        j7.setText("7");
        j7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7ActionPerformed(evt);
            }
        });

        jEqual.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jEqual.setForeground(new java.awt.Color(255, 102, 0));
        jEqual.setText("=");
        jEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEqualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jClear, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(j0, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jSub, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jMul, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMul, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSub, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMulActionPerformed
        jTextField1.setText(jTextField1.getText() + "*"); // TODO add your handling code here:
    }//GEN-LAST:event_jMulActionPerformed

    private void j0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j0ActionPerformed
        jTextField1.setText (jTextField1.getText()+"0"); // TODO add your handling code here:
    }//GEN-LAST:event_j0ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
        jTextField1.setText (jTextField1.getText()+"5"); // TODO add your handling code here:
    }//GEN-LAST:event_j5ActionPerformed

    private void jSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubActionPerformed
        jTextField1.setText(jTextField1.getText() + "-");// TODO add your handling code here:
    }//GEN-LAST:event_jSubActionPerformed

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
        jTextField1.setText (jTextField1.getText()+"6");// TODO add your handling code here:
    }//GEN-LAST:event_j6ActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        jTextField1.setText ("");// TODO add your handling code here:
    }//GEN-LAST:event_jClearActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
        jTextField1.setText (jTextField1.getText()+"4"); // TODO add your handling code here:
    }//GEN-LAST:event_j4ActionPerformed

    private void jDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDivActionPerformed
        jTextField1.setText(jTextField1.getText() + "/");// TODO add your handling code here:
    }//GEN-LAST:event_jDivActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
        jTextField1.setText (jTextField1.getText()+"2"); // TODO add your handling code here:
    }//GEN-LAST:event_j2ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
        jTextField1.setText (jTextField1.getText()+"3");// TODO add your handling code here:
    }//GEN-LAST:event_j3ActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
        jTextField1.setText (jTextField1.getText()+"1"); // TODO add your handling code here:
    }//GEN-LAST:event_j1ActionPerformed

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
        jTextField1.setText(jTextField1.getText() + "+");
    }//GEN-LAST:event_jAddActionPerformed

    private void j8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8ActionPerformed
        jTextField1.setText (jTextField1.getText()+"8");// TODO add your handling code here:
    }//GEN-LAST:event_j8ActionPerformed

    private void j9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9ActionPerformed
        jTextField1.setText (jTextField1.getText()+"9"); // TODO add your handling code here:
    }//GEN-LAST:event_j9ActionPerformed

    private void jPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPointActionPerformed
        jTextField1.setText (jTextField1.getText()+".");// TODO add your handling code here:
    }//GEN-LAST:event_jPointActionPerformed

    private void j7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7ActionPerformed
        jTextField1.setText (jTextField1.getText()+"7");// TODO add your handling code here:
    }//GEN-LAST:event_j7ActionPerformed

    private void jEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEqualActionPerformed
     String input = jTextField1.getText();

       double result = evaluateExpression(input);
    jTextField1.setText(Double.toString(result));

        
    }//GEN-LAST:event_jEqualActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
       String backSpace = null;
       
       if(jTextField1.getText().length() > 0){
           StringBuilder s = new StringBuilder(jTextField1.getText());
           
           s.deleteCharAt(jTextField1.getText().length()-1);
           backSpace = s.toString();
           jTextField1.setText(backSpace);
       }
        
    }//GEN-LAST:event_jDeleteActionPerformed
                                         
    public double evaluateExpression(String expression) {
    Stack<Double> numbers = new Stack<>();
    Stack<Character> operators = new Stack<>();

    String temp = "";

    for (int i = 0; i < expression.length(); i++) {
        char ch = expression.charAt(i);

        if (Character.isDigit(ch) || ch == '.') {
            temp += ch;
        } else {
            if (!temp.isEmpty()) {
                numbers.push(Double.parseDouble(temp));
                temp = "";
            }

            while (!operators.isEmpty() && hasPrecedence(ch, operators.peek())) {
                double b = numbers.pop();
                double a = numbers.pop();
                char op = operators.pop();
                numbers.push(applyOperation(a, b, op));
            }

            operators.push(ch);
        }
    }

    if (!temp.isEmpty()) {
        numbers.push(Double.parseDouble(temp));
    }

    while (!operators.isEmpty()) {
        double b = numbers.pop();
        double a = numbers.pop();
        char op = operators.pop();
        numbers.push(applyOperation(a, b, op));
    }

    return numbers.pop();
}


// Check operator precedence
private boolean hasPrecedence(char op1, char op2) {
    if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
        return false;
    return true;
}


// Perform operation based on operator
private double applyOperation(double a, double b, char op) {
    switch (op) {
        case '+': return a + b;
        case '-': return a - b;
        case '*': return a * b;
        case '/': return a / b;
    }
    return 0;
}
 
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton j0;
    private javax.swing.JButton j1;
    private javax.swing.JButton j2;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JButton j7;
    private javax.swing.JButton j8;
    private javax.swing.JButton j9;
    private javax.swing.JButton jAdd;
    private javax.swing.JButton jClear;
    private javax.swing.JButton jDelete;
    private javax.swing.JButton jDiv;
    private javax.swing.JButton jEqual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jMul;
    private javax.swing.JButton jPoint;
    private javax.swing.JButton jSub;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

