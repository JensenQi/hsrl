package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrazedNetherwing_54885 : Card() {
    override val id = 54885
    override val name = "疯狂的灵翼龙"
    override val description = "<b>战吼：</b> 如果你的手牌中有龙牌，则对所有其他角色造成3点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.DescentOfDragons
    override val background = "尾巴一翻，与我无关。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/40127f8debaaa8d4e1eb81c060803f72f9ef39b6ef2dc1d5a24c5605a1aef5c0.png"
}
