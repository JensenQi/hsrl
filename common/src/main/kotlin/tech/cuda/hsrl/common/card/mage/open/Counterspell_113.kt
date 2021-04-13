package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Counterspell_113 : Card() {
    override val id = 113
    override val name = "法术反制"
    override val description = "<b>奥秘：</b>当你的对手施放一个法术时，<b>反制</b>该法术。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy3
    override val background = "一个会法术反制的法师和一个不会法术反制的法师之间有什么区别？那个不会的法师被炎爆术炸了一脸。"
    override val artist = "Jason Chan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b8730ec3d475b5780b80ab51eeb89331a151a485663881e594c5e6feb267dcf0.png"
}
