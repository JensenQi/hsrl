package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Platebreaker_55419 : Card() {
    override val id = 55419
    override val name = "破甲骑士"
    override val description = "<b>战吼：</b> 摧毁你对手的护甲。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "护甲都是纸。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c8edbaffa7898c0be0b99afff39102ed545443249cdb56364bf3aead1ba287fc.png"
}
