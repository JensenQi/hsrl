package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LesserMithrilSpellstone_45519 : Card() {
    override val id = 45519
    override val name = "小型法术秘银石"
    override val description = "召唤一个5/5的秘银魔像。 <i>（装备一把武器后升级。）</i>"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“岩石化成的矮人们听信了恶魔的许诺，渴求力量的贪婪带给他们的却是末日，他们被永久囚禁在秘银的墓穴之中。”——《魔石》"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8c30a80056b04a5e27e5d2f0b8c8c8fb37ad6602f8937d90059423026a6b5726.png"
}
