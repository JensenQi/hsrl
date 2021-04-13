package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncestralGuardian_53408 : Card() {
    override val id = 53408
    override val name = "先祖守护者"
    override val description = "<b>吸血，复生</b>"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "没人知道他究竟是谁的先祖，但他仍会因为你从不召唤他而感到失落。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c9d502852bbecbe58bede34906ab6d80a42177b41a467d5df8cba792f79f9fb1.png"
}
