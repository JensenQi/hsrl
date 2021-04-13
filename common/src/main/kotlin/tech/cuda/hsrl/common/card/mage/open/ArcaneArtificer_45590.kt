package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneArtificer_45590 : Card() {
    override val id = 45590
    override val name = "奥术工匠"
    override val description = "每当你施放一个法术，便获得等同于其法力值消耗的护甲值。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "以太护甲会在6小时后消失，可能会给初次购买的顾客带来尴尬的经历。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3c7c2998118c1994530df951a2166a8cdbb20eb996722461b5ed0d0c51e49189.png"
}
