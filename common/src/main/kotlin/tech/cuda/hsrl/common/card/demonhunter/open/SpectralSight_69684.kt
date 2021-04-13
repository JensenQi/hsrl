package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpectralSight_69684 : Card() {
    override val id = 69684
    override val name = "幽灵视觉"
    override val description = "抽一张牌。<b>流放：</b>再抽一张。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Core
    override val background = "“选一张牌，随意选！最好是最左或最右边的。”"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0c8517bb8f62107c9301da819db21bb28df06c3c86b2cb9a8032754211732626.png"
}
