package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FelfireDeadeye_61968 : Card() {
    override val id = 61968
    override val name = "邪火神射手"
    override val description = "你的英雄技能的法力值消耗减少（1）点。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "她只会射向那些未经允许就来撸她的大猫的家伙。"
    override val artist = "Angelica Alieva"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5c36e8e91ab967032360af5d25db4225d20677a2b47ed93ffd1444ee10113b23.png"
}
