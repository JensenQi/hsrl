package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Dragonslayer_43486 : Card() {
    override val id = 43486
    override val name = "屠龙者"
    override val description = "<b>战吼：</b>对一条龙造成6点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "两个壮实的矮人可以防止大灾变的降临。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a670a72aea4a624a829993fc7804e6d8f0906a45b46e962301b460a56721333a.png"
}
