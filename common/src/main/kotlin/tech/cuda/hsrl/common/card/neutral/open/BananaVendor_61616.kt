package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BananaVendor_61616 : Card() {
    override val id = 61616
    override val name = "香蕉商贩"
    override val description = "<b>战吼：</b>将两根香蕉置入每个玩家的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "商贩歇斯底里，香蕉delicious！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/50e4e386bdb370be0c5f3a5e918e6ae0f17dd7fe20ddc32202f7257ce797c302.png"
}
