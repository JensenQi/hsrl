package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Sap_68475 : Card() {
    override val id = 68475
    override val name = "闷棍"
    override val description = "将一个敌方随从移回你对手的手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "“潜行者”的闷棍技术比“盗贼”好很多，他们不用天赋支持，就可以保证百分之百闷棍命中。"
    override val artist = "Scott Altmann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3fd4381e08cccc7983b022439218e50764e538bbd0303fa6bb9e8e6b67aefe19.png"
}
