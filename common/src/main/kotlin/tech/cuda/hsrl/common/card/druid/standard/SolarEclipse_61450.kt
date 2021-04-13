package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SolarEclipse_61450 : Card() {
    override val id = 61450
    override val name = "日蚀"
    override val description = "在本回合中，你的下一个法术将施放两次。"
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
    override val background = "当月亮运行到太阳和艾泽拉斯之间时发生的现象。"
    override val artist = "Jun Yan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/176e285aadbb6a6ccdf0bd98d4d60f90ee3411663355005b5d5ec38b9d48ab2d.png"
}
