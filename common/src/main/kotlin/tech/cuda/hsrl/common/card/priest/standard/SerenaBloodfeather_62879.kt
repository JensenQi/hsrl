package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SerenaBloodfeather_62879 : Card() {
    override val id = 62879
    override val name = "塞瑞娜·血羽"
    override val description = "<b>战吼：</b>选择一个敌方随从，偷取其攻击力和生命值，直至该随从的攻击力和生命值高于目标随从。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "塞瑞娜人脉奇广，把无数的低等级部落玩家介绍给了灵魂医者。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c1d8d1a0158fd93d8e56126c99e331e58c61af1bbb13e4315a7e5ccb168f80e0.png"
}
