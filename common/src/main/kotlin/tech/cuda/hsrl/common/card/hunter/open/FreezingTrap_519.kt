package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FreezingTrap_519 : Card() {
    override val id = 519
    override val name = "冰冻陷阱"
    override val description = "<b>奥秘：</b>当一个敌方随从攻击时，将其移回拥有者的手牌，并且法力值消耗增加（2）点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy3
    override val background = "“呃，好冷。”——当你中了冰冻陷阱或是听到一个冷笑话时，通常都是这个反应。"
    override val artist = "Matt Gaser"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/353d6b1a5ef82fd35bc42d01dffa77e275577ddd136047c3c137bf49b7f35694.png"
}
