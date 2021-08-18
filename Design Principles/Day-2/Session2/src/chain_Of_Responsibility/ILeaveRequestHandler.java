package chain_Of_Responsibility;


public interface ILeaveRequestHandler {
	
	public void setNext(ILeaveRequestHandler nextHandler);
	public void HandleRequest(LeaveRequest leaveRequest);
}
