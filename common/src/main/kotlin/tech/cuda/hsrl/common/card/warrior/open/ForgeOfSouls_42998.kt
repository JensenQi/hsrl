package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForgeOfSouls_42998 : Card() {
    override val id = 42998
    override val name = "灵魂洪炉"
    override val description = "从你的牌库中抽两张武器牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Kotf
    override val background = "由千魂之父布隆亚姆打造的强大武器库。"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/08c5aaa52f5c661573d2ecb59c336ee77c03e0d1d6c9f5d00bbae808c723fe71.png"
}
