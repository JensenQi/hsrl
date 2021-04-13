package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LakeThresher_59452 : Card() {
    override val id = 59452
    override val name = "止水湖蛇颈龙"
    override val description = "同时对其攻击目标相邻的随从造成伤害。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“湖里有个怪物？！” “那不是怪物，那是龙哥。”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eb1e2baf96205daf2445755d35531060a266957b2a71cfe548c170da52ebf2ed.png"
}
