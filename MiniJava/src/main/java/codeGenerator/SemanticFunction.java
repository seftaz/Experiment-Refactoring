package codeGenerator;

import scanner.token.Token;

public abstract class SemanticFunction {
    protected CodeGenerator codeGenerator;

    public SemanticFunction(CodeGenerator codeGenerator) {
        this.codeGenerator = codeGenerator;
    }

    public abstract void execute(Token next);
}


class CheckID extends SemanticFunction {
    public CheckID(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.checkID();
    }
}

class Pid extends SemanticFunction {
    public Pid(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.pid(next);
    }
}

class Fpid extends SemanticFunction {
    public Fpid(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.fpid();
    }
}

class Kpid extends SemanticFunction {
    public Kpid(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.kpid(next);
    }
}

class Intpid extends SemanticFunction {
    public Intpid(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.intpid(next);
    }
}

class StartCall extends SemanticFunction {
    public StartCall(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.startCall();
    }
}

class Call extends SemanticFunction {
    public Call(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.call();
    }
}

class Arg extends SemanticFunction {
    public Arg(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.arg();
    }
}

class Assign extends SemanticFunction {
    public Assign(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.assign();
    }
}

class Add extends SemanticFunction {
    public Add(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.add();
    }
}

class Sub extends SemanticFunction {
    public Sub(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.sub();
    }
}

class Mult extends SemanticFunction {
    public Mult(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.mult();
    }
}

class Label extends SemanticFunction {
    public Label(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.label();
    }
}

class Save extends SemanticFunction {
    public Save(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.save();
    }
}

class While extends SemanticFunction {
    public While(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator._while();
    }
}

class JpfSave extends SemanticFunction {
    public JpfSave(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.jpf_save();
    }
}

class JpHere extends SemanticFunction {
    public JpHere(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.jpHere();
    }
}

class Print extends SemanticFunction {
    public Print(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.print();
    }
}

class Equal extends SemanticFunction {
    public Equal(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.equal();
    }
}

class LessThan extends SemanticFunction {
    public LessThan(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.less_than();
    }
}

class And extends SemanticFunction {
    public And(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.and();
    }
}

class Not extends SemanticFunction {
    public Not(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.not();
    }
}

class DefClass extends SemanticFunction {
    public DefClass(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.defClass();
    }
}

class DefMethod extends SemanticFunction {
    public DefMethod(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.defMethod();
    }
}

class PopClass extends SemanticFunction {
    public PopClass(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.popClass();
    }
}

class Extend extends SemanticFunction {
    public Extend(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.extend();
    }
}

class DefField extends SemanticFunction {
    public DefField(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.defField();
    }
}


class DefVar extends SemanticFunction {
    public DefVar(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.defVar();
    }
}

class MethodReturn extends SemanticFunction {
    public MethodReturn(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.methodReturn();
    }
}

class DefParam extends SemanticFunction {
    public DefParam(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.defParam();
    }
}

class LastTypeBool extends SemanticFunction {
    public LastTypeBool(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.lastTypeBool();
    }
}

class LastTypeInt extends SemanticFunction {
    public LastTypeInt(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.lastTypeInt();
    }
}

class DefMain extends SemanticFunction {
    public DefMain(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    @Override
    public void execute(Token next) {
        codeGenerator.defMain();
    }
}















