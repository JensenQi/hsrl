package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Acornbearer_51790 : Card() {
    override val id = 51790
    override val name = "橡果人"
    override val description = "<b>亡语：</b>将两张1/1的“松鼠”置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RiseOfShadows
    override val background = "橡树果实能力者。"
    override val artist = "Steven Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c5324a63d733ffb67261d292ebbbb519d03d856bfdb3886397fb7bc6eaa6a147.png"
}
