package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ProfessorSlate_60004 : Card() {
    override val id = 60004
    override val name = "斯雷特教授"
    override val description = "你的法术具有<b>剧毒</b>。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“别怕，很快就结束了。可能你感觉起来会无比漫长，但我向你保证，其实真的很快！”"
    override val artist = "A.J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/204d2ce641a3c79e8a5cc651672992ece4d1f2a0563f33c6d3fa940166d5f550.png"
}
