package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TrueaimCrescent_59233 : Card() {
    override val id = 59233
    override val name = "引月长弓"
    override val description = "在你的英雄攻击一个随从后，你的所有随从也会攻击该随从。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "一支穿云箭，千军万马来相见。"
    override val artist = "Kagi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6b0d519adc3b5cd224f046c5879ed0b7fbd3aca2b220107529e96af499916ec0.png"
}
