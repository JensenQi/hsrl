package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LunarEclipse_61449 : Card() {
    override val id = 61449
    override val name = "月蚀"
    override val description = "对一个随从造成 3点伤害。在本回合中，你施放的下一个法术的法力值消耗减少（2）点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "当艾泽拉斯运行到太阳和月亮之间时发生的现象。"
    override val artist = "Jun Yan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d323f97c581edc06518e664650ec67f9dcb9cdbe02ba7e2aa01c046e3ee08f44.png"
}
