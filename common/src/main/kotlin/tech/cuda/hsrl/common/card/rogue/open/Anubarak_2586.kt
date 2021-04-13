package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Anubarak_2586 : Card() {
    override val id = 2586
    override val name = "阿努巴拉克"
    override val description = "<b>亡语：</b>将该随从移回你的手牌，召唤一个4/4的蛛魔。"
    override var cost: Int? = 9
    override var health: Int? = 4
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Tgt
    override val background = "他以前曾是个好人，直到遇见了巫妖王。"
    override val artist = "Eric Braddock"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6e6066182bb9c98f57a49be85034c3066fcd93bb1008702a884984b07b0dde6e.png"
}
