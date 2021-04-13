package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DraconicStudies_58974 : Card() {
    override val id = 58974
    override val name = "龙族研习"
    override val description = "<b>发现</b>一张龙牌。你的下一张龙牌法力值消耗减少（1）点。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "参加龙族研习项目的学生大概率会被烧得油尽灯枯。"
    override val artist = "Kagi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a1debdf5399e85459a07f57577ce9432d6a2908e60e97f5a0f789decdf1ac9f5.png"
}
