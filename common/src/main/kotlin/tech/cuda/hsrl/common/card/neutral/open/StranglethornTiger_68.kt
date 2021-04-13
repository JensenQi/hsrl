package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StranglethornTiger_68 : Card() {
    override val id = 68
    override val name = "荆棘谷猛虎"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "这些美丽的大猫是荆棘谷一道亮丽的风景！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d0533aa5e3b240367fd71d82abb745b3939a8ec60ffd1fa2d37d6b2ffa4ad179.png"
}
