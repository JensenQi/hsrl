package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlackjackStunner_56528 : Card() {
    override val id = 56528
    override val name = "钉棍终结者"
    override val description = "<b>战吼：</b>如果你控制一个<b>奥秘</b>，将一个随从移回其拥有者的手牌，并且法力值消耗增加（1）点。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“我即将终结这个10费随从的职业生涯。”"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/029e34a126066f696b016e1cf61597550edfcf45d5c46f6f03219035bd33463a.png"
}
