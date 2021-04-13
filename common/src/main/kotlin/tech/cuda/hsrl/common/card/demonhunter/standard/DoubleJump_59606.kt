package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DoubleJump_59606 : Card() {
    override val id = 59606
    override val name = "二段跳"
    override val description = "从你的牌库中抽一张<b>流放</b>牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "各种速通的关键技能。"
    override val artist = "A.J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9233585e8b3318b6820026034f7ea676c04edfc72e609dcbab3d1ccc2240c1d1.png"
}
