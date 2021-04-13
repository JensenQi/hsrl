package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PuzzleBoxOfYoggSaron_53442 : Card() {
    override val id = 53442
    override val name = "尤格-萨隆的谜之匣"
    override val description = "随机施放10个法术<i>（目标随机而定）</i>。"
    override var cost: Int? = 10
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“快把它放下，雷诺！”"
    override val artist = "Kagi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b593b9234864d0db857f4cf45bae5b605da6aacb7aa7278a5bda250debc4154e.png"
}
