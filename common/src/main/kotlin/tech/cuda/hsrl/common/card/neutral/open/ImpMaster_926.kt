package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImpMaster_926 : Card() {
    override val id = 926
    override val name = "小鬼召唤师"
    override val description = "在你的回合结束时，对该随从造成1点伤害，并召唤一个1/1的 小鬼。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "如果她能让这些小鬼不再咬她的话，她会更加享受这份工作的。"
    override val artist = "Mark Gibbons"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b01863df024fbe91f0875abcc2c8c7c447d8c8e6335691272bc364a76e67c0aa.png"
}
