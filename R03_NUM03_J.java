/* 
Vulnerability 3
NUM03-J. Use integer types that can fully represent the possible range of unsigned data
}*/

public static int get Integer (DataInputStream is) throws IOException {
    return is.readInt();
}