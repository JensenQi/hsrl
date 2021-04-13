package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NatureStudies_59163 : Card() {
    override val id = 59163
    override val name = "自然研习"
    override val description = "<b>发现</b>一张法术牌。你的下一张法术牌法力值消耗减少（1）点。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“我有一本初版的！看看，看这上面的年轮。”"
    override val artist = "SARIYA"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/84a14df7a2ca14e909990cd3325ab16ac49de6ccf0ec59fe67d0de6cf8c1c7ed.png"
}
