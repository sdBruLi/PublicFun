﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:2.0.50727.3603
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------



[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.ServiceContractAttribute(ConfigurationName="IOrderService")]
public interface IOrderService
{
    
    [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IOrderService/HelloWho", ReplyAction="http://tempuri.org/IOrderService/HelloWhoResponse")]
    string HelloWho(string name);
    
    [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IOrderService/Square", ReplyAction="http://tempuri.org/IOrderService/SquareResponse")]
    int Square(int i);
}

[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
public interface IOrderServiceChannel : IOrderService, System.ServiceModel.IClientChannel
{
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
public partial class OrderServiceClient : System.ServiceModel.ClientBase<IOrderService>, IOrderService
{
    
    public OrderServiceClient()
    {
    }
    
    public OrderServiceClient(string endpointConfigurationName) : 
            base(endpointConfigurationName)
    {
    }
    
    public OrderServiceClient(string endpointConfigurationName, string remoteAddress) : 
            base(endpointConfigurationName, remoteAddress)
    {
    }
    
    public OrderServiceClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
            base(endpointConfigurationName, remoteAddress)
    {
    }
    
    public OrderServiceClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
            base(binding, remoteAddress)
    {
    }
    
    public string HelloWho(string name)
    {
        return base.Channel.HelloWho(name);
    }
    
    public int Square(int i)
    {
        return base.Channel.Square(i);
    }
}
