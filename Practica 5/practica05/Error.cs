﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace practica05
{
    class Error : Exception
    {
        public Error() : base() { }
        public Error(string message) : base(message) { }
    }
}
