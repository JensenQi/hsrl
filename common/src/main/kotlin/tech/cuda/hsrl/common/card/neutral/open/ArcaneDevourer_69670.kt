package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneDevourer_69670 : Card() {
    override val id = 69670
    override val name = "奥术吞噬者"
    override val description = "每当你施放一个法术，便获得+2/+2。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "她喜欢在吞之前以优美的姿态撒上一撮盐。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2f3766c48e571a0e06f10e50baf800cd0cfad879c64ef23cc8aa53e33983bace.png"
}
