package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BoneWraith_54002 : Card() {
    override val id = 54002
    override val name = "白骨怨灵"
    override val description = "<b>嘲讽，复生</b>"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "饿得只剩布包骨，换谁都会有怨气。"
    override val artist = "Steven Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/79e733815e39c8d5ae6378749ab6e7b5d62c967de3746d39164ddbaee9bb81ba.png"
}
