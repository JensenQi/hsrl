package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Sprint_69526 : Card() {
    override val id = 69526
    override val name = "疾跑"
    override val description = "抽四张牌。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Core
    override val background = "潜行者们通常都不擅长慢跑。"
    override val artist = "James Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a87e95e908b50cf586fd0000a43641f096ac33ebcdd4df624ef1987215705b29.png"
}
