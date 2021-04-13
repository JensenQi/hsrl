package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RotnestDrake_56239 : Card() {
    override val id = 56239
    override val name = "腐巢幼龙"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，随机消灭一个敌方随从。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "把你的巢收拾干净，不然我就把你最喜欢的随从带走了！"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9d56fe253698e50e42a8b8c5059cb1f4a9fc1c6d03940f12d09c85bd3254aba5.png"
}
